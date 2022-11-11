package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_diffCred 
{
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username_txt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password_txt;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_btn;
	
	
	WebDriver driver=null; 
	public PF_diffCred(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
