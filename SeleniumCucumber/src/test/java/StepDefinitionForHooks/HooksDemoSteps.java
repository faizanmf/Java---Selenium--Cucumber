package StepDefinitionForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	WebDriver driver;

	@Before(value="@smoke", order=0)
	public void setup()
	{
		System.out.println("i am inside browser setup");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resource/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@Before(order=0)
	public void setup2()
	{
		System.out.println("i am inside browser setup2");
	}
	
	@After(order=1)
	public void teardown()
	{
		System.out.println("i am inside browser teardown");
		driver.close();
		driver.quit();
	}
	
	@After(order=0)
	public void teardown2()
	{
		System.out.println("i am inside browser teardown2");
	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("i am inside beforestep");
	}
	
	@AfterStep
	public void afterstep() {
		System.out.println("i am inside afterstep");
	}
	
	@Given("user on login page")
	public void browser_opens() {

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {

	}

	@When("click on login button")
	public void click_on_login_button() {

	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {

	}


}
