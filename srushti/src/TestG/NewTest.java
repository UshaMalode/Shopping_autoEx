package TestG; 

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void shamboo() 
  {
	 System.out.println("Minal");
  }
  
  @BeforeTest
  void BeforTest()
  {
  System.out.println("Srushti");
  }
  @AfterTest
  void AfterTest()
  {
	  System.out.println("Usha");
  }
   @AfterSuite
   void aft()
   {
	   System.out.println("shiv");
   }
 // @BeforeSuite
 // void befo()
  //{
	//  System.out.println("Sharvil");
	  
//  }
  }
  
  
 

