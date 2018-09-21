package scripts;

import org.testng.annotations.Test;

import pom.LoginScreen;
import pom.Radius;


@Test
public class LoginCases extends BaseTest {
	
	LoginScreen loginsreen;
	String title = "Radius - Join the Fastest Growing Real Estate Network";
	
	public void testInvalidLogin()
	{
		
	 loginsreen=new LoginScreen(driver);
	 loginsreen.verifyBlankMsg();
	// Enter Invalid un, pw & click login
		
		loginsreen.login("mkz@gmail.com", "xyz");
		
	//Verify err msg
		loginsreen.verifyErrMsg();
		
	}

	public void testValidLogin() {
		System.out.println("testValidLogin");
	//	Enter valid un.pw & click login
		 loginsreen=new LoginScreen(driver);
		loginsreen.login("ashwinnaik@gmail.com", "ashwinnaik");
		
		Radius rad=new Radius(driver);
	   rad.verifyPageTitle(title);
	}
}
