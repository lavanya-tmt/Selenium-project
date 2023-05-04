package Assertions;

//import dev.failsafe.internal.util.Assert;

import org.testng.Assert;

public class HardAssertions {
	
	void Test() {
		Assert.assertTrue(true);
		Assert.assertEquals("Hi","Hi"); //true=passed
		Assert.assertEquals("Selenium","selenium")// false
		Assert.assertFalse(false);
		System.out.println("Successfully Passed");


}
