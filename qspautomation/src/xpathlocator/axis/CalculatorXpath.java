package xpathlocator.axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//span[.='2'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='+'] ")).click();
		driver.findElement(By.xpath("//span[.='3'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='='] ")).click();
		String t1=driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='2'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='–'] ")).click();
		driver.findElement(By.xpath("//span[.='1'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='='] ")).click();
		String t2=driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='2'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='×'] ")).click();
		driver.findElement(By.xpath("//span[.='3'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='='] ")).click();
		String t3=driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='2'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='/'] ")).click();
		driver.findElement(By.xpath("//span[.='2'] ")).click();
		driver.findElement(By.xpath("//span[.='0'] ")).click();
		driver.findElement(By.xpath("//span[.='='] ")).click();
		String t4=driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		Thread.sleep(3000);
		driver.close();

	}

}
