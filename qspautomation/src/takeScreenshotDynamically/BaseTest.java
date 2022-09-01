package takeScreenshotDynamically;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class BaseTest {
  WebDriver driver;
  public void initialisation() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("https://www.flipkart.com");
  }
  
  public void failedTest()
  {
	  try
	  {
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./ScreenShots/failedscreenshot.jpg");
		  Files.copy(src, dest);
	  }
	  catch(Exception e)
	  {
		  
	  }
  }
}
