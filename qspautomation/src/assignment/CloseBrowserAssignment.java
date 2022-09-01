package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(8000);
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> allhandle = driver.getWindowHandles();
		for(String handle:allhandle)
		{
		 driver.switchTo().window(handle).close();
		}
	}
}
