package TestG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class priority
{
	@Test(priority=1)
	public void TestL()
	{
		System.out.println("L Method");
	}
	@Test(priority=-2)
	public void TestJ()
	{
		System.out.println("J Method");
	}
	@Test(priority=1)
	public void testG()
	{
		System.out.println("G Method");
	}
	}


