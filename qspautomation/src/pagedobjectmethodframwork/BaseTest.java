package pagedobjectmethodframwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		FileInputStream fis=new FileInputStream(PROP_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String browservalue=prop.getProperty("browser");
		String url = prop.getProperty("url");
		//String sheetname = prop.getProperty("sheetname");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
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
