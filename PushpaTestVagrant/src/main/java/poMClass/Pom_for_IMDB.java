package poMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_for_IMDB {
	
	@FindBy (xpath="//div//section//div[1]//section[10]//div[2]//ul//li[2]//div//ul//li//a")
	private WebElement countryOrigin ;
	
	@FindBy (xpath="(//div//section//div[1]//section[10]//div[2]//ul//div[1])[1]")
	private WebElement releaseDate ;
	
	public Pom_for_IMDB(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public String countryIMDB()
	{
		String country=countryOrigin.getText();
		return country;
	}
	public String releaseDateIMDB()
	{
		String date=releaseDate.getText();
		return date;
	}
	

}
