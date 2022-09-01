package xpathlocator.axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProdPrice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/laptops/pr?sid=6bo,b5g&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_7241c563-577e-43c5-bba7-42bd785a15e7_1_372UD5BXDFYS_MC.34WHNYFH5V2Y&otracker=hp_rich_navigation_8_1.navigationCard.RICH_NAVIGATION_Electronics~Laptop%2Band%2BDesktop_34WHNYFH5V2Y&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&cid=34WHNYFH5V2Y");
		 String t1 = driver.findElement(By.xpath("//div[.='ASUS ROG Zephyrus G14 Ryzen 7 Octa Core 4800HS - (8 GB/1 TB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']")).getText();
		 String tp1 = driver.findElement(By.xpath("//div[.='ASUS ROG Zephyrus G14 Ryzen 7 Octa Core 4800HS - (8 GB/1 TB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		 System.out.println(t1+"-->" +tp1);
		
		 driver.get("https://www.flipkart.com/laptops/pr?sid=6bo,b5g&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_518d0cd2-27fd-4106-a2c6-48f8bbf62f35_1_372UD5BXDFYS_MC.34WHNYFH5V2Y&otracker=hp_rich_navigation_8_1.navigationCard.RICH_NAVIGATION_Electronics~Laptop%2Band%2BDesktop_34WHNYFH5V2Y&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&cid=34WHNYFH5V2Y");
		 String t2 = driver.findElement(By.xpath("//div[.='ASUS VivoBook Pro 14 OLED Ryzen 7 Octa Core 5800H - (16 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NV...']")).getText();
		 String tp2 = driver.findElement(By.xpath("//div[.='ASUS VivoBook Pro 14 OLED Ryzen 7 Octa Core 5800H - (16 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NV...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		 System.out.println(t2+"-->" +tp2);
		 driver.close();

	}

}
