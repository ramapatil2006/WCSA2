package pagedobjectmethodframwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage extends BaseTest {

	//@FindBy(name="firstHierarchyLevelCode") private WebElement topgroupleveldropdown;
	//@FindBy(name="secondHierarchyLevelCode") private WebElement middlegroupleveldropdown;
	//@FindBy(name="thirdHierarchyLevelCode") private WebElement timeentryleveldropdown;
	//@FindBy(id="hoursPerDayLimited_LimitTo") private WebElement maxreportedhrsperday;
	@FindBy(xpath="(//img[@class='sizer'])[5]") private WebElement settingtab;
	@FindBy(xpath="//a[@class='item' and text()='Logo & Color Scheme']") private WebElement logoandcolorscheme;
	@FindBy(name="colorScheme") private WebElement colorschemedropdown;
	@FindBy(xpath="//input[@value='Save Settings']") private WebElement savesettingbutton;
	
	public SettingPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoandcolorscheme() {
		return logoandcolorscheme;
	}

	public WebElement getColorschemedropdown() {
		return colorschemedropdown;
	}

	public WebElement getSavesettingbutton() {
		return savesettingbutton;
	}
	
	
	
	public void colorScheme() throws InterruptedException
	{
		
		Flib flib=new Flib();
		settingtab.click();
		logoandcolorscheme.click();
		flib.readDropDown(colorschemedropdown, "azureblue");
		savesettingbutton.click();
	}
	
}
