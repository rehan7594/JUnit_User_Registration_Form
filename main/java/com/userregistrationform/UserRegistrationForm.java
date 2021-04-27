package com.userregistrationform;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@Description - Here User Registration Details. Pattern Is Provided And Check Is That Valid Or Invalid.
public class UserRegistrationForm {
	Scanner scanner = new Scanner(System.in);
	// Initialization Of Veriables
	String firstName;
	String lastName;
	String email;
	String mobileNumber;
	String password;

	// Get User Input For Validations
	public String getFirstName() {
		System.out.println("Enter your first name");
		firstName = scanner.nextLine();
		return firstName;
	}

	// Get User Input For Validation
	public String getLastName() {
		System.out.println("Enter your last name");
		lastName = scanner.nextLine();
		return lastName;
	}

	// Get User Input For Email Check
	public String getEmail() {
		System.out.println("Enter Email -");
		email = scanner.nextLine();
		return email;
	}

	// Get User Input For Mobile Number Checking Purpose
	public String getMobileNumber() {
		System.out.println("Enter Mobile Number -");
		mobileNumber = scanner.nextLine();
		return mobileNumber;
	}

	// Get User Input For Password
	public String getPassword() {
		System.out.println("Enter Password -");
		password = scanner.nextLine();
		return password;
	}

	// Checking valid first name
	public boolean validateName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		try {
			if (matches) {
				System.out.println("First Name is valid");
			} else {
				throw new UserRegistrationException("Sorry Invalid First Name");
			}
		} catch (UserRegistrationException ex) {
			System.out.println("exception. First Name Is Not Valid");

		}
		return matches;

	}

	// Validation for Last Name
	public boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(lastName);
		boolean matches = matcher.find();
		try {
			if (matches) {
				System.out.println("Last Name Is Valid");
			} else {
				throw new UserRegistrationException("Sorry Invalid Last Name");
			}
		} catch (UserRegistrationException ex) {
			System.out.println("exception. Last Name Is Not Valid");

		}
		return matches;
	}

	// Checking valid Email
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(email);
		boolean matches = matcher.find();
		try {
			if (matches) {
				System.out.println("Email Is Valid");
			} else {
				throw new UserRegistrationException("Sorry Invalid Email Name");
			}
		} catch (UserRegistrationException ex) {
			System.out.println("exception. Email Is Not Valid");

		}
		return matches;
	}

	//Checking validation for mobile
	public boolean validateMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("[0-9]{2}[ ][0-9]{10}");
		Matcher matcher = pattern.matcher(mobileNumber);
		boolean matches = matcher.find();
		try {
			if (matches) {
				System.out.println("Mobile Number Is Valid");
			} else {
				throw new UserRegistrationException("Sorry Invalid Mobile Number");
			}
		} catch (UserRegistrationException ex) {
			System.out.println("exception. Mobile Number Is Not Valid");
		}
		return matches;
	}

	//Checking validation for Password
	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])((?=.+[!$%^&*(),.:@#^]){1}).{8,}$");
		Matcher matcher = pattern.matcher(password);
		boolean matches = matcher.find();
		try {
			if (matches) {
				System.out.println("Password Is Valid");
			} else {
				throw new UserRegistrationException("Sorry Invalid Password");
			}
		} catch (UserRegistrationException ex) {
			System.out.println("exception. Password Is Not Valid");
		}
		return matches;
	}

	public static void main(String[] args) {
		{
			System.out.println("Well Come In User Registration....");
			UserRegistrationForm userRegistration = new UserRegistrationForm();
			String firstName = userRegistration.getFirstName();
			userRegistration.validateName(firstName);
			String lastName = userRegistration.getLastName();
			userRegistration.validateLastName(lastName);
			String email = userRegistration.getEmail();
			userRegistration.validateEmail(email);
			String mobileNumber = userRegistration.getMobileNumber();
			userRegistration.validateMobileNumber(mobileNumber);
			String password = userRegistration.getPassword();
			userRegistration.validatePassword(password);
		}
	}
}

