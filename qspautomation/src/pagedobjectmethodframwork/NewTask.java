package pagedobjectmethodframwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTask extends BaseTest{
	
	@FindBy(name="customerId") private WebElement customerdropdown;
	@FindBy(name="projectId") private WebElement projectdropdown;
	@FindBy(name="task[0].name") private WebElement tasknamefield;
	@FindBy(name="task[0].deadline") private WebElement deadlinefield;
	@FindBy(name="task[0].billingType") private WebElement billingtypedropdown;
	@FindBy(name="task[0].markedToBeAddedToUserTasks") private WebElement markedaddtousertasks;
	@FindBy(xpath="(//img[contains(@src,'/img/default/erase_row.gif?hash=1692528820')])[1]") private WebElement clearline;
	@FindBy(xpath="//input[contains(@value,'Create Tasks')]") private WebElement createtaskbutton;
	
	
	public NewTask() {
			PageFactory.initElements(driver, this);
	}


	public WebElement getCustomerdropdown() {
		return customerdropdown;
	}


	public WebElement getProjectdropdown() {
		return projectdropdown;
	}


	public WebElement getTasknamefield() {
		return tasknamefield;
	}


	public WebElement getDeadlinefield() {
		return deadlinefield;
	}


	public WebElement getBillingtypedropdown() {
		return billingtypedropdown;
	}


	public WebElement getMarkedaddtousertasks() {
		return markedaddtousertasks;
	}


	public WebElement getClearline() {
		return clearline;
	}


	public WebElement getCreatetaskbutton() {
		return createtaskbutton;
	}
	
	
	public void newTaskActiTime(String keysToSend,String deadline) {
		customerdropdown.click();
		projectdropdown.click();
		tasknamefield.sendKeys(keysToSend);
		deadlinefield.sendKeys(deadline);
		
	}
	
	
}
