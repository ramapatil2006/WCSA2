package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://dell/login.do");
		String text = driver.findElement(By.xpath("//td[text()='Please identify yourself']")).getText();
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("//td[text()='Username:']")).getText();
		System.out.println(text1);
		driver.close();

	}

}
