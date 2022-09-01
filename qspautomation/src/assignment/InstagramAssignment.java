package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAssignment {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	String logintitle = driver.getTitle();
	driver.findElement(By.name("username")).click();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("manager");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println("Login Page Title:=>"+logintitle);
	
}
}
