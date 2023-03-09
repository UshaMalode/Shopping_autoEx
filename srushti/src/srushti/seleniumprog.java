package srushti;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class seleniumprog {

	public static void main(String[] args)
			{
		
  System.out.println("usha");
  
	//WebDriver test=new ChromeDriver();
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\91902\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	 WebDriver n=new FirefoxDriver();
    n.get("https://www.redbus.com/");
    
    File s=((FirefoxDriver)n).getFullPageScreenshotAs(OutputType.FILE);
    
    
 try {
	FileHandler.copy(s,new File("Fulscreenshot.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
 
			}
			
			}
	
	
	


