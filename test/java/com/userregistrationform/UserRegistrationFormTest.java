package com.userregistrationform;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationFormTest {

	UserRegistrationForm user= new UserRegistrationForm();

	@Test
	// to validate first name should return false
	public void givenFirstName_ShouldReturnFalse() {
		Assert.assertFalse(user.firstName("yas"));
	}
	
	@Test
	public void givenFirstNmae_ShouldReturnTrue()
	{
		Assert.assertTrue(user.firstName("Yash"));
	}
	

}


