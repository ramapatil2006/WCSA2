package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement we = driver.findElement(By.name("login"));
		Rectangle re = we.getRect();
		System.out.println("Height of webelement is: "+re.height);
		System.out.println("Width of webelement is: "+re.width);
		System.out.println("X axis distance of webelement is: "+re.getX());
		System.out.println("Y axis distance of webelement is: "+re.getY());
		Thread.sleep(3000);
		Dimension gs = we.getSize();
		System.out.println("Height of webelement is: "+gs.getHeight());
		System.out.println("Width of webelement is: "+gs.getWidth());
		driver.close();

	}

}
