package Step_Defi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StarWars_StepDefination {
	WebDriver driver;
		
	//List of all the Star Wars characters:
	
		@Given("^User should launch swapi\\.dev$")
		public void user_should_launch_swapi_dev() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
		    
		}

		@When("^enter valid service URL for all characters$")
		public void enter_valid_service_URL_for_all_characters() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("people/");
		    
		}

		@Then("^click on the request button$")
		public void click_on_the_request_button1() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		}

		@Then("^check final result$")
		public void check_final_result() throws Throwable {
			boolean all_valid_char_result = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(all_valid_char_result);
		}
	
	//Invalid scenario for Star Wars Character

		@Given("^User must open swapi\\.dev$")
		public void user_must_open_swapi_dev() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
		}

		@When("^User enters invalid data in starwars characters$")
		public void user_enters_invalid_data_in_starwars_characters() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("people190/");
		}

		@Then("^clicks on request button$")
		public void clicks_on_request_button() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click(); 
		}

		@Then("^will check the displayed result$")
		public void will_check_the_displayed_result() throws Throwable {
			boolean allchar_invaliddataresult = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(allchar_invaliddataresult);
		}

	//The details of a specified Star Wars Character
		
		@Given("^User must be on swapi\\.dev$")
		public void user_must_be_on_swapi_dev() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
			}		

		@When("^enter valid service_URL for starwars specific character$")
		public void enter_valid_service_URL_for_starwars_specific_character() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("people/3/");
		}

		@Then("^clicks on the request box$")
		public void clicks_on_the_request_box() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		}

		@Then("^Confirm the result$")
		public void confirm_the_result() throws Throwable {
			boolean specificCharacterValidResult = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(specificCharacterValidResult);
		}
		
	//Invalid scenario for Star Wars Character
		
		@Given("^User should launch the website$")
		public void user_should_launch_the_website() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
		}

		@When("^enter invalid service URL for specific character$")
		public void enter_invalid_service_URL_for_specific_character() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("people/204/");		
		}

		@Then("^Click on the request button$")
		public void click_on_the_request_button() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		}

		@Then("^Confirm if the end result displayed$")
		public void confirm_if_the_end_result_displayed() throws Throwable {
			boolean resultofInvalidserviceURL = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(resultofInvalidserviceURL);
		}
		
	//The details of a planet

		@Given("^User should open firefox and type swapi URL$")
		public void user_should_open_chrome_and_type_swapi_URL() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
		}

		@When("^Enter valid planets/characters valid service URL$")
		public void enter_valid_planets_characters_valid_service_URL() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("planets/4/");
		}

		@Then("^Clicks on the request button$")
		public void clicks_on_the_request_button() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		}

		@Then("^Check the results$")
		public void check_the_results() throws Throwable {
			boolean validSearchDataResult = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(validSearchDataResult);
		}

	//Invalid scenario for planets
		
		@Given("^User must be on homepage of swapi\\.dev$")
		public void user_must_be_on_homepage_of_swapi_dev() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
		}

		@When("^enter invalid service URL to search planets/characters$")
		public void enter_invalid_service_URL_to_search_planets_characters() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("planets/202/");

		}

		@Then("^User clicks on request$")
		public void user_clicks_on_request() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		}

		@Then("^checks if the final result is available$")
		public void checks_if_the_final_result_is_available() throws Throwable {
			boolean resultofInvalidSearch = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(resultofInvalidSearch);
		}

	//Blank URL
		
		@Given("^User should be on homepage of swapi\\.dev$")
		public void user_should_be_on_homepage_of_swapi_dev() throws Throwable {
			System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Cucumber/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://swapi.dev/");
		}

		@When("^keep service URL field blank$")
		public void keep_service_URL_field_blank() throws Throwable {
			driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("");
		}

		@Then("^click on the request$")
		public void click_on_the_request() throws Throwable {
			driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		}

		@Then("^check if the result is displayed$")
		public void check_if_the_result_is_displayed() throws Throwable {
			boolean resultofblankserviceURL = driver.findElement(By.id("interactive_output")).isDisplayed();
			Assert.assertTrue(resultofblankserviceURL);
		}

	@After
	public void tearDown() {
		driver.quit();
	}


}