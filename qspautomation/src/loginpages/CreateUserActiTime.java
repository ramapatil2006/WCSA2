package loginpages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserActiTime {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://dell/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='button' and @value='Create New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Ramkrishna123");
		driver.findElement(By.name("passwordText")).sendKeys("manager");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("manager");
		driver.findElement(By.name("firstName")).sendKeys("man");
		driver.findElement(By.name("lastName")).sendKeys("a");
		driver.findElement(By.name("middleName")).sendKeys("m");
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("1234567894");
		driver.findElement(By.name("workdayDurationStr")).clear();
		driver.findElement(By.name("workdayDurationStr")).sendKeys("9:00");
		
		driver.findElement(By.id("overtimeTracking_Enable")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("overtimeTrackingLevel_ReadOnly")).click();
		
		
		driver.findElement(By.id("right1")).click();
		driver.findElement(By.id("right12")).click();
		driver.findElement(By.id("right2")).click();
		
		driver.findElement(By.id("right5")).click();
		driver.findElement(By.id("right7")).click();
		driver.findElement(By.id("right10")).click();
		driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(3000);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
