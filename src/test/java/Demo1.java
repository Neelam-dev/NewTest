import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(priority=0)
	public void abc()
	{


		System.out.println("Test1");
		System.out.println("Test2");

	}
	
	@Test
	public void xyz()
	{
		System.out.println("Test2");
	}
	
	@Test
	public void acb()
	{
		System.out.println("Test3");
	}
	
	
	
	@Test
	public void Test6()
	{
		System.out.println("Test6dfddf");
	}


}
