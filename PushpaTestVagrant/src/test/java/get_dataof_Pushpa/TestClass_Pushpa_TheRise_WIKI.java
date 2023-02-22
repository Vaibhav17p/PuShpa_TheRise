package get_dataof_Pushpa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import poMClass.Pom_forWiki;

public class TestClass_Pushpa_TheRise_WIKI {
	WebDriver driver;
	Pom_forWiki wiki;
	
	@BeforeClass
	public void launch_Browser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
             
	}
	@BeforeMethod
	public void launchsites ()
	{   
		wiki=new Pom_forWiki(driver);
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	    
	}
	
	@Test
	public void getThedetails_WIKI()
	{
		String country=wiki.countryWiki();
		System.out.println("Origin of country WIKI:-"+country);
		
		String date=wiki.releaseDateWiki();
		System.out.println("Date of release for WIKI :- "+date);

		SoftAssert soft=new SoftAssert();
		boolean result=country.equals("India");
		
		soft.assertTrue(result);
		
		boolean result2=date.equals("17 December 2021");
		soft.assertTrue(result2);
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void clearObjects() {
		
		wiki=null;
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(5200);
		driver.close();
		driver= null;
		System.gc(); 
		
	}
	
	
	
	
	

}
