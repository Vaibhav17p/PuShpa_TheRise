package poMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_forWiki {
	
	
	@FindBy (xpath="(//tbody//tr[14]//td)[1]")
	private WebElement countryOrigin ;
	
	@FindBy (xpath="//tbody//tr[12]//td//div//ul")
	private WebElement releaseDate ;
	
	public Pom_forWiki(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public String countryWiki()
	{
		String country=countryOrigin.getText();
		//System.out.println(country);
		return country;
	}
	public String releaseDateWiki()
	{
		String date=releaseDate.getText();
		//System.out.println("Country Origin for Wiki :- "+date);
		return date;
	}
	
	

}
