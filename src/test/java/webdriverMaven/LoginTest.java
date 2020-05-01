package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\GitWebDriverMaven\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test
	public void doLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("seleniumpupil@gmail.com");
		driver.findElement(By.xpath("//span[contains(@class,'RveJvd snByac')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,30); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dssdff");
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();
		// added new comments
		
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
