package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 
{
   WebDriver driver;
	
   @FindBy(id="username")
   WebElement Username;
   
   @FindBy(name="password")
   WebElement Password;
   
   @FindBy(className="btn")
   WebElement loginbtn;
   
   @FindBy(xpath="//a[text()='Log out']")
   WebElement logout;
   
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public void enterPasswod(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickLoginbtn()
	{
		loginbtn.click();
	}
	
	
	public void clickLogoutBtn()
	{
		logout.click();
	}
}
