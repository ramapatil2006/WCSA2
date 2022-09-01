package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestInvalidActiTime extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Flib flib=new Flib();
		int rc = flib.rowCount(bt.excelpath, bt.sheetname);
		for(int i=1;i<rc;i++)
		{
			String username = flib.readExcelData(bt.excelpath, bt.sheetname, i, 0);
			String password = flib.readExcelData(bt.excelpath, bt.sheetname, i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
			Thread.sleep(3000);
		}
		bt.closeBrowser();
	}
}
