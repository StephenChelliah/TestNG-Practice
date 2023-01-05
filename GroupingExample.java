package testNGpackagestephen;

import org.testng.annotations.Test;

public class GroupingExample {
      
	@Test(groups= {"moto"})
	public void moto1()
	{
		System.out.println("Moto Testing 1");
	}
	
	@Test(groups= {"moto"})
	public void moto2()
	{
		System.out.println("Moto Testing 2");
	}
	
	@Test(groups= {"lenovo"})
	public void lenevo1()
	{
		System.out.println("Lenovo Testing 1");
	
    }
	@Test(groups= {"lenovo"})
	public void lenevo2()
	{
		System.out.println("Lenovo Testing 2");
	}
	
	@Test(groups= {"samsung"})
	public void samsung1()
	{
		System.out.println("Samsung Testing 1");
	}
	@Test(groups= {"samsung"})
	public void samsung2()
	{
		System.out.println("Samsung Testing 2");
	}
	
}
