package TestG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sus
{
 @BeforeSuite
 void befores()
 {
	 System.out.println("Before Suite");
 }
   @Test
   public void f()
	{
	System.out.println("My first tisting");	

	}
   @AfterSuite
   void aftersuite()
   {
	   System.out.println("After suite");
}
}
