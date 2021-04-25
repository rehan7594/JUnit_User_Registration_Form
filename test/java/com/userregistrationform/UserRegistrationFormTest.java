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

	@Test
	// UC2-to validate last name if first letter is in upperCase
	public void givenLastName_WhereCapitaLetter_ShouldReturnTrue()
	{
		UserRegistrationForm user= new UserRegistrationForm();
		boolean check = user.lastName("Kumar");
		Assert.assertEquals(true,check);
	}
	@Test
	//UC2-to validate last name if first letter is in lowerCase
	public void givenLastName_WhereLowerCase_ShouldReturnFalse()
	{
		UserRegistrationForm user= new UserRegistrationForm();
		boolean check = user.lastName("kumar");
		Assert.assertEquals(false,check);
	}
}


