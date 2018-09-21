package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginScreen {
	@FindBy(xpath = "//small[contains(.,'Email is required.')]")
	private WebElement emailErr;
	
	@FindBy(xpath = "//small[contains(.,'Password is required.')]")
	private WebElement pwdErr;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement unTextBox;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwTextBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@id='__next']/div[2]/span/div")
	private WebElement errMsg;
	
	public LoginScreen(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	 
	public void login(String un, String pw)
	{
		System.out.println("Loginclicked");
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		loginButton.click();
	}
	

	public void verifyBlankMsg()
	{
		loginButton.click();
		Assert.assertTrue(emailErr.isDisplayed());
		Assert.assertTrue(pwdErr.isDisplayed());
	}
	
	public void verifyErrMsg()
	{
		Assert.assertTrue(errMsg.isDisplayed());
	}
}
