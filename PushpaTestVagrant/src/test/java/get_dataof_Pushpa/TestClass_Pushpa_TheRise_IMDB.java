package get_dataof_Pushpa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import poMClass.Pom_for_IMDB;

public class TestClass_Pushpa_TheRise_IMDB {
	
	WebDriver driver;
	Pom_for_IMDB imdb;
	
	@BeforeClass
	public void launch_Browser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
             
	}
	@BeforeMethod
	public void launchsites ()
	{   
		imdb=new Pom_for_IMDB(driver);
		driver.get("https://www.imdb.com/title/tt9389998/");
	    
	}
	
	@Test
	public void getThedetails_IMDB()
	{
		String country=imdb.countryIMDB();
		System.out.println("Country Origin for IMDB :- "+country);
		
		String date=imdb.releaseDateIMDB();
		System.out.println("Date of release for IMDB :- "+date);

		SoftAssert soft=new SoftAssert();
		boolean result=country.equals("India");
		
		soft.assertTrue(result);
		
		boolean result2=date.equals("December 17, 2021 (United States)");
		soft.assertTrue(result2);
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void clearObjects() {
		
		imdb=null;
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
