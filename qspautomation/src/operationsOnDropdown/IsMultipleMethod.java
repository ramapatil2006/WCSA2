package operationsOnDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/multiselectdropdown.html");
	driver.manage().window().maximize();
	WebElement multisd = driver.findElement(By.id("menu"));
	Select sel = new Select(multisd);
	boolean we = sel.isMultiple();
	System.out.println(we);
}
}
