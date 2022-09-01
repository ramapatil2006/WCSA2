package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultiAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/laptops-store?fm=neo%2Fmerchandising&iid=M_2fc1cfe5-53e8-409f-a8b5-97408dede257_1_372UD5BXDFYS_MC.WB1CFS0X26D1&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Laptop%2Band%2BDesktop~Laptops_WB1CFS0X26D1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=WB1CFS0X26D1");
		String text = driver.findElement(By.xpath("//a[contains(@class,'s1Q9rs')]")).getText();
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("//div[contains(@class,'_30jeq3')]")).getText();
		System.out.println(text1);
		
		driver.close();

	}

}
