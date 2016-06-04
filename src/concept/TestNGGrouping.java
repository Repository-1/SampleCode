package concept;

import org.testng.annotations.Test;

public class TestNGGrouping 
{
	@Test(groups={"XBOX1"})
	public void console()
	{
		System.out.println("Project CARS");	
	}
	@Test(groups={"Samsung"})
	public void mobile()
	{
		System.out.println("Rovio angry birds");	
	}
	@Test(groups={"WiiU"})
	public void wiiu()
	{
		System.out.println("Walking dead");	
	}
}
