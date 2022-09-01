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

public class OrangeHrmAssert {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}



	@Test
	public void OrangeHrmTest() throws InterruptedException
	{
		Thread.sleep(5000);
		String loginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		//softAssert
		softassert.assertEquals(loginPageTitle, "OrangeHRM");

		Reporter.log("login page title is verified",true);

		//hard assert
		boolean statusOfusernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox, true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//---------------------------------------------------------
		//hard assert
		boolean statusOfpaswordtextBox = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		Assert.assertEquals(statusOfpaswordtextBox, true);
		Reporter.log("pasword text box is displayed",true);
		driver.findElement(By.name("password")).sendKeys("admin123");
		//----------------------------------------------------------
		//hard assert
		boolean statusOfLoginButton = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		Assert.assertEquals(statusOfLoginButton, true);
		Reporter.log("login button  is displayed",true);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//softAssert
		String homePageTitle = driver.getTitle();
		softassert.assertEquals(homePageTitle, "OrangeHRM");
		Reporter.log("home page title is verified",true);	
		Thread.sleep(3000);
		softassert.assertAll();

	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}