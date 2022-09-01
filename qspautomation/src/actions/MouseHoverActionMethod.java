package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		Thread.sleep(3000);
		driver.close(); 
	}
}
