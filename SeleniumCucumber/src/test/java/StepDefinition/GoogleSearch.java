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

public class GoogleSearch {
	private	WebDriver driver;
	
//	@Given("open browser")
//	public void open_browser() {
//	String path = 	System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path+"/src/test/resource/Drivers/chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//	    //driver.manage().window().maximize();
//	}
//
//	@And("click on search page")
//	public void click_on_search_page() {
//	    driver.navigate().to("https://www.google.co.in/");
//	    
//	}
//
//	@When("user enters text")
//	public void user_enters_text() {
//	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	}
//
//	@And("click on enter")
//	public void click_on_enter() {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigate to result")
//	public void user_is_navigate_to_result() throws InterruptedException {
//	   String title= driver.getTitle();
//	    System.out.println(title);
//	    driver.getPageSource().contains("Free Online Tutorials");
//	    driver.close();
//	    Thread.sleep(2000);
//	    driver.quit();
//	}
}
