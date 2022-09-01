package operationsOnDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/multiselectdropdown.html");
	driver.manage().window().maximize();
	WebElement multisd = driver.findElement(By.id("menu"));
	Select sel = new Select(multisd);
	List<WebElement> we = sel.getOptions();
	
	for(WebElement op:we)
	{	
	String text = op.getText();
	System.out.println(text);
	}
	
}
}
