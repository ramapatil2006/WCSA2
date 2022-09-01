package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://dell/login.do");
	}



	@Test
	public void ActitimeTest() throws InterruptedException
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		//softAssert
		softassert.assertEquals(loginPageTitle, "actiTIME - Login");

		Reporter.log("login page title is verified",true);

		//hard assert
		boolean statusOfusernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox, true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		//---------------------------------------------------------
		//hard assert
		boolean statusOfpaswordtextBox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusOfpaswordtextBox, true);
		Reporter.log("pasword text box is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//----------------------------------------------------------
		//hard assert
		boolean statusOfLoginButton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusOfLoginButton, true);
		Reporter.log("login button  is displayed",true);
		driver.findElement(By.id("loginButton")).click();
		//--------------------------------------------------------

		Thread.sleep(5000);
		String homePageTitle = driver.getTitle();
		softassert.assertEquals(homePageTitle, "actiTIME - Enter Time-Track");

		Reporter.log("Home page title is verified",true);
		
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		softassert.assertAll();

	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}