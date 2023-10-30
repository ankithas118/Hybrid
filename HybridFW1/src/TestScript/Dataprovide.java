package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Pom_Sript.Facebook_Login;

public class Dataprovide extends Base_Test{
	
	@Test(dataProvider = "testData")
	public void browserTest(String un,String pwd) throws InterruptedException
	{
		Facebook_Login fb=new Facebook_Login(driver);
		fb.unPass(un);
		fb.pwdPass(pwd);
		Thread.sleep(2000);
		fb.clickLogin();
		Assert.fail();

	}

	@DataProvider(name = "testData")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "ccc"},
	   { "Anne", "kkkk"},
	 };
	}

}
