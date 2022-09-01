package eliminateduplicate;

import java.time.Duration;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateHashSet {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/wcsa2workspace/HTML/singleselectdropdown.html");
	 WebElement ssd = driver.findElement(By.id("menu"));
	 Select sel = new Select(ssd);
	 Thread.sleep(3000);
	 List<WebElement> allops = sel.getOptions();
	System.out.println(allops);
	
	 for(WebElement op:allops)
		{	
		String text = op.getText();
		System.out.println(text);
		}
	 System.out.println("--------------");
	 	 
		// Set<WebElement> hs = new HashSet<WebElement>(allops);
		 //for(int i=0;i<allops.size();i++)
		 //{
		 //hs=allops.add();
		 //}
		 //for(WebElement op:hs)
			//{	
			//String text = op.;
			//System.out.println(text);
			//}
		 driver.close();
}
}
