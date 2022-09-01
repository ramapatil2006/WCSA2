package multiselectdropdownmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/multiselectdropdown.html");
		 WebElement ssd = driver.findElement(By.id("menu"));
		 Select sel = new Select(ssd);
		 Thread.sleep(3000);
		 sel.selectByValue("v1");
		 Thread.sleep(3000);
		 sel.selectByValue("v2");
		 Thread.sleep(3000);
		 sel.selectByValue("v4");
		 Thread.sleep(3000);
		 driver.close();
	}
}
