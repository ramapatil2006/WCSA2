package keyworddrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;
	String excelpath;
	String sheetname;
	public void openBrowser() throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browservalue=prop.getProperty("browser");
		String url = prop.getProperty("url");
		String cbpath = prop.getProperty("cbpath");
		String cbkey = prop.getProperty("cbkey");
		String fbpath = prop.getProperty("fbpath");
		String fbkey = prop.getProperty("fbkey");
		excelpath = prop.getProperty("excelpath");
		sheetname = prop.getProperty("sheetname");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(cbkey, cbpath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(fbkey, fbpath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
