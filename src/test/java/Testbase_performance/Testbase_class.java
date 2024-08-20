package Testbase_performance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Performance_pageobject.Goalperiods_pageobject;
import Performance_pageobject.Login_pageobject_performance;
import Performance_pageobject.Periodsdetails_pageobject;
import Performance_pageobject.creating_new_focusarea;
import Performance_pageobject.discard_page;

public class Testbase_class {
	
	public WebDriver driver;
	
	public Login_pageobject_performance logpage;
	
	public Goalperiods_pageobject periodpage;
	
	public Periodsdetails_pageobject perioddetailpage;
	
	public discard_page dp;
	
	public creating_new_focusarea newgoal;

public void openBrowser() {
	driver= new ChromeDriver();
	logpage= new Login_pageobject_performance(driver);
	
	periodpage=new Goalperiods_pageobject(driver);
	
	perioddetailpage = new Periodsdetails_pageobject(driver);
	
	dp= new discard_page(driver);
	
	newgoal= new creating_new_focusarea(driver);
	
    driver.manage().window().maximize();
	
	driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
	
}

public void LoginCredentials() throws InterruptedException {
	
	Thread.sleep(5000);
	
	
	logpage.enter_mailid("qatester@glintinc.com");
  
	
	logpage.setContinuebutton();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	logpage.enter_clientid("qa20230202_1");
	
	
	logpage.setContinuebutton();
	
	
	
	logpage.enter_password("Dem0@pass2");
	
	logpage.setContinuebutton();
	}

public void open_goalPeriods() throws InterruptedException 
{
	periodpage.click_configure();
	periodpage.click_periods();
	
}

public void create_newGoalPeriod() throws InterruptedException {
	perioddetailpage.click_newperiod();
	Thread.sleep(5000);
	perioddetailpage.click_createperiod();
	perioddetailpage.click_period_dropdown();
	perioddetailpage.click_monthlyPeriod();
	Thread.sleep(5000);
	perioddetailpage.Enter_Periodname("R75 PERFORMANCE GOAL");
	perioddetailpage.click_calendar();
	perioddetailpage.click_datepicker();
	perioddetailpage.click_datepicker();
	perioddetailpage.click_datepicker();
	perioddetailpage.click_selectdate();
	perioddetailpage.get_dayscount();
	perioddetailpage.click_togglebutton();
	Thread.sleep(5000);
	perioddetailpage.click_togglebutton();
	//Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	perioddetailpage.click_savechangesButton();
	
}

public void disable_goalPeriod() 
{
	
	perioddetailpage.click_saved_goalPeriod();
	perioddetailpage.click_togglebutton();
	perioddetailpage.click_savechangesButton();
}

public void get_Enabled_CadenceName() throws InterruptedException {
	perioddetailpage.click_cadencebutton();
	perioddetailpage.click_cadenceSemiAnnual();
	perioddetailpage.click_newperiod();
	perioddetailpage.click_period_dropdown();
	Thread.sleep(5000);
	perioddetailpage.get_cadenceText();
	
}

public void close_DiscradChanges() throws InterruptedException
{
	perioddetailpage.click_newperiod();
	perioddetailpage.click_period_dropdown();
	perioddetailpage.click_monthlyPeriod();
	perioddetailpage.click_closeIcon();
	Thread.sleep(5000);
    dp.click_dischardChanges();
}


public void FocusArea_method() throws InterruptedException {
	perioddetailpage.click_focusArea();
	perioddetailpage.click_currentPeriod();
	Thread.sleep(3000);
	perioddetailpage.select_goalperiod();
	Thread.sleep(3000);
	perioddetailpage.click_chooseFocusarea();
	Thread.sleep(3000);
	newgoal.get_newfocusarea_text();
	newgoal.click_choosebutton();
	newgoal.Enter_goaltitle("sample AUTOMATION");
	Thread.sleep(3000);
	newgoal.click_period_Dropdown();
	newgoal.select_goalperiod();
	newgoal.Click_doneButton();
	newgoal.click_choosebutton();
}











}
