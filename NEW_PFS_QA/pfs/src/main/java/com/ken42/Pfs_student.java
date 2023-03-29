package com.ken42;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;
import org.testng.annotations.Test;

import io.qase.api.annotation.QaseId;

public class Pfs_student {
	public static Logger log = Logger.getLogger("Pfs_portal");
	static int time = 2000;

	@Test(priority = 1)
	public static void testStudent(String url, WebDriver driver, Logger log) throws Exception {
		try {
			System.out.println(" TC-1:  Student Starting Home tab  case execution");
			// Utils.bigSleepBetweenClicks(1);
			// Utils.clickXpath(driver, ActionXpath.Stu_prName, time, "Click on Login
			// initial", log);
			// Check if Attendance, Assessments, Schedule are present in home tab.
			WebElement l = driver.findElement(By.tagName("body"));
			String p = l.getText();
			if (p.contains("XXXXX") && p.contains("Assessments")
					&& p.contains("Timetable") && p.contains("Schedule") && p.contains("MY SUBJECTS")) {
				Utils.logg(log, "info", "TC-1: Student Home tab test case PASSED \n\n");
			} else {
				log.warning(" TC-1 Student Home tab test case FAILED it does not contain all the tabs\n\n");
			}
			if (p.contains("Attendance") && p.contains("Assessments")
					&& p.contains("Timetable") && p.contains("Schedule") && p.contains("MY SUBJECTS")) {
				Utils.logg(log, "info", "TC-1 Student Home tab test case PASSED \n\n");
			} else {
				log.warning(" TC-1 Student Home tab test case FAILED it does not contain all the tabs\n\n");
			}
		} catch (Exception e) {

			Utils.printException(e);
			Utils.logout(driver, url, "student", log);
			Utils.logg(log, "warn", " TC-1 Student Home tab test case FAILED \n");
		}
	}

	@Test(priority = 2)
	public static void testStudentEnrollment(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println(" TC-2  Starting Student Enrollment  case execution");
				Utils.smallSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.portfolio, time, "click portfolio", log);
				Utils.clickXpath(driver, ActionXpath.kerextracuricular, time, "Click on extracuricularactivties",
						log);

				Utils.clickXpath(driver, ActionXpath.kerachivement, time, "Click achivement", log);
				Utils.clickXpath(driver, ActionXpath.kerconduct, time, "Click Conduct", log);
				Utils.clickXpath(driver, ActionXpath.kerrequestcomplint, time, "Click port&complint", log);
				Utils.bigSleepBetweenClicks(2);
				// Utils.clickXpath(driver, ActionXpath.portraisetiket, time, "Click
				// Raise&tiket", log);
				Utils.clickXpath(driver, ActionXpath.portpersonaldet, time, "Click personal dr", log);

				Utils.logg(log, "info", "TC-2 Enrollment of the Student Test Case PASSED \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-2 Enrollment of the Student Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-2 Enrollment of the Student Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 3)
	public static void testStudentAcademic(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-3: Starting Student Academic  test case execution\n");
				Utils.clickXpath(driver, ActionXpath.dashbord, time, "click dashbord", log);
				Utils.clickXpath(driver, ActionXpath.clicklearn, time, "click learn", log);
				Utils.clickXpath(driver, ActionXpath.overalldropdown, time, "click over all drop down", log);
				Utils.clickXpath(driver, ActionXpath.selectoveralldropdown, time, "select the all drop down", log);

				Utils.logg(log, "info", "TC-3 Student Academic Test Case PASSED  \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-3 Student Academic Test Case FAILED  \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-3 Student Academic Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 4)
	public static void testStudentExamination(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-4:   Starting Student Examination test case execution");
				Utils.goBackToHome(driver, url, log);
				if (Utils.checkUrlToSkipTest(url)) {
					Utils.logg(log, "info", "TC-4 Exam tab Skipped as this is not applicable for this portal \n");

					return;
				}
				if (Utils.checkLtsta(url)) {
					// Do nothing
				} else {
					Utils.clickXpath(driver, ActionXpath.ClickExam, time, "Click Exams", log);
				}
				Utils.clickXpath(driver, ActionXpath.examAnnouncements, time, "Click on Announcement", log);
				Utils.logg(log, "info", "TC-4 Student Examination Test Case PASSED \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-4 Student Examination Test Case FAILED  \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-4 Student Examination Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 5)
	public static void testStudentAttendance(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-5: Starting Student Attendance test case execution");

				Utils.clickXpath(driver, ActionXpath.clickonattendance, time, "Select the Attendance History",
						log);

				Utils.logg(log, "info", "TC-5 Student Attendance Test Case PASSED  \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-5 Student Attendance  Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-5: Student Attendance Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 6)
	public static void testStudentTimeTable(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-6: Starting Student Timetable test case execution ");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.ClickTimetable, time, "Select time table", log);
				Utils.clickXpath(driver, ActionXpath.TimeTableMonth, time, "Select Month view", log);
				Utils.clickXpath(driver, ActionXpath.TimeTableWeek, time, "Selecte Week view", log);
				Utils.clickXpath(driver, ActionXpath.TimeTableDay, time, "Select Day view", log);
				Utils.logg(log, "info", "TC-6   Student Timetable Test Case PASSED  \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-6  Student Timetable Test Case Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-6   Student Timetable Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 7)
	public static void testStudentFees(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-7:  Starting Student FEES test case execution");
				Utils.goBackToHome(driver, url, log);

				Utils.clickXpath(driver, ActionXpath.clickonfees, time, "Expand the Fees", log);
				Utils.clickXpath(driver, ActionXpath.clickonpendingfees, time, " Click pendingfees", log);
				Utils.clickXpath(driver, ActionXpath.clickonfeecart, time, "Expand the Fees cart", log);

				Utils.clickXpath(driver, ActionXpath.clickonfeeschedule, time, "Expand the Fees schedule", log);
				Utils.clickXpath(driver, ActionXpath.clickonfeescheduleclass, time, " Click Fee Schedule class", log);
				Utils.clickXpath(driver, ActionXpath.clickontranscation, time, "clickon transcation", log);

				Utils.clickXpath(driver, ActionXpath.clickonstudentservice, time, " clickon studentservice", log);
				Utils.clickXpath(driver, ActionXpath.clickonfeestudentserviceinr, time, "clickon feestudentserviceinr",
						log);

				Utils.logg(log, "info", "TC-7 Student Fees Test Case PASSED  \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-7 Student Fees Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-7 Student Fees Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 8)
	public static void testStudentFeedback(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-8:   Starting Student FEEDBACK test case execution");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.feedBack, time, "FeedBack", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.clickPending, time, "Programe Feedbcak", log);
				Utils.logg(log, "info", "TC-8 Student FEEDBACK tab Test Case PASSED \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-8 Student FEEDBACK tab Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-8 Student FEEDBACK tab Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 9)
	public static void testStudentStudentStatus(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-9  Starting  Student Services check cancel button test case execution ");
				Utils.goBackToHome(driver, url, log);

				Utils.clickXpath(driver, ActionXpath.StudentService, time, "Student Status", log);
				Utils.clickXpath(driver, ActionXpath.addrequest, time, "Make Raise", log);
				Utils.clickXpath(driver, ActionXpath.requesttype, time, "Raise case", log);
				Utils.clickXpath(driver, ActionXpath.selectdropdown, time, "Button Raise", log);
				Utils.clickXpath(driver, ActionXpath.Priority, time, "Raise case", log);
				Utils.clickXpath(driver, ActionXpath.selectdropdown, time, "Button Raise", log);
				Utils.callSendkeys(driver, ActionXpath.reasonrequst, "WIfi not working ", time, log);
				Utils.clickXpath(driver, ActionXpath.Submitrequest, time, "Cancel the raise case", log);
				Utils.logg(log, "info", "TC-9 Student Services check cancel button Test Case PASSED \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-9 Student Services check cancel button Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"TC-9 Student Services check cancel button Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 10)
	public static void testStudentRaiseCase(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-10 Starting Student Services Raise test case execution \n");
				Utils.goBackToHome(driver, url, log);

				Utils.clickXpath(driver, ActionXpath.StudentService, time, "Raise case", log);
				Utils.clickXpath(driver, ActionXpath.raisecomplain, time, "Button Raise", log);
				Utils.clickXpath(driver, ActionXpath.requesttype, time, "Raise case", log);
				Utils.clickXpath(driver, ActionXpath.selectdropdown, time, "Button Raise", log);
				Utils.clickXpath(driver, ActionXpath.Priority, time, "Raise case", log);
				Utils.clickXpath(driver, ActionXpath.selectdropdown, time, "Button Raise", log);
				Utils.callSendkeys(driver, ActionXpath.reasonrequst, "WIfi not working ", time, log);
				Utils.clickXpath(driver, ActionXpath.Submitrequest, time, "Cancel the raise case", log);
				Utils.logg(log, "info", " TC-10 Student Service Raise case Test Case PASSED \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-10 Student Service Raise case Test Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", " TC-10 Student Service Raise case Test case Failed Retrying once more\n");

				}
			}
		}

	}

	@Test(priority = 11)
	public static void requestfilter(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-11 Starting Student Services make request test case execution ");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.StudentService, time, "Raise case", log);
				Utils.clickXpath(driver, ActionXpath.requestfilter, time, "Student Status", log);
				Utils.clickXpath(driver, ActionXpath.filter1, time, "Click the button Make raise", log);
				Utils.clickXpath(driver, ActionXpath.selectdropdown, time, "selet the Button Make request", log);
				Utils.clickXpath(driver, ActionXpath.filter2, time, "Submit the make requst option", log);
				Utils.clickXpath(driver, ActionXpath.selectdropdown, time, "selet the Button Make request", log);
				Utils.clickXpath(driver, ActionXpath.Applyss, time, "selet the Button Make request", log);
				Utils.logg(log, "info", " TC-11 Student services make request test case PASSED  \n");
				break;

			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-11 Student services make request test Case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", " TC-11 Student Service Raise case Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 12)
	public static void testStudentEvent(String student, String faculty, String url, WebDriver driver, Logger log)
			throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-12  Starting Student Event case Execution ");
				Utils.goBackToHome(driver, url, log);
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.portevent, time, "click event", log);
				Utils.clickXpath(driver, ActionXpath.portfilter, time, "click filter", log);
				Utils.clickXpath(driver, ActionXpath.allcategary, time, "click all categaroy", log);
				Utils.clickXpath(driver, ActionXpath.selectallcategary, time, "click select categary", log);
				Utils.clickXpath(driver, ActionXpath.cliclapply, time, "click apply button", log);
				Utils.logg(log, "info", "TC-12 Student EVENT Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-12 Student EVENT Test Case  FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-12 Student EVENT Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 13)
	public static void testStudentProfile(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println("TC-13 Starting execution of student profile");
				Utils.goBackToHome(driver, url, log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.Stu_prName, time, "Click on Initial icon", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.kerprofile, time, "Click on profile button", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.kerextracuricular, time, "Click on edit SVG", log);
				Utils.clickXpath(driver, ActionXpath.kerfolioacdemics, time, "Click on Save", log);
				Utils.clickXpath(driver, ActionXpath.kerclub, time, "Click on Save", log);
				Utils.clickXpath(driver, ActionXpath.kerfootball, time, "Click on Save", log);
				Utils.clickXpath(driver, ActionXpath.kerother, time, "Click on Save", log);
				Utils.clickXpath(driver, ActionXpath.kerachivement, time, "Click on Save", log);
				Utils.clickXpath(driver, ActionXpath.kerconduct, time, "Click on Save", log);
				Utils.clickXpath(driver, ActionXpath.kerrequestcomplint, time, "Click on Save", log);
				Utils.bigSleepBetweenClicks(1);
				Utils.logg(log, "info", "  TC-13: Student profile test case PASSED  \n");

				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-13 Student profile test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "  TC-13 Student profile Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 14)
	public static void testStudentEditProfile(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				System.out.println(" TC-14 Starting student edit profile education Details case execution");
				Utils.goBackToHome(driver, url, log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.Stu_prName, time, "Click on profile Icon", log);
				Utils.clickXpath(driver, ActionXpath.kerprofile, time, "Click on profile button", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.keroersonaldetails, time, "Click on education", log);
				Utils.clickXpath(driver, ActionXpath.kereditdetail, time, "CLick on edit SVG", log);
				Utils.callSendkeys(driver, ActionXpath.kermiddlename, "test", time, log);
				Utils.clickXpath(driver, ActionXpath.kergender, time, "CLick on edit SVG", log);
				Utils.clickXpath(driver, ActionXpath.kerselcetgender, time, "CLick on edit SVG", log);
				Utils.callSendkeys(driver, ActionXpath.kerbirthplace, "test", time, log);
				Utils.clickXpath(driver, ActionXpath.kersubmit, time, "CLick on edit SVG", log);

				Utils.logg(log, "info", " TC-14 Student profile edit  test case PASSED \n");

				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-14 Student profile edit  test case FAILED\n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							" TC-14 Student profile edit Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 15)
	public static void testStudentEditAddress(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.stueditprofil(url)) {
					log.info(
							"TC-15 Student Education Deatil Skipped this test as this is not applicable for this portal\n\n");

					return;
				} else {
					if (Utils.checkltpct(url)) {
						Utils.logg(log, "info", " TC-15 Student Address Edit is not supported on this portal\n");
						return;
					}
					System.out.println(" TC-15 Starting student prfofile edit Address test case execution");

					Utils.goBackToHome(driver, url, log);
					Utils.bigSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.Stu_prName, time, "profile", log);
					Utils.clickXpath(driver, ActionXpath.stuprofile, time, "stuprofile", log);
					Utils.smallSleepBetweenClicks(1);
					// if (Utils.checkLtsta(url)) {
					// driver.findElement(By.xpath(ActionXpath.stuprofile)).sendKeys(Keys.TAB);
					// }
					JavascriptExecutor js14 = (JavascriptExecutor) driver;
					js14.executeScript("window.scrollBy(0,2500)");
					Utils.bigSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.stuadddrop, time, "stuadddrop", log);
					Utils.vsmallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.stuedit, time, "stuedit", log);
					Utils.clickXpath(driver, ActionXpath.stuaddadd, time, "stuaddadd", log);
					Utils.callSendkeys(driver, ActionXpath.stuhouse, "SAMPLE", time, log);
					Utils.callSendkeys(driver, ActionXpath.sturoad, "SAMPLE", time, log);
					Utils.callSendkeys(driver, ActionXpath.stusuburb, "SAMPLE", time, log);
					Utils.callSendkeys(driver, ActionXpath.stucountry, "India", time, log);
					Utils.callSendkeys(driver, ActionXpath.stupincode, "600001", time, log);
					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.stusave, time, "stusave", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.bigSleepBetweenClicks(1);
					Utils.logg(log, "info", "  TC-15 Student profile edit address detail test case PASSED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-15 Student profile edit address detail test case FAILED \n");
					break;

				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info",
							"  TC-15 Student profile edit address detail Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 16)
	public static void testStudentSignout(String url, WebDriver driver, Logger log) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-16 :     Starting Student SIGNOUT  case execution ");
				Utils.goBackToHome(driver, url, log);
				Utils.clickXpath(driver, ActionXpath.FCCportal, time, " on the Profile on the student portal", log);
				Utils.clickXpath(driver, ActionXpath.signOut, time, "Signout the student portal", log);
				Utils.logg(log, "info", "TC-16 Student SIGNOUT Test Case PASSED  \n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.goBackToHome(driver, url, log);
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "warn", "TC-16 Student SIGNOUT Test Case FAILED \n");
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, "student", log);
					Utils.logg(log, "info", "TC-16 Student SIGNOUT Test case Failed Retrying once more\n");

				}
			}
		}
	}
}