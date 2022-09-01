package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidActiTimeLogin {
	WebDriver driver;
  @Test
  @Parameters({"browse","url","username","pass"})
  public void validActiTimeLogin(String browservalue,String url, String username, String pass) throws InterruptedException 
  {
	  if(browservalue.equalsIgnoreCase("chrome"))
	  {
		  	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			driver.close();
	  }
	  else if(browservalue.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			driver.close();
	  }
  }


}
