package operationsOnDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/multiselectdropdown.html");
	driver.manage().window().maximize();
	WebElement multisd = driver.findElement(By.id("menu"));
	Select sel = new Select(multisd);
	for(int i=0;i<=5;i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(1000);
	}
	Thread.sleep(3000);
	List<WebElement> allsel = sel.getAllSelectedOptions();
	for(WebElement op:allsel)
	{	
	String text = op.getText();
	System.out.println(text);
	}
	driver.close();
}
}
