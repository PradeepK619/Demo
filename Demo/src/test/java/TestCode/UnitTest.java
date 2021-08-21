package TestCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {

	@Test
	public void sumTest() {
		double a=10,b=20,c;
		
		c=a+b;
		Assert.assertEquals(c, 30.0);
	}
	@Test
	public void diffTest() {
		double a=10,b=20,c;
		c=a-b;
		Assert.assertEquals(c, -10.0);
	}
	@Test
	public void mulTest() {
		double a=10,b=20,c;
		c=a*b;
		Assert.assertEquals(c, 200.0);
	}
	@Test
	public void divTest() {
		double a=10,b=20,c;
		c=a/b;
		Assert.assertEquals(c, 0.5);
	}
	
}
