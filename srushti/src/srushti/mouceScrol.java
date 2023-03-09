 package srushti;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mouceScrol {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\91902\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		 WebDriver t=new FirefoxDriver();
	    
         t.manage().window().maximize();
         t.get("https://trytestingthis.netlify.app/");
         JavascriptExecutor js=(JavascriptExecutor)t;
         
         js.executeScript("Window.scrollBy(0,600)");
         js.executeScript("Window.scrollBy(0,-300)");
         
	}

}
