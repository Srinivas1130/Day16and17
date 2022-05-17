package com.bridgelabz.day16and17;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class customizeMessageRegEx {
	private static void userDetails() {

		String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name:");
		String firstName = scanner.next();

		Pattern pattern = Pattern.compile(firstNamePattern);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if(result == true) {

			String fullNamePattern = "[A-Z]{1}[a-z]{2,}";
			System.out.println("Enter Full Name:");
			String fullName = scanner.next();

			Pattern pattern1 = Pattern.compile(fullNamePattern);
			Matcher matcher1 = pattern1.matcher(fullName);
			boolean result1 = matcher1.matches();

			if(result1 == true) {

				String mobileNoPattern = "(91-)?[6-9][0-9]{9}";
				System.out.println("Enter your Mobile Number:");
				String mobileNumber = scanner.next();

				Pattern pattern3 = Pattern.compile(mobileNoPattern);
				Matcher matcher3 = pattern3.matcher(mobileNumber);
				boolean result3 = matcher3.matches();

				if(result3 == true) {
					System.out.println("Hello " + firstName +",");
					System.out.println();
					System.out.println("We have your full name as " + fullName + " in our " +
							"system. your contact number is " + mobileNumber + ".");
					System.out.println();

					System.out.println("Please,let us know in case of any clarification.");
					System.out.println();
					System.out.println("                                      Thank you,");
					System.out.println("Date :" + java.time.LocalDate.now() + "                      BridgeLabz"); 
				}
				else {
					System.out.println("Mobile Number is invalid");
				}
			}
			else {
				System.out.println("Full Name is invalid");
			}
		}
		else {
			System.out.println("Name is Invalid");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		userDetails();
	}
}
