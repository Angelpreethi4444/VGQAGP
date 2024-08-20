package Performance_pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class Periodsdetails_pageobject 
{
	
	public WebDriver driver;
	
	
	
	public  Periodsdetails_pageobject(WebDriver newdriver) 
	{
		driver=newdriver;
		PageFactory.initElements(newdriver,this);
	}

//goal periods page locators
	
	@FindBy(how = How.XPATH, using="//div[@class='actions']")
	@CacheLookup
	WebElement newperiod;
	
	
	@FindBy(how = How.XPATH, using="//div[@class='slideyHeader']")
	@CacheLookup
	WebElement createperiod_text;
	
	@FindBy(how = How.XPATH, using="(//div[@class='menuContainer'])[4]")
	@CacheLookup
	WebElement period_dropdown;
	
	@FindBy(how = How.XPATH, using="//li[@id='option1']")
	@CacheLookup
	WebElement Monthly_goalPeriod;
	
	@FindBy(how = How.ID, using="periodName")
	@CacheLookup
	WebElement goalPeriod_Name;
	
	@FindBy(how = How.XPATH, using="(//div[@class='datePicker'])[2]")
	@CacheLookup
	WebElement calendar;
	
	@FindBy(how = How.XPATH, using="//button[@data-id='datePickerNavFwd_endsOn']")
	@CacheLookup
	WebElement date_picker;
	
	@FindBy(how = How.XPATH, using="//button[@aria-label='Friday, November 1, 2024']")
	@CacheLookup
	WebElement selectdate;
	
	@FindBy(how = How.XPATH, using="(//dd[@class='ng-star-inserted'])[5]")
	@CacheLookup
	WebElement dayscount;
	
	public WebElement toggle(){
        WebElement togbutton = driver.findElement(By.xpath("//div[@class='toggle rightLabelAlign']"));
         return togbutton;
    }
	
//	@FindBy(how = How.XPATH, using="//div[@class='toggle rightLabelAlign']")
//	@CacheLookup
//	WebElement togglebutton;
	
	@FindBy(how = How.XPATH, using="//div[@class='slideyHeaderTools']")
	//@FindBy(how = How.XPATH, using="//button[text()=' Save Changes ']")
	@CacheLookup
	WebElement savechanges_button;
	
	
	@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted'])[18]")
	@CacheLookup
	WebElement saved_goalPeriod;
	
	@FindBy(how = How.XPATH, using="//li[@data-id='cadences']")
	@CacheLookup
	WebElement cadence_button;
	
	@FindBy(how = How.XPATH, using="(//label[@class='switch on'])[4]")                            //span[@class='switchLabel ng-star-inserted'])[5]")
	@CacheLookup
	WebElement cadence_semiAnnual;
	
	@FindBy(how = How.XPATH, using="//li[@role='menuitemradio']")
	@CacheLookup
	List<WebElement> cadence_printText;
	
	@FindBy(how = How.XPATH, using="//button[@data-id='slideyClose_periodEditor']")
	@CacheLookup
	WebElement close_icon;
	
	
	@FindBy(how = How.XPATH, using="//button[text()='Discard Changes']")  //button[@class='glintButton btnAlert']
	//@FindBy(how = How.XPATH, using="//i[@class='close glintIcon']")
	@CacheLookup
	WebElement DiscardChanges;
	
@FindBy(how = How.XPATH,using="(//li[@class='ng-star-inserted'])[2]")
@CacheLookup
WebElement FocusArea;
	
@FindBy(how = How.XPATH,using="(//div[@class='menuContainer'])[3]")
@CacheLookup
WebElement CurrentPeriod;	

@FindBy(how = How.XPATH,using="//li[@aria-label='pre 70 PERFORMANCE GOAL']")
@CacheLookup
WebElement goalperiod_option;		
	
@FindBy(how = How.XPATH,using="//button[@class='btnCta glintButton ng-star-inserted']")
@CacheLookup
WebElement choose_Focusarea;	
		
	                                                   // method 
	
	public void click_newperiod() 
	{
		newperiod.click();
	}
	
	public void click_createperiod() throws InterruptedException 
	{
		
       //Assert.assertEquals("createperiod.getText()","create period");
		System.out.println(createperiod_text.getText());
	}
	
	public void click_period_dropdown() 
	{
		period_dropdown.click();
	}
	public void click_monthlyPeriod() 
	{
	   Monthly_goalPeriod.click();
	}
	
	public void Enter_Periodname(String nametext) 
	{
		goalPeriod_Name.sendKeys(nametext);
	}
	
	public void click_calendar() throws InterruptedException 
	{
	   
//	    JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("window.scrollBy(0,1000)", "");
//		
//		Thread.sleep(3000);
		
		 calendar.click();
	}
	public  void click_datepicker() 
	{
		
	   date_picker.click();
		
	}
	
	public  void click_selectdate() 
	{
		
	   selectdate.click();
		
	}
	
	public  void get_dayscount() 
	{
		
	   System.out.println(dayscount.getText());
		
	}
	
	
	
	public void click_togglebutton()
	{
        toggle().click();
    }
//	public  void click_togglebutton() 
//	{
//		
//		togglebutton.click();
		
//}
	
	public  void click_savechangesButton() 
	{
		
		savechanges_button.click();
		
	}
	
	public  void click_saved_goalPeriod() 
	{
		
		saved_goalPeriod.click();
		
	}
	
	public  void click_cadencebutton() {
		
		cadence_button.click();
		}
	public  void click_cadenceSemiAnnual() {
		
		cadence_semiAnnual.click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,-750)", "");
		}
   public  void get_cadenceText() 
   {
	   
	   for(WebElement x:cadence_printText)
		
	   System.out.println(x.getText());
   }
   public  void click_closeIcon() {
		
		close_icon.click();
		}
  public  void click_Discardchanges() {
		
	  DiscardChanges.click();
		}
  
 //FOCUS AREA METHOD
  
  public void click_focusArea() {
	  FocusArea.click();
  }
  public void click_currentPeriod() {
	  CurrentPeriod.click();
  }
  public void select_goalperiod() {
	  System.out.println(goalperiod_option.getText());
	  goalperiod_option.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	  }
  
  public void click_chooseFocusarea() {
	  choose_Focusarea.click();
  }
}
