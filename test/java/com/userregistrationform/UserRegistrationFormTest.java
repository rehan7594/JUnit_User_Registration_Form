package com.userregistrationform;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationFormTest {

	private UserRegistrationForm userRegistration;

	public UserRegistrationFormTest() {
		userRegistration = new UserRegistrationForm();
	}

	// Unit Test For First Name
	@Test
	public void validateName() {
		String name = "Rehan";
		boolean result = userRegistration.validateName(name);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid First Name
	@Test
	public void validateInvalidName() {


		String name = "rehan";
		boolean result = userRegistration.validateName(name);
		Assert.assertEquals( false, result);
	}

	// Unit Test For Last Name
	@Test
	public void validateLastName() {
		String lastname = "Kumar";
		boolean result = userRegistration.validateLastName(lastname);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Last Name
	@Test
	public void validateInvalidLastName() {


		String lastName = "kumar";
		boolean result = userRegistration.validateLastName(lastName);
		Assert.assertEquals( false, result);
	}

	// Unit Test For Email
	@Test
	public void validateEmail() {
		String email = "Rehansdm94@gmail.com";
		boolean result = userRegistration.validateEmail(email);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Email
	@Test
	public void validateInvalidEmail() {


		String email = "rehansdm94@com";
		boolean result = userRegistration.validateEmail(email);
		Assert.assertEquals( false, result);
	}

	@Test
	public void validateMobileNumber() {
		String mobileNumber = "91 8217646327";
		boolean result = userRegistration.validateMobileNumber(mobileNumber);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Mobile Number
	@Test
	public void validateInvalidMobileNumber() {

		String mobileNumber = "8217646327";
		boolean result = userRegistration.validateEmail(mobileNumber);
		Assert.assertEquals( false, result);
	}

	@Test
	public void validatePassword() {
		String password = "Rehan@7594";
		boolean result = userRegistration.validatePassword(password);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Password
	@Test
	public void validateInvalidPassword() {

		String password = "r123pdf2";
		boolean result = userRegistration.validateEmail(password);
		Assert.assertEquals( false, result);
	}
}