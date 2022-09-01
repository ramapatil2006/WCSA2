package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way5 {

public static void main(String[] args) throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dell/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	WebElement webe = driver.findElement(By.xpath("//a[.='Login']"));
	//File src = webe.getScreenshotAs(OutputType.FILE);
	//File dest = new File("./screenshots/screenshot1.jpg");
	//Files.copy(src, dest);
	Thread.sleep(3000);
	driver.close();
}
}
