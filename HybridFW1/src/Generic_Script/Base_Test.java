package Generic_Script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test  implements Frameworkconst{
	
public WebDriver driver;
	
	@BeforeMethod
	public void openappl()
	{
		System.setProperty( Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@AfterMethod
	public void closeappl(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			GenericScreenShot.getphoto(driver);
			
		}
		driver.quit();
	}


	
}
