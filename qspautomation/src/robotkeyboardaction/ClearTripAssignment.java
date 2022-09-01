package robotkeyboardaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=CjwKCAjwrZOXBhACEiwA0EoRD70oPbUTPxTFBzgY_yEtaO4IjMFGbDYksbwD3G9ps5zOmQNwz_1kvBoCNYAQAvD_BwE&gclid=CjwKCAjwrZOXBhACEiwA0EoRD70oPbUTPxTFBzgY_yEtaO4IjMFGbDYksbwD3G9ps5zOmQNwz_1kvBoCNYAQAvD_BwE");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click(); 
		Thread.sleep(4000);
		WebElement text = driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));
		
		Actions act = new Actions(driver);
		for(int i=0;i<=2;i++)
		{
		act.clickAndHold(text).perform();
		}
		Thread.sleep(4000);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).click();
		Thread.sleep(4000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.close();
	}
}
