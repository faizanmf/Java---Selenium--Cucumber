package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF 
{
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(name =  "username")
	WebElement txt_username;

	@FindBy(name =  "password")
	WebElement txt_password;

	@FindBy(id = "submit")
	WebElement submitBtn;

	

	public void EnterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void EnterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void ClickLogin()
	{
		submitBtn.click();
	}


}
