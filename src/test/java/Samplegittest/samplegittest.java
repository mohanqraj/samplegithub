package Samplegittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class samplegittest {
	
	@Test
	public void logintest() throws IOException
	{
		WebDriver wd  = new FirefoxDriver();
		wd.manage().window().maximize();
//		wd.get("https://www.google.com/");
		wd.get("https://www.bing.com/");
	
File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);//takingthe screenshot and moving to file
//FileUtils.copyFile(src, new File("C:\\AutomationWorkspace\\Webdriver\\Screenshot\\google.jpg"));
FileUtils.copyFile(src, new File("C:\\AutomationWorkspace\\samplegittest\\Screenshot\\bing.jpg"));
	}
	
}
