package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class Login 
{
	WebDriver driver;
	LoginPage login;
	
	@Before
	public void launchBrowser()
	{
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() 
	{
	    
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user is enters the (.*) and(.*)$")
	public void user_is_enters_the_username_and_password(String username,String password) throws InterruptedException
	{
		System.out.println(username+" "+password);
		
	    login=new LoginPage(driver);
	    login.enterUsername(username.trim());
	    login.enterPasswod(password.trim());
	    Thread.sleep(5000);
	    
	    
	}

	@And("click on the login button")
	public void click_on_the_login_button() throws InterruptedException 
	{
	 
		login.clickLoginbtn();
		Thread.sleep(10000);
	  
	}

	@Then("the user should navigates to home page")
	public void the_user_should_navigates_to_home_page() 
	{
	  
		
		
		if(driver.getPageSource().contains(" practicetestautomation.com/logged-in-successfully/"))
		{
			System.out.println("User logged successfully and navigated to home page");
		}
		else
		{
			System.out.println("User failed to login");
		}
	   
	}

	@And("click on the logout button")
	public void click_on_the_logout_button()
	{
	  
		login.clickLogoutBtn();
	   
	}

	
	
	

}