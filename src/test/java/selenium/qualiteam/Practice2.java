package selenium.qualiteam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {
	@Test
	public void run()
	{
	System.out.println("Dogs can run");
	}
	
	@Test
	public void speak()
	{
		System.out.println("Dogs can bark");
	}
	
	@BeforeMethod
	public void animals()
	{
		System.out.println("Animals categories");
	}
	
	@BeforeMethod
	public void animals2()
	{
		System.out.println("Dogs are white");
	}
	
	@BeforeClass
	public void Dogs2()
	{
		System.out.println("Dogs are drinking water");
	}
	
	@AfterClass
	public void Dogs3()
	{
		System.out.println("Dogs are drinking water");
	}

}
