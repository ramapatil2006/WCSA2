package multiselectdropdownmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethodForLoop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/multiselectdropdown.html");
		 WebElement ssd = driver.findElement(By.id("menu"));
		 Select sel = new Select(ssd);
		 Thread.sleep(3000);
		 for(int i=0;i<=3;i++)
		 {
		 sel.selectByIndex(i);
		 Thread.sleep(3000);
		 }
		 Thread.sleep(3000);
		 driver.close();
	}
}

