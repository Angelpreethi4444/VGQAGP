package performance_Testfunction;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testbase_performance.Testbase_class;

public class Testfunction_class_performance extends Testbase_class 
{
	
@BeforeMethod	
	
public void launchBrowser() throws InterruptedException 
{
	openBrowser();
	LoginCredentials();
}

@Test

public void getPageTitle()
{
	System.out.println(driver.getTitle());
}

@Test

public void Open_Goalperiods_page() throws InterruptedException 
{
	open_goalPeriods();
	create_newGoalPeriod();
	
}
@Test	
public void disable_Goalperiod_method() throws InterruptedException
{
	open_goalPeriods();
	disable_goalPeriod();
}

@Test	
public void cadence() throws InterruptedException
{
	open_goalPeriods();
	get_Enabled_CadenceName();

}
@Test
public void discardChanges_method() throws InterruptedException {
	open_goalPeriods();
	close_DiscradChanges();
	
	
}


@Test
public void Focusarea_dashborad_method() throws InterruptedException {
	Thread.sleep(5000);
	FocusArea_method();
}

}
