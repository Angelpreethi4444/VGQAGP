package Performance_pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class discard_page {
	
	
	public WebDriver driver;

	public discard_page(WebDriver newdriver)
	{
	  driver=newdriver;
	  PageFactory.initElements(driver,this);
	}
	
	
	
@FindBy(how = How.XPATH, using="//button[@class='glintButton btnAlert']")
@CacheLookup
WebElement discard_changes_button;



public void click_dischardChanges() {
	discard_changes_button.click();
}
}
