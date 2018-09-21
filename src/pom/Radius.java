package pom;

import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class Radius {
	public WebDriver driver;
		
	public Radius(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyPageTitle(String ePageTitle)
	{
		String aPageTitle=driver.getTitle();
		Assert.assertEquals(aPageTitle, ePageTitle);
		System.out.println(ePageTitle);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}
	
}
