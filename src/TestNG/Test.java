package TestNG;

public class Test {
	@Test
	void LoginByEmail()
	{
		System.out.println("Login by Email");
		Assert.assertEquals("L","L");
	}
	
	void LoginByFacebook()
	{
		System.out.println("Login by FB");
		Assert.assertEquals("L","y");
	}


}
