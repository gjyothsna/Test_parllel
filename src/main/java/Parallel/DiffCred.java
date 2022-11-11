package Parallel;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DiffCred
{
	WebDriver driver=null;
	PF_diffCred pfd=null;
	Properties p=null;
	File file=null;
	FileInputStream fis=null;
	@Test(priority=1)
	public void login() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		file=new File("E:\\Selenium\\Parallel\\Config\\Data.properties");
		fis=new FileInputStream(file);
		pfd=new PF_diffCred(driver);
		p=new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		pfd.username_txt.sendKeys(p.getProperty("username"));
		pfd.password_txt.sendKeys(p.getProperty("password"));
		pfd.submit_btn.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void jrLogin() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		file=new File("E:\\Selenium\\Parallel\\Config\\Data.properties");
		fis=new FileInputStream(file);
		pfd=new PF_diffCred(driver);
		p=new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		pfd.username_txt.sendKeys(p.getProperty("jrusername"));
		String value = pfd.username_txt.getAttribute("value");
		System.out.println(value);
		pfd.password_txt.sendKeys(p.getProperty("password"));
		pfd.submit_btn.click();
		Thread.sleep(2000);
	}

}
