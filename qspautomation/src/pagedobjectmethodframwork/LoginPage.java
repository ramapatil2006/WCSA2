package pagedobjectmethodframwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedCheckBox;
	@FindBy(xpath="//a[contains(text(),'Actimind')]") private WebElement actimindLink;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	
	
	//initailization
public LoginPage() {
		PageFactory.initElements(driver, this);
	}



	
	//getter
public WebElement getUsn() {
	return usn;
}


public WebElement getPass() {
	return pass;
}


public WebElement getLoginButton() {
	return loginButton;
}


public WebElement getKeepLoggedCheckBox() {
	return keepLoggedCheckBox;
}


public WebElement getActimindLink() {
	return actimindLink;
}


public WebElement getLicenseLink() {
	return licenseLink;
}

//Operational Method
public void validLoginActiTime(String validusername,String validpassword)
{
	usn.sendKeys(validusername);
	pass.sendKeys(validpassword);
	loginButton.click();
	
}
public void inValidLoginActiTime(String invalidusername,String invalidpassword)
{
	usn.sendKeys(invalidusername);
	pass.sendKeys(invalidpassword);
	loginButton.click();
	usn.clear();
	usn.sendKeys(invalidusername);
	
}


}
