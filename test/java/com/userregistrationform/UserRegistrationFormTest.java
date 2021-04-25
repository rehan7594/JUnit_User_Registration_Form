package com.userregistrationform;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationFormTest {

	UserRegistrationForm user= new UserRegistrationForm();

	@Test
	//UC1-to validate first name should return Happy
	public void firstNameValidation_ShouldReturnHappy() {

		String result = user.firstName("Rehan");
		Assert.assertEquals("Happy",result);
	}
	@Test
	//UC1-to validate first name should return Sad
	public void givenFirstName_WhereLowerCase_ShouldReturnSad() {

		String  result = user.firstName("ras");
		Assert.assertEquals("Sad", result);
	}

	@Test
	// UC2-to validate last name if first letter is in upperCase should retrun happy
	public void givenLastName_WhereCapitaLetter_ShouldReturnHappy()
	{
		String result = user.lastName("Kumar");
		Assert.assertEquals("Happy",result);
	}

	@Test
	//UC2-to validate last name if first letter is in lowerCase should return sad
	public void givenLastName_WhereLowerCase_ShouldReturnSad()
	{
		String result = user.lastName("kumar");
		Assert.assertEquals("Sad",result);
	}

	@Test
	//UC3-to validate emailID should return Happy
	public void givenEmailId_ShouldReturnHappy()
	{
		String  result = user.emailId("rehansdm94@gmail.com");
		Assert.assertEquals("Happy",result);
	}

	@Test
	//UC3-to validate emailID should return Sad
	public void givenEmailId_ShouldReturnSad()
	{
		String  result = user.emailId("@123@gmail.com");
		Assert.assertEquals("Sad",result);
	}

	@Test
	// UC4-validating mobile number with country code followed by space and number should return Happy
	public void givenMobileNumber_ShouldReturnHappy()
	{
		String check = user.mobileNo("91 9134567872");
		Assert.assertEquals("Happy",check);
	}

	//UC4-validating mobile number without country code followed by space should return Sad
	@Test
	public void givenMobileNumber_ShouldReturnSad()
	{
		String check = user.mobileNo("9123456624");
		Assert.assertEquals("Sad",check);
	}

	@Test
	//UC5-validating for password with minimum 8 characters should return Happy
	public void givenPassword_ShouldReturnHappy()
	{
		String check = user.passwordCheck("qwerty123@");
		Assert.assertEquals("Happy",check);
	}

	@Test
	//UC5-validating password having less than 8 characters should return Sad
	public void givenPassword_ShouldReturnSad()
	{
		String check = user.passwordCheck("yetet@");
		Assert.assertEquals("Sad",check);
	}

	@Test
	//UC6-validating password having minimum 1 upperCase character should return Happy
	public void givenPassword_ForMinimumOneUpperCase_ShouldReturnHappy()
	{
		String check = user.passwordCheck_ForAtLeast_OneUpperCase("Qwerty123@");
		Assert.assertEquals("Happy",check);
	}

	@Test
	//UC6-validating password having no upperCase character should return Sad
	public void givenPassword_WithNoUpperCase_ShouldReturnSad()
	{
		String check = user.passwordCheck_ForAtLeast_OneUpperCase("qwerty123@");
		Assert.assertEquals("Sad",check);
	}

	@Test
	/*UC7-validating password having minimum 8 character
	 * password having minimum 1 upperCase character and
	 * password will have minimum 1 numeric value
	 */
	public void givenPassword_WithMinimumOneNumber_ShouldReturnHappy() {
		String check = user.passwordCheck_ForAtLeast_OneNumericCharacter("Qwerty123@");
		Assert.assertEquals("Happy", check);
	}

	@Test
	/*UC8-validating password for exactly one special character should return true
	 * and all rule should passed
	 */
	public void givenPassword_WithExactlyOneSpecialCharacter_ShouldReturnHappy()
	{
		String  check = user.passwordCheck_ForExactly_OneSpecialCharacter("Qwerty12@");
		Assert.assertEquals("Happy",check);
	}

	@Test
	/*UC8-validating password for exactly no special character should return sad
	 * and all rule should passed
	 */
	public void givenPassword_WithExactlyOneSpecialCharacter_ShouldReturnSad()
	{
		String  check = user.passwordCheck_ForExactly_OneSpecialCharacter("Qwerty12");
		Assert.assertEquals("Sad",check);
	}

}


