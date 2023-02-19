package Sprint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Auth {
	WebDriver  driver ;
		@Given("open browser")
		public void open_browser() {
		 System.setProperty("webdriver.chrome.driver","scr/test/resources/chromedriver.exe");  
		 driver =  new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	   
	      }
		@When("open URL")
		public void open_url() {
			driver.navigate().to ("https://www.facebook.com/");
		}

		@When("Click in sign up")
		public void click_in_sign_up() {
			WebElement Signup;
			Signup = driver.findElement(By.xpath ("//a[normalize-space()='Créer nouveau compte']"));
			Signup.click();
		}

		@When("Write name")
		public void write_name() {
			WebElement Name;
			Name = driver.findElement(By.xpath ("//input[@aria-label='Prénom']"));
			Name.sendKeys("Oussema");
		}

		@Then("write Last name")
		public void write_last_name() {
			WebElement LastName;
			LastName = driver.findElement(By.xpath ("//input[@aria-label='Nom de famille']"));
			LastName.sendKeys("ABIDI");
		}

		@Then("write Email")
		public void write_email() {
			WebElement Email;
			Email = driver.findElement(By.xpath ("//input[@aria-label='Numéro de mobile ou e-mail']"));
			Email.sendKeys("@gmail");
		}

		@Then("confirm Email")
		public void confirm_email() {
			WebElement Email;
			Email = driver.findElement(By.xpath ("//input[@aria-label='Numéro de mobile ou e-mail']"));
			Email.sendKeys("@gmail");
		}

		@Then("write birth date")
		public void write_birth_date() {
			WebElement listday = driver.findElement(By.xpath("//select[@title='Jour']"));
			// appel class select
		Select select = new Select(listday);
		select.selectByValue("31");
		WebElement listMonth = driver.findElement(By.xpath("//select[@title='Mois']"));
		// appel class select
		Select selected = new Select(listMonth);
		selected.selectByVisibleText("juil");

		WebElement listYear = driver.findElement(By.xpath("//select[@title='Année']"));
		// appel class select
		Select selecte = new Select(listYear);
		selecte.selectByValue("1994");
		}

		@Then("choose genre")
		public void choose_genre() {
		
		}


		
	}


