package Pom_Sript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Script.BasePage;

public class FaceBookSignup extends BasePage {
	@FindBy(name="firstname")
	private WebElement FNTbox;	
	
	@FindBy(name="lastname")
	private WebElement LNTbox;	
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement MNTbox;
	
	
	@FindBy(id="password_step_input")
	private WebElement PassTbox;	
	
	@FindBy(id="day")
	private WebElement Day;
	
	
	@FindBy(id="month")
	private WebElement Month;
	
	@FindBy(id="year")
	private WebElement year ;
	
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement gender ;
	
	
	public FaceBookSignup (WebDriver driver)
	{
		super(driver);
	}
	
	
	public void FNTbox(String fn)
	{
		FNTbox.sendKeys(fn);
	}
	

	public void lastname(String ln)
	{
		LNTbox.sendKeys(ln);
	}
	
	//public void  (String mnt)
//	{
//		MNTbox.sendKeys(mnt);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
