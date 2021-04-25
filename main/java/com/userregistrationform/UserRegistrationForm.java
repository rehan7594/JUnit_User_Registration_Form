package com.userregistrationform;

import java.util.regex.Pattern;

public class UserRegistrationForm {
	public boolean firstName(String name) {
		return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", name) == true);
	}
}
