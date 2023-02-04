package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps extends googleBase {
	
	//WebDriver driver;
	
	@Given("I am on the goole homepage")
	public void i_am_on_the_goole_homepage() {
		
	launchBrowser();
	
	/* WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize(); */
	
	}

	@When("I enter search {string}")
	public void i_enter_search(String searchData) {
		
		WebElement searchBox;
		
		searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys(searchData);
		
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		WebElement searchBtn;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		searchBtn = driver.findElement(By.name("btnK"));
		
		searchBtn.click();
	   
	}

	@Then("I receive related search results")
	public void i_receive_related_search_results() {
		
		WebElement resultStats;
		
		resultStats = driver.findElement(By.id("result-stats"));
		
		String results = resultStats.getText();
		
		System.out.println("");
		System.out.println(results);
		System.out.println("");
		
		
		closeBrowser();
		
		//driver.close();
	}

}
