package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class KeywordDrivernFramework extends BaseTest{

	public static void main(String[] args) throws InterruptedException, IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(3000);
		Flib flib = new Flib();
		String username = flib.readExcelData(bt.excelpath, bt.sheetname, 1, 0);
		String password = flib.readExcelData(bt.excelpath, bt.sheetname, 1, 1);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		bt.closeBrowser();
	}
}
