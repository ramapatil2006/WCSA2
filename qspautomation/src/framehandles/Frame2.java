package framehandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/username.html");
		Thread.sleep(4000);
		
		
		
		driver.findElement(By.id("un")).sendKeys("admin");
		Thread.sleep(3000);
		driver.switchTo().frame("frnm");
		driver.findElement(By.id("pwd")).sendKeys("manager");
		//driver.findElement(By.xpath("//div[@class='lc-90q5um esv0owm0']")).click();
		Thread.sleep(3000);
		driver.close(); 
	}

}

