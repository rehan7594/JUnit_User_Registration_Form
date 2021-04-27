package com.userregistrationform;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationFormTest {

	private UserRegistrationForm userRegistration;

	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

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
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("First Name is Invalid");

		String name = "rehan";
		userRegistration.validateName(name);
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
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Last Name is Invalid");

		String lastName = "kumar";
		userRegistration.validateLastName(lastName);
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
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Email is Invalid");

		String email = "rehansdm94@gmail.com";
		userRegistration.validateEmail(email);
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
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Mobile Number is Invalid");
		String mobileNumber = "8217646327";
		userRegistration.validateEmail(mobileNumber);
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
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Password is Invalid");
		String password = "r123pdf2";
		userRegistration.validateEmail(password);
	}
}