package TestG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class one 
{
	@BeforeClass
	void bclass()
	{
		System.out.println("Before Class One");
	}
	
	@BeforeTest
	void btest()
	{
		System.out.println("B Test two");
	}
	@Test
	void f()
	{
		System.out.println("Class two");
	}
	@AfterTest
	void aftertest()
	{
		System.out.println("aaaa");
	}

}
