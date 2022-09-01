package pagedobjectmethodframwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
	//Declaration
	@FindBy(name="usersSelector.selectedUser") private WebElement entertimetrackdropdoen;
	@FindBy(xpath="//a[contains(text(),'Create new tasks')]") private WebElement createnewtask;
	@FindBy(id="SubmitTTButton") private WebElement saveleavetimebutton;
	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logoutlink;
	
	
	//Initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


	//getter
	public WebElement getEntertimetrackdropdoen() {
		return entertimetrackdropdoen;
	}


	public WebElement getCreatenewtask() {
		return createnewtask;
	}


	public WebElement getSaveleavetimebutton() {
		return saveleavetimebutton;
	}


	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	//Operational method
	public void logoutActiTime()
	{
		logoutlink.click();
	}
	
}
