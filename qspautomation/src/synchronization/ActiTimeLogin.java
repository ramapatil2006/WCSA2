package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogin {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dell/login.do");
	String logintitle = driver.getTitle();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[.='Login']")).click();
	//String hometitle = driver.getTitle();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	
	
	if(logintitle.equals("actiTIME - Login"))
	{
		System.out.println("Login page can be verified | Test case can be passed ");
	}
	else
	{
		System.out.println("Login page can not be verified | Test case can be failed ");
	}
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	
	System.out.println("Home page title is verified | test case is passed");
	
}
}

