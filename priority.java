package testNGpackagestephen;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=0)
	public void startthecar()
	{
		System.out.println("Start the Car");
	}
	@Test(priority=1)
	public void putfirstgear()
	{
		System.out.println("firstgear");
	}
	@Test(priority=2)
	public void putsecondgear()
	{
		System.out.println("Secondgear");
	}
	@Test(priority=3)
	public void putthirdgear()
	{
		System.out.println("ThirdGear");
	}
	@Test(priority=4)
	public void putfourthgear()
	{
		System.out.println("Fourth Gear");
	}
}
