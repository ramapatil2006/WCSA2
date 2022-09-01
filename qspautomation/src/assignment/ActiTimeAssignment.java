package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAssignment {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dell/login.do");
	String logintitle = driver.getTitle();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[.='Login']")).click();
	driver.findElement(By.name("usersSelector.selectedUser"));
	String hometitle = driver.getTitle();
	System.out.println("Login Page Title:=>"+logintitle);
	System.out.println("Home Page Title:=>"+hometitle);
}
}
