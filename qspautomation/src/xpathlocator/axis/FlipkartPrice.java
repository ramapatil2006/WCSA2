package xpathlocator.axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Core i5']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Core i5']/ancestor::div[@class='_1KOcBL']/descendant::div[.='Brand']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Core i5']/ancestor::div[@class='_1KOcBL']/descendant::div[.='Brand']/following-sibling::div[@class='_3FPh42']/descendant::div[.='DELL']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[.='Core i5']/ancestor::div[@class='_1KOcBL']/descendant::div[.='Brand']/following-sibling::div[@class='_3FPh42']/descendant::div[.='DELL']/ancestor::div[@class='_1KOcBL']/descendant::div[.='Screen Size']")).click();
	Thread.sleep(3000);
}
}
