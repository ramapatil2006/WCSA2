package datadrivenframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLoginDataDriven {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://dell/login.do");
	driver.manage().window().maximize();
	
	Flib flib = new Flib();
	
	int rc = flib.rowcount("./data/TestDataAct.xlsx", "invalidcreds");
	for(int i=1;i<=rc;i++)
	{
		String username = flib.readExcelData("./data/TestDataAct.xlsx", "invalidcreds", i, 0);
		String password = flib.readExcelData("./data/TestDataAct.xlsx", "invalidcreds", i, 1);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).clear();
	}
}
}
