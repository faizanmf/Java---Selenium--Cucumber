package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	
	private By txt_username = By.name("username");
	private By txt_password = By.name("password");
	private By submitBtn = By.id("submit");
	private By logout = By.linkText("Log out");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		if(!driver.getTitle().equals("Test Login | Practice Test Automation"));
		{
			throw new IllegalStateException("this is not login page.The current page is " +driver.getCurrentUrl());
		}
	}
	public void EnterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void EnterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void ClickLogin()
	{
		driver.findElement(submitBtn).click();
	}
	public void Logout()
	{
		driver.findElement(logout).click();
	}
	
	//single function
	public void login(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(submitBtn).click();
	}
}
