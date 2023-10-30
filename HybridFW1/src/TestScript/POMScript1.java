package TestScript;


import org.testng.annotations.Test;

import Generic_Script.Base_Test;

import Pom_Sript.Facebook_Login;

public class POMScript1  extends Base_Test{
	
	@Test
	public void test() throws InterruptedException
	{
		
	
	Facebook_Login ts= new Facebook_Login(driver);
	 ts.unPass("admin");
	 Thread.sleep(2000);
	 ts.pwdPass("manager");
	 Thread.sleep(2000);
	 ts.clickLogin();
	
	}
}

