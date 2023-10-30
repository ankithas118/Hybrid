package Pom_Sript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.BasePage;

public class Facebook_Login  extends BasePage{

	@FindBy(id="email")
	private WebElement unTbox;
	
	@FindBy(id="pass")
	private WebElement pwdTbox;
	
	
	@FindBy(name="login")
	private WebElement LogBtn;
	
	
	public Facebook_Login(WebDriver driver)
	{
		super(driver);
	}

	
	public void unPass(String un)
	{
		unTbox.sendKeys(un);
	}
	

	public void pwdPass(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		LogBtn.click();
	}
}



