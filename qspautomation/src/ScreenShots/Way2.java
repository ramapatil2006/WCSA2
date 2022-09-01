package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver drv = new ChromeDriver();
		//RemoteWebDriver drv=(RemoteWebDriver)driver;
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drv.get("https://www.selenium.dev/");
		
		File src = drv.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot4.jpg");
		Files.copy(src, dest);
		Thread.sleep(3000);
		drv.close();
	}
}
