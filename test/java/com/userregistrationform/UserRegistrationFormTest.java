package com.userregistrationform;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationFormTest {

	UserRegistrationForm user= new UserRegistrationForm();

	@Test
	//UC1-to validate first name should return false
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
		
		boolean check = user.lastName("Kumar");
		Assert.assertEquals(true,check);
	}
	@Test
	//UC2-to validate last name if first letter is in lowerCase
	public void givenLastName_WhereLowerCase_ShouldReturnFalse()
	{
		
		boolean check = user.lastName("kumar");
		Assert.assertEquals(false,check);
	}
	
	@Test
    //UC3-to validate emailID
    public void givenEmailId_ShouldReturnTrue()
    {
        
        boolean check = user.emailId("rehansdm94@gmail.com");
        Assert.assertEquals(true,check);
    }
	
	 @Test
	    // UC4-validating mobile number with country code followed by space and number
	    public void givenMobileNumber_ShouldReturnTrue()
	    {
	        
	        boolean check = user.mobileNo("91 9134567872");
	        Assert.assertEquals(true,check);
	    }
	    //UC4-validating mobile number without country code followed by space
	    @Test
	    public void givenMobileNumber_ShouldReturnFalse()
	    {
	       
	        boolean check = user.mobileNo("9123456624");
	        Assert.assertEquals(false,check);
	    }
}


