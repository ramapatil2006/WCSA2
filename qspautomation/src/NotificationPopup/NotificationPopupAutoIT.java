package NotificationPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopupAutoIT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		WebElement target = driver.findElement(By.xpath("//input[@class='duplexBox']"));
		Thread.sleep(3000);
		 Actions act = new Actions(driver);
		 act.doubleClick(target).perform();
		Thread.sleep(3000);
		
	}
}
