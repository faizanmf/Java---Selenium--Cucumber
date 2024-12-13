package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo {
	private	WebDriver driver;


//	@Given("browser opens")
//	public void browser_opens() {
//		String path = 	System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path+"/src/test/resource/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		//driver.manage().window().maximize();
//	}
//
//	@And("user on login page")
//	public void user_on_login_page() {
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@And("click on login")
//	public void click_on_login() {
//		driver.findElement(By.id("submit")).click();
//	}
//
//	@Then("user is navigate to homepage")
//	public void user_is_navigate_to_homepage() throws InterruptedException {
//		String title= driver.getTitle();
//		System.out.println(title);
//
//		boolean vrypage = driver.findElement(By.linkText("Log out")).isDisplayed();
//		System.out.println(vrypage);
//
//		driver.getPageSource().contains("Logged In Successfully");
//		driver.close();
//		Thread.sleep(2000);
//		driver.quit();
//	}
}

