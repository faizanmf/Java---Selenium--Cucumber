package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	WebDriver driver;

	public HomePage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(linkText = "Log out")
	WebElement logout;

	public void Logout() {
		if (logout.isDisplayed()) {
			logout.click();
		} else {
			System.out.println("Logout button is not displayed");
		}
	}
}