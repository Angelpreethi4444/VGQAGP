package Performance_pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class creating_new_focusarea {

          
	public WebDriver driver;
	
		public creating_new_focusarea(WebDriver newdriver)
		{
			driver=newdriver;
			PageFactory.initElements(newdriver,this);
		}
		
	@FindBy(how = How.XPATH, using="//h1[@data-id='peopleGoalCreationTitle']")
	@CacheLookup
	WebElement new_focusarea;
 
	@FindBy(how = How.XPATH, using="(//button[@data-id='driverButton'])[6]")
	@CacheLookup
	WebElement choose_button;

	@FindBy(how = How.XPATH, using="//textarea[@data-id='goalTitle']")
	@CacheLookup
	WebElement goalTitle;

	@FindBy(how = How.XPATH, using="//glint-time-period-selector[@id='goalEditorPeriodSelector']")
	@CacheLookup
	WebElement goalperiod_dropdown;

	@FindBy(how = How.XPATH, using="//li[@data-index='15']")
	@CacheLookup
	WebElement goalperiod;
	
	@FindBy(how = How.XPATH, using="(//button[@class='btnCta glintButton'])[2]")
	@CacheLookup
	WebElement done_button;
	
//@FindBy(how = How.XPATH, using="//button[@data-id='saveGoal']")
	@FindBy(how = How.XPATH, using="//button[text()=' Create Focus Area ']")
	@CacheLookup
	WebElement create_Focusarea_button;
	
	
	public void get_newfocusarea_text()
	{
		System.out.println(new_focusarea.getText());
		
	}
		
	public void click_choosebutton() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
	    Thread.sleep(5000);
	    choose_button.click();
	}	
		
	public void Enter_goaltitle(String goalname) throws InterruptedException
	{
		goalTitle.clear();
		Thread.sleep(3000);
		goalTitle.sendKeys(goalname);
		
	}		
	
 public void click_period_Dropdown() {
	 goalperiod_dropdown.click();
 }
 
 public void select_goalperiod() {
	 goalperiod.click();
 }
 
 public void Click_doneButton() {
	 done_button.click();
 }
 
 public void Click_creategoal_Button() throws InterruptedException {
	 
	 Thread.sleep(5000);
	 create_Focusarea_button.click();
	 
	 
 }


}
