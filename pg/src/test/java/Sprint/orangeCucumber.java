package Sprint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class orangeCucumber {
	WebDriver driver;

	@Given("ouvrir l URL de l application")
	public void ouvrir_l_URL_de_l_application() {
		System.setProperty("webdriver.chrome.driver", "scr/test/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Implicity wait (for whole project)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@When("saisir le login")
	public void saisir_le_login() {
		WebElement username;
		username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
	}
	@And("saisir le PW")
	public void saisir_le_PW() {

		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

	}

	@And("cliquer sur le bouton se connecter")
	public void cliquer_sur_le_bouton_se_connecter() {

		WebElement bouton;
		bouton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();

	}

	@Then("ouverture de la page accueil")
	public void ouverture_de_la_page_accueil() {

		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String message;
		message = profil.getText();
		System.out.println(message);
		Assert.assertEquals("Paul Collings", message);

	}

}
