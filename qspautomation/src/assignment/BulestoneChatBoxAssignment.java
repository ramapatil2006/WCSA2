package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulestoneChatBoxAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='lc-o7mqve e16i86ec1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("name")).sendKeys("abcd");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("oetmijwuho_146917605549304831")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[@class='lc-90q5um esv0owm0']")).click();
		Thread.sleep(3000);
		driver.close(); 
	}

}
