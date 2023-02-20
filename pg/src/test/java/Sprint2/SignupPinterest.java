package Sprint2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupPinterest {
	WebDriver  driver ;
		@Given("opens browser")
		public void opens_browser() {
		 System.setProperty("webdriver.chrome.driver","scr/test/resources/chromedriver.exe");  
		 driver =  new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	   
	      }
		
	@Given("Open URL")
	public void open_url() {
		driver.navigate().to ("https://www.pinterest.com/");
	}

	@When("Click signup button")
	public void click_signup_button() {
		WebElement Signup;
		Signup = driver.findElement(By.xpath ("//body/div[@data-reactcontainer='true']/div/div/div[@role='main']/div/div/div[@data-layout-shift-boundary-id='UnauthHomePageContainer']/div/div/div[@data-fp-styles='null']/div/div/div[@data-test-id='unauth-header']/div/div/div[@data-test-id='simple-signup-button']/button[@type='button']/div[1]"));
		Signup.click();
	}

	@When("Fill up Email")
	public void fill_up_email() {
		
		
		WebElement Email;
		Email = driver.findElement(By.xpath ("//input[@placeholder='E-mail']"));
		Email.sendKeys("Oussema@gmail.com");
	}

	@When("Fill up password")
	public void fill_up_password() {
		WebElement password;
		password = driver.findElement(By.xpath ("//input[@placeholder='Créer un mot de passe']"));
		password.sendKeys("Oussema@gmail.com");
	}

	@When("Choose age")
	public void choose_age() {
		WebElement age;
		age= driver.findElement(By.xpath ("//input[@placeholder='Créer un mot de passe']"));
		age.sendKeys("38");
	}

	@When("Click continue button")
	public void click_continue_button() {
		WebElement button;
		button= driver.findElement(By.xpath ("//div[contains(text(),'Continuer')]"));
		button.click();
	}

	@When("Choose genre")
	public void choose_genre() {
		WebElement NEXT;
		NEXT= driver.findElement(By.xpath ("//body/div/div/div/div[@aria-label='nux']/div/div/div/div/div/div/div[@data-test-id='nux_name_done_btn']/button[@aria-label='Suivant']/div[1]"));
		NEXT.click();
		
		WebElement genre;
		genre= driver.findElement(By.xpath ("//input[@value='male']"));
		genre.click();
	}

	@When("Click Next button")
	public void click_next_button() {
	
	}

	@When("Choose language")
	public void choose_language() {
		WebElement Language = driver.findElement(By.xpath("//div[@data-test-id='nux-locale-select']//div//div//select[@aria-invalid='false']"));
		// appel class select
		Select selecte = new Select(Language);
		selecte.selectByVisibleText("Français");
	}

	@When("Choose contury")
	public void choose_contury() {
		WebElement contury = driver.findElement(By.xpath("//div[@data-test-id='nux-locale-select']//div//div//select[@aria-invalid='false']"));
		// appel class select
		Select selected = new Select(contury);
		selected.selectByVisibleText("Tunisie");  
		WebElement NEXT1;
	    NEXT1= driver.findElement(By.xpath ("//button[@type='submit']"));
	    NEXT1.click();
	}
	@When("Choose intersts")
	public void choose_intersts() {
		
		WebElement intert1;
		intert1= driver.findElement(By.xpath ("//div[@aria-label='Art, liste 2 sur 110']//div//div//div"));
		intert1.click();
		WebElement intert2;
		intert2= driver.findElement(By.xpath ("//div[@aria-label='Football, liste 1 sur 110']//div//div//div"));
		intert2.click();
		WebElement intert3;
		intert3= driver.findElement(By.xpath ("//div[@aria-label='Aménagement intérieur, liste 4 sur 110']//div//div//div"));
		intert3.click();
		WebElement intert4;
		intert4= driver.findElement(By.xpath ("//div[@aria-label='Naruto, liste 5 sur 110']//div//div//div"));
		intert4.click();
		WebElement intert5;
		intert5= driver.findElement(By.xpath ("//body/div/div/div/div[@aria-label='nux']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@data-test-id='nux-picker-topic']/div[@aria-label='Photographie de paysage, liste 3 sur 110']/div[1]/div[1]"));
		intert5.click();
		WebElement NEXT2;
	    NEXT2= driver.findElement(By.xpath ("//button[@type='submit']"));
	    NEXT2.click();
	  
	    WebElement NEXT3;
	    NEXT3= driver.findElement(By.xpath ("//button[@type='submit']"));
	    NEXT3.click();
	    
	}

	@Then("I validate the the user name")
	public void i_validate_the_the_user_name() {
		WebElement Resulat; 
		Resulat= driver.findElement(By.xpath ("//body/div[@data-reactcontainer='true']/div/div[@role='banner']/div[@data-test-id='header']/div[@data-test-id='header-Header']/div[@data-test-id='header-background']/div/div/div/div/div[@data-test-id='button-container']/div[@data-test-id='HeaderAccountsOptionsFlyout']/div/div/div[@aria-label='Popover']/div/div[@aria-label='Actuellement connecté']/div[@role='menuitem']/div[1]"));
	    Assert.assertTrue(Resulat.getText().contains("Oussema@gmail.com"),"Test ok");
	}


}
