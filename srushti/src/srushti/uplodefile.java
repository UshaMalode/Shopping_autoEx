package srushti;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uplodefile {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\91902\\\\Downloads\\\\geckodriver-v0.32.0-win64\\\\geckodriver.exe");
   WebDriver r=new FirefoxDriver();
   r.get("https://trytestingthis.netlify.app/");
   
 // WebElement uplode=r.findElement(By.xpath("//input[@id='myfile']"));
   //uplode.sendKeys("C:\\Users\\91902\\Desktop\\usha data\\Aug22_Batch_Manual Assignment_Defect Management tools.xlsx");
	
	JavascriptExecutor u=(JavascriptExecutor)r;
	u.executeScript("document.getElementById('favcolor').value='#bf00ff'");
	}
	

}
