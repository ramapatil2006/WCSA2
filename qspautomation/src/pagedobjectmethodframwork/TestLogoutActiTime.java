package pagedobjectmethodframwork;

import java.io.IOException;

public class TestLogoutActiTime extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib=new Flib();
		LoginPage lp=new LoginPage();
		
		lp.validLoginActiTime(flib.readPropertFile(PROP_PATH, "validusername"), flib.readPropertFile(PROP_PATH, "validpassword"));
		Thread.sleep(3000);
		
		HomePage hp=new HomePage();
		
		hp.logoutActiTime();
		Thread.sleep(3000);
		
		bt.closeBrowser();
	}

}
