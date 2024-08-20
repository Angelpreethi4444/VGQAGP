package Performance_pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Goalperiods_pageobject {
	
	public WebDriver driver;
	
	public Goalperiods_pageobject(WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements(newdriver,this);
	}

	
@FindBy(how = How.XPATH, using="//li[@class='configure mobileLink ng-star-inserted']")	
@CacheLookup
WebElement configure;

@FindBy(how = How.XPATH, using="//p[text()='Create and edit periods for your organization']")
//"(//div[@class='circle ng-star-inserted'])[10]")             //"//p[text()='Create and edit periods for your organization']"

@CacheLookup
WebElement periods;

public void click_configure() 
{
	configure.click();
}

public void click_periods() throws InterruptedException 
{
	
//	WebElement element = periods;
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,750)", "");
	
	Thread.sleep(5000);
	periods.click();
	
	
	
}






}
