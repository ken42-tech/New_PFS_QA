package com.ken42;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.logging.Logger;
import org.testng.annotations.Test;

public class Pfs_resource {
	public static Logger log = Logger.getLogger("Pfs_portal");
	static int time = 2000;
	private static String PFSurl;

	@Test
	public static void resourceFacultyInitialSteps(String faculty, String url, WebDriver driver, Logger log,
			String[] csvCell)
			throws Exception {
		Utils.login(driver, faculty, url, log, csvCell);
		Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
		Utils.clickXpath(driver, ActionXpath.faccc, time, "Click on course content", log);
	}

	public static void resourceSubmitForm(String faculty, String url, WebDriver driver, Logger log) throws Exception {

		try {
			Utils.clickXpath(driver, ActionXpath.facssadd, time, "Click of add resource", log);
			Utils.smallSleepBetweenClicks(2);
			Utils.clickXpath(driver, ActionXpath.facccresdescclick, time, "Click on URL resource link", log);
			// Utils.smallSleepBetweenClicks(1);
			// Utils.clickXpath(driver, ActionXpath.facssadd, time, "facssadd");
			Utils.smallSleepBetweenClicks(1);
			// Utils.clickXpath(driver, ActionXpath.facccresdescclick, time,
			// "facccresdescclick");
			Utils.callSendkeys(driver, ActionXpath.facccresurl, "Hello", time, log);
			// Utils.callSendkeys(driver, "//*[@id='tinymce']//p", "Testing", time);
			Utils.clickXpath(driver, ActionXpath.facccressubmitform, time, "Save URL link button", log);
			// log.info("resource create passed ");

		} catch (Exception e) {

			Utils.printException(e);
			log.warning(" Resource create Fuction FAILED  ");
			throw (e);

		}

	}

	public static void resourcePublishAndLogout(String faculty, String url,
			WebDriver driver, String fileName, String Role, Logger log) throws Exception {
		try {

			Utils.clickXpath(driver, "//p[. ='" + fileName + "']/../../.././..//*[local-name()='svg']", time,
					"Select PPT file name", log);
			Utils.clickXpath(driver, ActionXpath.facsspublish, time, "Click on publish button1", log);
			Utils.clickXpath(driver, ActionXpath.facsspublishyes, time, "Click on publish button2", log);
			Utils.bigSleepBetweenClicks(1);
			Utils.logout(driver, url, Role, log);

			// log.info(fileName + " Publish passed ");
		} catch (Exception e) {
			Utils.printException(e);
			log.warning(fileName + " Publish Fuction FAILED  ");
			throw (e);
		}

	}

	public static void resourceStudentViewAndLogout(String faculty, String url,
			WebDriver driver, String fileName, String Role, Logger log) throws Exception {
		try {
			Utils.clickXpath(driver, "//p[.='" + fileName + "']/../../.././..//*[local-name()='svg']", time,
					"Select PPT file name", log);
			Utils.clickXpath(driver, ActionXpath.viewpdf2, time, "Click on View Spreadsheet", log);
			Utils.clickXpath(driver, ActionXpath.learn, time, "click learn", log);
			Utils.logout(driver, url, Role, log);
			// log.info(fileName + "Studentview passed ");
		} catch (Exception e) {
			Utils.printException(e);
			log.warning(fileName + "Studentview Fuction FAILED  ");
			throw (e);
		}
	}

	public static void resourceextra(String faculty, String url,
			WebDriver driver, String fileName, String Role, Logger log) throws Exception {
		try {
			Utils.clickXpath(driver, ActionXpath.autoupdatefreequecy, time,
					"autoupdatefreequecy", log);
			Utils.clickXpath(driver, ActionXpath.clickinever, time, "clickinever", log);
			Utils.clickXpath(driver, ActionXpath.appearance, time, "appearance", log);
			Utils.clickXpath(driver, ActionXpath.currentwindow, time, "currentwindow",
					log);
			Utils.clickXpath(driver, ActionXpath.displaycoures, time, "displaycoures",
					log);
			Utils.clickXpath(driver, ActionXpath.selectyes, time, "selectyes", log);
			Utils.clickXpath(driver, ActionXpath.displayattpetstatus, time,
					"displayattpetstatus", log);
			Utils.clickXpath(driver, ActionXpath.selectdisplatattmpt, time,
					"selectdisplatattmpt", log);
			Utils.callSendkeys(driver, ActionXpath.avalibityfrom, "22-02-2023", time, log);
			new Actions(driver).sendKeys(Keys.TAB).perform();
			Utils.callSendkeys(driver, ActionXpath.avalibityfrom, "11:20", time, log);
			Utils.callSendkeys(driver, ActionXpath.avlabityto, "22-02-2023", time, log);
			new Actions(driver).sendKeys(Keys.TAB).perform();
			Utils.callSendkeys(driver, ActionXpath.avlabityto, "11:20", time, log);
			Utils.clickXpath(driver, ActionXpath.numberofattpmt, time, "numberofattpmt", log);
			Utils.clickXpath(driver, ActionXpath.selectnoofattmpt, time, "selectnoofattmpt", log);
			Utils.clickXpath(driver, ActionXpath.attpmtsgreding, time, "attpmtsgreding", log);
			Utils.clickXpath(driver, ActionXpath.selectattmtgreding, time, "selectattmtgreding", log);
			Utils.clickXpath(driver, ActionXpath.forecenewattmpt, time, "forecenewattmpt", log);
			Utils.clickXpath(driver, ActionXpath.selectforeceattmpt, time, "selectforeceattmpt", log);
			Utils.clickXpath(driver, ActionXpath.loockfinalattmpt, time, "forecenewattmpt", log);
			Utils.clickXpath(driver, ActionXpath.selectfinalattmpt, time, "selectfinalattmpt", log);
			Utils.clickXpath(driver, ActionXpath.compltetiontraking, time, "compltetion", log);
			Utils.clickXpath(driver, ActionXpath.compltetiontrakingselect, time, "compltetiontrakingselect", log);
			Utils.callSendkeys(driver, ActionXpath.expectcompletedon, "22-02-2023", time, log);
			new Actions(driver).sendKeys(Keys.TAB).perform();
			Utils.callSendkeys(driver, ActionXpath.expectcompletedon, "12:00", time, log);

		} catch (Exception e) {
			Utils.printException(e);
			log.warning(fileName + "Studentview Fuction FAILED  ");
			throw (e);
		}
	}

	public static void resourceEdit(String faculty, String url,
			WebDriver driver, String fileName, String Role, Logger log) throws Exception {
		try {
			Utils.clickXpath(driver, "//p[.='" + fileName + "']/../../.././..//*[local-name()='svg']", time,
					"Select PPT file name", log);
			Utils.clickXpath(driver, ActionXpath.facpdfedit, time, "Click on edit button", log);
			Utils.clickXpath(driver, ActionXpath.deletefile, time, "Click on deletefile", log);
		} catch (Exception e) {
			Utils.printException(e);
			log.warning(fileName + "Delete Fuction FAILED  ");
			throw (e);
		}
	}

	public static void resourceDeleteAndLogout(String faculty, String url,
			WebDriver driver, String fileName, String Role, Logger log) throws Exception {
		try {

			Utils.clickXpath(driver, "//p[.='" + fileName + "']/../../.././..//*[local-name()='svg']", time,
					"Select PPT file name", log);
			Utils.clickXpath(driver, ActionXpath.facpdfdelete, time, "Click on Delete button1", log);
			Utils.clickXpath(driver, ActionXpath.facpdfdelete2, time, "Click on delete button2", log);
			// Utils.logout(driver, url, Role, log);
			// log.info(fileName + "Delete passed ");
			Utils.logout(driver, url, Role, log);

		} catch (Exception e) {
			Utils.printException(e);
			log.warning(fileName + "Delete Fuction FAILED  ");
			throw (e);
		}
	}

	public static void resorcesdelete(String faculty, String url,
			WebDriver driver, String[] csvCell, String Role, Logger log, String Prefix, String xpath) throws Exception {
		try {
			resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
			Utils.smallSleepBetweenClicks(5);
			Utils.clickXpath(driver, xpath, time, "View Resources" + xpath, log);
			Utils.smallSleepBetweenClicks(1);
			List<WebElement> elements = driver.findElements(By.xpath("(//*[contains(text(), '" + Prefix + "')])"));
			int count = elements.size();
			System.out.println("Count is: " + count);
			while (count > 0) {
				Utils.smallSleepBetweenClicks(4);
				Utils.clickXpath(driver,
						"(//*[contains(text(), '" + Prefix + "')]/../../../../..//*[local-name()='svg'])[1]", time,
						"Select LINK file name", log);
				Utils.clickXpath(driver, ActionXpath.facpdfdelete, time, "Click on Delete button1", log);
				Utils.clickXpath(driver, ActionXpath.facpdfdelete2, time, "Click on delete button2", log);
				count--;
			}
			Utils.logout(driver, url, Role, log);
		} catch (Exception e) {
			Utils.printException(e);
			Utils.logg(log, "warn_d", " Delete Fuction FAILED  ");
			throw (e);
		}

	}

	@Test(priority = 48)
	public static void testSpreadsheetCreateViewDelete(String student, String faculty, String url,
			String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {

		int RetryCount = 0;
		while (true) {
			try {

				String SpreadSheetFile = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				SpreadSheetFile = folder + "\\demo.xlsx";

				System.out.println("TC-48:  SpreadSheet resource Create View delete Test case Started");

				Utils.smallSleepBetweenClicks(1);
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				// String returnArray[] = new String[2];
				// returnArray = Utils.getClassSubjectAndSection(driver, url,"resource");
				// String programconverted = returnArray[0];
				// String subject = returnArray[1];

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facssclick, time, "facssclick", log);
				resourceSubmitForm(faculty, url, driver, log);

				String fileName = "Excel_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.xlsx,.xls']")).sendKeys(SpreadSheetFile);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				// Utils.clickXpath(driver, ActionXpath.facccressubmityes, time,
				// "facccressubmityes", log);
				// Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);

				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				Utils.smallSleepBetweenClicks(1);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facssopen, time, "Click on SS SVG", log);

				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);

				// Student part starts
				Utils.login(driver, student, url, log, csvCell);
				Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.learn, time, "learn", log);
				Utils.smallSleepBetweenClicks(1);

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();

				Utils.clickXpath(driver, ActionXpath.viewss, time, "viewss", log);
				resourceStudentViewAndLogout(faculty, url, driver, fileName, Role, log);
				// Student part ends

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.facssopen, time, "facspreadsheetopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-48 SpreadSheet resource Create View delete Test Case PASSED\n");
				break;
			} catch (Exception e) {

				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-48 SpreadSheet resource Create View delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-48 SpreadSheet resource Create View delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 49)
	public static void testPPTCreateViewDelete(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {

				String folder = "";
				folder = Pfs_portal.getFolderPath();
				String PPT_file = "";
				PPT_file = folder + "\\demo.pptx";

				System.out.println("TC-49  PPT resource Create View delete Test case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facpptclick, time, "facpptclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "PPT_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.ppt,.pptx']")).sendKeys(PPT_file);
				Utils.smallSleepBetweenClicks(1);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facpptfopen, time, "facpptfopen", log);
				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);

				Utils.login(driver, student, url, log, csvCell);
				Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.learn, time, "learn", log);

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();

				Utils.clickXpath(driver, ActionXpath.viewppt, time, "viewppt", log);
				resourceStudentViewAndLogout(faculty, url, driver, fileName, Role, log);

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.facpptfopen, time, "facpptfopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-49 PPT resource Create View delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-49 PPT resource Create View delete Test Case FAILED \n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-49 PPT resource Create View delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 50)
	public static void testPDFCreateViewDelete(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String PDF_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				PDF_file = folder + "\\demo.pdf";

				System.out.println("TC-50  Create PDF resource publish and delete PDF");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facccrespdf, time, "facccrespdf", log);
				resourceSubmitForm(faculty, url, driver, log);

				String fileName = "PDF_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.pdf']"))
						.sendKeys(PDF_file);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facpdfopen, time, "facpdfopen", log);
				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);

				// Now verify in student
				Utils.login(driver, student, url, log, csvCell);
				Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.learn, time, "learn", log);

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();

				Utils.clickXpath(driver, ActionXpath.viewpdf, time, "viewpdf", log);
				resourceStudentViewAndLogout(faculty, url, driver, fileName, Role, log);

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.facpdfopen, time, "facpdfopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-50 Create PDF resource publish and delete PDF Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-50 Create PDF resource publish and delete PDF Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-50 Create PDF resource publish and delete PDF Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 51)
	public static void testVideoCreateViewDelete(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String Video_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				Video_file = folder + "\\demo.mp4";

				System.out.println("TC-51  Create Video resource create view  and delete");

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facvideoclick, time, "facvideoclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Video_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.mp4']"))
						.sendKeys(Video_file);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facvideoopen, time, "facvideoopen", log);
				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);

				// Student to verify
				Utils.login(driver, student, url, log, csvCell);
				Utils.smallSleepBetweenClicks(1);
				Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.learn, time, "Click on learnlearn", log);

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();

				Utils.clickXpath(driver, ActionXpath.viewvideo, time, "Click on video", log);
				resourceStudentViewAndLogout(faculty, url, driver, fileName, Role, log);

				// Faculty to delete
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.facvideoopen, time, "facvideoopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-51 Create Video resource create view  and delete  Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-51 Create Video resource create view  and delete Test Case FAILED");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-51 Create Video resource create view  and delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 52)
	public static void testLinkCreateViewDelete(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-52  Link resource Create View delete Test case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.faclinkclick, time, "faclinkclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Link_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				Utils.callSendkeys(driver, ActionXpath.faclinkexternal, url, time, log);
				Utils.scrollUpOrDown(driver, time);
				Utils.scrollUpOrDown(driver, time);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);

				if (Utils.publishlink(url)) {
					Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
					Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
					Utils.smallSleepBetweenClicks(2);
					driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
					Utils.clickXpath(driver, ActionXpath.viewlink, time, "faclinkopen", log);
					resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);
				} else {
					Utils.logout(driver, url, Role, log);
				}

				Utils.login(driver, student, url, log, csvCell);
				Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.learn, time, "learn", log);

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();

				Utils.clickXpath(driver, ActionXpath.viewlink, time, "viewlink", log);
				resourceStudentViewAndLogout(faculty, url, driver, fileName, Role, log);

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.faclinkopen, time, "faclinkopen", log);
				Utils.scrollUpOrDown(driver, 500);
				Utils.scrollUpOrDown(driver, 500);
				Utils.scrollUpOrDown(driver, 500);

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);

				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-52 Link resource Create View delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-52 Link resource Create View delete Test Case FAILED");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-52 Link resource Create View delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 53)
	public static void testSpreadsheetFileType(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-53  Test SpreadSheet resource Create View delete Test case Started");

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facssclick, time, "facssclick", log);

				Utils.clickXpath(driver, ActionXpath.facssadd, time, "Click of add resource", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//input[@accept='.xlsx,.xls']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo.pdf");
				Utils.smallSleepBetweenClicks(1);
				Utils.smallSleepBetweenClicks(2);
				WebElement s = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[1]"));
				String kenm = s.getText();
				String noSpaceStr = kenm.replaceAll("\\s", "");
				String name = "AnErrorOccuredUnsupportedFileFormat.Pleaseuploadonly.xlsx,.xlsformat.";

				if (noSpaceStr.equals(name)) {
					System.out.println("It is not the excel file");
				} else {
					System.out.println("File uploaded");
				}
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/button/span[1]")).click();
				Utils.logout(driver, url, faculty, log);
				Utils.logg(log, "info", "TC-53 Test Spreadsheet File type Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-53 Test Spreadsheet File type Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info", "TC-53 Test Spreadsheet File type Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 54)
	public static void testPPTFileType(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-54  Test PPT File type");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facpptclick, time, "facpptclick", log);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.facssadd, time, "Click of add resource", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//input[@accept='.ppt,.pptx']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo.pdf");
				Utils.smallSleepBetweenClicks(2);

				WebElement s = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[1]"));
				String kenm = s.getText();
				String noSpaceStr = kenm.replaceAll("\\s", ""); // using built in method
				String name = "AnErrorOccuredUnsupportedFileFormat.Pleaseuploadonly.ppt,.pptxformat.";
				if (noSpaceStr.equals(name)) {
					System.out.println("It is not the PPT file");
				} else {
					System.out.println("File uploaded");
				}
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/button/span[1]")).click();
				Utils.logout(driver, url, faculty, log);
				Utils.logg(log, "info", "TC-54 Test PPT File type Test Case PASSED\n");
				break;

			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-54 Test PPT File type Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info", "TC-54 Test PPT File type Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 55)
	public static void testPDFFileType(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-55 Test PDF File type Test Case");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facccrespdf, time, "facccrespdf", log);
				Utils.clickXpath(driver, ActionXpath.facssadd, time, "Click of add resource", log);
				Utils.smallSleepBetweenClicks(2);

				driver.findElement(By.xpath("//input[@accept='.pdf']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo.pptx");
				Utils.smallSleepBetweenClicks(2);
				WebElement s = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[1]"));
				String kenm = s.getText();
				String noSpaceStr = kenm.replaceAll("\\s", ""); // using built in method
				String name = "AnErrorOccuredUnsupportedFileFormat.Pleaseuploadonly.pdfformat.";
				if (noSpaceStr.equals(name)) {
					System.out.println("It is not the PDF file");
				} else {
					System.out.println("File uploaded");
				}
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/button/span[1]")).click();
				Utils.logout(driver, url, faculty, log);
				Utils.logg(log, "info", "TC-55 Test PDF File type Test Case PASSED\n");
				break;

			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-55 Test PDF File type Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info", "TC-55 Test PDF File type Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 56)
	public static void testVideoFileType(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-56 Test Video File type Test Case");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facvideoclick, time, "facvideoclick", log);
				Utils.clickXpath(driver, ActionXpath.facssadd, time, "Click of add resource", log);

				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//input[@accept='.mp4']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo.pdf");
				Utils.smallSleepBetweenClicks(2);

				WebElement s = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[1]"));
				String kenm = s.getText();
				String noSpaceStr = kenm.replaceAll("\\s", ""); // using built in method
				String name = "AnErrorOccuredUnsupportedFileFormat.Pleaseuploadonly.mp4format.";
				if (noSpaceStr.equals(name)) {
					System.out.println("It is not the Video file");
				} else {
					System.out.println("File uploaded");
				}
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/button/span[1]")).click();
				Utils.logout(driver, url, faculty, log);
				Utils.logg(log, "info", "TC-56 Test Video File type Test Case PASSED\n");
				break;
			} catch (Exception e) {

				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-56 Test Video File type Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info", "TC-56 Test Video File type Test case Failed Retrying once more\n");

				}
			}
		}

	}

	@Test(priority = 57)
	public static void testFacultyFilterResource(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-57  PPT resource Filter Option View Test case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.bigSleepBetweenClicks(1);

				String p = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "pptfilter");
				System.out.println("p" + p);
				if (p.contains("Pdf") && (p.contains("Presentations")) && (p.contains("Videos"))
						&& (p.contains("Links"))) {

				} else {
					System.out.println(" All resource are not Presnet Quiting the Test. ");
					Utils.logg(log, "warn", "TC-57 PPt resource Filter Option View Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
				}
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "Clik ont he Filter button", log);
				Utils.clickXpath(driver, ActionXpath.faccFilterClear, time, "Clear all the filter ", log);
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "Appling the Filter to click the filter button",
						log);
				Utils.clickXpath(driver, ActionXpath.faccPPTOPen, time, "CLick on the filter Resource type span", log);
				Utils.clickXpath(driver, ActionXpath.faccPPTCheckBox, time, "select the PPT Check box ", log);
				Actions qwe = new Actions(driver);
				qwe.moveByOffset(40, 40).click().perform();

				String p2 = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "pptfilter");
				if (p2.contains("Presentations") && (!p2.contains("pdf")) && (!p2.contains("Spreadsheet"))
						&& (!p2.contains("Videos")) && (!p2.contains("Links"))) {

				} else {
					Utils.logg(log, "warn",
							"TC-57 PPT resource Filter Option View FAILED it does not contain all the tabs\n");
				}
				Utils.executeLongWait(url);
				Utils.logout(driver, url, Role, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.logg(log, "info", "TC-57 PPT resource Filter Option View Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {

					Utils.printException(e);
					Utils.logg(log, "warn", "TC-57 PPT resource Filter Option View Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;

				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-57 PPT resource Filter Option View Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 58)
	public static void testFacultyFilterPDFResource(String student, String faculty, String url, String Browser,
			String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-58  PDF resource Filter Option View Test case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.bigSleepBetweenClicks(1);
				String p = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "pdffilter");
				System.out.println("p" + p);
				if (p.contains("Pdf") && (p.contains("Presentations")) && (p.contains("Videos"))
						&& (p.contains("Links"))) {

				} else {
					System.out.println(" All resource are not Presnet Quiting the Test. ");
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn", "TC-58 PDF resource Filter Option View Test Case FAILED\n");

				}
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "click on the filter button", log);

				Utils.clickXpath(driver, ActionXpath.faccFilterClear, time, "click the clear all on the filter ", log);
				Utils.clickXpath(driver, ActionXpath.faccFilter, time,
						"click on the filter to open to apply the filter ",
						log);
				Utils.clickXpath(driver, ActionXpath.faccPPTOPen, time, "Open the reosurce Filter  span opnen", log);
				Utils.clickXpath(driver, ActionXpath.faccPDFCheckBox, time, "click the PDF checkbox", log);
				Actions qwe = new Actions(driver);
				qwe.moveByOffset(40, 40).click().perform();

				String p2 = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "pdffilter");
				if (p2.contains("Pdf") && (!p2.contains("Presentations")) && (!p2.contains("Spreadsheet"))
						&& (!p2.contains("Videos")) && (!p2.contains("Links"))) {

				} else {
					Utils.logg(log, "warn",
							"TC-58 PDF resource Filter Option View FAILED it does not contain all the tabs\n");

				}
				Utils.executeLongWait(url);
				Utils.logout(driver, url, Role, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.logg(log, "info", "TC-58 PDF resource Filter Option View Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {

					Utils.printException(e);
					Utils.logg(log, "warn", "TC-58 PDF resource Filter Option View Test Case FAILED\n");
					Utils.logout(driver, Role, url, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-58 PDF resource Filter Option View Test case Failed Retrying once more\n");

				}

			}
		}
	}

	@Test(priority = 59)
	public static void testFacultyFilterVideoResource(String student, String faculty, String url, String Browser,
			String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-59  Video resource Filter Option View Test case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.bigSleepBetweenClicks(1);
				String p = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "videofilter");
				System.out.println("p" + p);
				if (p.contains("Pdf") && (p.contains("Presentations")) && (p.contains("Videos"))
						&& (p.contains("Links"))) {
				} else {
					System.out.println(" All resource are not Presnet Quiting the Test. ");
					Utils.logg(log, "warn", "TC-59 Video resource Filter Option View Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
				}
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "Clik ont he Filter button", log);
				Utils.clickXpath(driver, ActionXpath.faccFilterClear, time, "Clear all the filter", log);
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "Appling the Filter to click the filter button",
						log);
				Utils.clickXpath(driver, ActionXpath.faccPPTOPen, time, "CLick on the filter Resource type span", log);
				Utils.clickXpath(driver, ActionXpath.faccVideoCheckBox, time, "select the Viedo Check box", log);
				Actions qwe = new Actions(driver);
				qwe.moveByOffset(40, 40).click().perform();

				String p2 = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "videofilter");
				if (p2.contains("Videos") && (!p2.contains("Presentations")) && (!p2.contains("Spreadsheet"))
						&& (!p2.contains("pdf")) && (!p2.contains("Links"))) {
					System.out.println(" TC-59  Video resource Filter Option Contains Video test case PASSED \n\n");
				} else {
					Utils.logg(log, "warn",
							"TC-59  Video resource Filter Option View FAILED it does not contain all the tabs\n");

				}
				Utils.logout(driver, url, Role, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.logg(log, "info", "TC-59 Video resource Filter Option View Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-59  Video resource Filter Option View Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-59  Video resource Filter Option View Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 60)
	public static void testFacultyFilterLinksResource(String student, String faculty, String url, String Browser,
			String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-60  Links resource Filter Option View Test case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.bigSleepBetweenClicks(1);
				String p = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "linkfilter");
				System.out.println("p" + p);
				if (p.contains("Pdf") && (p.contains("Presentations")) && (p.contains("Videos"))
						&& (p.contains("Links"))) {

				} else {
					System.out.println(" All resource are not Presnet Quiting the Test. ");
					Utils.logg(log, "warn", "TC-60 Links resource Filter Option View Test Case FAILED \n");

					Utils.logout(driver, url, Role, log);
				}
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "Clik ont he Filter button", log);
				Utils.clickXpath(driver, ActionXpath.faccFilterClear, time, "Clear all the filter", log);
				Utils.clickXpath(driver, ActionXpath.faccFilter, time, "Appling the Filter to click the filter button",
						log);
				Utils.clickXpath(driver, ActionXpath.faccPPTOPen, time, "CLick on the filter Resource type span", log);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(5,5)");
				Utils.clickXpath(driver, ActionXpath.faccLinksCheckBox, time, "Selec the Link Check Box filter", log);
				Actions qwe = new Actions(driver);
				qwe.moveByOffset(40, 40).click().perform();
				String p2 = Utils.getTEXT(driver, ActionXpath.facResourceFilterDiv, log, "linkfilter");
				if (p2.contains("Links") && (!p2.contains("Presentations")) && (!p2.contains("Spreadsheet"))
						&& (!p2.contains("pdf")) && (!p2.contains("Videos"))) {
					System.out.println(" TC-60 Links resource Filter Option Contains Links test case PASSED \n\n");
				} else {
					Utils.logg(log, "warn",
							"TC-60 Links resource Filter Option View FAILED it does not contain all the tabs\n");
				}
				Utils.executeLongWait(url);
				Utils.logout(driver, url, Role, log);
				Utils.smallSleepBetweenClicks(1);
				Utils.logg(log, "info", "TC-60 Links resource Filter Option View Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {

					Utils.printException(e);
					Utils.logg(log, "warn", "TC-60 Links resource Filter Option View Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-60 Links resource Filter Option View Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 61)
	public static void CreatepublisheditdeltePDF(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String PDF_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				PDF_file = folder + "\\demo.pdf";

				System.out.println("TC-61  Create PDF resource publish Edit and delete PDF");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facccrespdf, time, "facccrespdf", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "PDF_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.pdf']"))
						.sendKeys(PDF_file);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facpdfopen, time, "facpdfopen", log);
				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.viewpdf, time, "facpdfopen", log);
				resourceEdit(faculty, url, driver, fileName, Role, log);
				driver.findElement(By.xpath("//input[@accept='.pdf']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo1.pdf");
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(-100,-100)");
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.viewpdf, time, "facpdfopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-61 PDF resource Create Publish Edit delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-61 PDF resource Create Publish Edit delete Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-61 PDF resource Create Publish Edit delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 62)
	public static void CreatepublisheditdeltePPT(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String PPT_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				PPT_file = folder + "\\demo.pptx";

				System.out.println("TC-62  Create PPT resource publish Edit and delete PDF");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facpptclick, time, "facpptclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "PPT_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.ppt,.pptx']")).sendKeys(PPT_file);
				Utils.smallSleepBetweenClicks(1);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facpptfopen, time, "facpptfopen", log);
				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facpptfopen, time, "facpdfopen", log);
				resourceEdit(faculty, url, driver, fileName, Role, log);

				driver.findElement(By.xpath("//input[@accept='.ppt,.pptx']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo1.pptx");
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(-100,-100)");
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.facpptfopen, time, "facpdfopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-62 PPT resource Create Publish Edit delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-62 PPT resource Create Publish Edit delete Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-62 PPT resource Create Publish Edit delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 63)
	public static void CreatepublisheditdelteVideo(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String Video_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				Video_file = folder + "\\demo.mp4";

				System.out.println("TC-63  Create Video resource publish Edit and delete PDF");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facvideoclick, time, "facvideoclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Video_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.mp4']"))
						.sendKeys(Video_file);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facvideoopen, time, "facvideoopen", log);
				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facvideoopen, time, "facpdfopen", log);
				resourceEdit(faculty, url, driver, fileName, Role, log);
				driver.findElement(By.xpath("//input[@accept='.mp4']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo1.mp4");
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(-100,-100)");
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.facvideoopen, time, "facpdfopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-63 Video resource Create Publish Edit delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-63 Video resource Create Publish Edit delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-63 Video resource Create Publish Edit delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 64)
	public static void CreatepublisheditdelteSpreadsheet(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String SpreadSheetFile = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				SpreadSheetFile = folder + "\\demo.xlsx";

				System.out.println("TC-64  Create Spreadsheet resource publish Edit and delete PDF");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facssclick, time, "facssclick", log);
				resourceSubmitForm(faculty, url, driver, log);

				String fileName = "Excel_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.xlsx,.xls']")).sendKeys(SpreadSheetFile);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				Utils.smallSleepBetweenClicks(1);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facssopen, time, "Click on SS SVG", log);

				resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.facssopen, time, "facssopen", log);
				resourceEdit(faculty, url, driver, fileName, Role, log);
				driver.findElement(By.xpath("//input[@accept='.xlsx,.xls']"))
						.sendKeys("C:\\Users\\Public\\Documents\\demo1.xlsx");
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(-100,-100)");
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.facssopen, time, "facssopen", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-64 Spreadsheet resource Create Publish Edit delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn",
							"TC-64 Spreadsheet resource Create Publish Edit delete Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-64 Spreadsheet resource Create Publish Edit delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 65)
	public static void CreatepublisheditdelteLink(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String PDF_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				PDF_file = folder + "\\demo.pdf";

				System.out.println("TC-65  Create Link resource publish Edit and delete PDF");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.faclinkclick, time, "faclinkclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Link_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				Utils.callSendkeys(driver, ActionXpath.faclinkexternal, url, time, log);
				Utils.scrollUpOrDown(driver, time);
				Utils.scrollUpOrDown(driver, time);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);

				if (Utils.publishlink(url)) {
					Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					Utils.scrollUpOrDown(driver, 500);
					Utils.scrollUpOrDown(driver, 500);
					driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
					Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
					Utils.smallSleepBetweenClicks(2);
					driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
					Utils.clickXpath(driver, ActionXpath.viewlink, time, "faclinkopen", log);
					resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);
				} else {
					Utils.logout(driver, url, Role, log);
				}

				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
				Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
				Utils.smallSleepBetweenClicks(2);
				driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
				Utils.clickXpath(driver, ActionXpath.viewlink, time, "viewlink", log);
				Utils.clickXpath(driver, "//p[.='" + fileName + "']/../../.././..//*[local-name()='svg']", time,
						"Select PPT file name", log);
				Utils.clickXpath(driver, ActionXpath.facpdfedit, time, "Click on edit button", log);
				Utils.cleartext(driver, ActionXpath.faclinkexternal);
				Utils.callSendkeys(driver, ActionXpath.faclinkexternal, "WWW.Google.com", time, log);
				Utils.scrollUpOrDown(driver, 500);
				Utils.scrollUpOrDown(driver, 500);
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(-200,-200)");
				Utils.scrollUpOrDown(driver, time);
				Utils.scrollUpOrDown(driver, time);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				Utils.clickXpath(driver, ActionXpath.viewlink, time, "viewlink", log);
				Utils.scrollUpOrDown(driver, time);
				Utils.scrollUpOrDown(driver, time);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);
				Utils.scrollUpOrDown(driver, 500);
				Utils.scrollUpOrDown(driver, 500);
				Utils.scrollUpOrDown(driver, 500);
				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				Utils.logg(log, "info", "TC-65 Link resource Create Publish Edit delete Test Case PASSED\n");
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-65 Link resource Create Publish Edit delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-65 Link resource Create Publish Edit delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 66)
	public static void testSCORMPackageFileType(String student, String faculty, String url,
			String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (Utils.checkBimtech(url)) {
					String ZipFile = "";
					String folder = "";
					folder = Pfs_portal.getFolderPath();
					ZipFile = folder + "\\demo.zip";
					System.out.println("TC-66  Scormp resource Create View delete Test case Started");

					Utils.smallSleepBetweenClicks(1);
					resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
					String program, subject;

					Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					if (csvCell[12].equals("NA")) {
						System.out.println("---------------------------------------------------------");

						Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
					} else {
						String program1 = csvCell[11];
						System.out.println("******************************************************");
						Utils.smallSleepBetweenClicks(1);
						System.out.println("-------------------" + program1);

						driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
					}
					Utils.smallSleepBetweenClicks(1);
					program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
					System.out.println("********************" + program);

					Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
					if (csvCell[12].equals("NA")) {
						Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
					} else {
						String subject1 = csvCell[12];
						Utils.smallSleepBetweenClicks(1);
						System.out.println("-------------------" + subject1);

						driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

						System.out.println("-------------------" + subject1);

					}

					subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
					System.out.println("********************" + subject);

					// String returnArray[] = new String[2];
					// returnArray = Utils.getClassSubjectAndSection(driver, url,"resource");
					// String programconverted = returnArray[0];
					// String subject = returnArray[1];

					Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
					Utils.clickXpath(driver, ActionXpath.scrompakege, time, "facssclick", log);
					resourceSubmitForm(faculty, url, driver, log);

					String fileName = "Zip_" + Utils.generateRandom();
					Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
					driver.findElement(By.xpath("//input[@type='file']")).sendKeys(ZipFile);
					Utils.smallSleepBetweenClicks(2);

					Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
					// Utils.clickXpath(driver, ActionXpath.facccressubmityes, time,
					// "facccressubmityes", log);
					// Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
					driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
					Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
					Utils.smallSleepBetweenClicks(2);
					Utils.smallSleepBetweenClicks(1);
					driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();
					Utils.clickXpath(driver, ActionXpath.facssopen, time, "Click on SS SVG", log);

					resourcePublishAndLogout(faculty, url, driver, fileName, Role, log);

					// Student part starts
					Utils.login(driver, student, url, log, csvCell);
					Utils.checkAcadAndClick(driver, faculty, url, log, csvCell);
					Utils.clickXpath(driver, ActionXpath.learn, time, "learn", log);
					Utils.smallSleepBetweenClicks(1);
					Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					driver.findElement(By.xpath("//li[@data-value='" + program + "']")).click();
					Utils.clickXpath(driver, ActionXpath.subject, time, "click on subject", log);
					Utils.smallSleepBetweenClicks(2);
					driver.findElement(By.xpath("//li[text()='" + subject + "']")).click();

					Utils.smallSleepBetweenClicks(1);

					Utils.clickXpath(driver, ActionXpath.viewss, time, "viewss", log);
					resourceStudentViewAndLogout(faculty, url, driver, fileName, Role, log);
					// Student part ends

					resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
					Utils.clickXpath(driver, ActionXpath.facssopen, time, "facspreadsheetopen", log);
					Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					if (csvCell[12].equals("NA")) {
						System.out.println("---------------------------------------------------------");

						Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
					} else {
						String program1 = csvCell[11];
						System.out.println("******************************************************");
						Utils.smallSleepBetweenClicks(1);
						System.out.println("-------------------" + program1);

						driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
					}
					Utils.smallSleepBetweenClicks(1);
					program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
					System.out.println("********************" + program);

					Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
					if (csvCell[12].equals("NA")) {
						Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
					} else {
						String subject1 = csvCell[12];
						Utils.smallSleepBetweenClicks(1);
						System.out.println("-------------------" + subject1);

						driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

						System.out.println("-------------------" + subject1);

					}

					subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
					System.out.println("********************" + subject);

					resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
					Utils.logg(log, "info", "TC-66 Scormp resource Create View delete Test Case PASSED\n");
				} else {
					Utils.logg(log, "info", "TC-66 Scormp resource Is not for this portal\n");
				}
				break;

			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-66 Scormp resource Create View delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "info",
							"TC-66 Scormp resource Create View delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 67)
	public static void CreateSpreadsheetViewinDashboard(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String SpreadSheetFile = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				SpreadSheetFile = folder + "\\demo.xlsx";

				System.out.println("TC-67  Create Spreadsheet resource and view in Dashboard started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;

				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facssclick, time, "facssclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Excel_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.xlsx,.xls']")).sendKeys(SpreadSheetFile);
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				System.out.println("filename : " + fileName);
				Utils.bigSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.classclick1, time, "classclick1", log);
				Utils.smallSleepBetweenClicks(10);
				WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + fileName + "')]"));
				String text = element.getText();
				System.out.println("File Found: " + text);
				Utils.clickXpath(driver, ActionXpath.faccc, time, "Click on course content", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.clickXpath(driver, ActionXpath.viewss, time, "viewss", log);
				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				if (text.equalsIgnoreCase(fileName)) {
					Utils.logg(log, "info",
							"TC-67 DashboardClasscheck Spreadsheet File name Matched and Test Case PASSED\n");

				} else {
					Utils.logg(log, "warn",
							"TC-67 DashboardClasscheck Spreadsheet File name Matched and Test Case FAILED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn",
							"TC-67 DashboardClasscheck Spreadsheet File name Matched and Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-67 DashboardClasscheck Spreadsheet File name Matched and Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 68)
	public static void CreatePPTViewinDashboard(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				String PPT_file = "";
				PPT_file = folder + "\\demo.pptx";
				System.out.println("TC-68  Create PPT resource and view in Dashboard started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facpptclick, time, "facpptclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "PPT_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.ppt,.pptx']")).sendKeys(PPT_file);
				Utils.smallSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				System.out.println("filename : " + fileName);
				Utils.bigSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.classclick1, time, "classclick1", log);
				Utils.smallSleepBetweenClicks(10);
				WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + fileName + "')]"));
				String text = element.getText();
				System.out.println("File Found: " + text);
				Utils.clickXpath(driver, ActionXpath.faccc, time, "Click on course content", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.clickXpath(driver, ActionXpath.facpptfopen, time, "facpptfopen", log);
				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				if (text.equalsIgnoreCase(fileName)) {
					Utils.logg(log, "info", "TC-68 DashboardClasscheck PPT File name Matched and Test Case PASSED\n");

				} else {
					Utils.logg(log, "warn", "TC-68 DashboardClasscheck PPT File name Matched and Test Case FAILED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-68 DashboardClasscheck PPT File name Matched and Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-68 DashboardClasscheck PPT File name Matched and Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 69)
	public static void CreatePDFViewinDashboard(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String PDF_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				PDF_file = folder + "\\demo.pdf";
				System.out.println("TC-69  DashboardClasscheck PDF File name Matched and Test Case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facccrespdf, time, "facccrespdf", log);
				resourceSubmitForm(faculty, url, driver, log);

				String fileName = "PDF_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.pdf']"))
						.sendKeys(PDF_file);

				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				System.out.println("filename : " + fileName);
				Utils.bigSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.classclick1, time, "classclick1", log);
				Utils.smallSleepBetweenClicks(10);
				WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + fileName + "')]"));
				String text = element.getText();
				System.out.println("File Found: " + text);
				Utils.clickXpath(driver, ActionXpath.faccc, time, "Click on course content", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.clickXpath(driver, ActionXpath.facpdfopen, time, "facpdfopen", log);
				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				if (text.equalsIgnoreCase(fileName)) {
					Utils.logg(log, "info", "TC-69 DashboardClasscheck PDF File name Matched and Test Case PASSED\n");
				} else {
					Utils.logg(log, "warn", "TC-69 DashboardClasscheck PDF File name Matched and Test Case FAILED\n");

				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn", "TC-69: DashboardClasscheck PDF File name Matched and Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-69 DashboardClasscheck PDF File name Matched and Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 70)
	public static void CreateVideoViewinDashboard(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				String Video_file = "";
				String folder = "";
				folder = Pfs_portal.getFolderPath();
				Video_file = folder + "\\demo.mp4";
				System.out.println("TC-70  DashboardClasscheck Video File name Matched and Test Case Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);

				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");
					Utils.bigSleepBetweenClicks(2);
					Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[12].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.facvideoclick, time, "facvideoclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Video_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				driver.findElement(By.xpath("//input[@accept='.mp4']"))
						.sendKeys(Video_file);
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				System.out.println("filename : " + fileName);
				Utils.bigSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.classclick1, time, "classclick1", log);
				Utils.smallSleepBetweenClicks(10);
				WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + fileName + "')]"));
				String text = element.getText();
				System.out.println("File Found: " + text);
				Utils.clickXpath(driver, ActionXpath.faccc, time, "Click on course content", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.clickXpath(driver, ActionXpath.facvideoopen, time, "facvideoopen", log);
				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				if (text.equalsIgnoreCase(fileName)) {
					Utils.logg(log, "info", "TC-70 DashboardClasscheck Video File name Matched and Test Case PASSED\n");
				} else {
					Utils.logg(log, "warn",
							"TC-70 DashboardClasscheck Video File name Matched and Test Case FAILED\n");

				}
				Utils.logout(driver, url, Role, log);
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn",
							"TC-70 DashboardClasscheck Video File name Matched and Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-70 DashboardClasscheck Video File name Matched and Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 71)
	public static void CreateLinkViewinDashboard(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				System.out.println("TC-71  DashboardClasscheck Link File name Matched and Test Case  Started");
				resourceFacultyInitialSteps(faculty, url, driver, log, csvCell);
				String program, subject;
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);
				if (csvCell[11].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.smallSleepBetweenClicks(1);
				program = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[1]", log, "program");
				System.out.println("********************" + program);

				Utils.clickXpath(driver, ActionXpath.course, time, "click on subject", log);
				if (csvCell[11].equals("NA")) {
					Utils.clickXpath(driver, ActionXpath.courseselect, time, "click on select subject", log);
				} else {
					String subject1 = csvCell[12];
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + subject1);

					driver.findElement(By.xpath("//li[.='" + subject1 + "']")).click();

					System.out.println("-------------------" + subject1);

				}

				subject = Utils.getTEXT(driver, "(//*[. and @aria-haspopup='listbox'])[2]", log, "subject");
				System.out.println("********************" + subject);

				Utils.clickXpath(driver, ActionXpath.facccres, time, "facccres", log);
				Utils.clickXpath(driver, ActionXpath.faclinkclick, time, "faclinkclick", log);
				resourceSubmitForm(faculty, url, driver, log);
				String fileName = "Link_" + Utils.generateRandom();
				Utils.callSendkeys(driver, ActionXpath.facpptname, fileName, time, log);
				Utils.callSendkeys(driver, ActionXpath.faclinkexternal, url, time, log);
				Utils.scrollUpOrDown(driver, time);
				Utils.scrollUpOrDown(driver, time);
				Utils.clickXpath(driver, ActionXpath.facccressubmit, time, "facccressubmit", log);
				Utils.clickXpath(driver, ActionXpath.facccressubmityes, time, "facccressubmityes", log);
				System.out.println("filename : " + fileName);
				Utils.bigSleepBetweenClicks(2);
				Utils.clickXpath(driver, ActionXpath.clickFacDashdevnosbm, time, "Dashboard", log);
				Utils.bigSleepBetweenClicks(1);
				Utils.clickXpath(driver, ActionXpath.classclick1, time, "classclick1", log);
				Utils.smallSleepBetweenClicks(10);
				WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + fileName + "')]"));
				String text = element.getText();
				System.out.println("File Found: " + text);
				Utils.clickXpath(driver, ActionXpath.faccc, time, "Click on course content", log);
				Utils.clickXpath(driver, ActionXpath.program, time, "click on program", log);

				if (csvCell[12].equals("NA")) {
					System.out.println("---------------------------------------------------------");

					Utils.clickXpath(driver, ActionXpath.programselect, time, "click on program select", log);
				} else {
					String program1 = csvCell[11];
					System.out.println("******************************************************");
					Utils.smallSleepBetweenClicks(1);
					System.out.println("-------------------" + program1);

					driver.findElement(By.xpath("//li[.='" + program1 + "']")).click();
				}
				Utils.clickXpath(driver, ActionXpath.viewlink, time, "viewlink", log);
				resourceDeleteAndLogout(faculty, url, driver, fileName, Role, log);
				if (text.equalsIgnoreCase(fileName)) {
					Utils.logg(log, "info", "TC-71 DashboardClasscheck Link File name Matched and Test Case PASSED \n");
				} else {
					Utils.logg(log, "warn", "TC-71 DashboardClasscheck Link File name Matched and Test Case FAILED\n");
				}
				break;
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn",
							"TC-71 DashboardClasscheck Link File name Matched and Test Case FAILED Retrying once more\n");
					Utils.logout(driver, url, Role, log);
					break;
				}

			}
		}
	}

	// -------------------------------------DELETE-----------------------------------------------------

	@Test(priority = 203)
	public static void DeleteResourcesPPT(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (csvCell[16].equals("TRUE")) {
					System.out.println("TC-203: PPT Delete Test case Started");
					String Prefix = "PPT_";
					String xpath = ActionXpath.facpptfopen;
					resorcesdelete(faculty, url, driver, csvCell, Role, log, Prefix, xpath);
					Utils.logg(log, "info_d", "TC-203: PPT Delete Test Case PASSED\n");
					break;
				}
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn_d", "TC-203 PPT Delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-203 PPT Delete Test Case Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 204)
	public static void DeleteResourcesExcel(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (csvCell[16].equals("TRUE")) {
					System.out.println("TC-204:  Excel Delete test case started");
					String Prefix = "Excel_";
					String xpath = ActionXpath.facssopen;
					resorcesdelete(faculty, url, driver, csvCell, Role, log, Prefix, xpath);
					Utils.logg(log, "info_d", "TC-204 Excel Delete Test Case PASSED\n");
					break;
				}
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn_d", "TC-204 Excel Delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-204 Excel Delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 205)
	public static void DeleteResourcesPDF(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (csvCell[16].equals("TRUE")) {
					System.out.println("TC-205  PDF Delete test case started");
					String Prefix = "PDF_";
					String xpath = ActionXpath.facpdfopen;
					resorcesdelete(faculty, url, driver, csvCell, Role, log, Prefix, xpath);
					Utils.logg(log, "info_d", "TC-205 PDF Delete Test Case PASSED\n");
					break;
				}
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn_d", "TC-205 PDF Delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-205 PDF Delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 206)
	public static void DeleteResourcesVideo(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (csvCell[16].equals("TRUE")) {
					System.out.println("TC-206:  Video Delete test case started");
					String Prefix = "Video_";
					String xpath = ActionXpath.facvideoopen;
					resorcesdelete(faculty, url, driver, csvCell, Role, log, Prefix, xpath);
					Utils.logg(log, "info_d", "TC-206: Video Delete Test Case PASSED\n");
					break;
				}
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn_d", "TC-206: Video Delete Test Case FAILED\n");

					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-206: Video Delete Test case Failed Retrying once more\n");

				}
			}
		}
	}

	@Test(priority = 207)
	public static void DeleteResourcesLink(String student, String faculty,
			String url, String Browser, String Role, WebDriver driver, Logger log, String[] csvCell) throws Exception {
		int RetryCount = 0;
		while (true) {
			try {
				if (csvCell[16].equals("TRUE")) {
					System.out.println("TC-207:  Link Delete Test case started");
					String Prefix = "Link_";
					String xpath = ActionXpath.viewlink;
					resorcesdelete(faculty, url, driver, csvCell, Role, log, Prefix, xpath);
					Utils.logg(log, "info_d", "TC-207: Link Delete Test Case PASSED\n");
					break;
				}
			} catch (Exception e) {
				if (RetryCount >= 1) {
					System.out.println("maxRetryCount:" + RetryCount);
					Utils.printException(e);
					Utils.logg(log, "warn_d", "TC-207: Link Delete Test Case FAILED\n");
					Utils.logout(driver, url, Role, log);
					break;
				} else {
					RetryCount++;
					Utils.logout(driver, url, Role, log);
					Utils.logg(log, "warn",
							"TC-206: Video Delete Test case Failed Retrying once more\n");

				}
			}

		}
	}
}