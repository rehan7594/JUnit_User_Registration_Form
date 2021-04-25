package com.userregistrationform;

import java.util.regex.Pattern;

public class UserRegistrationForm {
	
	// UC1 - to check first name
	public boolean firstName(String name) {
		return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", name) == true);
	}
	
	 // UC2-to validate last name
    public boolean lastName(String name)
    {
        return (Pattern.matches("^[A-Z]{1}[a-z]{3,}", name));
    }
}
