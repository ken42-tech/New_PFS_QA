package com.ken42;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.testng.annotations.Test;

public class Pfs_faculty {
	public static Logger log = Logger.getLogger("Pfs_portal");
	static int time = 2000;

	public static void questionadd(String faculty, String url,
			WebDriver driver, String fileName, String Role, Logger log) throws Exception {
		try {

			if (Utils.questionbank(url)) {
				Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.facccresurl, "Automation", time, log);
				Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
				// Utils.callSendkeys(driver, ActionXpath.faccquestion, "Question", time, log);
				if (Utils.questionname(url)) {
					System.out.println("Question name skipped");
				} else {
					Utils.callSendkeys(driver, ActionXpath.faccquestionname, "Automation Name", time, log);
				}
				Utils.callSendkeys(driver, ActionXpath.facquestionpurpose, "Question Purpose", time, log);
				Utils.clickXpath(driver, ActionXpath.facquestionlevel, time, "facquestionlevel", log);
				Utils.clickXpath(driver, ActionXpath.faclevelselect, time, "faclevelselect", log);
				WebElement toClear = driver
						.findElement(
								By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
				toClear.sendKeys(Keys.CONTROL + "a");
				toClear.sendKeys(Keys.DELETE);
				Utils.callSendkeys(driver, ActionXpath.facquestionmark, "10", time, log);

			} else {
				Utils.callSendkeys(driver, ActionXpath.faccquestion, "Automation", time, log);
				if (Utils.uploadimage(url)) {
					String Image_file = "";
					String folder = "";
					folder = Pfs_portal.getFolderPath();
					Image_file = folder + "\\demo.jpg";
					driver.findElement(By.xpath("//input[@accept='.png,.jpg,.jpeg']"))
							.sendKeys(Image_file);
				} else {
					Utils.callSendkeys(driver, ActionXpath.faccquestionname, "Question time", time, log);

				}
			}
			Utils.cleartext(driver, ActionXpath.faccmarks);
			Utils.smallSleepBetweenClicks(1);
			if (Utils.QBoption(url)) {
				Utils.clickXpath(driver, ActionXpath.Option1Insert1, time, "click on option1", log);
				Utils.callSendkeys(driver, ActionXpath.Qurl1, "test1", time, log);
				Utils.clickXpath(driver, ActionXpath.faccoptionsave1, time, "save option1", log);
				Utils.callSendkeys(driver, ActionXpath.Qfacfeedback1, "Excellent", time, log);
				Utils.clickXpath(driver, ActionXpath.Option2Insert2, time, "click on option2", log);
				Utils.callSendkeys(driver, ActionXpath.Qurl2, "test2", time, log);
				Utils.clickXpath(driver, ActionXpath.faccoptionsave2, time, "save option2", log);
				Utils.callSendkeys(driver, ActionXpath.Qfacfeedback2, "Good", time, log);
				Utils.clickXpath(driver, ActionXpath.Option3Insert3, time, "click on option1", log);
				Utils.callSendkeys(driver, ActionXpath.Qurl3, "test3", time, log);
				Utils.clickXpath(driver, ActionXpath.faccoptionsave3, time, "save option3", log);
				Utils.callSendkeys(driver, ActionXpath.Qfacfeedback3, "Better", time, log);

			} else {
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.faccmarks, "5", time, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.faccoption1, "modi", time, log);
				Utils.smallSleepBetweenClicks(1);

				Utils.callSendkeys(driver, ActionXpath.faccoption2, "sachin", time, log);
				// Utils.callSendkeys(driver, ActionXpath.feedback2, "vg", time, log);
				Utils.callSendkeys(driver, ActionXpath.faccoption3, "anand", time, log);
				// Utils.callSendkeys(driver, ActionXpath.feedback3, "good", time, log);
			}
			Utils.smallSleepBetweenClicks(1);
			if (Utils.QBoption(url)) {
				Utils.clickXpath(driver, ActionXpath.numberofchoice, time, "No of chocice", log);
				Utils.callSendkeys(driver, ActionXpath.feedbackofcrtans, "super", time, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.feefbacofincorrect, "improve", time, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.generalfeedback, "gain know", time, log);
				Utils.smallSleepBetweenClicks(1);
			} else {
				Utils.smallSleepBetweenClicks(1);
			}
			Utils.clickXpath(driver, ActionXpath.facsaveandfinish, time, "Finished", log);
			Utils.smallSleepBetweenClicks(1);
			// Utils.scrollUpOrDown(driver, time);
			// Utils.scrollUpOrDown(driver, time);
			// Utils.clickXpath(driver, ActionXpath.facqueback, time, "BAck", log);
		} catch (Exception e) {
			Utils.printException(e);
			log.warning(fileName + "Delete Fuction FAILED  ");
			throw (e);
		}
	}

	@Test(priority = 17)
	public static void testFaculty(String url, WebDriver driver, Logger log) throws Exception {
		try {
			System.out.println("TC-17:  Starting FACULTY PORTAL Academic tab test case executation\n");
			Utils.goBackToHome(driver, url, log);
			Utils.bigSleepBetweenClicks(1);
			WebElement l = driver.findElement(By.tagName("body"));
			String p = l.getText();
			if (p.contains("Students") && p.contains("Classes Conducted")
					&& p.contains("Assignments") && p.contains("Schedule") && p.contains("MY CLASSES")) {
				Utils.logg(log, "info", " TC-17 Faculty Home tab test case PASSED\n");

			} else {
				Utils.logg(log, "warn", "TC-17 Faculty Home tab test case FAILED it does not contain all the tabs \n");
			}
		} catch (Exception e) {
			Utils.printException(e);
			Utils.goBackToHome(driver, url, log);
			Thread.sleep(time);
			Utils.logg(log, "warn", "TC-17 Faculty ACADEMIC Test case FAILED\n");
		}
	}

	@Test(priority = 18)
	public static void testFacultymy360(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-18  Faculty Starting my360 Tab test case Executation");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.my360, time, "open my360", log);
				Utils.clickXpath(driver, ActionXpath.mypath, time, "open mypath", log);
				Utils.clickXpath(driver, ActionXpath.Achivement, time, "open Achivement", log);
				Utils.clickXpath(driver, ActionXpath.sppersonaldetails, time, "open personaldetails", log);
				Utils.logg(log, "info", "TC-18 Faculty QuestionBank click Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-18 Faculty my360 click Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-18  Faculty QuestionBank click BACK button Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 19)
	public static void testFacultyteachattendence(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				Utils.goBackToHome(driver, url, log);
				System.out.println("TC-19 Faculty teach and attendence Test Execution  Started ");
				Utils.clickXpath(driver, ActionXpath.teach, time, "open teach", log);
				ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(newTb.get(0));
				Utils.clickXpath(driver, ActionXpath.Attendence, time, "open Attendence", log);
				Utils.clickXpath(driver, ActionXpath.markattendence, time, "open markattendence", log);
				Utils.clickXpath(driver, ActionXpath.Attendencehistory, time, "open Attendencehistory", log);

				log.info("TC-19  Faculty teach and attendence Test PASSED \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-19  Faculty teach and attendence Test FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn",
							"TC-19  Faculty teach and attendencet Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 20)
	public static void testFacultyExamination(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-20 Faculty Examination Test Executation Statred");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.Examination, time, "Click on the Examination ", log);
				Utils.clickXpath(driver, ActionXpath.examinationexam, time, "Click on the examinationexam ", log);
				Utils.clickXpath(driver, ActionXpath.invigilation, time, "Click on the invigilation ", log);
				Utils.clickXpath(driver, ActionXpath.Evaluation, time, "Click on the Examination ", log);
				Utils.clickXpath(driver, ActionXpath.qnbank, time, "Click on the qnbank ", log);
				ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(newTb.get(0));
				Utils.clickXpath(driver, ActionXpath.spresult, time, "Click on the spresult ", log);
				Utils.clickXpath(driver, ActionXpath.editmark, time, "Click on the editmark ", log);
				Utils.clickXpath(driver, ActionXpath.Submit, time, "Click on the Submit ", log);
				Utils.logg(log, "info", " TC-20 Faculty Examanation test cases PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-20 Faculty Examanation test cases FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-20  Faculty Course Content Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 21)
	public static void testFacultyMYStudent(String url, WebDriver driver, Logger log) throws Exception {

		try {
			System.out.println("TC-21 Faculty My Students Test Executation Started");
			Utils.goBackToHome(driver, url, log);
			Utils.clickXpath(driver, ActionXpath.spstudents, time, "open the my student ", log);
			Utils.clickXpath(driver, ActionXpath.Courses, time, "open the  Courses ", log);
			Utils.logg(log, "info", " TC-21 Faculty My Student  tab test case PASSED\n");
		} catch (Exception e) {

			Utils.printException(e);
			Utils.goBackToHome(driver, url, log);
			Utils.logout(driver, url, "faculty", log);
			Utils.logg(log, "warn", "TC-21 Faculty My Student  tab Test case Failed Retrying once more\n");

		}

	}

	@Test(priority = 22)
	public static void testFacultyAttendance(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-22  Faculty Attendance Test Executation Startred ");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.Attendence, time, "open Attendence", log);
				Utils.clickXpath(driver, ActionXpath.markattendence, time, "open markattendence", log);
				Utils.clickXpath(driver, ActionXpath.Attendencehistory, time, "open Attendencehistory", log);

				Utils.logg(log, "info", " TC-22  Faculty Attendance test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-22 Faculty Attendance Test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", " TC-22 Faculty Attendance Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 23)
	public static void testFaculityCalender(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-23 Faculty Timetable Test Executation Started ");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.calender, time, "calender", log);
				Utils.clickXpath(driver, ActionXpath.moth, time, "moth", log);
				Utils.clickXpath(driver, ActionXpath.week, time, "week", log);
				Utils.clickXpath(driver, ActionXpath.day, time, "day", log);
				Utils.logg(log, "info", " TC-23 Faculty Timetable test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-23  Faculty Timetable test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", " TC-23  Faculty Timetable Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 24)
	public static void testFacultyEvents(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-24  Faculty events Test case Started");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.portevent, time, "click event", log);
				Utils.clickXpath(driver, ActionXpath.portevent, time, "click event", log);
				Utils.clickXpath(driver, ActionXpath.portfilter, time, "click filter", log);
				Utils.clickXpath(driver, ActionXpath.allcategary, time, "click all categaroy", log);
				Utils.clickXpath(driver, ActionXpath.selectallcategary, time, "click select categary", log);
				Utils.clickXpath(driver, ActionXpath.cliclapply, time, "click apply button", log);
				Utils.logg(log, "info", " TC-24 Faculty events test cancel button Test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-24 Faculty events test cancel button Test case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-24 Faculty events test cancel button Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 25)
	public static void testFacultyfeedback(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-25 Faculty feedback ");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.spfeedback, time, "spfeedback", log);
				Utils.clickXpath(driver, ActionXpath.spprogram, time, "spprogram", log);
				Utils.clickXpath(driver, ActionXpath.spinstute, time, "spinstute", log);
				Utils.logg(log, "info", " TC-25 Faculty feedback test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-25 Faculty feedback test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-25 Faculty feedback Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 26)
	public static void testFacultyresources(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-26 Starting Faculty resources test case");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.spresources, time, "Click onspresources", log);
				ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(newTb.get(0));
				Utils.logg(log, "info", "TC-26 Faculty resources test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-26 Faculty resources Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-26 Faculty resources Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 27)
	public static void testFacultyDocumentflow(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-27 Faculty Portal Documentflow Test case Started");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.documentflow, time, "documentflow", log);
				Utils.clickXpath(driver, ActionXpath.refrenceoutline, time, "refrenceoutline", log);
				Utils.clickXpath(driver, ActionXpath.refrencelist, time, "refrencelist", log);
				Utils.logg(log, "info", " TC-27 Faculty Documentflow test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-27 Faculty Documentflow Test case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-27 Faculty Event Test case Failed Retrying once more \n");

				}
			}
		}
	}

	@Test(priority = 28)
	public static void testfacultyContactflowConfirm(String student, String faculty, String url, WebDriver driver,
			Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println(" TC-28  Faculty Starting Contactflow Confirm Started  case executation");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.contactflow, time, "facdpsave", log);
				Utils.clickXpath(driver, ActionXpath.Accept, time, "Accept", log);
				Utils.clickXpath(driver, ActionXpath.confirm, time, "confirm", log);

				Utils.logg(log, "info", " TC-28 Faculty Starting Contactflow Confirm Completed test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-28 Faculty Starting Contactflow Confirm test case FAILED\n");
					break;

				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-28 Faculty Starting Contactflow Confirm Completed Test case Failed Retrying once more\n");

				}
			}
		}

	}

	@Test(priority = 29)
	public static void testfacultyContactflowreject(String student, String faculty, String url, WebDriver driver,
			Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {

			try {
				System.out.println(" TC-29 Faculty Contactflow reject  case executation");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.contactflow, time, "contactflow", log);
				Utils.clickXpath(driver, ActionXpath.reject, time, "reject", log);
				Utils.clickXpath(driver, ActionXpath.Submit, time, "Submit", log);
				Utils.clickXpath(driver, ActionXpath.sendapproval, time, "sendapproval", log);
				Utils.logg(log, "info", " TC-29 Faculty Contactflow reject test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);

					Utils.logg(log, "warn", "TC-29 Faculty Contactflow reject test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-29 Faculty eContactflow reject Completed Test case Failed Retrying once more \n");

				}
			}
		}
	}

	@Test(priority = 30)
	public static void testfacultyEditprofile(String student, String faculty, String url, WebDriver driver,
			Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println(" TC-30   Faculty Starting Edit personal Details Started  case executation");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.Stu_prName, time, "facSelectPrtoSignout", log);
				Utils.clickXpath(driver, ActionXpath.kerprofile, time, "kerprofile", log);
				driver.navigate().refresh();
				Utils.smallSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.personaldetails, time, "faccacadmics", log);
				Utils.logg(log, "info", "TC-30  personal Details Completed test case PASSED \n");

				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-30  personal Details test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-30  personal Details Completed Test case Failed Retrying once more \n");

				}
			}
		}
	}

	@Test(priority = 31)
	public static void testfacultyEditprofileimage(String student, String faculty, String url, WebDriver driver,
			Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println(" TC-31 Faculty Starting Edit profileimage Started  case executation");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.Stu_prName, time, "facSelectPrtoSignout", log);
				Utils.clickXpath(driver, ActionXpath.editimage, time, "stuaddadd", log);
				driver.navigate().refresh();

				Utils.logg(log, "info", "TC-31  Faculty Starting Edit profileimage Started  test case PASSED \n");

				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn",
							"TC-31 Faculty Starting Edit profileimage Started  test case test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-31  Faculty Starting Edit profileimage Started  Test case Failed Retrying once more \n");

				}
			}
		}
	}

	@Test(priority = 32)
	public static void testfacultyEditRESEARCHPublication(String student, String faculty, String url, WebDriver driver,
			Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println(" TC-32 Faculty Starting Edit Research Started  case executation");

				if (Utils.skipthefacultyprofile(url)) {
					Utils.logg(log, "info", "TC-32 Edit Research Skip Faculty Profile\n");
					return;

				} else {
					Utils.goBackToHome(driver, url, log);

					System.out.println(" TC-32  RESEARCH PUBLICATION Started  case executation");
					Utils.goBackToHome(driver, url, log);
					Utils.clickXpath(driver, ActionXpath.FCCportal, time, "facSelectPrtoSignout", log);
					Utils.clickXpath(driver, ActionXpath.faccProfile, time, "facprofile", log);
					// Utils.clickXpath(driver, ActionXpath.resechersvg,
					// time,"facclickonRESEARCHSUPERVISIONpublish", log);
					Utils.scrollUpOrDown(driver, 300);
					Utils.clickXpath(driver, ActionXpath.resecher, time, "resecher", log);
					Utils.clickXpath(driver, ActionXpath.resechersvg, time, "resechersvg", log);
					Utils.callSendkeys(driver, ActionXpath.resname, "Surya", time, log);
					Utils.callSendkeys(driver, ActionXpath.rechelink, "https://portal-dev.ken42.com", time, log);
					Utils.callSendkeys(driver, ActionXpath.recherdec, "Sample Desc", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.rechpub, time, "rechpub", log);
					Utils.smallSleepBetweenClicks(1);
					boolean addrow1 = false;
					addrow1 = driver.findElements(By.xpath("(//*[text()='Add Row'])")).size() > 0;
					if (addrow1) {
						Utils.clickXpath(driver, ActionXpath.recshadd, time, "recshadd", log);
						Utils.callSendkeys(driver, ActionXpath.rechnam, "name", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechlink, "https://portal-dev.ken42.com", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechdecs, "sample", time, log);
						Utils.clickXpath(driver, ActionXpath.rechsave, time, "rechsave", log);

					} else {
						Utils.callSendkeys(driver, ActionXpath.rechnam, "publication", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechlink, "https://portal-dev.ken42.com", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechdecs, "sample", time, log);
						Utils.clickXpath(driver, ActionXpath.rechsave, time, "rechsave", log);

					}
					Utils.smallSleepBetweenClicks(1);
					boolean addrow2 = false;
					addrow2 = driver.findElements(By.xpath("(//*[text()='Add Row'])")).size() > 0;
					if (addrow1) {
						Utils.callSendkeys(driver, ActionXpath.rechnam, "publication", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechlink, "https://portal-dev.ken42.com", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechdecs, "sample", time, log);
						Utils.clickXpath(driver, ActionXpath.rechsave, time, "rechsave", log);

					} else {
						Utils.callSendkeys(driver, ActionXpath.rechnam, "publication", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechlink, "https://portal-dev.ken42.com", time, log);
						Utils.callSendkeys(driver, ActionXpath.rechdecs, "sample", time, log);
						Utils.clickXpath(driver, ActionXpath.rechsave, time, "rechsave", log);
					}
					Utils.clickXpath(driver, ActionXpath.reschconfrence, time, "reschbook", log);
					Utils.callSendkeys(driver, ActionXpath.nameconfrence, "bookname", time, log);
					Utils.clickXpath(driver, ActionXpath.confrencelink, time, "booklink", log);
					Utils.clickXpath(driver, ActionXpath.confrencedecsti, time, "bookdecsti", log);
					Utils.clickXpath(driver, ActionXpath.confrencesave, time, "booksave", log);

					Utils.clickXpath(driver, ActionXpath.reschbook, time, "reschbook", log);
					Utils.callSendkeys(driver, ActionXpath.bookname, "bookname", time, log);
					Utils.clickXpath(driver, ActionXpath.booklink, time, "booklink", log);
					Utils.clickXpath(driver, ActionXpath.bookdecsti, time, "bookdecsti", log);
					Utils.clickXpath(driver, ActionXpath.booksave, time, "booksave", log);
					Utils.logg(log, "info", " TC-32 Faculty edit RESEARCH PUBLICATION  test case PASSED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-32 Faculty edit RESEARCH PUBLICATION test case FAILED\n");
					break;

				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-32 Faculty edit RESEARCH PUBLICATION  Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 33)
	public static void testfacultyEditOTHERS(String student, String faculty, String url, WebDriver driver,
			Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println(" TC-33 Faculty Starting Faculty Edid Others Started  case executation");

				if (Utils.skipthefacultyprofile(url)) {
					Utils.logg(log, "info", " TC-33 Faculty Edid Others Skip Faculty Profile\n");

					return;

				} else {

					Utils.goBackToHome(driver, url, log);
					System.out.println(" TC-33 Faculty edit Conference Started  case executation");
					Utils.goBackToHome(driver, url, log);
					Utils.clickXpath(driver, ActionXpath.FCCportal, time, "facSelectPrtoSignout", log);
					Utils.clickXpath(driver, ActionXpath.faccProfile, time, "facprofile", log);
					Utils.scrollUpOrDown(driver, 300);
					Utils.clickXpath(driver, ActionXpath.others, time, "others", log);
					Utils.clickXpath(driver, ActionXpath.otherssvg, time, "otherssvg", log);
					// Utils.clickXpath(driver, ActionXpath.facdpreaddconfernece, time,
					// "facdpreaddconfernece", log);
					Utils.callSendkeys(driver, ActionXpath.othername, "Sample", time, log);
					Utils.callSendkeys(driver, ActionXpath.otherlink, "https://portal-dev.ken42.com", time, log);
					Utils.callSendkeys(driver, ActionXpath.othersdes, "Sample Desc", time, log);
					Utils.clickXpath(driver, ActionXpath.othersave, time, "othersave", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.logg(log, "info", "TC-33  Faculty edit Conference Completed test case PASSED \n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Thread.sleep(time);
					Utils.logg(log, "warn", "TC-33 Conference test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-33 Faculty edit Conference Completed Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 34)
	public static void testfacultyEditBook(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.skipthefacultyprofile(url)) {
					Utils.logg(log, "info", " TC-34 Faculty Edit book Skip Faculty Profile\n");

					return;

				} else {
					System.out.println(" TC:34 Book Started  case executation");
					Utils.goBackToHome(driver, url, log);
					Utils.clickXpath(driver, ActionXpath.FCCportal, time, "facSelectPrtoSignout", log);
					Utils.clickXpath(driver, ActionXpath.faccProfile, time, "facprofile", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.facdpbook, time, "facdpbook", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.facdpbookedit, time, "facdpbookedit", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.facdpbookadd, time, "facdpbookadd", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.facdpbookname, "Sample", time, log);
					Utils.callSendkeys(driver, ActionXpath.facdpbooklink, "https://portal-dev.ken42.com", time, log);
					Utils.callSendkeys(driver, ActionXpath.facdpbookdesc, "Sample Desc", time, log);
					Utils.clickXpath(driver, ActionXpath.faccSaveNsombm, time, "faccSaveNsombm", log);
					Utils.bigSleepBetweenClicks(1);
					Utils.logg(log, "info", " TC-34 Faculty edit Book Completed test case PASSED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-34 Faculty edit Book test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-34 Faculty edit Book Completed Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 35)
	public static void testfacultyEditProfessionalAssociation(String student, String faculty, String url,
			WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.skipthefacultyprofile(url)) {
					Utils.logg(log, "info", " TC-35 Faculty ProfessionalAssociation Skip Faculty Profile\n");
					return;
				} else {
					Utils.goBackToHome(driver, url, log);
					System.out.println(" TC-35 Professional Association Started  case executation");
					Utils.clickXpath(driver, ActionXpath.FCCportal, time, "facSelectPrtoSignout", log);
					Utils.clickXpath(driver, ActionXpath.faccProfile, time, "facprofile", log);
					Utils.clickXpath(driver, ActionXpath.facdpprof, time, "facdpprof", log);
					Utils.clickXpath(driver, ActionXpath.facdpprofedit, time, "facdpprofedit", log);
					Utils.clickXpath(driver, ActionXpath.facdpprofadd, time, "facdpprofadd", log);
					Utils.callSendkeys(driver, ActionXpath.facdpprofname, "Sample", time, log);
					Utils.callSendkeys(driver, ActionXpath.facdpproflink, "https://portal-dev.ken42.com", time, log);
					Utils.callSendkeys(driver, ActionXpath.facdpprofdesc, "Sample Desc", time, log);
					Utils.clickXpath(driver, ActionXpath.facdpprofsave, time, "facdpprofsave", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.logg(log, "info",
							"  TC-35  Faculty profile edit Professional Association Completed test case PASSED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-35 Faculty profile edit Professional Association test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"  TC-35 Faculty profile edit Professional Association Completed Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 36)
	public static void testfacultyOthers(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.skipthefacultyprofile(url)) {
					Utils.logg(log, "info", " TC-36 Faculty others Skip Faculty Profile \n");
					return;
				} else {
					System.out.println(" TC-36 Faculty edit Others Started  case executation");
					Utils.goBackToHome(driver, url, log);
					Utils.clickXpath(driver, ActionXpath.FCCportal, time, "facSelectPrtoSignout", log);
					Utils.clickXpath(driver, ActionXpath.faccProfile, time, "facprofile", log);
					Utils.clickXpath(driver, ActionXpath.facdpother, time, "facdpother", log);
					Utils.clickXpath(driver, ActionXpath.facdpotheredit, time, "facdpotheredit", log);
					Utils.clickXpath(driver, ActionXpath.facdpotheradd, time, "facdpotheradd", log);
					Utils.callSendkeys(driver, ActionXpath.facdpothername, "Sample", time, log);
					Utils.callSendkeys(driver, ActionXpath.facdpotherlink, "https://portal-dev.ken42.com", time, log);
					Utils.callSendkeys(driver, ActionXpath.facdpotherdesc, "Sample Desc", time, log);
					Utils.clickXpath(driver, ActionXpath.facdpothersave, time, "facdpothersave", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.logg(log, "info", " TC-36 Faculty edit Others Completed test case PASSED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-36 Faculty edit Others test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-36 Faculty edit Others Completed  Test case Failed Retrying once more\n");

				}
			}
		}

	}

	@Test(priority = 37)
	public static void testFacultyDashboard(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {

		try {
			System.out.println("TC-37 Faculty DASHBOARD test executation \n");
			Utils.goBackToHome(driver, url, log);
			if (Utils.checkLtsta(url)) {
				Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time,
						"open academics sapn on the ltsta",
						log);
			} else {
				Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
			}
			Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
			Utils.bigSleepBetweenClicks(1);
			WebElement l = driver.findElement(By.tagName("body"));
			String p = l.getText();
			if (p.contains("Overview") && p.contains("Activities")) {
				Utils.logg(log, "info", "TC-37 Faculty My Student  tab test case PASSED \n");
			} else {
				Utils.logg(log, "warn",
						"TC-37 Faculty My Student  tab test case FAILED it does not contain all the tabs\n");

			}
		} catch (Exception e) {

			Utils.printException(e);
			Utils.goBackToHome(driver, url, log);
			Utils.logout(driver, url, "faculty", log);
			Utils.logg(log, "warn", "TC-37 Faculty DASHBOARD  FAILED\n");

		}
	}

	@Test(priority = 38)
	public static void testFacultyQuestionPaper(String student, String faculty, String url, WebDriver driver,
			Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-38 Faculty QUESTION PAPER test executation \n");
				Utils.goBackToHome(driver, url, log);

				if (Utils.checkLtsta(url)) {
					Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time,
							"open academics sapn on the ltsta",
							log);
				} else {
					Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
				}
				Utils.clickXpath(driver, ActionXpath.facqb, time, "Automation ", log);
				Utils.clickXpath(driver, ActionXpath.facaddmanual, time, "Add anual", log);
				Utils.clickXpath(driver, ActionXpath.facquecclass, time, "facquecclass", log);
				Utils.clickXpath(driver, ActionXpath.facqueclassselect, time, "facqueclassselect", log);

				Utils.clickXpath(driver, ActionXpath.facquesub, time, "facqueclassselect", log);

				Utils.clickXpath(driver, ActionXpath.facquesubselect, time, "Question Bank Select SUbject ", log);
				Utils.clickXpath(driver, ActionXpath.faccnext, time, "Next", log);
				if (Utils.questionbank(url)) {
					Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.facccresurl, "Automation", time, log);
					Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
					// Utils.callSendkeys(driver, ActionXpath.faccquestion, "Question", time, log);
					if (Utils.questionname(url)) {
						System.out.println("Question name skipped");
					} else {
						Utils.callSendkeys(driver, ActionXpath.faccquestionname, "Question Name", time, log);
					}
					Utils.callSendkeys(driver, ActionXpath.facquestionpurpose, "Question Purpose", time, log);
					Utils.clickXpath(driver, ActionXpath.facquestionlevel, time, "facquestionlevel", log);
					Utils.clickXpath(driver, ActionXpath.faclevelselect, time, "faclevelselect", log);
					WebElement toClear = driver
							.findElement(
									By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
					toClear.sendKeys(Keys.CONTROL + "a");
					toClear.sendKeys(Keys.DELETE);
					Utils.callSendkeys(driver, ActionXpath.facquestionmark, "10", time, log);

				} else {
					Utils.callSendkeys(driver, ActionXpath.faccquestion, "Question", time, log);
					if (Utils.uploadimage(url)) {
						String Image_file = "";
						String folder = "";
						folder = Pfs_portal.getFolderPath();
						Image_file = folder + "\\demo.jpg";
						driver.findElement(By.xpath("//input[@accept='.png,.jpg,.jpeg']"))
								.sendKeys(Image_file);
					} else {
						Utils.callSendkeys(driver, ActionXpath.faccquestionname, "Question time", time, log);

					}
				}
				Utils.cleartext(driver, ActionXpath.faccmarks);
				Utils.smallSleepBetweenClicks(1);
				if (Utils.QBoption(url)) {
					Utils.clickXpath(driver, ActionXpath.Option1Insert1, time, "click on option1", log);
					Utils.callSendkeys(driver, ActionXpath.Qurl1, "test1", time, log);
					Utils.clickXpath(driver, ActionXpath.faccoptionsave1, time, "save option1", log);
					Utils.callSendkeys(driver, ActionXpath.Qfacfeedback1, "Excellent", time, log);
					Utils.clickXpath(driver, ActionXpath.Option2Insert2, time, "click on option2", log);
					Utils.callSendkeys(driver, ActionXpath.Qurl2, "test2", time, log);
					Utils.clickXpath(driver, ActionXpath.faccoptionsave2, time, "save option2", log);
					Utils.callSendkeys(driver, ActionXpath.Qfacfeedback2, "Good", time, log);
					Utils.clickXpath(driver, ActionXpath.Option3Insert3, time, "click on option1", log);
					Utils.callSendkeys(driver, ActionXpath.Qurl3, "test3", time, log);
					Utils.clickXpath(driver, ActionXpath.faccoptionsave3, time, "save option3", log);
					Utils.callSendkeys(driver, ActionXpath.Qfacfeedback3, "Better", time, log);

				} else {
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.faccmarks, "10", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.faccoption1, "modi", time, log);
					Utils.smallSleepBetweenClicks(1);

					Utils.callSendkeys(driver, ActionXpath.faccoption2, "sachin", time, log);
					// Utils.callSendkeys(driver, ActionXpath.feedback2, "vg", time, log);
					Utils.callSendkeys(driver, ActionXpath.faccoption3, "anand", time, log);
					// Utils.callSendkeys(driver, ActionXpath.feedback3, "good", time, log);
				}
				Utils.smallSleepBetweenClicks(1);
				if (Utils.QBoption(url)) {
					Utils.clickXpath(driver, ActionXpath.numberofchoice, time, "No of chocice", log);
					Utils.callSendkeys(driver, ActionXpath.feedbackofcrtans, "super", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.feefbacofincorrect, "improve", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.generalfeedback, "gain know", time, log);
					Utils.smallSleepBetweenClicks(1);
				} else {
					Utils.smallSleepBetweenClicks(1);
				}
				Utils.clickXpath(driver, ActionXpath.facsaveandfinish, time, "Finished", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.scrollUpOrDown(driver, time);
				Utils.scrollUpOrDown(driver, time);
				Utils.clickXpath(driver, ActionXpath.facqueback, time, "BAck", log);
				Utils.logg(log, "info", " TC-38 Faculty QUESTION PAPER TEST CASE PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-38 Faculty QUESTION PAPER  FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", " TC-38 Faculty QUESTION PAPER Test case Failed Retrying once more\n");

				}
			}
		}

	}

	@Test(priority = 39)
	public static void testFacultyQuestiontrueORfalse(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-39 Faculty Starting QuestionBank True/false Tab test case Executation");
				Utils.goBackToHome(driver, url, log);

				if (Utils.checkLtsta(url)) {
					Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time,
							"open academics sapn on the ltsta",
							log);
				} else {
					Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
				}
				Utils.clickXpath(driver, ActionXpath.facqb, time, "Question ", log);
				Utils.clickXpath(driver, ActionXpath.facaddmanual, time, "Add anual", log);
				Utils.clickXpath(driver, ActionXpath.trueORfalse, time, "trueORfalse", log);
				Utils.clickXpath(driver, ActionXpath.selecttrueORfalse, time, "selecttrueORfalse", log);
				Utils.clickXpath(driver, ActionXpath.facquecclass, time, "facquecclass", log);
				Utils.clickXpath(driver, ActionXpath.facqueclassselect, time, "facqueclassselect", log);
				Utils.clickXpath(driver, ActionXpath.facquesub, time, "facqueclassselect", log);
				Utils.clickXpath(driver, ActionXpath.facquesubselect, time, "Question Bank Select SUbject ", log);
				Utils.clickXpath(driver, ActionXpath.faccnext, time, "Next", log);
				if (Utils.checkLtsta(url)) {
					Utils.callSendkeys(driver, ActionXpath.ltstaquestion, "Automation", time, log);
					WebElement toClear = driver
							.findElement(
									By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
					toClear.sendKeys(Keys.CONTROL + "a");
					toClear.sendKeys(Keys.DELETE);
					Utils.callSendkeys(driver, ActionXpath.facquestionmark, "5", time, log);
					Utils.clickXpath(driver, ActionXpath.selectingtrue, time, "selectingtrue", log);
				} else {
					Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.facccresurl, "Automation", time, log);
					Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
					WebElement toClear = driver
							.findElement(
									By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
					toClear.sendKeys(Keys.CONTROL + "a");
					toClear.sendKeys(Keys.DELETE);
					Utils.callSendkeys(driver, ActionXpath.facquestionmark, "5", time, log);
					Utils.clickXpath(driver, ActionXpath.selectingtrue, time, "selectingtrue", log);
					Utils.callSendkeys(driver, ActionXpath.questionpurpose, "Automation", time, log);
					Utils.clickXpath(driver, ActionXpath.difficultlevel, time, "difficultlevel", log);
					Utils.clickXpath(driver, ActionXpath.selectmoderate, time, "selectmoderate", log);
				}
				Utils.clickXpath(driver, ActionXpath.facsaveandfinish, time, "Finished", log);
				Utils.clickXpath(driver, ActionXpath.questionback, time, "questionback", log);
				Utils.logg(log, "info", " TC-39 Faculty QuestionBank True/false Test Case PASSED\n");
				break;
			} catch (Exception e) {

				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-39 Faculty QuestionBank True/false Test Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-39 Faculty QuestionBank True/false Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 40)
	public static void testFacultyQuestionshortanswer(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-40 Faculty Starting QuestionBank shortanswer Tab test case Executation");
				Utils.goBackToHome(driver, url, log);

				if (Utils.checkLtsta(url)) {
					Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time,
							"open academics sapn on the ltsta",
							log);
				} else {
					Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
				}
				Utils.clickXpath(driver, ActionXpath.facqb, time, "Question ", log);
				Utils.clickXpath(driver, ActionXpath.facaddmanual, time, "Add anual", log);
				Utils.clickXpath(driver, ActionXpath.trueORfalse, time, "trueORfalse", log);
				Utils.clickXpath(driver, ActionXpath.shortanswer, time, "shortanswer", log);
				Utils.clickXpath(driver, ActionXpath.facquecclass, time, "facquecclass", log);
				Utils.clickXpath(driver, ActionXpath.facqueclassselect, time, "facqueclassselect", log);
				Utils.clickXpath(driver, ActionXpath.facquesub, time, "facqueclassselect", log);
				Utils.clickXpath(driver, ActionXpath.facquesubselect, time, "Question Bank Select SUbject ", log);
				Utils.clickXpath(driver, ActionXpath.faccnext, time, "Next", log);
				Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.facccresurl, "Automation", time, log);
				Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
				if (Utils.checkLtsta(url)) {
					WebElement toClear = driver
							.findElement(
									By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
					toClear.sendKeys(Keys.CONTROL + "a");
					toClear.sendKeys(Keys.DELETE);
					Utils.callSendkeys(driver, ActionXpath.facquestionmark, "5", time, log);
					Utils.callSendkeys(driver, ActionXpath.enteranswer1, "Automation", time, log);
					Utils.callSendkeys(driver, ActionXpath.grade1, "100", time, log);
				} else {
					Utils.callSendkeys(driver, ActionXpath.questionpurpose, "Automation", time, log);
					Utils.clickXpath(driver, ActionXpath.difficultlevel, time, "difficultlevel", log);
					Utils.clickXpath(driver, ActionXpath.selectmoderate, time, "selectmoderate", log);
					WebElement toClear = driver
							.findElement(
									By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
					toClear.sendKeys(Keys.CONTROL + "a");
					toClear.sendKeys(Keys.DELETE);
					Utils.callSendkeys(driver, ActionXpath.facquestionmark, "5", time, log);
					Utils.callSendkeys(driver, ActionXpath.enteranswer1, "Automation", time, log);
					Utils.callSendkeys(driver, ActionXpath.grade1, "100", time, log);
					Utils.callSendkeys(driver, ActionXpath.feedbackSA1, "Sample", time, log);
					Utils.callSendkeys(driver, ActionXpath.generalfeedbackSA, "Sample", time, log);
				}
				Utils.clickXpath(driver, ActionXpath.facsaveandfinish, time, "Finished", log);
				Utils.clickXpath(driver, ActionXpath.questionback, time, "questionback", log);
				Utils.logg(log, "info", " TC-40 : Faculty QuestionBank shortanswer Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-40 Faculty QuestionBank shortanswer Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-40 Faculty QuestionBank shortanswer Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 41)
	public static void testFacultyQuestionEssay(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-41  Faculty Starting QuestionBank Essay Tab test case Executation");
				Utils.goBackToHome(driver, url, log);

				if (Utils.checkLtsta(url)) {
					Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time,
							"open academics sapn on the ltsta",
							log);
				} else {
					Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
				}
				Utils.clickXpath(driver, ActionXpath.facqb, time, "Question ", log);
				Utils.clickXpath(driver, ActionXpath.facaddmanual, time, "Add anual", log);
				Utils.clickXpath(driver, ActionXpath.trueORfalse, time, "trueORfalse", log);
				Utils.clickXpath(driver, ActionXpath.Essay, time, "Essay", log);
				Utils.clickXpath(driver, ActionXpath.facquecclass, time, "facquecclass", log);
				Utils.clickXpath(driver, ActionXpath.facqueclassselect, time, "facqueclassselect", log);
				Utils.clickXpath(driver, ActionXpath.facquesub, time, "facqueclassselect", log);
				Utils.clickXpath(driver, ActionXpath.facquesubselect, time, "Question Bank Select SUbject ", log);
				Utils.clickXpath(driver, ActionXpath.faccnext, time, "Next", log);
				Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.facccresurl, "Automation", time, log);
				Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
				if (Utils.checkLtsta(url)) {
					System.out.println("Skip those steps");
				} else {
					Utils.callSendkeys(driver, ActionXpath.questionpurpose, "Automation", time, log);
					Utils.clickXpath(driver, ActionXpath.difficultlevel, time, "difficultlevel", log);
					Utils.clickXpath(driver, ActionXpath.selectmoderate, time, "selectmoderate", log);
				}
				WebElement toClear = driver
						.findElement(
								By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
				toClear.sendKeys(Keys.CONTROL + "a");
				toClear.sendKeys(Keys.DELETE);
				Utils.callSendkeys(driver, ActionXpath.facquestionmark, "5", time, log);

				Utils.clickXpath(driver, ActionXpath.facsaveandfinish, time, "Finished", log);
				Utils.clickXpath(driver, ActionXpath.questionback, time, "questionback", log);
				Utils.logg(log, "info", " TC-41 : Faculty QuestionBank Essay Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-41 Faculty QuestionBank Essay Test Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-41 Faculty QuestionBank Essay Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 42)
	public static void testaddmorequestion(String student, String faculty, String url, WebDriver driver,
			Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-42 Faculty QUESTION PAPER test executation \n");
				Utils.goBackToHome(driver, url, log);

				if (Utils.checkLtsta(url)) {
					Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time,
							"open academics sapn on the ltsta",
							log);
				} else {
					Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
				}
				Utils.clickXpath(driver, ActionXpath.facqb, time, "Question ", log);
				Utils.clickXpath(driver, ActionXpath.facaddmanual, time, "Add anual", log);
				Utils.clickXpath(driver, ActionXpath.facquecclass, time, "facquecclass", log);
				Utils.clickXpath(driver, ActionXpath.facqueclassselect, time, "facqueclassselect", log);

				Utils.clickXpath(driver, ActionXpath.facquesub, time, "facqueclassselect", log);

				Utils.clickXpath(driver, ActionXpath.facquesubselect, time, "Question Bank Select SUbject ", log);
				Utils.clickXpath(driver, ActionXpath.faccnext, time, "Next", log);
				if (Utils.questionbank(url)) {
					Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.facccresurl, "Question", time, log);
					Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
					// Utils.callSendkeys(driver, ActionXpath.faccquestion, "Question", time, log);
					if (Utils.questionname(url)) {
						System.out.println("Question name skipped");
					} else {
						Utils.callSendkeys(driver, ActionXpath.faccquestionname, "Question Name", time, log);
					}
					Utils.callSendkeys(driver, ActionXpath.facquestionpurpose, "Question Purpose", time, log);
					Utils.clickXpath(driver, ActionXpath.facquestionlevel, time, "facquestionlevel", log);
					Utils.clickXpath(driver, ActionXpath.faclevelselect, time, "faclevelselect", log);
					WebElement toClear = driver
							.findElement(
									By.xpath("//*[text()='Marks for this question']/../../../../..//*[@name='marks']"));
					toClear.sendKeys(Keys.CONTROL + "a");
					toClear.sendKeys(Keys.DELETE);
					Utils.callSendkeys(driver, ActionXpath.facquestionmark, "10", time, log);

				} else {
					Utils.callSendkeys(driver, ActionXpath.faccquestion, "Automation", time, log);
					if (Utils.uploadimage(url)) {
						String Image_file = "";
						String folder = "";
						folder = Pfs_portal.getFolderPath();
						Image_file = folder + "\\demo.jpg";
						driver.findElement(By.xpath("//input[@accept='.png,.jpg,.jpeg']"))
								.sendKeys(Image_file);
					} else {
						Utils.callSendkeys(driver, ActionXpath.faccquestionname, "Question time", time, log);

					}
				}
				Utils.cleartext(driver, ActionXpath.faccmarks);
				Utils.smallSleepBetweenClicks(1);
				if (Utils.QBoption(url)) {
					Utils.clickXpath(driver, ActionXpath.Option1Insert1, time, "click on option1", log);
					Utils.callSendkeys(driver, ActionXpath.Qurl1, "test1", time, log);
					Utils.clickXpath(driver, ActionXpath.faccoptionsave1, time, "save option1", log);
					Utils.callSendkeys(driver, ActionXpath.Qfacfeedback1, "Excellent", time, log);
					Utils.clickXpath(driver, ActionXpath.Option2Insert2, time, "click on option2", log);
					Utils.callSendkeys(driver, ActionXpath.Qurl2, "test2", time, log);
					Utils.clickXpath(driver, ActionXpath.faccoptionsave2, time, "save option2", log);
					Utils.callSendkeys(driver, ActionXpath.Qfacfeedback2, "Good", time, log);
					Utils.clickXpath(driver, ActionXpath.Option3Insert3, time, "click on option1", log);
					Utils.callSendkeys(driver, ActionXpath.Qurl3, "test3", time, log);
					Utils.clickXpath(driver, ActionXpath.faccoptionsave3, time, "save option3", log);
					Utils.callSendkeys(driver, ActionXpath.Qfacfeedback3, "Better", time, log);

				} else {
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.faccmarks, "10", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.faccoption1, "modi", time, log);
					Utils.smallSleepBetweenClicks(1);

					Utils.callSendkeys(driver, ActionXpath.faccoption2, "sachin", time, log);
					// Utils.callSendkeys(driver, ActionXpath.feedback2, "vg", time, log);
					Utils.callSendkeys(driver, ActionXpath.faccoption3, "anand", time, log);
					// Utils.callSendkeys(driver, ActionXpath.feedback3, "good", time, log);
				}
				Utils.smallSleepBetweenClicks(1);
				if (Utils.QBoption(url)) {
					Utils.clickXpath(driver, ActionXpath.numberofchoice, time, "No of chocice", log);
					Utils.callSendkeys(driver, ActionXpath.feedbackofcrtans, "super", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.feefbacofincorrect, "improve", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.generalfeedback, "gain know", time, log);
					Utils.smallSleepBetweenClicks(1);
				} else {
					Utils.smallSleepBetweenClicks(1);
				}
				Utils.clickXpath(driver, ActionXpath.facsaveandfinish, time, "Finished", log);
				Utils.smallSleepBetweenClicks(1);

				if (Utils.checkLtsta(url)) {
					Utils.clickXpath(driver, ActionXpath.addquestion, time, "addquestion", log);

				} else {
					System.out.println("No add question");
				}
				Pfs_faculty.questionadd(faculty, url, driver, faculty, url, log);
				Utils.clickXpath(driver, ActionXpath.returntoQB, time, "returntoQB", log);
				Utils.logg(log, "info", " TC-42: Faculty QUESTION PAPER TEST CASE PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-42 Faculty QUESTION PAPER  FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", " TC-42 Faculty QUESTION PAPER Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 43)
	public static void testFacultySignout(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-43  Faculty  View Profile test Executation Started");
				Utils.goBackToHome(driver, url, log);
				Utils.logout(driver, url, "faculty", log);

				// Utils.clickXpath(driver, ActionXpath.FCCportal, time, "facselectpro", log);
				// Utils.clickXpath(driver, ActionXpath.facprofile, time, "facprofile", log);

				// Utils.clickXpath(driver, ActionXpath.FCCportal, time, "Click of faculty pic",
				// log);
				// Utils.clickXpath(driver, ActionXpath.facsignOut, time, "facsignOut", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.logg(log, "info", " TC-43 Faculty View Profile and Sign out Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-43 Faculty View Profile and Sign out Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-43 Faculty View Profile and Sign out Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 44)
	public static void testFacultyEventFilter(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-44 Faculty Portal Event Filter Tab Test case Started");
				Utils.goBackToHome(driver, url, log);
				Utils.smallSleepBetweenClicks(2);
				// Utils.clickXpath(driver, ActionXpath.eventfilter, time, "facEvent", log);
				Utils.clickXpath(driver, ActionXpath.faccEvent, time, "facEvent", log);
				// Utils.clickXpath(driver, ActionXpath.eventfilterclear, time, "facEvent",
				// log);
				Utils.smallSleepBetweenClicks(1);
				Utils.callSendkeys(driver, ActionXpath.eventfiltersecrech, "Ganesh Chaturthi", time, log);
				Utils.clickXpath(driver, ActionXpath.faceventlocation, time, "faceventlocation", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.faceventlocationselect, time, "faceventlocationselect", log);
				// Utils.callSendkeys(driver, ActionXpath.FaccSearch, "Ganesh", time, log);
				Utils.clickXpath(driver, ActionXpath.eventfiltercatgery, time, "eventfiltercatgery", log);
				Utils.clickXpath(driver, ActionXpath.eventsfiltercatgeryselect, time, "eventsfiltercatgeryselect", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.eventsfiltertype, time, "eventsfiltertype", log);
				Utils.clickXpath(driver, ActionXpath.eventsfiltertypeseclect, time, "eventsfiltertypeseclect", log);
				Utils.logg(log, "info", "TC-44 Faculty Event Filter Test case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-44 Faculty Event Filter Test case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-44 Faculty Event Filter Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 45)
	public static void testFacultymystudentprofileadmissiondetails(String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-45 Faculty Mystudent Profile ADMISSION DETAILS test Executation Started");
				if (Utils.skipmysudents(url)) {
					Utils.goBackToHome(driver, url, log);
					Utils.smallSleepBetweenClicks(1);
					if (Utils.checkLtsta(url)) {
						Utils.clickXpath(driver, ActionXpath.mystudentltsta, time, "mystudent", log);
					} else {
						Utils.clickXpath(driver, ActionXpath.mystudent, time, "mystudent", log);
					}
					// Utils.clickXpath(driver, ActionXpath.mystudent, time, "mystudent", log);
					Utils.callSendkeys(driver, ActionXpath.mystudentserch, "Test Student", time, log);

					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.mystudentprofileclick, time, "mystudentprofileclick", log);
					Utils.callSendkeys(driver, ActionXpath.mystudentyoj, "Raj", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudenthoues, "CBE", time, log);
					Utils.bigSleepBetweenClicks(2);
					Utils.callSendkeys(driver, ActionXpath.mystudentvpaopted, "bangalore", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentecapted, "rurel", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentadhar, "1234567890", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.callSendkeys(driver, ActionXpath.mystudentage, "25", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentallery, "NO", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentdrivername, "kumar", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentphoneno, "250111998", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentphotofamilyhistory, "yes", time, log);
					Utils.clickXpath(driver, ActionXpath.mystudentsubmit, time, "mystudentsubmit", log);
					// Utils.clickXpath(driver, ActionXpath.facsignOut, time, "facsignOut", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.logg(log, "info", " TC-45 Faculty Mystudent Profile ADMISSION DETAILS  Test Case PASSED\n");

				} else {
					Utils.logg(log, "info", " TC-45 Faculty Mystudent Profile Skipped for this portals \n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-45 Faculty Mystudent Profile ADMISSION DETAILS Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-45 Faculty Mystudent Profile ADMISSION DETAILS  Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 46)
	public static void testFacultymystudentprofilepresonaldetails(String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.skipmysudents(url)) {
					System.out.println(" TC-46 Faculty Mystudent Profile PERSONAL DETAILS test Executation Started");
					Utils.goBackToHome(driver, url, log);
					Utils.smallSleepBetweenClicks(2);
					if (Utils.checkLtsta(url)) {
						Utils.clickXpath(driver, ActionXpath.mystudentltsta, time, "mystudent", log);
					} else {
						Utils.clickXpath(driver, ActionXpath.mystudent, time, "mystudent", log);
					}
					Utils.smallSleepBetweenClicks(2);
					Utils.callSendkeys(driver, ActionXpath.mystudentserch, "Test Student", time, log);
					Utils.clickXpath(driver, ActionXpath.mystudentprofileclick, time, "mystudentprofileclick", log);
					Utils.clickXpath(driver, ActionXpath.mystudentpersonal, time, "mystudentpersonal", log);
					Utils.callSendkeys(driver, ActionXpath.mystudentperfather, "hari", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentmother, "janaki", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentprimarycontant, "567896543", time, log);
					Utils.callSendkeys(driver, ActionXpath.bloodgroup, "AB+", time, log);
					Utils.callSendkeys(driver, ActionXpath.alternatorcontact, "345698765", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentmailid, "hari@gmail.com", time, log);
					Utils.callSendkeys(driver, ActionXpath.fatherocupation, "Army", time, log);
					Utils.callSendkeys(driver, ActionXpath.moterocupation, "home maker", time, log);
					Utils.callSendkeys(driver, ActionXpath.anualincome, "5-lash", time, log);
					Utils.callSendkeys(driver, ActionXpath.emercycontant, "453666655", time, log);
					Utils.clickXpath(driver, ActionXpath.personalsubit, time, "personalsubit", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.logg(log, "info",
							" TC-46 Faculty Mystudent Profile PERSONAL DETAILS and  Test Case PASSED\n");

				} else {
					Utils.logg(log, "info", "TC-46 Faculty Mystudent Profile Skipped for this portals\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-46 Faculty Mystudent Profile PERSONAL  DETAILS Test Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-46 Faculty Mystudent Profile PERSONAL DETAILS and  Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 47)
	public static void testFacultymystudentprofileaddresdetails(String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.skipmysudents(url)) {
					System.out.println(" TC-47 Faculty Mystudent Profile Address Details Test Executation Started");
					Utils.goBackToHome(driver, url, log);
					Utils.smallSleepBetweenClicks(2);
					if (Utils.checkLtsta(url)) {
						Utils.clickXpath(driver, ActionXpath.mystudentltsta, time, "mystudent", log);
					} else {
						Utils.clickXpath(driver, ActionXpath.mystudent, time, "mystudent", log);
					}
					Utils.callSendkeys(driver, ActionXpath.mystudentserch, "Test Student", time, log);
					Utils.clickXpath(driver, ActionXpath.mystudentprofileclick, time, "mystudentprofileclick", log);
					Utils.smallSleepBetweenClicks(2);
					// Utils.callSendkeys(driver, ActionXpath.adderwsdetails, "hari", time, log);
					Utils.clickXpath(driver, ActionXpath.adderwsdetails, time, "adderwsdetails", log);
					Utils.callSendkeys(driver, ActionXpath.streetaddres, "renganathapuram", time, log);
					Utils.callSendkeys(driver, ActionXpath.cityaddres, "CBE-BANGALORE", time, log);
					Utils.callSendkeys(driver, ActionXpath.postalcode, "7642", time, log);
					Utils.callSendkeys(driver, ActionXpath.mystudentstate, "KT", time, log);
					Utils.callSendkeys(driver, ActionXpath.countrydetails, "IND", time, log);
					Utils.callSendkeys(driver, ActionXpath.streetperment, "Truchi", time, log);
					Utils.callSendkeys(driver, ActionXpath.cityperment, "BANGALORE RUREL", time, log);
					Utils.callSendkeys(driver, ActionXpath.postalcodeperment, "IPO", time, log);
					Utils.callSendkeys(driver, ActionXpath.permentstate, "KARNATAKA", time, log);
					Utils.callSendkeys(driver, ActionXpath.permentcountary, "hari", time, log);
					Utils.clickXpath(driver, ActionXpath.personalsubit, time, "personalsubit", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.logg(log, "info",
							" TC-47 Faculty Mystudent Profile Address Details  and  Test Case PASSED\n");

				} else {
					Utils.logg(log, "info", "TC-47 Faculty Mystudent Profile Skipped for this portals\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "faculty", log);
					Utils.logg(log, "warn", "TC-47 Faculty Mystudent Profile Address Details  Test Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-47 Faculty Mystudent Profile Address Details  and  Test case Failed Retrying once more\n");

				}
			}
		}
	}

	// ------------------------------------------------------------------------------------------------
	// Extra TC not added
	@Test(priority = 11111)
	public static void Myclasses(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		try {
			if (Utils.checkLtsta(url)) {
				Utils.clickXpath(driver, ActionXpath.facClickacademicsltsta, time, "open academics sapn on the ltsta",
						log);
			} else {
				Utils.clickXpath(driver, ActionXpath.openFacltsta, time, "open span on acadmics on the ltsta", log);
			}
			Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
			Utils.bigSleepBetweenClicks(1);
			Utils.clickXpath(driver, ActionXpath.classclick1, time, "classclick1", log);
			Utils.bigSleepBetweenClicks(20);

			// Find the parent element
			WebElement parentElement = driver.findElement(
					By.xpath(
							"(//*[text()='General Course Content'])[2]/../../..//*[@class='MuiSvgIcon-root']"));
			// Find all elements with the class name "my-class" inside the parent element
			List<WebElement> childElements = parentElement
					.findElements(By.xpath("//*[contains(@class, 'MuiBox-root jss')]//*[@class='MuiSvgIcon-root']"));

			// Get the count of elements with the class name "my-class"
			int count = childElements.size();
			// Print the count
			int count1 = count / 2;
			System.out.println("Number of row in a table " + count1);
			Utils.bigSleepBetweenClicks(1);

		} catch (Exception e) {
			Utils.printException(e);
			Utils.goBackToHome(driver, url, log);
			Utils.logout(driver, url, "faculty", log);
			log.warning("TC-1111: Faculty edit Book test case FAILED \n");
		}
	}
	// ------------------------------------------------------------------------------------------------

}