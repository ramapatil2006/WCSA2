package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeChildWindowAssignment {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(8000);
		driver.findElement(By.linkText("Open a popup window")).click();
		//String parentw = driver.getWindowHandle();
		Set<String> allhandle = driver.getWindowHandles();
		driver.manage().window().maximize();
		
		
	}
}
