package sampleGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest2 {
	@Test
	
	public void logintest() throws IOException
	{
	  WebDriver wd = new FirefoxDriver();
	  wd.manage().window().maximize();
	  wd.get("https://www.ntltaxi.com");
	  File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\samplegitTest\\screenshot\\google.jpg"));
	  
	       
	  
	  
			  
	
	}

}
