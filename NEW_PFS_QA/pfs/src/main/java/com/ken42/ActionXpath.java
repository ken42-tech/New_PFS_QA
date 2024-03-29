package com.ken42;

public class ActionXpath {
   // Login related Xpaths
   public static final String OTP = null;
   static String email2 = "//input[@placeholder='Email Address']";
   static String SignIn = "//span[. and text()='Request OTP']";
   // static String mobile =
   // "/html/body/div/div/div/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div
   // |
   // //*[@id=\"app\"]/div/div/div/main/div[2]/div[2]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div";
   static String mobile = "(//*[@placeholder='Please enter your Mobile Number'])";
   static String mobile2 = "/html/body/div[2]/div[3]/ul/li";
   static String SignIn2 = "//span[. and text()='SIGN IN']";
   static String OtpInput = "//input[@placeholder='Enter Otp']";
   static String submit = "//span[text()='Submit']";

   static String email = "//input[@placeholder='Please enter your Email Id'] |//input[@placeholder='Email Address']";
   static String requestotp = "//span[. ='Request OTP']";
   static String otprequest1 = "//input[@placeholder='Please enter the OTP sent to your registered Email ID.']";
   static String otprequest2 = "//input[@placeholder='Please enter the OTP sent to your registered Mobile No.']";
   static String verifyotp = "//span[. and text()='Verify & Sign in']";

   // Login Xpaths ends here

   // Student Test case 1
   static String Home = "(//span[. and text()='Home'])[2]/..";
   // static String Home = "(//span[@class='MuiTypography-root jss62
   // MuiTypography-body1 MuiTypography-displayBlock' //*text()='Home'])[2]";
   // static String Home =
   // "//*[@id=\"app\"]/div/div/div/main/div[2]/div[1]/div/div[1]/div/div[2]/div/div[1]/a/div/div[2]/span
   // | (//span[. and text()='Home'])[2]/..";
   // static String Home = "(//span[@class='MuiTypography-root jss124
   // MuiTypography-body1 MuiTypography-displayBlock' and text()='Home'])[1]/..";
   // static String Stu_prName = "(//span[@class='MuiIconButton-label'])[3]";
   static String Stu_prName = "//button[@aria-controls='menu-appbar']";
   // Student test case 1 ends here

   // Student Test case 2 Enrollments
   static String ClickEnroll = "(//span[text()='Enrollments'])[2]/..";
   static String clickCompletedEnroll = "//span[text()='Completed Enrollments']";
   static String ClickOpenEnroll = "//span[text()='Open Enrollments']";
   // Student End of Test case 2

   // Student Test case 3 Academics
   static String ExpandAcademic = "(//span[. and text()='Academics'])[2]/..";
   static String ltstaAcademic = "(//span[. and text()='Academics'])[1]";
   static String ClickDashboard = "(//span[. and text()='Dashboard'])[1]";
   static String ClickLearn = "(//span[. and text()='Learn'])[1]";
   static String CloseAcademicExapand = "(//span[. and text()='Academics'])[2]";
   // Student Portal Academics Xpath ends here

   // Student test case 4 Examinations
   static String ClickExam = "(//span[. and text()='Examinations'])[2]";
   static String ltstaExam = "(//span[. and text()='Examinations'])[1]";
   static String examAnnouncements = "//*[@id=\"panel1a-header\"]/div[1]/h6";
   // Student Portal Examination Xpath ends here

   // Student Test case 5 Attendance
   static String ClickAttendance = "(//span[text()='Attendance'])[2]";
   static String ltstaAttendance = "(//span[text()='Attendance'])[1]";
   static String clickattendanceHistory = "//span[text()='Attendance History']";
   // Student Test case 5 Attendance Xpath ends here

   // Student Test case 6 TimeTable
   static String ClickTimetable = "(//*[text()='Time Table'])[1]";
   static String ltstaTimetable = "(//*[text()='Time Table'])[1]";
   static String TimeTableMonth = "(//button[text()='month'])[1]";
   static String TimeTableWeek = "(//button[text()='week'])[1]";
   static String TimeTableDay = "(//button[text()='day'])[1]";
   // Student Portal Timetable Xpath ends here
   // fees xpath
   static String clickonfees = "//span[text()='Fees']";
   static String clickonpendingfees = "//b[text()='Pending Fees in']/../../..//..//*[@role='button']";

   static String clickonfeecart = "//span[text()='Fee Cart']";

   static String clickonfeeschedule = "//span[text()='Fee Schedule']";
   static String clickonfeescheduleclass = "//b[text()='2022-Class 6-ICSE']/../../..//..//*[@role='button']";

   static String clickontranscation = "//span[text()='Transactions']";
   static String clickonstudentservice = "//span[text()='Student Service Fee']";

   static String clickonfeestudentserviceinr = "//b[text()='Student Service Fees INR ']/../../..//..//*[@role='button']";

   // attendance xpath

   static String clickonattendance = "//span[text()='Attendance']";
   // Student test case 7 Fees
   // static String ExpandFees="(//span[text()='Fees'])[2]";
   static String ExpandFees = "(//span[text()=' Fees']/../..//*[local-name()='svg'])[4]";
   static String ltstaFees = "(//span[text()=' Fees'])[1]";
   static String clickMyCart = "//span[. and text()='My Cart']";
   static String clickFeeSchedule = "//span[. and text()='Fee Schedule']";
   static String clickFeePayment = "//span[. and text()='Fee Payment']";
   static String clickManualpayment = "//span[. and text()='Manual Payment']";
   static String ClickMyTranscetion = "//span[. and text()='My Transactions']";
   static String closeExpandFees = "(//span[text()='Fees'])[2]";
   // Student Test case 7 Portal Fees Xpath ends here

   // Student Test case 8 Feedback
   static String feedBack = "(//span[. and text()='Feedback'])[1]";
   static String ltstafeedBack = "(//span[. and text()='Feedback'])[1]";
   static String clickPending = "(//*[. and text()='Pending'])[1]";
   // Student Portal Feedback Xpath ends here

   // Student Test case 9 Student service cancel button
   // static String StudentService="(//span[. and text()='Student Services'])[2]";
   static String StudentService = "//*[. and text()='Support services']";
   static String ltstaService = "(//span[. and text()='Student Services'])[2] | (//span[. and text()='Support Services'])[2] | (//span[. and text()='Trainer Services'])[1]";
   static String Priority = "(//*[@aria-haspopup='listbox'])[2]";
   static String requesttype = "(//*[@aria-haspopup='listbox'])[1]";

   static String requestfilter = "(//*[@class='MuiButton-label'])[3]";
   static String filter1 = "(//*[@id='mui-component-select-program'])[2]";
   static String filter2 = "(//*[@id='mui-component-select-program'])[3]";
   static String portevent = "(//*[text()='Events'])[1]";
   static String portfilter = "(//*[@class='MuiButton-label'])[1]";
   static String allcategary = "//*[@id='mui-component-select-category']";
   // static String selectallcategary = "//li[@aria-selected='true']";
   static String cliclapply = "//*[text()='Apply']";
   static String cancelimage = "//*[@class='MuiSvgIcon-root jss5369 MuiSvgIcon-fontSizeSmall']";
   static String editimage = "//*[text()='Edit Profile Image']";
   static String Applyss = "//*[text()='Apply']";
   static String addrequest = "(//*[. and text()='Add your Request'])[1]";
   static String buttonRaisecase = "//button[@label='Raise Case']";
   static String selectdropdown = "(//*[@role='option'])[1]";
   static String reasonrequst = "(//*[@id='fullWidth'])[1]";
   static String Submitrequest = "(//*[text()='Submit'])[1]";
   static String cancel = "//button[@label='Cancel']";
   // Student Test case 9 ends here
   static String raisecomplain = "(//*[. and text()='Raise a Complaint'])[2]";
   // Student Service Test case 10 Raise a case
   //// static String StudentService="(//span[. and text()='Student
   // Services'])[2]";
   //// static String Raisecase="(//p [. and text()='Raise A Case'])[1]";
   //// static String buttonRaisecase="//button[@label='Raise Case']";
   static String inputraise = "//input[@name='Subject']";
   static String description = "//textarea[@placeholder='Type your description here...']";
   static String submitofcase = "//button[@label='Submit']";
   // Student Service Test case 10 ends here
   static String portfolio = "(//span[text()='My Portfolio'])/..";

   static String portraisetiket = "(//*[text()='Raise Ticket'])";
   static String portaddrequest = "(//*[text()='Add your Request'])";
   static String porttype = "(//*[@id='mui-component-select-Choose a category'])[1]/..//*[local-name()='svg']";
   static String typeselect = "//li[text()='KARNATAKA']";
   static String portprioty = "(//*[@id='mui-component-select-Choose a category'])[2]/..//*[local-name()='svg']";
   static String priotyselect = "//li[text()='Top']";
   static String resonadition = "//*[@id='fullWidth']";
   static String portpersonaldet = "(//*[text()='Personal Details'])";
   static String dashbord = "//*[text()='Dashboard']";
   static String clicklearn = "(//*[text()='Learn'])[1]";
   static String overalldropdown = "(//*[@aria-haspopup='listbox'])";
   static String selectoveralldropdown = "//li[@aria-selected='true']";

   // Statudent Service Tets case 11 Make a request
   //// static String StudentService="(//span[. and text()='Student
   // Services'])[2]";
   //// static String MakeRaise="(//p [. and text()='Make A Request'])[1]";
   static String makeRequest = "//button[@label=' Make a Request']";
   static String enterSubject = "//input[@name='Subject']";
   static String desc = "//textarea[@placeholder='Type your description here...']";
   static String makeSubmit = "//button[@label='Submit']";
   // Student Service Test case 11 ends here

   // Student Test case 12 Event
   static String Event = "(//span[. and text()='Events'])[2]";
   static String ltstaEvent = "(//span[. and text()='Events'])[1]";
   static String clcikEvent = "//*[@id=\"app\"]/div/div/div/main/div[2]/div[2]/div[2]/div[4]/div/div[1]/div";
   static String back = "//span[text()='Back']";
   // Student Test case Feedback ends here

   /// Student Test case 13 edit Profile Xpath
   static String kerprofile = "//*[text()='Profile']";
   static String kerextracuricular = "(//*[text()='Extra Curricular Activities'])";
   static String kerfolioacdemics = "(//*[text()='Academics'])[2]";
   static String kerclub = "(//*[text()='Clubs'])[1]";
   static String kerfootball = "(//*[text()='FootBall'])[1]";
   static String kerother = "(//*[text()='Other'])[1]";
   static String kerachivement = "(//*[text()='Achievements'])[1]";
   static String kerconduct = "//*[text()='Conduct']";
   static String kerrequestcomplint = "(//*[text()='Request & Complaints'])[1]";
   static String keroersonaldetails = "(//*[text()='Personal Details'])";
   static String kereditdetail = "(//*[text()='Edit Details'])";
   static String kermiddlename = "(//*[@name='middleName'])";
   static String kergender = "(//*[@name='gender'])";
   static String kerselcetgender = "(//*[@value='Male'])";
   static String kerbirthplace = "(//*[@name='birthPlace'])";
   static String kersubmit = "(//*[text()='Submit'])";
   //// static String Stu_prName = "(//span[@class='MuiIconButton-label'])[3]";
   static String stuprofile = "//*[. and text()='Profile']/..";
   static String stubasicedit = "(//*[name()='svg'and@height='23'])[1]";
   static String Stubasicgender = "//*[@id=\"mui-component-select-Gender\"]";
   static String Gender = "Female";
   static String stubasicgenderselect = "//li[@data-value='Female']";
   static String selectallcategary = "//*[@role='listbox']";
   static String stubasicdob = "//*[@name='BirthDate']";
   static String stubasicnation = "//*[@name='CountryOfResidence']";
   static String stubasicsave = "//*[text()='Save']";
   // static String stubasicsave =
   // "//*[@id=\"app\"]/div/div/div/main/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/div/div[9]/div[1]/button";
   // Student test case 13 edit Profile Xpath ends here

   // Student Test case 14 student profile edit education details
   // 12
   // static String stueddrop="(//p[. and text()='EDUCATION
   // DETAILS']/../../..//*[local-name()='svg'])[1]";
   static String stueddrop = "//p[. and text()='EDUCATION DETAILS']/..";
   static String Devstued = "(//p[. and text()='EDUCATION DETAILS']/../../..//*[local-name()='svg'])[1]";
   static String stued = "(//p[. and text()='EDUCATION DETAILS']/../../..//*[local-name()='svg'])[1]";
   static String stued12school = "(//*[@name='hed__Educational_Institution_Name__c'])[1]";
   static String stued12country = "(//*[@name='Country__c'])[1]";
   static String stued12year = "(//*[@name='Year_of_Passing__c'])[1]";

   // clg
   static String stuedclg = "(//*[@name='hed__Educational_Institution_Name__c'])[2]";
   static String stuedclgcountry = "(//*[@name='Country__c'])[2]";
   static String stuedclgyear = "(//*[@name='Year_of_Passing__c'])[2]";
   // pg
   static String stuedpgclg = "(//*[@name='hed__Educational_Institution_Name__c'])[3]";
   static String stuedpgcountry = "(//*[@name='Country__c'])[3]";
   static String stuedpgyear = "(//*[@name='Year_of_Passing__c'])[3]";
   // save
   static String stuedsave = "//p[. and text()='EDUCATION DETAILS']/../../..//span[. and text()='Save']/..";
   // static String stueddropup="//*[@id=\"panel1a-header\"]/div[2]";
   static String dummyCLick = "//h6[. and text()='My Profile']";
   // Student Test case 14 ends here

   // Student Test case 15 Student edit address
   static String stuadddrop = "//p[. and text()='ADDRESS DETAILS']";
   // static String
   // stuadddrop="//*[@id=\"panel1a-header\"]/div[2]/span[1]/svg/path";
   // static String stuedit="(//*[name()='svg'and@height='23'])[2]";
   static String stuedit = "(//p[. and text()='ADDRESS DETAILS']/../../..//*[local-name()='svg'])[2]";
   // static String stuaddadd="//*[@id=\"panel1a-content\"]/div/div/div[4]/button";
   static String stuaddadd = "//span[. and text()='Add Address']/..";
   static String stuhouse = "//*[@name='House_Flat_No__c']";
   static String sturoad = "//*[@name='hed__MailingStreet__c']";
   static String stusuburb = "//*[@name='hed__MailingCity__c']";
   static String stucountry = "//*[@name='hed__MailingCountry__c']";
   static String stupincode = "//*[@name='hed__MailingPostalCode__c']";
   static String stusave = "//p[. and text()='ADDRESS DETAILS']/../../..//span[. and text()='Save']";
   static String StudBEdit = "(//p[. and text()='Home'])[1]";
   // Student Test case 15 Student edit address ends here

   // Student Test case 16 Signout
   // static String
   // SelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   static String SelectPrtoSignout = "(//div[.='T'])[2]";
   static String signOut = "//*[.='Sign Out']";
   // Student Test case 16 Signout ends here

   // All Student test cases Xpath should be before this line
   // ****************************************************************************************************
   // */
   // *************************************************************************************
   // */

   // Faculty Role Xpaths begin
   // here*********************************************************
   // TC:17 faculty academics
   static String openFacdevnosbm = "(//span[text()='Academics'])[2]";
   static String facClickacademicsltsta = "(//span[text()='Academics'])[1]";
   static String openFacltsta = "(//span[text()='Academics'])[2]";
   static String clickFacDashdevnosbm = "//span[text()='Dashboard']";
   static String facdbfilterselect = "//*[@id=\"menu-\"]/div[3]/ul/li[4]";
   static String facFilter = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input MuiInputBase-inputMarginDense MuiInput-inputMarginDense']";
   static String facdbresfilter = "(//*[@xmlns='http://www.w3.org/2000/svg'])[2]";
   static String facdbrestypes = "//*[@id=\"alert-dialog-description\"]/div/div[2]/div[1]/div[2]";
   static String facdbresapply = "//span[text()='Apply Filter']";

   // TC:18 faculty Question
   static String facqb = "//span[text()='Question Bank']";
   static String facaddque = "//span[text()='Add Question Manually']";
   static String facquetype = "//*[@id='mui-component-select-questionType']";
   static String facquetypeselect = "//li[@data-value='multichoice' or text()='Multiple choice']";
   static String facqueclass = "//*[@id='mui-component-select-classSelected']";
   static String facqueclasselect = "//li[@data-value='39' or text()='2022-BBA-core' or text()='2022-Managerial Economics' or text()='2020-Sales & Distribution Management-20-22']";

   // TC:19 faculty COurse
   static String faccc = "//span[text()='Course Content']";
   static String facccactivity = "//span[text()='Activity']";
   static String facassessmentrelative = "(//div[@id='responsive-dialog-title']//ancestor::div[@aria-labelledby='responsive-dialog-title']//descendant::div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-2'])[1]";
   static String facassessmentrelativeltsta = "/html/body/div[4]/div[3]/div/div[2]/div/div/div[1]/div/img";
   static String facaddactivityrelative = "//span[.='Add Activity']";
   static String facccAsscancel = "//span[text()='Cancel']";
   static String faccAssYes = "//span[text()='Yes']";
   static String faccAssopen = "(//span[@class='MuiIconButton-label'])[5]";
   static String FaccClickResource = "//span[text()='Resource']";
   static String facrescancel = "//span[text()='Cancel']";
   // TC:20 faculty Examination
   // static String facexam = "(//span[.='Examinations'])[1]";
   static String facexam = "(//span[.='Examinations'])[2]";
   static String facexamarrow = "//*[@id=\"panel1a-header\"]/div[2]";
   static String facexamdropdown = "//*[@id=\"simple-tabpanel-0\"]/div/p/div/div/div/div[1]/div/div/table/tbody/tr[1]/td[1]/button";
   static String facexamexam = "//*[@id=\"simple-tabpanel-0\"]/div/p/div/div/div/div[1]/div/div/table/thead/tr/th[1]";
   static String facexamdate = "//*[@id=\"simple-tabpanel-0\"]/div/p/div/div/div/div[1]/div/div/table/thead/tr/th[2]";
   static String faceexamtime = "//*[@id=\"simple-tabpanel-0\"]/div/p/div/div/div/div[1]/div/div/table/thead/tr/th[3]";
   // TC:21 faculty My student
   static String faccMyStudent = "(//span[text()='My Students'])[2]";
   static String facstudrop = "//*[@id=\"app\"]/div/div/div/main/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div";
   static String facstudropselect = "//*[@id=\"menu-\"]/div[3]/ul/li";
   static String faccMyStudentltsta = "//span[text()='My Students']";
   // TC:22 faculty Attendance
   static String facatt = "(//span[text()='Attendance'])[2]";
   static String facattendanceforltsta = "(//span[text()='Attendance'])[1]";
   static String faccAttendahis = "//span[text()='Attendance History']";
   static String faccView = "(//span[text()='View'])[2]";
   static String faccEdit = "(//span[text()='Edit'])[2]";
   static String faccBack = "//span[text()='BACK']";
   // TC:23 Faculty Timetable
   static String facClickTimetable = "(//span[text()='Timetable'])[2]";
   static String facttmonth = "//button[text()='month']";
   static String facttweek = "//button[text()='week']";
   static String facttday = "//button[text()='day']";
   static String facClickTimetableltsta = "//span[text()='Timetable']";

   // TC-24:New change faculty portal Services
   // static String facServicespfsbmtnsom = "(//span[text()='Faculty Services' or
   // text()='Support Services'])[2]";
   // static String facServicespfsbmtnsom = "((//span[text()='Faculty Services' or
   // text()='Support Services'])[2]/../..//*[local-name()='svg'])[2] |(//span[.
   // and text()='Master Trainer Services'])[1]";
   static String facServicespfsbmtnsom = "(//span[. and text()='Master Trainer Services' or text()='Support Services' or text()='Faculty Services'])[2]/../../..//*[local-name()='svg']";
   static String facServicesltsta = "(//span[. and text()='Master Trainer Services'])[1]";
   static String FacRaisecasedevbmtech = "//span[text()='Raise a Case']";
   static String FacRaisebutton = "//button[@label='Raise Case']|//*[text()='Raise a Case'] ";
   static String FacRaisequerybutton = "(//*[. and text()='Raise Query'])[1]";

   static String Raisebutton = "//span[text()='Raise Case']|//span[text()='Raise Query']";
   static String facCancelSer = "//span[text()='Cancel']";
   static String facMakedevNsom = "//p[text()='Make A Request']";
   static String facMakeRButtondevNsome = "//p[text()='Make A Request']";
   static String facMakeReqButtonSecond = "//span[text()=' Make a Request']";
   static String FaccraiseNSOM = "//button[@label='Raise Case']";
   // TC:25:faculty Raise request
   static String inputSub = "//input[@name='Subject']";
   static String SubmitRaise = "//button[@label='Submit']";
   static String facRaiseCaseleftNavbar = "(//span[. and text()='Raise a Case'])|(//*[. and text()='Raise a Query'])[1]";
   // Tc:26 faculty make request
   static String makeSubjectIn = "//input[@name='Subject']";
   static String MakeBtn = "//button[@label='Submit']";
   // TC:27 Event
   static String faccEvent = "(//span[text()='Events'])[2]";
   static String faceventlocation = "//div[@aria-labelledby='Location']";
   static String faceventlocationselect = "//li[@data-value='All' or text()='All']";
   static String FaccSearch = "//input[@placeholder='Search…']";
   static String faccEventltsta = "//span[text()='Events']";
   // TC:28faculty profile faculty
   static String facSeleectpic = "(//span[@class='MuiIconButton-label'])[3]";
   static String faccProfile = "//a[text()='Profile']";
   static String facpersonal = "(//*[@id=\"panel1a-header\"])[1]";
   static String facpdedit = "//*[name()='svg'and@height='23']";
   static String Faced = "(//*[@xmlns='http://www.w3.org/2000/svg'])[8]";
   static String facpdgender = "//*[@id=\"mui-component-select-Gender\"]";
   static String facpdgenderselect = "//li[@data-value='Male']";
   static String facpddob = "//input[@name='BirthDate']";
   static String facpdnationality = "//input[@name='CountryOfResidence']";
   static String facdpsave = "(//span[text()='Save'])[1]";
   // TC:29 faculty address
   static String address = "//h6[. and text()='ADDRESS DETAILS']";
   static String facdpaddedit = "(//h6[. and text()='ADDRESS DETAILS']/../../..//*[local-name()='svg'])[1]";
   static String facdptype = "//div[@id='mui-component-select-Addresstype']";
   static String FaccfaccTypeSelect = "//li[@data-value='Home']";
   static String faccAddress = "//input[@name='address']";
   static String faccPincode = "//input[@name='pincode']";
   static String facccountry = "//div[@id='mui-component-select-Country']";
   static String faccSelectCountry = "//li[@data-value='IN']";
   static String faccSelectCountry2 = "//li[@data-value='IR']";

   static String faccState = "//div[@id='mui-component-select-state']";
   static String faccSelectState = "//li[@data-value='KA' and text()='Karnataka']";
   static String faccSelectState2 = "//li[@data-value='KL' and text()='Kerala']";

   static String faccCity = "//div[@id='mui-component-select-distract']";
   static String faccSelectCity = "//li[@data-value='Bangalore Urban' and text()='Bangalore Urban']";
   static String faccSaveaddress = "//h6[. and text()='ADDRESS DETAILS']/../../..//span[. and text()='Save']";
   // TC:30 faculty Acadmic profile edit
   static String facdpacdeails = "//h6[text()='ACADEMIC DETAILS (highest qualification to be mentioned in the first row)']/..";
   static String facdpacadd = "//h6[text()='ACADEMIC DETAILS (highest qualification to be mentioned in the first row)']/../../..//span[. and text()='Add Row']";
   static String facdplevel = "//div[@id='mui-component-select-level']";
   static String facdplevelselect = "//li[@data-value='Graduate']";
   static String facdpadcountry = "//div[@id='mui-component-select-country']";
   static String facdpadcountryselect = "//li[@data-value='India' or text()='India']";
   static String facdpaduniversity = "//*[@name='university']";
   static String facdpadyear = "//*[@name='year']";
   static String facdpadsave = "//h6[text()='ACADEMIC DETAILS (highest qualification to be mentioned in the first row)']/../../..//span[. and text()='Save']";

   /// TC:31 faculty Reserch supervision edit
   static String facclickonT = "(//span[@class='MuiIconButton-label' or text()='P' or text()='T'])[3]";
   static String facclickonprofile = "//a[.='Profile']";
   static String facclickonRESEARCHSUPERVISION = "//h6[text()='RESEARCH SUPERVISION']";
   // static String facclickonedit =
   // "(//*[name()='svg'and@fill='currentColor'])[9]";
   static String facdpreedit = "(//h6[. and text()='RESEARCH SUPERVISION']/../../..//*[local-name()='svg'])[1]";
   static String facdpreadd = "//h6[text()='RESEARCH SUPERVISION']/../../..//span[. and text()='Add Row']";
   static String facdprename = "//h6[text()='RESEARCH SUPERVISION']/../../../..//*//input[@name='name']";
   static String facdprelink = "//h6[text()='RESEARCH SUPERVISION']/../../../..//*//input[@name='linkURL']";
   static String facdpredesc = "//h6[text()='RESEARCH SUPERVISION']/../../../..//*//input[@name='description']";
   static String faccSaveexp = "//h6[text()='RESEARCH SUPERVISION']/../../..//span[. and text()='Save']";

   static String faccdeleteexp = "//span[.='Delete']";
   // TC:32 testfacultyRESEARCHPUBLICATION

   static String facclickonRESEARCHSUPERVISIONpublish = "(//h6[. and text()='RESEARCH & PUBLICATIONS']/../../..//*[local-name()='svg'])[1]";
   static String facdpreeditpublish = "(//h6[. and text()='RESEARCH & PUBLICATIONS']/../../..//*[local-name()='svg'])[1]";
   static String facdpreaddpublish = "//h6[text()='RESEARCH & PUBLICATIONS']/../../..//span[. and text()='Add Row']";

   static String facdppubname = "//h6[text()='RESEARCH & PUBLICATIONS']/../../../..//*//input[@name='name']";
   static String facdppublink = "//h6[text()='RESEARCH & PUBLICATIONS']/../../../..//*//input[@name='linkURL']";
   static String facdppubdesc = "//h6[text()='RESEARCH & PUBLICATIONS']/../../../..//*//input[@name='description']";
   static String faccSaveRes = "//h6[text()='RESEARCH & PUBLICATIONS']/../../..//span[. and text()='Save']";

   static String faccdeletepublish = "(//span[.='Delete'])[2]";

   // TC:33 faculty confernece

   static String facclickonRESEARCHSUPERVISIONconfernece = "(//h6[. and text()='CONFERENCES']/../../..//*[local-name()='svg'])[1]";
   static String facdpreeditconfernece = "(//h6[. and text()='CONFERENCES']/../../..//*[local-name()='svg'])[1]";
   static String facdpreaddconfernece = "//h6[text()='CONFERENCES']/../../..//span[. and text()='Add Row']";

   static String facdpconnameconfernece = "//h6[text()='CONFERENCES']/../../../..//*//input[@name='name']";
   static String facdpconlinkconfernece = "//h6[text()='CONFERENCES']/../../../..//*//input[@name='linkURL']";
   static String facdpcondescconfernece = "//h6[text()='CONFERENCES']/../../../..//*//input[@name='description']";
   static String facdpconsaveconfernece = "//h6[text()='CONFERENCES']/../../..//span[. and text()='Save']";

   static String faccdeleteconference = "(//span[.='Delete'])[3]";

   // TC:34 faculty Book
   static String facdpbook = "//h6[text()='BOOK']";
   static String facdpbookedit = "(//h6[. and text()='BOOK']/../../..//*[local-name()='svg'])[1]";
   static String facdpbookadd = "//h6[text()='BOOK']/../../..//span[. and text()='Add Row']";
   static String facdpbookname = "//h6[text()='BOOK']/../../../..//*//input[@name='name']";
   static String facdpbooklink = "//h6[text()='BOOK']/../../../..//*//input[@name='linkURL']";
   static String facdpbookdesc = "//h6[text()='BOOK']/../../../..//*//input[@name='description']";
   static String faccSaveNsombm = "//h6[text()='BOOK']/../../..//span[. and text()='Save']";

   // TC:35 faculty professionl association
   static String facdpprof = "//h6[text()='PROFESSIONAL ASSOCIATION']";
   static String facdpprofedit = "(//h6[text()='PROFESSIONAL ASSOCIATION']/../../..//*[local-name()='svg'])[1]";
   static String facdpprofadd = "//h6[text()='PROFESSIONAL ASSOCIATION']/../../..//span[. and text()='Add Row']";
   static String facdpprofname = "//h6[text()='PROFESSIONAL ASSOCIATION']/../../../..//*//input[@name='name']";
   static String facdpproflink = "//h6[text()='PROFESSIONAL ASSOCIATION']/../../../..//*//input[@name='linkURL']";
   static String facdpprofdesc = "//h6[text()='PROFESSIONAL ASSOCIATION']/../../../..//*//input[@name='description']";
   static String facdpprofsave = "//h6[text()='PROFESSIONAL ASSOCIATION']/../../..//span[. and text()='Save']";

   // TC:36 faculty Others
   static String facdpother = "//h6[text()='OTHERS']/..";
   static String facdpotheredit = "(//h6[text()='OTHERS']/../../..//*[local-name()='svg'])[1]";
   static String facdpotheradd = "//h6[text()='OTHERS']/../../..//span[. and text()='Add Row']";
   static String facdpothername = "//h6[text()='OTHERS']/../../../..//*//input[@name='name']";
   static String facdpotherlink = "//h6[text()='OTHERS']/../../../..//*//input[@name='linkURL']";
   static String facdpotherdesc = "//h6[text()='OTHERS']/../../../..//*//input[@name='description']";
   static String facdpothersave = "//h6[text()='OTHERS']/../../..//span[. and text()='Save']";

   // TC:37 Fcaulty Dashboard
   // static String openFacdevnosbm = "(//span[text()='Academics'])[2]";
   // static String clickFacDashdevnosbm = "//span[text()='Dashboard']";

   // TC:39 faculty QuestionBank

   static String facaddmanual = "//button[@label='Add Question Manually']";
   static String facquesub = "//*[@id='mui-component-select-subjectSelected']";
   static String facquecclass = "//*[@id='mui-component-select-classSelected']";
   static String facqueclassselect = "//li[@data-value='3' or text()]";

   // static String facquesubselect = "//li[@data-value='3' or
   // text()='2022-AUG-BBA-Finance' or text()='2020-Sales & Distribution
   // Management-20-22'or text()='2022-Managerial Economics' or text()='2022-Design
   // Technology D-FD' or text()='2022-Electrician']";
   static String facquesubselect = "//li[@data-value='3' or text()]";
   static String facquesNEXT = "//span[text()='Next']";
   static String facclicksubject = "//div[@id='mui-component-select-subjectSelected']";
   static String faccsubject = "//li[.='2022-AUG-BBA-Finance']";
   static String faccnext = "//button[@label='Next']";
   static String faccquestion = "//input[@name='questionText']";
   static String faccquestionname = "//input[@name='questionName']";

   static String facquestionpurpose = "//input[@name='questionPurpose']";
   static String facquestionlevel = "//*[text()='Difficulty Level']/../../../../..//*[@role='button']";
   static String faclevelselect = "(//*[text()='Easy'])[1]";
   static String facquestionmark = "//*[text()='Marks for this question']/../../../../..//*[@name='marks']";

   static String faccmarks = "//input[@name='marks']";
   static String faccoption1 = "(//input[@placeholder='Enter option'])[1]";
   static String feedback1 = "(//input[@placeholder='Type your feedback here'])[1]";
   static String faccoption2 = "(//input[@placeholder='Enter option'])[2]";
   static String feedback2 = "(//input[@placeholder='Type your feedback here'])[2]";
   static String faccoption3 = "(//input[@placeholder='Enter option'])[3]";
   static String feedback3 = "(//input[@placeholder='Type your feedback here'])[3]";
   static String numberofchoice = "//input[@value='ABCD']/..";

   static String feedbackofcrtans = "//input[@name='correctAnswerFeedback']";

   static String feefbacofincorrect = "//input[@name='wrongAnswerFeedback']";
   static String generalfeedback = "//textarea[@name='generalFeedback']";
   static String facsaveandfinish = "//p[text()='Save and Finish']";
   static String facqueback = "(//span[text()='Question Bank'])[2]";
   static String facselectpro = "//*[@id=\"app\"]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div";
   static String facprofile = "//*[@id=\"menu-appbar\"]/div[3]/ul/li[1]";
   static String FacDesc = "//textarea[@placeholder='Type your description here...']";
   static String makedesc = "//textarea[@placeholder='Type your description here...']";

   // ********************************************************************************************
   // */
   // ********************************************************************************************
   // */
   // Both role test cases begin here

   // TC-40 Spreadsheet Xpath Started
   //// static String facClickacademics="(//span[text()='Academics'])[2]";
   //// static String faccc="//span[text()='Course Content']";
   //// static String facccres="//span[text()='Resource']";
   // spreadsheet upload
   static String facssclick = "//figcaption[text()='Spreadsheet']/..";
   static String facssadd = "//span[text()='Add Resource']";
   //// static String facccresdescclick="//button[@title='Insert/edit link']";
   //// static String facccresurl="//input[@type='url']";
   //// static String facccressubmitform="//*[.='Save']";
   //// static String facpptname="//input[@placeholder='Enter name']";
   //// static String facccressubmit="//span[text()='Save Resource(s)']";
   //// static String facccressubmityes="//span[text()='OK']";
   // ltsta xpath
   //// static String facClickacademicsltsta="//span[text()='Academics']";
   // spreadsheet publish
   // static String facssopen="//*[. and contains(text(),
   //// 'Spreadsheet')]/../../../..//*[local-name()='svg']";
   static String facssopen = "//*[contains(text(), 'Spreadsheet')]";
   // static String facss3dot="(//div[@class='MuiCardContent-root'])[12]";
   // static String facss3dot="(//p[.='Sample
   // Excel']/ancestor::div[@class='MuiPaper-root MuiCard-root jss152
   // MuiPaper-outlined
   // MuiPaper-rounded']/descendant::h5/../../..//*[local-name()='svg'])";
   static String facss3dot = "//p[.='Sample Excel']/../../.././..//*[local-name()='svg']";
   static String facsspublish = "//span[text()='Publish']";
   static String facsspublishyes = "//span[text()='Publish']";
   //// static String
   //// facSelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String facsignOut="//*[.='Sign Out']";
   // student portal start
   //// static String ltstaaccademics="//span[text()='Academics']";
   //// static String accademics="(//span[text()='Academics'])[2]";
   //// static String learn="//span[text()='Learn']";
   // static String viewss="//*[. and contains(text(),
   //// 'Spreadsheet')]/../../../..//*[local-name()='svg']";
   static String viewss = "//*[contains(text(), 'Spreadsheet')]";
   //// static String viewpdf2="//span[text()='View']";
   //// static String
   //// SelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String signOut="//*[.='Sign Out']";
   // Spreadsheet delete
   //// static String facpdfdelete="//span[text()='Delete']";
   //// static String facpdfdelete2="//span[text()='Delete']";
   // TC-40 Spreadsheet Xpath Completed

   // TC-41 PPT Xpath Started
   // ppt upload
   static String facClickacademics = "(//span[text()='Academics'])[2]";
   //// static String faccc="//span[text()='Course Content']";
   static String facccres = "//span[text()='Resource']";
   static String facpptclick = "//figcaption[text()='Presentation']/.. | /html/body/div[4]/div[3]/div/div[2]/div/div[1]/div[1]/div/img";
   static String facpptadd = "//span[text()='Add Resource']";
   // static String facccresdescclick="//button[@title='Insert/edit link']";
   static String facccresdescclick = "//button[@title='Insert/edit link']//*[local-name()='svg']";
   // static String facccresurl="//input[@type='url']";
   static String facccresurl = "//input[@type='url']";
   static String facccressubmitform = "//*[.='Save']";
   static String facpptname = "//input[@placeholder='Enter name']";
   static String facccressubmit = "//span[text()='Save Resource(s)'] | //span[text()='Save Resource'] | //span[text()='Save_Resource(s)']";
   static String facccressubmityes = "//span[text()='OK']";
   // ltsta xpath
   //// static String facClickacademicsltsta="//span[text()='Academics']";
   // ppt publish
   // static String facpptfopen="(//div[@id='panel1a-header'])[4]";
   static String facpptfopen = "//*[contains(text(), 'Presentations')]";
   static String facppt3dot = "(//b[.='Sample PPT']/ancestor::div[@class='MuiGrid-root']/descendant::h5/../../..//*[local-name()='svg'])[1]";
   static String facpptpublish = "//span[text()='Publish']";
   static String facpptpublishyes = "//span[text()='Publish']";
   //// static String
   //// facSelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   static String facsignOut = "//div[text()='Sign Out']/..";
   // student portal start
   static String ltstaaccademics = "//span[text()='Academics']";
   static String accademics = "(//span[text()='Academics'])[2]";
   static String learn = "//span[text()='Learn']";
   static String viewppt = "//*[contains(text(), 'Presentations')]";
   static String viewpdf2 = "//span[text()='View']";
   //// static String
   //// SelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   // static String signOut="//*[.='Sign Out']";
   // ppt delete
   static String facpdfdelete = "//span[text()='Delete']";
   static String facpdfdelete1 = "(//span[text()='Delete'])[1]";

   static String facpdfdelete2 = "//span[text()='Delete']";
   static String facpdfedit = "//span[text()='Edit']";
   static String deletefile = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-1']";
   static String logout = "//*[@id=\"menu-appbar\"]/div[3]/ul/li[2]";
   ////////////
   static String FCCportal = "//*[text()='T'] | //*[text()='A'] | //*[text()='I'] | //*[text()='S'] |//*[text()='K'] |//*[text()='t']|//*[@class='MuiAvatar-root MuiAvatar-circular']";
   // TC-41 PPT Xpath Completed

   // TC-42 PDF Xpath Started
   //// static String facClickacademics="(//span[text()='Academics'])[2]";
   //// static String faccc="//span[text()='Course Content']";
   //// static String facccres="//span[text()='Resource']";
   // pdf upload
   static String facccrespdf = "//figcaption[text()='PDF']/..|/html/body/div[4]/div[3]/div/div[2]/div/div[1]/div[3]/div/img";
   static String facccresadd = "//span[text()='Add Resource']";
   //// static String facccresdescclick="//button[@title='Insert/edit link']";
   //// static String facccresurl="//input[@type='url']";
   //// static String facccressubmitform="//*[.='Save']";
   //// static String facpptname="//input[@placeholder='Enter name']";
   //// static String facccressubmit="//span[text()='Save Resource(s)']";
   //// static String facccressubmityes="//span[text()='OK']";
   // ltsta xpath
   //// static String facClickacademicsltsta="//span[text()='Academics']";
   // pdf publish
   // static String facpdfopen="(//div[@id='panel1a-header'])[6]";
   static String facpdfopen = "//*[contains(text(), 'Pdf')]";
   // static String fac3dot="(//div[@class='MuiCardContent-root'])[16]";
   static String fac3dot = "(//p[.='Sample PDF']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 MuiGrid-item MuiGrid-grid-xs-12']/descendant::h5/../../..//*[local-name()='svg'])[1]";
   static String facpublishpdf = "//span[text()='Publish']";
   static String facpublishpdf2 = "//span[text()='Publish']";
   //// static String
   //// facSelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String facsignOut="//*[.='Sign Out']";
   // student portal start
   //// static String ltstaaccademics="//span[text()='Academics']";
   //// static String accademics="(//span[text()='Academics'])[2]";
   //// static String learn="//span[text()='Learn']";
   static String viewpdf = "//*[contains(text(), 'Pdf')]";
   //// static String viewpdf2="//span[text()='View']";
   //// static String
   //// SelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String signOut="//*[.='Sign Out']";
   // pdf delete
   //// static String facpdfdelete="//span[text()='Delete']";
   //// static String facpdfdelete2="//span[text()='Delete']";
   // TC-42 PDF Xpath Completed

   // TC-43 Video Xpath Started
   //// static String facClickacademics="(//span[text()='Academics'])[2]";
   //// static String faccc="//span[text()='Course Content']";
   //// static String facccres="//span[text()='Resource']";
   // video upload
   static String facvideoclick = "//figcaption[text()='Video']/..|/html/body/div[4]/div[3]/div/div[2]/div/div[1]/div[2]/div/img";
   static String facvideoadd = "//span[text()='Add Resource']";
   //// static String facccresdescclick="//button[@title='Insert/edit link']";
   //// static String facccresurl="//input[@type='url']";
   //// static String facccressubmitform="//*[.='Save']";
   //// static String facpptname="//input[@placeholder='Enter name']";
   //// static String facccressubmit="//span[text()='Save Resource(s)']";
   //// static String facccressubmityes="//span[text()='OK']";
   // ltsta xpath
   //// static String facClickacademicsltsta="//span[text()='Academics']";
   // video publish
   static String facvideoopen = "//*[contains(text(), 'Videos')]";
   static String facvideo3dot = "(//p[.='Sample Video']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 MuiGrid-item MuiGrid-grid-xs-12']/descendant::h5/../../..//*[local-name()='svg'])[1]";
   static String facvideopublish = "//span[text()='Publish']";
   static String facvideopublishyes = "//span[text()='Publish']";
   //// static String
   //// facSelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String facsignOut="//*[.='Sign Out']";
   // student portal start
   //// static String ltstaaccademics="//span[text()='Academics']";
   //// static String accademics="(//span[text()='Academics'])[2]";
   //// static String learn="//span[text()='Learn']";
   static String viewvideo = "//*[contains(text(), 'Videos')]";
   //// static String viewpdf2="//span[text()='View']";
   //// static String
   //// SelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String signOut="//*[.='Sign Out']";
   // Video delete
   //// static String facpdfdelete="//span[text()='Delete']";
   //// static String facpdfdelete2="//span[text()='Delete']";
   // TC-43 Video Xpath Completed

   // TC-44 Link Xpath Started
   //// static String facClickacademics="(//span[text()='Academics'])[2]";
   //// static String faccc="//span[text()='Course Content']";
   //// static String facccres="//span[text()='Resource']";
   // link upload no publish for link
   static String faclinkclick = "//figcaption[text()='Links']/..|/html/body/div[4]/div[3]/div/div[2]/div/div[2]/div/div/img";
   static String faclinkadd = "//span[text()='Add Resource']";
   static String faclinkexternal = "//input[@name='externalUrl']";
   //// static String facccresdescclick="//button[@title='Insert/edit link']";
   //// static String facccresurl="//input[@type='url']";
   //// static String facccressubmitform="//*[.='Save']";
   //// static String facpptname="//input[@placeholder='Enter name']";
   //// static String facccressubmit="//span[text()='Save Resource(s)']";
   //// static String facccressubmityes="//span[text()='OK']";
   // ltsta xpath
   //// static String facClickacademicsltsta="//span[text()='Academics']";
   //// static String
   //// facSelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String facsignOut="//*[.='Sign Out']";
   // student portal start
   //// static String ltstaaccademics="//span[text()='Academics']";
   //// static String accademics="(//span[text()='Academics'])[2]";
   //// static String learn="//span[text()='Learn']";
   static String viewlink = "//*[contains(text(), 'Link')]";
   //// static String viewpdf2="//span[text()='View']";
   //// static String
   //// SelectPrtoSignout="/html/body/div[1]/div/div/div/main/div[2]/div[2]/header/div/header/div[1]/div[2]/div/div";
   //// static String signOut="//*[.='Sign Out']";
   // Link delete
   //// static String facpdfdelete="//span[text()='Delete']";
   //// static String facpdfdelete2="//span[text()='Delete']";
   static String faclink3dot = "(//p[.='Sample Link']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 MuiGrid-item MuiGrid-grid-xs-12']/descendant::h5/../../..//*[local-name()='svg'])[1]";
   static String faclinkopen = "//*[contains(text(), 'Link')]";
   // TC-44 Link Xpath Completed

   //// ................Test case no 45
   //// testStudentFacultyASSEMENT.................................////
   //// .........................Faculty portal Assement test case path
   //// .................................////
   static String facClickacademicsrelative = "//span[.='Academics']";
   static String facclickcouserelative = "//span[.='Course Content']";
   static String facactivityrelative = "//span[.='Activity']";
   //// static String facassessmentrelative = "(//div[@class='MuiGrid-root
   //// MuiGrid-item MuiGrid-grid-xs-2'])[1]";
   //// static String facaddactivityrelative = "//span[.='Add Activity']";
   static String facassesmentrelative = "//input[@name='assessmentName']";
   static String facmorerelative = "//button[@title='More...']";
   static String facclinkrelative = "//button[@title='Insert/edit link']";
   static String facurlrelative = "//input[@type='url']";
   static String facsavlinrelative = "//button[@title='Save']";
   static String facsaverelative = "//span[.='Save and Proceed to Assessment Settings']";
   static String fachourrelative = "//input[@name='timeLimitHours']";
   static String facminrelative = "//input[@name='timeLimitMinutes']/..//*[local-name()='svg']/..";
   static String minute1 = "//*[text()='01']";
   static String selectgrace = "//*[text()='On time expiration']/../../../../..//*[local-name()='svg']/..";
   static String selectgrace1 = "//*[text()='There is a grace period when open attempts can be submitted, but no more questions answered']";
   static String passminute = "//*[@name='submissionGradeInputValue']";
   static String period = "//*[@id='mui-component-select-submissionGradeSelectValue']";
   static String periodselect = "(//*[text()='Minutes'])[2]";

   static String fasaverelative = "//span[.='Save and Proceed']";
   static String fasokrelative = "//span[.='OK']";
   static String fasquestionrelative = "//p[.='From question bank']";
   static String facselectrelative = "(//input[@type='checkbox'])[7]/..";
   static String selectquestiontype = "//*[text()='Question Type']";
   static String selectmcq5 = "(//*[text()='Multiple choice']/../..//*[@type='checkbox'])[1]";
   static String facselectrelative1 = "(//input[@type='checkbox'])[8]/..";
   static String facselectrelative2 = "(//input[@type='checkbox'])[9]/..";
   static String facselectrelative3 = "(//input[@type='checkbox'])[10]/..";
   static String facselectrelative4 = "(//input[@type='checkbox'])[11]/..";

   static String facaddselectrelative = "//span[.='Add Selected']";
   static String facprevirelative = "//p[.='Preview']";
   static String assesmentedit = "//p[.='Edit']";
   static String preview = "//p[.='Preview']";
   static String facAssPublish = "//span[.='Publish Assessment']/..";
   static String facAreYouSurePublish = "//span[.='Publish']/..";
   static String facGoToDashboard = "(//span[. and contains(text(), 'Go ')])[2]";
   // static String facSelectPrtoSignoutrealtive = "(//div[.='S'])[2]";
   // static String facsignOutrealtive = "(//li[@role='menuitem'])[2]";
   //// ..........................Student login Assessment view relative
   // xpath........................../////
   // static String facforummore = "//button[@title='More...']";
   static String Studentassessmenstrelativeacademic = "//span[.='Academics']";
   static String Studentassessmenstrelativelearn = "//span[.='Learn']";
   // static String Studentassessmenstrelativelexpand =
   // "(//span[@class='MuiIconButton-label'])[5]";
   static String Studentassessmenstrelativelexpand = "(//*[. and contains(text(), 'Assessments')]/../../../../..//*[local-name()='svg'])[1]";
   static String assesmentattemptnow = "(//span[.='Attempt Now'])[1]";

   static String assesmentinstruction = "//*[@type='checkbox']/../../..";
   static String startassesment = "//*[. and text()='Start Assessment'] | //*[. and text()='Continue Attempt']";
   static String attemptquestion = "(//*[. and @type='radio'])[1]/../../..";
   static String attemptquestion2 = "(//*[. and @type='radio'])[2]/../../..";

   static String attemptnextquestion = "//*[text()='Next']";
   static String clickquestiontype = "//*[. and text()='Question Type']";
   static String selectmcq = "(//*[. and text()='Multiple choice'])[1]";
   static String selectmcq1 = "(//*[. and text()='Multiple choice'])[3]";
   // static String selectmcq1 = "//input[@name='multichoice']";
   static String selectmcq2 = "(//*[. and text()='Multiple choice'])[2]";
   static String submitattempt = "//*[. and text()='Submit Attempt']";
   static String submitagainattempt = "//*[. and text()='Submit']";
   static String assesmentok = "//*[. and text()='OK']";

   static String viewattempt = "(//span[.='View Attempt'])[1]";
   static String viewattempt2 = "(//span[.='View Attempt'])[2]";
   static String viewattempt3 = "(//span[.='View Attempt'])[3]";

   static String getresult = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-4']";
   static String reviewquiz = "(//*[text()='Review Quiz'])[1]";
   static String searchname = "//*[@placeholder='Search by Name & Status']";
   static String viewresultinfac = "(//*[text()='Result'])[1]";

   static String StudentassessmenstrelativeclickonA = "(//span[@class='MuiIconButton-label'])[3]";
   static String Studentassessmenstrelativesignout = "(//li[@role='menuitem'])[2]";
   //// .......................Faculty delete Assessment relative
   //// xpath................................//
   static String facClickacademicsrelativedelete = "//span[.='Academics']";
   static String facclickcouserelativedelete = "//span[.='Course Content']";
   static String facultyassessmenstrelativelexpandtodelete = "(//*[. and contains(text(), 'Assessments')]/../../../../..//*[local-name()='svg'])[1]";
   static String fclickondotltstarelativedelete = "//p[.='sachinautoengineer']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-justify-content-xs-space-around']/descendant::h5";
   static String fsubltstadeleterelativedelete = "(//span[.='Delete'])[1]";
   static String fsubltstadelete1relativedelete2 = "//span[.='Delete']";
   static String facSelectPrtoSignoutrealtivedelete = "(//div[.='S'])[2]";
   static String facsignOutrealtivedelete = "(//li[@role='menuitem'])[2]";
   //// ................................end of assessment
   //// xpath.....................................//////
   static String facinstruction3dot = "//*[@class='tox-tbtn' and @title='More...']";
   static String facSelectPrtoSignoutrealtive = "(//div[.='T'])[2]";
   static String facsignOutrealtive = "//*[.='Sign Out']";
   // TC-45 Xpaths ends here

   //// .............................Test case no 46 testFacultyStudentASSIGNMENT
   //// RelativeXpath.........../////
   //// ............................. assignment faculty add assign Relative
   //// Xpath...................//////
   static String assignfacClickacademics1Relative = "//span[.='Academics']";
   static String assignfacclickcouse1relative = "//span[.='Course Content']";
   static String assignfacactivityrelative = "//span[.='Activity']";
   // static String assignfacassignmentrelative = "(//div[@class='MuiGrid-root
   // MuiGrid-item MuiGrid-grid-xs-2'])[2]/..";
   static String assignfacassignmentrelative = "/html/body/div[4]/div[3]/div/div[2]/div/div/div[2]/div/img";
   static String assignfacaddactivityrelative = "//span[.='Add Activity']";
   static String assignfacassignmentNamerelative = "//input[@name='assignmentName']";
   static String assignfaclinkrelative = "//button[@title='Insert/edit link']";
   static String assignfacurlrelative = "//input[@type='url']";
   static String assignfacsavlinrelative = "//button[@title='Save']";
   static String assignfacsaverelative = "//span[.='Save and Proceed to Assignment Settings']";
   static String assignfacdaterelative = "//input[@type='datetime-local']";
   static String assignfactotalmarksrelative = "//input[@name=\"totalMarks\"]";
   static String assignfacgraderelative = "//input[@name='gradetopass']";
   static String assignfacattementsrelative = "//div[@aria-labelledby='mui-component-select-attemptsAllowed']";
   static String assignfacselectattemtrelative = "//li[.='2 Attempts']";
   static String assignfacsaveandproceedrelative = "//span[.='Save and Proceed']";
   static String assignfacokrelative = "//span[.='OK']";
   static String assignexapnd1relative = "(//*[. and contains(text(), 'Assignments')]/../../../../..//*[local-name()='svg'])[1]";
   static String assignfacdot1relative = "";
   static String assignfacpublish = "(//span[.='Publish'])[1]";
   static String assignfacDiscussions = "(//span[.='Discussions'])[1]";
   static String assignfacDiscussions1 = "(//span[.='Discussions'])[1]/../..//*[local-name()='svg']";

   static String assignfacpublishrelative = "//span[.='Publish']";
   static String assignfacpublish1relative = "//span[.='Publish']";
   static String assignfacclickonp1relative = "(//div[.='T'])[2]";
   static String assignfacconsignout1relative = "(//li[@role='menuitem'])[2]";
   static String assignedit = "(//span[.='Edit'])[1]";
   //// ................. ..student assignment view relative
   //// xpath................................////
   static String assignacadmicsltstastudentrelative = "//span[.='Academics']";
   static String assignlearnltstastudentrelative = "//span[.='Learn']";
   static String assignexpandltstastudentrelative = "(//*[. and contains(text(), 'Assignments')]/../../../../..//*[local-name()='svg'])[1]";
   static String assignltstasignstudentrelative = "(//span[@class='MuiIconButton-label'])[3]";
   static String assignltstasignoutstudentrelative = "(//li[@role='menuitem'])[2]";
   //// ........... assignment delete faculty Relative
   //// xpath..............................////
   static String assignfacClickacademicsrelative = "//span[.='Academics']";
   static String assignfacclickcouserelative = "//span[.='Course Content']";
   static String assignexapndrelative = "(//div[@id='panel1a-header'])[1]";
   static String assignfacdotrelative = "//p[.='varunautomation']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-justify-content-xs-space-around']/descendant::h5";
   static String assignfacdeleterelative = "(//div[@role='button'])[23]";
   static String assignfacdelerelative = "(//span[.='Delete'])[1]";
   static String assignfacclickonprelative = "(//div[.='T'])[2]";
   static String assignfacconsignoutrelative = "(//li[@role='menuitem'])[2]";
   //// TC-46 ends here.......................end of Assignment
   //// Realtive......................./////

   // TC-47 FOrum Xpath Started
   //// .............. faculty forum add activity RelativeXpath
   // xpath...................////
   static String relativefacforumClickacademics1 = "//span[.='Academics']";
   static String relativefacforumclickcouse1 = "//span[.='Course Content']";
   static String relativefacforumactivity1 = "//span[.='Activity']";
   static String relativefacforum1 = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-2'])[3]";
   static String relativefacforum1ltsta = "/html/body/div[4]/div[3]/div/div[2]/div/div/div[3]/div/img";
   static String relativefacfforumaddactivity1 = "//span[.='Add Activity']";
   static String relativefacforumname1 = "//input[@name='forumName']";
   // static String facforummore = "//button[@title='More...']";
   static String relativefacforumclink1 = "//button[@title='Insert/edit link']";
   static String relativefacforumurl1 = "//input[@type='url']";
   static String relativefacforumsavlin1 = "//button[@title='Save']";
   static String relativefacforumsave1 = "//span[.='Save and Proceed to Forum Settings']/..";
   static String relativefaforumsave1 = "//span[.='Save and Proceed']/..";
   static String relativefaforumok1 = "//span[.='OK']";
   static String relativeformexpand1 = "(//*[. and contains(text(), 'Forum')]/../../../../..//*[local-name()='svg'])[1]";
   static String relativefaccformedot1 = "//p[.='spruthirajautomation']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-justify-content-xs-space-around']/descendant::h5";
   static String relativefacformepublish11 = "//span[.='Publish']";
   static String relativefacformepublish12 = "//span[.='Publish']";
   static String relativefacformeclickonp1 = "(//div[.='T'])[2]";
   static String relativefacformesignout1 = "(//li[@role='menuitem'])[2]";
   //// ............................ student forum login and view relative
   //// xpath.................////
   static String relativestudentacadamicsltsta1 = "//span[.='Academics']";
   static String relativeforumlearnltsta1 = "//span[.='Learn']";
   static String relativeforumaexpandltsta1 = "(//*[. and contains(text(), 'Forum')]/../../../../..//*[local-name()='svg'])[1]";
   static String relativeforumsubltstasign1 = "(//span[@class='MuiIconButton-label'])[3]";
   static String relativeforumsubltstasignout1 = "(//li[@role='menuitem'])[2]";
   //// ................................... faculty delete forum Relative
   //// xpath..................////
   static String relativeforumdaccltsta12 = "//span[.='Academics']";
   static String relativeforumdacclickcouse12 = "//span[.='Course Content']";
   static String relativeforumdfexpandltsta12 = "(//div[@id='panel1a-header'])[3]";
   static String relativeforumfclickondotltsta12 = "//p[.='spruthirajautomation']/ancestor::div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-justify-content-xs-space-around']/descendant::h5";
   static String relativedfacdelete12 = "(//span[.='Delete'])[1]";
   static String relativedfacdele12 = "//span[.='Delete']";
   static String relativedfacclickonp12 = "(//div[.='T'])[2]";
   static String relativedfacconsignout12 = "(//li[@role='menuitem'])[2]";

   static String program = "(//*[. and @aria-haspopup='listbox'])[1]";
   static String programselect = "(//li[@data-value])[1]";
   static String course = "(//*[. and @aria-haspopup='listbox'])[2]";
   static String courseselect = "(//li[@data-value])[1]";
   static String courseselect1 = "(//li[@data-value])[4]";
   static String selectxpath = "//*[@id='menu-']/div[3]/ul/li";

   static String subject = "(//*[. and @aria-haspopup='listbox'])[2]";
   static String section = "(//*[. and @aria-haspopup='listbox'])[3]";

   static String subjectclick = "//*[@class='MuiTab-wrapper']//p";

   static String subjectselect = "//*[@data-value='Sales & Distribution Management-20-22-Retail Management']";

   // .....................................testcase no-48
   // xpath................................///

   static String clickonaddsubmission = "//span[.='Add Submission']";
   static String clickonbrowser = "//input[@type='file']";
   static String clickonsubmit = "//span[.=' Submit']";
   static String clickongrade = "(//p[text()='Test student']/../../../../..//*[span='Grade'])[1]|(//p[text()='Test Student']/../../../../..//*[span='Grade'])[1]";
   // static String clickongradedev="(//p[text()='Test
   // student']/../../../../..//*[span='Grade'])[1]";
   static String clickongradeltpct = "(//p[text()='Sanchith Student']/../../../../..//*[span='Grade'])[1]";
   static String clickondot = "(//*[@class='tox-tbtn' and @title='More...'])[2]";

   ////////////////////////////// ....................testcase50......................./////////////
   static String clickongradething = "//input[@name='marks']";
   static String reviewassign = "(//span[. and text()='Review'])[1]/../..//*[local-name()='svg']/../..";
   // 56
   static String relativefacFormeDiscussion = "//span[.='Discussions']";
   static String relativeFacformeCreateNewDiscussion = "//span[text()='Create New discussion']";
   static String faccDiscuionText = "//input[@name='title']";
   static String faccDiscussionMessgae3dot = "//*[@aria-label='More...' and @title='More...']";
   static String faccMessage = "//iframe[@title='Rich Text Area']/..";
   static String faccSavefinish = "//span[.='Save and Finish']";
   // 55
   static String faccFilter = "(//span[text()='Filters'])[2]";
   static String faccFilterClear = "//p[text()='Clear all']";
   static String faccPPTCheckBox = "//input[@name='Presentation' and @type='checkbox']/..";
   static String faccPPTOPen = "(//*[. and contains(text(), 'Resource Type')]/../../../..//*[local-name()='svg'])[1]";
   // ltsta xpath

   // 57,58,59
   static String assignsearch = "(//*[@aria-label='search'])";
   // static String assigngrade = "(//*[text()='Grade'])[1]";
   static String assigngrade = "//*[text()='Test student']/../../../../../..//button | //*[text()='Test Student']/../../../../../..//*[text()='Grade']";
   static String faccPDFCheckBox = "//input[@name='Pdf' and @type='checkbox']/..";
   static String faccVideoCheckBox = "//input[@name='Video' and @type='checkbox']/..";
   static String faccLinksCheckBox = "//input[@name='Links' and @type='checkbox']/..";

   // 60,61,62
   static String filterassessment = "//*[@id='app']/div/div/div/main/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div | //*[@id='app']/div/div/div/main/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div/..";
   static String filterforum = "//*[@id='app']/div/div/div/main/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div | //*[@id='app']/div/div/div/main/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div/..";
   static String filterassignment = "//*[@id='app']/div/div/div/main/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div | //*[@id='app']/div/div/div/main/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div/..";
   static String faccFilterassignment = "(//span[text()='Filters'])[1]";
   static String faccFilterassignmnetClear = "//p[text()='Clear all']";
   static String FaccFilterOpen = "(//*[. and contains(text(), 'Activity Type')]/../../../..//*[local-name()='svg'])[1]";
   static String faccAssignmentCheckBox = "//input[@name='Assignments' and @type='checkbox']/..";
   static String faccAssementCheckBox = "//input[@name='Assessment' and @type='checkbox']/..";
   static String faccForumCheckBox = "//input[@name='Forum' and @type='checkbox']/..";
   static String facResourceFilterDiv = "//*[@id='app']/div/div/div/main/div[2]/div[2]/div[2]/div[2]/div[3]/div/div/div/.. | //*[@id='app']/div/div/div/main/div[2]/div[2]/div[3]/div[2]/div[3]/div/div/div/..";
   static String clickresult2 = "(//span[.='Result'])[2]";
   static String clickresult1 = "(//span[.='Result'])[1]";

   // 63
   static String facfourmeditattachements = "(//*[@role='button' and @aria-haspopup='listbox'])[2]";
   static String facfourmattachementset2 = "//*[text()='2' and @role='option' ]";
   static String getmark = "/html/body/div[1]/div/div/div/main/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[2]/p[1] | /html/body/div[1]/div/div/div/main/div[2]/div[2]/div[3]/div[3]/div[1]/div/div[1]/div[2]/div/div[2]/p[1]";

   // 66
   static String assesmentdashboard = "//*[text()=' to Dashboard']";
   static String alertmsg = "// div[@role='alert']";

   // login using username and password ltpct | spmb
   static String username = "(//*[@placeholder='Please Enter Username'])";
   static String password = "(//*[@placeholder='Please Enter Password'])";
   static String singnin = "(//*[text()='Verify & Sign in'])";
   // new profile fac edit
   static String singinintial = "(//*[text()='T'])";
   static String faccprofile = "(//*[text()='Profile'])";
   static String testfaculty = "//*[text()='Test Faculty']//*[local-name()='svg']";
   static String faccgender = "//*[@id='mui-component-select-Gender']";
   static String faccselgender = "//li[@data-value='Male']";
   static String faccph = "(//*[@name='Phone'])";
   static String faccadd = "(//*[text()='ADDRESS'])";
   static String faccadd2 = "//*[text()='ADDRESS DETAILS']/..//*[local-name()='svg']";
   static String faccstate = "//*[@id='mui-component-select-state']";
   static String faccacadmics = "(//*[text()='ACADEMIC'])";
   static String faccaddrow = "(//*[text()='Add Row'])";
   static String faccsave = "(//*[text()='Save'])[1]";

   static String faccexpe = "(//*[text()='EXPERIENCE '])";
   static String faccinst = "(//*[@name='Institute'])[1]";
   static String faccposition = "(//*[@name='Position'])";
   static String faccrole = "(//*[@name='Role'])";
   static String faccduration = "(//*[@name='Duration'])";
   static String faccdecs = "//*[text()='Description']/../../../..//*[@aria-label='maximum height']";
   static String faccsave1 = "(//*[text()='Save'])[1]";

   static String faccinstindu = "(//*[@name='Institute'])[2]";
   static String faccpositionindu = "(//*[@name='Position'])[2]";
   static String faccroleindu = "(//*[@name='Role'])[2]";
   static String faccdurationindu = "(//*[@name='Duration'])[2]";
   static String faccsave2indu = "(//*[text()='Save'])[2]";

   static String faccpacco = "//*[text()='PROFESSIONAL ASSOCIATION']/..//*[local-name()='svg']";
   static String proname = "(//*[@name='name'])[3]";
   static String prolink = "(//*[@name='linkURL'])[3]";
   static String prodec = "(//*[@name='description'])[3]";
   static String prosave = "(//*[text()='Save'])[3]";

   static String resecher = "(//*[text()='RESEARCH'])";
   static String resechersvg = "//*[text()='RESEARCH SUPERVISION']/..//*[local-name()='svg']";
   static String recshadd = "(//*[text()='Add Row'])";
   static String resname = "(//*[@name='name'])[1]";
   static String rechelink = "(//*[@name='linkURL'])[1]";
   static String recherdec = "(//*[@name='description'])[1]";
   static String rechpub = "//*[text()='RESEARCH & PUBLICATIONS']/..//*[local-name()='svg']";
   static String rechnam = "(//*[@name='name'])[2]";
   static String rechlink = "(//*[@name='linkURL'])[2]";
   static String rechdecs = "(//*[@name='description'])[2]";
   static String rechsave = "(//*[text()='Save'])[2]";
   static String reschconfrence = "//*[text()='CONFERENCES']/..//*[local-name()='svg']";
   static String nameconfrence = "(//*[@name='name'])[3]";
   static String confrencelink = "(//*[@name='linkURL'])[3]";
   static String confrencedecsti = "(//*[@name='description'])[3]";
   static String confrencesave = "(//*[text()='Save'])[3]";
   static String reschbook = "//*[text()='BOOK']/..//*[local-name()='svg']";
   static String bookname = "(//*[@name='name'])[4]";
   static String booklink = "(//*[@name='linkURL'])[4]";
   static String bookdecsti = "(//*[@name='description'])[4]";
   static String booksave = "(//*[text()='Save'])[4]";

   static String others = "(//*[text()='OTHERS '])";
   static String otherssvg = " //*[text()='OTHERS']/..//*[local-name()='svg']";
   static String othername = "(//*[@name='name'])[1]";
   static String otherlink = "(//*[@name='linkURL'])[1]";
   static String othersdes = "(//*[@name='description'])[1]";
   static String othersave = "(//*[text()='Save'])";
   //// ....................................changes in pfs
   //// xpath..................................////

   static String Option1Insert1 = "(//button[@title='Insert/edit link'])[2]";
   static String Qurl1 = "(//input[@type='url'])";
   static String faccoptionsave1 = "(//button[@title='Save'])";
   static String Qfacfeedback1 = "(//input[@placeholder='Type your feedback here'])[1]";
   static String Option2Insert2 = "(//button[@title='Insert/edit link'])[3]";
   static String Qurl2 = "(//input[@type='url'])";
   static String faccoptionsave2 = "(//button[@title='Save'])";
   static String Qfacfeedback2 = "(//input[@placeholder='Type your feedback here'])[2]";
   static String Option3Insert3 = "(//button[@title='Insert/edit link'])[4]";
   static String Qurl3 = "(//input[@type='url'])";
   static String faccoptionsave3 = "(//button[@title='Save'])";
   static String Qfacfeedback3 = "(//input[@placeholder='Type your feedback here'])[3]";
   static String Option4Insert4 = "(//button[@title='Insert/edit link'])[5]";
   static String Qurl4 = "(//input[@type='url'])";
   static String faccoptionsave4 = "(//button[@title='Save'])";
   static String Qfacfeedback4 = "(//input[@placeholder='Type your feedback here'])[4]";

   static String eventfilter = "(//*[text()='Events'])[1]/..";
   static String eventfiltersecrech = "//*[@placeholder='Search…']";
   static String eventfiltercatgery = "//*[@id='mui-component-select-category']";
   static String eventsfiltercatgeryselect = "(//*[text()='All'])[2]";
   static String eventsfiltertype = "//*[@id='mui-component-select-type']";
   static String eventsfiltertypeseclect = "//*[@data-value='All']";
   static String eventfilterclear = "//*[text()='Clear all']";
   static String mystudentltsta = "//span[. and text()='My Students']";

   static String mystudent = "(//span[. and text()='My Students'])[2]/..";
   static String mystudentserch = "//*[@aria-label='search']";
   static String mystudentprofileclick = "//*[text()='Test Student']/../.. |//*[text()='Test Student 2']/../..";
   static String mystudentyoj = "//*[@name='YOJ']";
   static String mystudenthoues = "//*[@name='HOUSE']";
   static String mystudentvpaopted = "//*[@name='VPAOPTED']";
   static String mystudentecapted = "//*[@name='ECAOPTED']";
   static String mystudentadhar = "//*[@name='AadharNumber'] ";
   static String mystudentage = "//*[@name='Age']";
   static String mystudentallery = "//*[@name='Allergy']";
   static String mystudentdrivername = "//*[@name='DriverName']";
   static String mystudentphotofamilyhistory = "//*[@name='PostFamilyHistory']";
   static String mystudentphoneno = "//*[@name='PhoneNo']";
   static String mystudentsubmit = "//*[text()='Submit']";
   static String mystudentpersonal = "//*[text()='PERSONAL DETAILS']";
   static String mystudentperfather = "//*[@name='FatherName']";
   static String mystudentmother = "//*[@name='MotherName']";
   static String mystudentprimarycontant = "//*[@name='PrimaryContact']";
   static String bloodgroup = "//*[@name='BloodGroup']";
   static String mystudentstate = "//*[@name='STATE']";
   static String alternatorcontact = "//*[@name='AlternateContact']";
   static String mystudentmailid = "//*[@name='MailID']";
   static String fatherocupation = "//*[@name='FathersOccupation']";
   static String moterocupation = "//*[@name='MotherOccupation']";
   static String anualincome = "//*[@name='AnnualIncome']";
   static String emercycontant = "//*[@name='EmergencyContactNumber']";
   static String personalsubit = "//*[text()='Submit']/..";
   static String adderwsdetails = "//*[text()='ADDRESS DETAILS']";
   static String streetaddres = "//*[@name='STREET']";
   static String cityaddres = "//*[@name='CITY']";
   static String postalcode = "//*[@name='POSTALCODE']";
   static String countrydetails = "//*[@name='COUNTRY']";
   static String streetperment = "//*[@name='PSTREET']";
   static String cityperment = "//*[@name='PCITY']";
   static String postalcodeperment = "//*[@name='PPOSTALCODE']";
   static String permentstate = "//*[@name='PSTATE']";
   static String permentcountary = "//*[@name='PCOUNTRY']";
   // scrompackege
   static String scrompakege = "//figcaption[text()='SCORM Package']/..";
   static String autoupdatefreequecy = "//*[@aria-labelledby='mui-component-select-AutoUpdateFrequency']/..";
   static String clickinever = "//li[text()='Never']";
   static String appearance = "//*[@id='mui-component-select-displayPack']";
   static String currentwindow = "//li[text()='Current Window']";
   static String displaycoures = "//*[@id='mui-component-select-displayCourse']";
   static String selectyes = "//li[text()='Yes']";
   static String displayattpetstatus = "//*[@id='mui-component-select-displayStatus']";
   static String displayselectfinal = "//li[text()='Yes']";
   static String selectdisplatattmpt = "//li[text()='No']";
   static String avalibityfrom = "(//*[@type='datetime-local'])[1]";
   static String avlabityto = "(//*[@type='datetime-local'])[2]";
   static String numberofattpmt = "//*[@id='mui-component-select-numberAttemp']";
   static String selectnoofattmpt = "//li[text()='3 Attempts']";
   static String attpmtsgreding = "//*[@id='mui-component-select-gradingAttemp']";
   static String selectattmtgreding = "//li[text()='Average Attempts']";
   static String forecenewattmpt = "//*[@id='mui-component-select-forceAttemp']";
   static String selectforeceattmpt = "//li[text()='passed or failed']";
   static String loockfinalattmpt = "//*[@id='mui-component-select-lockAttemp']";
   static String selectfinalattmpt = "//li[text()='Yes']";
   static String compltetiontraking = "//*[@id='mui-component-select-CompletionTracking']";
   static String compltetiontrakingselect = "//li[text()='Students can manually mark the activity as completed']";
   static String expectcompletedon = "(//*[@type='datetime-local'])[3]";

   // addquestion
   static String savequestion = "//*[text()='Save and Finish']";
   static String addquestion = "//*[text()='Add more']";
   static String returntoQB = "//*[text()='Return to Question Bank']";

   // multipleattempt
   static String attemptallowed = "//*[text()='Attempts allowed']/../../../..//*[local-name()='svg']/../..";
   static String attempt2 = "//*[text()='2 Attempts']";
   static String attempt3 = "//*[text()='3 Attempts']";

   // Grademethod
   static String grademethod = "//*[text()='Grade Methods']/../../../..//*[local-name()='svg']/..";
   static String highestgrade = "(//*[text()='Highest grade'])[2]";
   static String averagegrade = "//*[text()='Average grade']";
   static String firstattempt = "//*[text()='First Attempt']";
   static String lastattempt = "//*[text()='Last Attempt']";

   // class
   static String classclick1 = "(//*[contains(text(),'My Classes')]/../../../..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall'])[1]";
   static String classclick = "(//*[@id='app']/div/div/div/main/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[2]//*[local-name()='svg'])[1]";
   // true/false
   static String trueORfalse = "//*[text()='Question Type']/../../../../../..//*[local-name()='svg']/..";
   static String selecttrueORfalse = "//*[@data-value='truefalse']";
   static String selectingtrue = "//*[text()='True']";
   static String questionpurpose = "//*[text()='Question Purpose']/../../../../..//*[@name='questionPurpose'] | //*[text()='Question Outcome']/../../../../..//*[@name='questionPurpose']";
   static String difficultlevel = "//*[text()='Difficulty Level']/../../../../..//*[local-name()='svg']/..";
   static String selectmoderate = "//*[text()='Moderate']";
   static String questionback = "//*[text()='Back'] | //*[text()='Return to Question Bank']";
   static String ltstaquestion = "//*[. and text()='Question']/../../../../../..//*[@type='text']";
   // shortanswer
   static String shortanswer = "//*[text()='Short Answer']";
   static String enteranswer1 = "//*[text()='Answer 1']/../../../../../..//*[@placeholder='Enter Answer']";
   static String grade1 = "(//*[text()='Grade']/../../../../../..//*[@placeholder='Enter Grade 0 to 100'])[1]";
   static String feedbackSA1 = "(//*[text()='Feedback']/../../../../../..//*[@placeholder='Type your Feedback'])[1]";
   static String enteranswer2 = "//*[text()='Answer 2']/../../../../../..//*[@placeholder='Enter Answer']";
   static String grade2 = "(//*[text()='Grade']/../../../../../..//*[@placeholder='Enter Grade 0 to 100'])[2]";
   static String feedbackSA2 = "(//*[text()='Feedback']/../../../../../..//*[@placeholder='Type your Feedback'])[2]";
   static String generalfeedbackSA = "//*[@placeholder='A fully worked answer or link for more information.']";
   // essay
   static String Essay = "//*[text()='Essay']";

   // attempt5question
   static String rowperpage = "//*[@aria-haspopup='listbox']";
   static String selectall = "//*[text()='All']";
   static String question1 = "(//*[text()='Varun 2mark question1'])[1]";
   static String question2 = "(//*[text()='Varun 2mark question2'])[1]";
   static String question3 = "(//*[text()='Varun 2mark question3'])[1]";
   static String question4 = "(//*[text()='Varun 2mark question4'])[1]";
   static String question5 = "(//*[text()='Varun 2mark question5'])[1]";

   // assignmenttimelimit
   static String endtime = "(//*[@type='datetime-local'])[2]";
   static String errormsg = "(//*[@class='MuiTypography-root MuiTypography-body1'])[7]";
   static String wordlimt = "(//*[@type='number'])[3]";
   static String maxiumsubmisiontime = "//*[@id='mui-component-select-maximumFileSize']/..";
   static String selectmaxiumsubmisiontime = "//*[text()='1MB']";
   static String xmark = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-1']";
   static String noofquestionperpage = "(//*[@id='mui-component-select-questionsPerPage'])/..//*[local-name()='svg']/..";
   static String onequestioneachpage = "//li[text()='1 question each page']";
   static String my360 = "(//*[text()='My 360'])[1]";
   static String fees = "(//*[text()='Fees'])[2]";
   static String achivements = "(//*[text()='Achievements'])";
   static String personaldetails = "(//*[text()='Personal Details'])";
   static String sfees = "(//*[text()='Fees'])[1]";
   static String fesscart = "(//*[text()='Fee Cart'])[1]";
   static String feesschedule = "(//*[text()='Fee Schedule'])";
   static String transaction = "(//*[text()='Transactions'])";
   static String studentserivece = "(//*[text()='Student Service Fee'])";
   static String manualfeepayment = "(//*[text()='Manual Fee Payment'])";
   static String offerletterfeesdetails = "(//*[text()='Offer Letter Fee Details'])";
   static String attendence = "(//*[text()='Attendance'])[1]";
   static String overview = "(//*[text()='Overview'])[1]";
   static String subjectname = "(//*[text()='Subject Name'])[1]";
   static String sectionc = "(//*[text()='Section'])";
   static String totalattendance = "(//*[text()='Total Attendance'])";
   static String view = "(//*[text()='View'])";
   static String attenceshistorry = "(//span[text()='Attendance History'])";
   static String subjectnamed = "(//*[text()='Subject Name'])";
   static String date = "(//*[text()='Date'])";
   static String resontype = "(//*[text()='Reason Type'])";
   static String status = "(//*[text()='Status'])";
   static String lleran = "(//*[text()='Learn'])[1]";
   static String techinglearning = "(//*[text()='Teaching & Learning'])[2]";
   static String sevrcesss = "(//*[text()='Services'])[2]";
   static String industies = "(//*[text()='Industries'])[2]";
   static String aboutus = "(//*[text()='About Us'])[2]";
   static String examination = "(//*[text()='Examinations'])[1]";
   static String myrequest = "(//*[text()='My Requests'])[1]";
   static String applybtn = "(//*[text()='Apply'])[1]";
   static String examhistory = "(//*[text()='Exam History'])[1]";
   static String result = "(//*[text()='Result'])[1]";
   static String history = "(//*[text()='History'])[1]";
   static String completedenroll = "(//*[text()='Completed Enrollments'])[1]";
   static String openentroll = "(//*[text()='Open Enrollments'])[1]";
   static String clickview = "(//*[text()='View'])[1]";
   static String clickok = "(//*[text()=' Ok'])[1]";
   static String calender = "(//*[text()='Calendar'])[1]";
   static String moth = " (//*[text()='month'])[1]";
   static String week = "(//*[text()='week'])[1]";
   static String day = "(//*[text()='day'])[1]";
   static String event = "(//*[text()='Events'])[1]";
   static String feedback = "(//*[text()='Feedback'])[1]";
   static String programc = "(//*[text()='Program'])[1]";
   static String institude = "(//*[text()='Institute'])[1]";
   static String resoures = "(//*[text()='Resources'])[1]";

   // FACULTYSPJAIN
   static String mypath = "//*[text()='My Path']";
   static String Achivement = "//*[text()='Achievements']";
   static String sppersonaldetails = "//*[text()='Personal Details']";
   static String teach = "//span[text()='Teach']";
   static String Attendence = "//span[text()='Attendance']";
   static String markattendence = "//span[text()='Mark Attendance']";
   static String Attendencehistory = "//span[text()='Attendance History']";
   static String Examination = "//span[text()='Examinations']";
   static String examinationexam = "//button//span[text()='Examinations']";
   static String invigilation = "//button//span[text()='Invigilation/Proctoring']";
   static String Evaluation = "//button//span[text()='Evaluation']";
   static String qnbank = "//button//span[text()='Qn Bank']";
   static String spresult = "//span[text()='Result']";
   static String editmark = "//span[text()='Add/Edit Marks']";
   static String spstudents = "//span[text()='My Students']";
   static String Courses = "//*[text()='Courses']";
   // calende
   // event
   static String spfeedback = "(//span[. and text()='Feedback'])[1]";
   static String spprogram = "//*[. and text()='Program']";
   static String spinstute = "//*[. and text()='Institute']";
   static String spresources = "//*[. and text()='Resources']";
   static String documentflow = "//*[. and text()='Document FLow']";
   static String refrenceoutline = "//*[. and text()='Reference Outline']";
   static String refrencelist = "//*[. and text()='Reference List']";
   static String contactflow = "//*[. and text()='Contract FLow']";
   static String Accept = "//*[. and text()='Accept']";
   static String confirm = "//*[. and text()='Confirm']";
   static String reject = "//*[. and text()='Reject']";
   static String Submit = "//*[. and text()='Submit'] |//*[. and text()=' Submit']";
   static String sendapproval = "//*[. and text()='Send For Approval']";

}