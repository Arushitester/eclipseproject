package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters1 {
	@Parameters("v")
	@Test
	public void test1(String v)
	{
		System.out.println("v="+v);
	}

}
