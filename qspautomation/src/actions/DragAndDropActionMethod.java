package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
	WebElement dest = driver.findElement(By.xpath("//li[@class='placeholder']"));
	Actions act = new Actions(driver);
	Thread.sleep(3000);
	act.dragAndDrop(src, dest).perform();
	WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Thread.sleep(3000);
	act.dragAndDrop(src1, dest1).perform();
	
	WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	Thread.sleep(3000);
	act.dragAndDrop(src2, dest2).perform();
	
	WebElement src3 = driver.findElement(By.xpath("//a[.=' SALES ']"));
	WebElement dest3 = driver.findElement(By.xpath("//li[@class='placeholder']"));
	Thread.sleep(3000);
	act.dragAndDrop(src3, dest3).perform();
	Thread.sleep(3000);
	driver.close();
	
}
}