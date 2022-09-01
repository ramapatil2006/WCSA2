package operationsOnDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstOptionMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/multiselectdropdown.html");
	WebElement multisd = driver.findElement(By.id("menu"));
	Select sel = new Select(multisd);
	for(int i=0;i<=5;i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(1000);
	}
	Thread.sleep(3000);
	String firstoption = sel.getFirstSelectedOption().getText();
	System.out.println(firstoption);
	driver.close();
}
}
