package com.ken42;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.logging.*;
import java.util.logging.FileHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;

public class Pfs_portal extends Thread {
	private String[] csvLineData;
	private int count;
	private static final Exception Exception = null;
	static int time = 1000;
	static Boolean headless;
	public Logger log = Logger.getLogger("Pfs_portal");
	public static boolean faculty_login_set = false;
	public static boolean student_login_set = false;

	@Override
	public void run() {
		System.out.println("Thread- Started" + Thread.currentThread().getName());
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
		try {
			Thread.sleep(1000);
			testPFSPortal(this.csvLineData, this.count);
		} catch (InterruptedException e) {
			log.info("Thread- Exception " + Thread.currentThread().getName());
			System.out.println("Thread- Exception " + Thread.currentThread().getName());
			e.printStackTrace();
		} catch (java.lang.Exception e) {
			log.info("Thread- Exception " + Thread.currentThread().getName());
			System.out.println("Thread- Exception " + Thread.currentThread().getName());
			e.printStackTrace();
		}
		log.info("Thread- END " + Thread.currentThread().getName());
		System.out.println("Thread- END " + Thread.currentThread().getName());
	}

	public Pfs_portal(String[] csvCell, int count, Logger log) {
		this.csvLineData = csvCell;
		this.count = count;
		this.log = log;
	}

	public static void main(String[] args) throws Exception {
		Logger log = Logger.getLogger("Pfs_portal");
		String file_path = "";
		file_path = getFilePath();
		String CSV_PATH = "";
		CSV_PATH = file_path;
		CSVReader csvReader1;
		int ThreadCount = 0;
		csvReader1 = new CSVReader(new FileReader(CSV_PATH));
		String[] csvCell1;
		while ((csvCell1 = csvReader1.readNext()) != null) {
			ThreadCount++;
		}
		System.out.println("Number of threads to start  " + ThreadCount);
		Thread[] threads = new Thread[ThreadCount];

		CSVReader csvReader;
		int count = 0;
		csvReader = new CSVReader(new FileReader(CSV_PATH));

		String[] csvCell;
		while ((csvCell = csvReader.readNext()) != null) {
			if (count == 0) {
				count = count + 1;
				continue;
			}
			// testPFSPortal(csvCell);
			Thread t = new Pfs_portal(csvCell, count, log);
			threads[count] = t;
			threads[count].setName("T" + String.valueOf(count + 1));
			t.start();
			Utils.smallSleepBetweenClicks(8);
			count++;
		}
		// SendMail.sendEmail(logFileName);
	}

	public static void checkStudentIsLoggedIn(WebDriver driver, String studentEmail, String PFSurl, Logger log,
			String[] csvCell)
			throws Exception {
		// if (!student_login_set) {
		// Utils.smallSleepBetweenClicks(1);
		// Utils.login(driver, studentEmail, PFSurl, log,csvCell);
		// student_login_set = true;
		// }

		Utils.smallSleepBetweenClicks(2);
		boolean signInPresent = false;
		signInPresent = driver.findElements(By.xpath("//*[text()='Sign in'] | //*[text()='SIGN IN']")).size() > 0;
		if (signInPresent) {
			Utils.goBackToHome(driver, PFSurl, log);
			Utils.logg(log, "info_d", " Hey Student not logged in let's login with ID" + studentEmail);

			// log.info("Hey Student not logged in let's login with ID " + studentEmail);
			Utils.login(driver, studentEmail, PFSurl, log, csvCell);
			Utils.smallSleepBetweenClicks(4);
		} else {
			Utils.logg(log, "info_d", "It's not in login page");

			// System.out.println("It's not in login page");
		}
	}

	public static void checkFacultyIsLoggedIn(WebDriver driver, String facultyEmail, String PFSurl, Logger log,
			String[] csvCell)
			throws Exception {
		Utils.smallSleepBetweenClicks(2);

		boolean signInPresent = false;
		signInPresent = driver.findElements(By.xpath("//*[text()='Sign in']")).size() > 0;
		if (signInPresent) {
			Utils.goBackToHome(driver, PFSurl, log);
			Utils.logg(log, "info_d", "Hey Faculty not logged in let's login with ID " + facultyEmail);

			Utils.login(driver, facultyEmail, PFSurl, log, csvCell);
			Utils.smallSleepBetweenClicks(4);
		} else {
			// log.warning("Faculty login for test case 17-38 failed somewhere");
			System.out.println("$$$$$$$$$$$$$ No Sign in page");
		}
	}

	// Created a function so this can be threaded
	public static void testPFSPortal(String[] csvCell, int count) throws Exception {
		Logger log = Logger.getLogger("Pfs_portal" + count);
		String folder = "";
		folder = getFolderPath();
		boolean append = false;
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		String logFileName = String.format(folder + "\\Testresult_%s.HTML", timeStamp);
		FileHandler logFile = new FileHandler(logFileName, append);
		logFile.setFormatter(new MyHtmlFormatter());
		log.addHandler(logFile);
		System.out.println("LOG Name: " + logFileName);
		WebDriver driver = null;

		// boolean faculty_login_set = false;
		// boolean student_login_set = false;
		String PFSurl = csvCell[0];
		String facultyEmail = csvCell[1];
		String studentEmail = csvCell[2];
		String Role = "";
		String Browser = csvCell[3];
		String From = csvCell[4];
		String To = csvCell[5];
		String studentName = csvCell[6];
		// String headless = csvCell[7];
		String Delete = csvCell[16];
		int from = Integer.parseInt(From);
		int to = Integer.parseInt(To);
		headless = getHeadless(csvCell);
		if ((from < 1 || from > 207 || to < 1 || to > 207) || (to < from)) {
			log.warning("The range specificed is incorrect it has to be between 1 and 68");
			log.warning("Please correct the From and To Columns in CSV file and run again");
			System.exit(1);
		}

		driver = initDriver(Browser, PFSurl);

		if ((from >= 1 && to <= 16)) {
			// Utils.login(driver, studentEmail, PFSurl, log,csvCell);
			Role = "student";
			student_login_set = true;
		} else if ((from >= 17 && to <= 39)) {
			// Utils.login(driver, facultyEmail, PFSurl, log,csvCell);
			Role = "faculty";
			faculty_login_set = true;
		} else if ((from >= 1 && to <= 207) && (to >= 1 && to <= 207)) {
			student_login_set = false;
			faculty_login_set = false;
		}
		Utils.logg(log, "info", "**********************Testing for  Portal  " + PFSurl);

		// Below If will execute all Student related test cases
		for (int i = from; i <= to; i++) {
			switch (i) {
				case 1:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudent(PFSurl, driver, log); // TC-1
					break;
				case 2:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentEnrollment(PFSurl, driver, log); // TC-2
					break;
				case 3:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentAcademic(PFSurl, driver, log); // TC-3
					break;
				case 4:
					// checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					// Pfs_student.testStudentExamination(PFSurl, driver, log); // TC-4
					break;
				case 5:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentAttendance(PFSurl, driver, log); // TC-5
					break;
				case 6:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentTimeTable(PFSurl, driver, log); // TC-6
					break;
				case 7:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentFees(PFSurl, driver, log); // TC-7
					break;
				case 8:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentFeedback(PFSurl, driver, log); // TC-8
					break;
				case 9:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentStudentStatus(PFSurl, driver, log); // TC-9
					break;
				case 10:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentRaiseCase(studentEmail, facultyEmail, PFSurl, driver, log); // TC-10
					break;
				case 11:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.requestfilter(studentEmail, facultyEmail, PFSurl, driver, log); // TC-11
					break;
				case 12:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentEvent(studentEmail, facultyEmail, PFSurl, driver, log); // TC-12
					break;
				case 13:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentProfile(PFSurl, driver, log); // TC-13
					break;
				case 14:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentEditProfile(PFSurl, driver, log); // TC-14
					break;
				case 15:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentEditAddress(PFSurl, driver, log); // TC-15
					break;
				case 16:
					checkStudentIsLoggedIn(driver, studentEmail, PFSurl, log, csvCell);
					Pfs_student.testStudentSignout(PFSurl, driver, log); // TC-16
					break;
				case 17:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFaculty(PFSurl, driver, log); // TC-17
					break;
				case 18:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyQuestionBank(PFSurl, driver, log); // TC-18
					break;
				case 19:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyCourseContent(PFSurl, driver, log); // TC-19
					break;
				case 20:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyExamination(PFSurl, driver, log); // TC-20
					break;
				case 21:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyMYStudent(PFSurl, driver, log); // TC-21
					break;
				case 22:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyAttendance(PFSurl, driver, log); // TC-22
					break;
				case 23:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFaculityTimetable(PFSurl, driver, log); // TC-23
					break;
				case 24:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyService(PFSurl, driver, log); // TC-24
					break;
				case 25:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyRaiseCase(studentEmail, facultyEmail, PFSurl, driver, log); // TC-25
					break;
				case 26:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyMakeRequest(studentEmail, facultyEmail, PFSurl, driver, log); // TC-26
					break;
				case 27:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyEvent(PFSurl, driver, log); // TC-27
					break;
				case 28:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testfacultyEditProfile(studentEmail, facultyEmail, PFSurl,
							driver, log); // TC-28
					break;
				case 29:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testfacultyEditAddress(studentEmail, facultyEmail, PFSurl,
							driver, log); // TC-29
					break;
				case 30:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testfacultyEditAcademicDetails(studentEmail, facultyEmail,
							PFSurl, driver, log); // TC-30
					break;
				case 31:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testfacultyEditEXPERIENCE(studentEmail, facultyEmail,
							PFSurl, driver, log); // TC-31
					break;
				case 32:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testfacultyEditRESEARCHPublication(studentEmail, facultyEmail,
							PFSurl, driver, log); // TC-32
					break;
				case 33:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testfacultyEditOTHERS(studentEmail, facultyEmail, PFSurl,
							driver, log); // TC-33
					break;
				case 34:
					// checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log,csvCell);
					// Pfs_faculty.testfacultyEditBook(studentEmail, facultyEmail, PFSurl, driver,
					// log); // TC-34
					break;
				case 35:
					// checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log,csvCell);
					// Pfs_faculty.testfacultyEditProfessionalAssociation(studentEmail,
					// facultyEmail, PFSurl, driver, log); // TC-35
					break;
				case 36:
					// checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log,csvCell);
					// Pfs_faculty.testfacultyOthers(studentEmail, facultyEmail, PFSurl, driver,
					// log); // TC-36
					break;
				case 37:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyDashboard(studentEmail, facultyEmail, PFSurl, driver, log); // TC-37
					break;
				case 38:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyQuestionPaper(studentEmail, facultyEmail, PFSurl, driver, log); // TC-38
					break;
				case 39:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyQuestiontrueORfalse(PFSurl, driver, log);
					break;
				case 40:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyQuestionshortanswer(PFSurl, driver, log);
					break;
				case 41:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyQuestionEssay(PFSurl, driver, log);
					break;
				case 42:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testaddmorequestion(studentName, facultyEmail, PFSurl, driver, log);
					break;
				case 43:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultySignout(PFSurl, driver, log); // TC-39
					break;
				case 44:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultyEventFilter(PFSurl, driver, log); // TC-70
					break;
				case 45:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultymystudentprofileadmissiondetails(PFSurl, driver, log); // TC-84
					break;
				case 46:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultymystudentprofilepresonaldetails(PFSurl, driver, log); // TC-85
					break;
				case 47:
					checkFacultyIsLoggedIn(driver, facultyEmail, PFSurl, log, csvCell);
					Pfs_faculty.testFacultymystudentprofileaddresdetails(PFSurl, driver, log); // TC-86
					break;
				case 48:
					Pfs_resource.testSpreadsheetCreateViewDelete(studentEmail,
							facultyEmail, PFSurl, Browser, Role, driver, log, csvCell); // TC-40
					break;
				case 49:
					Pfs_resource.testPPTCreateViewDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-41
					break;
				case 50:
					Pfs_resource.testPDFCreateViewDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-42
					break;
				case 51:
					Pfs_resource.testVideoCreateViewDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-43
					break;
				case 52:
					Pfs_resource.testLinkCreateViewDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-44
					break;
				case 53:
					Pfs_resource.testSpreadsheetFileType(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-45
					break;
				case 54:
					Pfs_resource.testPPTFileType(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-46
					break;
				case 55:
					Pfs_resource.testPDFFileType(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-47
					break;
				case 56:
					Pfs_resource.testVideoFileType(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-48
					break;
				case 57:
					Pfs_resource.testFacultyFilterResource(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-49
					break;
				case 58:
					Pfs_resource.testFacultyFilterPDFResource(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-50
					break;
				case 59:
					Pfs_resource.testFacultyFilterVideoResource(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-51
					break;
				case 60:
					Pfs_resource.testFacultyFilterLinksResource(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-52
					break;
				case 61:
					Pfs_resource.CreatepublisheditdeltePDF(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-71
					break;
				case 62:
					Pfs_resource.CreatepublisheditdeltePPT(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-71
					break;
				case 63:
					Pfs_resource.CreatepublisheditdelteVideo(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-71
					break;
				case 64:
					Pfs_resource.CreatepublisheditdelteSpreadsheet(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-71
					break;
				case 65:
					Pfs_resource.CreatepublisheditdelteLink(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-71
					break;
				case 66:
					Pfs_resource.testSCORMPackageFileType(studentEmail, facultyEmail, PFSurl, Browser, Role, driver,
							log, csvCell);
					break;

				case 67:
					Pfs_resource.CreateSpreadsheetViewinDashboard(studentName, facultyEmail, PFSurl, Browser, Role,
							driver, log, csvCell);
					break;
				case 68:
					Pfs_resource.CreatePPTViewinDashboard(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
							csvCell);
					break;
				case 69:
					Pfs_resource.CreatePDFViewinDashboard(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
							csvCell);
					break;
				case 70:
					Pfs_resource.CreateVideoViewinDashboard(studentName, facultyEmail, PFSurl, Browser, Role, driver,
							log, csvCell);
					break;
				case 71:
					Pfs_resource.CreateLinkViewinDashboard(studentName, facultyEmail, PFSurl, Browser, Role, driver,
							log, csvCell);
					break;
				case 72:
					Pfs_activity.testFilterActivityAssignment(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-60
					break;
				case 73:
					Pfs_activity.testFilterActivityAssement(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-61
					break;
				case 74:
					Pfs_activity.testFilterActivityForum(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-62
					break;
				case 75:
					if (to < 76) {
						Pfs_activity.testForumCreatePublishViewDelete(studentEmail, facultyEmail,
								PFSurl, Browser, Role, driver, log, csvCell); // TC-55
					} else {
						Utils.logg(log, "info",
								"TC-75 Forum Create,Publish,View,delete Skipped as it's subset of next test case");
					}
					break;
				case 76:
					Pfs_activity.testForumCreatePublishViewDeleteDiscussion(studentEmail, facultyEmail,
							PFSurl, Browser, Role, driver, log, csvCell);// TC-59
					break;

				case 77:
					Pfs_activity.testForumCreatePublishEditDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-63
					break;
				case 78:
					Pfs_activity.testForumCreateunPublishEditDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-64
					break;

				case 79:
					if (to < 80) {
						Pfs_activity.testAssessmentCreatePublishViewDelete(studentEmail, facultyEmail,
								PFSurl, Browser, Role, driver, log, csvCell); // TC-53
					} else {
						Utils.logg(log, "info",
								"TC-79 Assessment Create,Publish,View,delete Skipped as it's subset of next test case");
					}
					break;
				case 80:
					Pfs_activity.testassesmentAttemptview(studentEmail, facultyEmail,
							PFSurl, Browser, Role, driver, log, csvCell);// TC-61
					break;

				case 81:
					Pfs_activity.testassesmenteditdelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-65
					break;
				case 82:
					Pfs_activity.testassesmentpublisheditview(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-66
					break;
				case 83:
					Pfs_activity.MultipleAttemptOfAssessment(studentEmail, facultyEmail, PFSurl, Browser, Role, driver,
							log, csvCell);
					break;
				case 84:
					Pfs_activity.ExpiredOfAssessment(studentEmail, facultyEmail, PFSurl, Browser, Role, driver,
							log, csvCell);
					break;
				case 85:
					Pfs_activity.testFAssignmentCreatePublishViewDelete(studentEmail, facultyEmail,
							PFSurl, Browser, Role, driver, log, csvCell); // TC-54
					break;
				case 86:
					if (to < 87) {
						Pfs_activity.testFAssignmentCreatePublishsubmissionfileuploadchecking(studentEmail,
								facultyEmail,
								PFSurl, Browser, Role, driver, log, csvCell); // TC-56
					} else {
						Utils.logg(log, "info",
								"TC-86 Assignment Create,Publish,View,delete Skipped as it's subset of next test case");
					}
					break;
				case 87:
					Pfs_activity.testFAssignmentCreatePublishsubmissiongradecheck(studentEmail, facultyEmail,
							PFSurl, Browser, Role, driver, studentName, log, csvCell); // TC-57
					break;
				case 88:
					Pfs_activity.testFAssignmentCreateEditDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-67
					break;
				case 89:
					Pfs_activity.testFAssignmentCreatepublishEditDelete(studentEmail, facultyEmail, PFSurl,
							Browser, Role, driver, log, csvCell); // TC-68
					break;
				case 90:
					Pfs_activity.DashboardClasscheckAssement(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, studentName, log, csvCell);
					break;
				case 91:
					Pfs_activity.DashboardClasscheckAssignment(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, studentName, log, csvCell);
					break;
				case 92:
					Pfs_activity.DashboardClasscheckForum(studentEmail, facultyEmail, PFSurl, Browser, Role, driver,
							studentName, log, csvCell);
					break;
				case 93:
					// Pfs_activity.testAttemptview(studentEmail, facultyEmail, PFSurl,
					// Browser, Role, driver, log, csvCell); // TC-69
					break;

				case 94:
					// Pfs_activity.GracePeriodAssessment(studentEmail, facultyEmail, PFSurl,
					// Browser, Role, driver, log,
					// csvCell);
					break;
				case 95:
					Pfs_activity.HighestGradeMethodsAssessment(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, log,
							csvCell, studentName);
					break;
				case 96:
					Pfs_activity.AverageGradeMethodsAssessment(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, log, csvCell, studentName);
					break;
				case 97:
					Pfs_activity.FirstAttemptGradeMethodsAssessment(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, log, csvCell, studentName);
					break;
				case 98:
					Pfs_activity.LastAttemptGradeMethodsAssessment(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, log, csvCell, studentName);
					break;
				case 99:
					Pfs_activity.testFAssignmenttimelimitchecking(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, log, csvCell);
					break;
				case 100:
					Pfs_activity.AssignmentfilelimitAndTextlimit(studentEmail, facultyEmail, PFSurl, Browser, Role,
							driver, log, csvCell);
					break;
				default:
					throw Exception;
			}
		}

		if (Delete.equals("TRUE")) {
			Pfs_activity.DeleteResourcesAssignments(studentName, facultyEmail, PFSurl, Browser, Role, driver,
					log, csvCell);
			Pfs_activity.DeleteResourcesAssessment(studentName, facultyEmail, PFSurl, Browser, Role, driver,
					log, csvCell);
			Pfs_activity.DeleteResourcesForum(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
					csvCell);
			Pfs_resource.DeleteResourcesPPT(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
					csvCell);
			Pfs_resource.DeleteResourcesExcel(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
					csvCell);
			Pfs_resource.DeleteResourcesPDF(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
					csvCell);
			Pfs_resource.DeleteResourcesVideo(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
					csvCell);
			Pfs_resource.DeleteResourcesLink(studentName, facultyEmail, PFSurl, Browser, Role, driver, log,
					csvCell);
		}
		quitDriver(driver, PFSurl);
		Utils.logg(log, "info", "***************** COMPLETED TESTTING OF PORTAL" + PFSurl);
		String result = ResultSummary(logFileName);
		SendMail.sendEmail(logFileName, result);
	}

	@BeforeSuite
	public static WebDriver initDriver(String Browser, String url) throws Exception {

		try {
			WebDriver driver = null;
			String folder = "";
			folder = getFolderPath();
			String ChromeDriver = folder + "\\chromedriver.exe";
			String EdgeDriver = folder + "\\msedgedriver.exe";
			String FirefoxDriver = folder + "\\geckodriver.exe";
			System.out.println("Browser is ****" + Browser);
			System.out.println("URL is " + url);
			if ("chrome".equals(Browser)) {
				System.setProperty("webdriver.chrome.driver", ChromeDriver);
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
				if (headless) {
					op.addArguments("--headless", "--window-size=1920,1080");
				} else {
					op.addArguments("--disable-notifications");
				}
				// op.addArguments("--headless");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(op);
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			} else if ("edge".equals(Browser)) {
				System.setProperty("webdriver.edge.driver", EdgeDriver);
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			} else if ("firefox".equals(Browser)) {
				System.setProperty("webdriver.firefox.driver", FirefoxDriver);
				FirefoxOptions fx = new FirefoxOptions();
				fx.addArguments("--disable-notifications");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(fx);
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			} else if ("safari".equals(Browser)) {
				driver = new SafariDriver();
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			}
			System.out.println("********************" + url);
			if (driver != null) {
				driver.get(url);
				driver.manage().window().maximize();
				return (driver);
			}
		} catch (Exception e) {
			Utils.printException(e);
			// log.warning("UNABLE TO LAUNCH BROWSER");
			System.exit(01);
		}
		return null;
	}

	@AfterSuite
	public static void quitDriver(WebDriver driver, String Url) throws Exception {
		// log.info("Completed testing of portal" + Url);
		System.out.println("Qutting driver");
		driver.quit();
		Utils.smallSleepBetweenClicks(1);
	}

	public static String getFilePath() throws Exception {
		try {
			String folder = "";
			InputStream folderPath = Pfs_portal.class.getResourceAsStream("folder.csv");
			CSVReader csvFolderPath = new CSVReader(new InputStreamReader(folderPath, "UTF-8"));
			String[] csvCell_folder;
			while ((csvCell_folder = csvFolderPath.readNext()) != null) {
				folder = csvCell_folder[0];
			}
			System.out.println(folder);
			return folder;
		} catch (Exception e) {
			Utils.printException(e);
		}
		return null;
	}

	public static String getFolderPath() throws Exception {
		try {
			String folder = "";
			InputStream folderPath1 = Pfs_portal.class.getResourceAsStream("folder.csv");
			CSVReader csvFolderPath = new CSVReader(new InputStreamReader(folderPath1, "UTF-8"));
			String[] csvCell_folder;
			while ((csvCell_folder = csvFolderPath.readNext()) != null) {
				folder = csvCell_folder[0];
			}
			String folderPath = folder.replaceAll("\\\\[^\\\\]*$", "");
			System.out.println(folderPath);
			return folderPath;
		} catch (Exception e) {
			Utils.printException(e);
		}
		return null;
	}

	public static Boolean getHeadless(String[] csvCell) throws Exception {
		try {
			String headless = csvCell[7];
			if ("TRUE".equals(headless)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			Utils.printException(e);
		}
		return false;
	}

	public static String ResultSummary(String logFileName) throws java.lang.Exception {

		try {

			File inputFile = new File(logFileName);
			Document doc = Jsoup.parse(inputFile, "UTF-8");
			String regex = "(?i).*\\b(Passed|Failed|Skipped)\\b.*";
			StringBuilder htmlBuilder = new StringBuilder();

			htmlBuilder.append("<table border=\"1\">");
			htmlBuilder.append(
					"<tr><th>URL</th><th>Total Tests</th><th>PASSED</th><th>Skipped</th><th>FAILED</th></tr>");
			String url = "";
			int passedCount = 0;
			int skippedCount = 0;
			int failedCount = 0;
			for (Element element : doc.getAllElements()) {
				if (element.ownText().contains("Testing for Portal")) {
					url = element.ownText().substring(element.ownText().indexOf("https"));
					break;
				}
			}
			for (Element element : doc.getAllElements()) {
				if (element.ownText().matches(regex)) {
					if (element.ownText().contains("PASSED")) {
						passedCount++;
					} else if (element.ownText().contains("FAILED")) {
						failedCount++;
					} else if (element.ownText().contains("Skipped ")) {
						skippedCount++;
					}
				}
			}
			htmlBuilder.append("<tr><td>").append(url).append("</td><td>")
					.append(passedCount + skippedCount + failedCount).append("</td><td>").append(passedCount)
					.append("</td><td>").append(skippedCount).append("</td><td>").append(failedCount)
					.append("</td></tr>");
			htmlBuilder.append("</table>");

			htmlBuilder.append("<br>");
			htmlBuilder.append("<br>");
			htmlBuilder.append("<table border=\"1\">");
			htmlBuilder.append(
					"<tr><th>S.No.</th><th>Test Case Name</th><th>Status</th><th>Execution time/Seconds</th></tr>");
			int count = 1;
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss", Locale.ENGLISH);
			Date prevTime = null;
			for (Element element : doc.getAllElements()) {
				if (element.ownText().matches(regex)) {
					String testCase = "";
					String status = "";
					String timePackage = "";
					String[] testCaseArr = element.ownText().split(": ");
					if (testCaseArr.length > 1) {
						testCase = testCaseArr[0];
						timePackage = testCaseArr[1];
					} else {
						testCase = element.ownText();
					}
					if (element.ownText().contains("PASSED")) {
						status = "PASSED";
						htmlBuilder.append("<tr style=\"background-color: #00FF00;\">");
					} else if (element.ownText().contains("FAILED")) {
						status = "FAILED";
						htmlBuilder.append("<tr style=\"background-color: #FF0000;\">");
					} else if (element.ownText().contains("Skipped ")) {
						status = "Skipped ";
						htmlBuilder.append("<tr style=\"background-color: #FFFF00;\">");
					} else {
						continue;
					}
					testCase = testCase.replaceAll("Test Case PASSED", "").replaceAll("Test Case FAILED", "")
							.replaceAll("test case PASSED", "").replaceAll("and Test Case PASSED", "");
					htmlBuilder.append("<td>").append(count).append("</td><td>").append(testCase).append("</td>")
							.append("<td>").append(status).append("</td>");

					// Extract time difference between rows
					Element timeCell = element.parent().select("td:eq(1)").first();
					String timestamp = timeCell.text();
					Date currTime = dateFormat.parse(timestamp);
					if (prevTime != null) {
						long diffSeconds = (currTime.getTime() - prevTime.getTime()) / 1000;
						htmlBuilder.append("<td>").append(diffSeconds).append("</td>");
					}
					prevTime = currTime;
					htmlBuilder.append("</tr>");
					count++;
				}
			}

			String folder = "";
			folder = Pfs_portal.getFolderPath();
			String output = "";
			Pattern pattern = Pattern.compile("://([^-]*)-");
			Matcher matcher = pattern.matcher(url);
			if (matcher.find()) {
				output = matcher.group(1);
				System.out.println(output);
			}
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
			String ResultSummary = String.format(folder + "\\" + output + "_%s.HTML", timeStamp);
			FileWriter writer = new FileWriter(ResultSummary);
			writer.write(htmlBuilder.toString());
			writer.close();

			System.out.println("Text extracted and written in table to file successfully");
			return ResultSummary;
		} catch (

		IOException e) {
			e.printStackTrace();
		}
		return logFileName;

	}

}