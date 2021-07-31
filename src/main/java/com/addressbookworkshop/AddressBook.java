package com.addressbookworkshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.model.ContactDetails;

public class AddressBook {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");
		List<String> PersonDetail = new ArrayList<String>();

		ArrayList<com.model.ContactDetails> personDetail = createContact();

		for (String str : PersonDetail) {
			System.out.println(str);
		}
	}

	public static boolean nameValidation(String name) {
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		return m.matches();
	}

	public static boolean email(String email) {

		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean mobileNumValidation(String mobileNum) {
		String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(mobileNumber);
		if (mobileNumber == null) {
			return false;
		}
		Matcher m = p.matcher(mobileNum);
		return m.matches();
	}

	public static ArrayList<ContactDetails> createContact() {

		ArrayList<ContactDetails> PersonDetail = new ArrayList<ContactDetails>();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the First name : ");
		String fname = input.nextLine();
		System.out.println(nameValidation(fname));

		System.out.print("Enter the Last name : ");
		String lname = input.nextLine();
		System.out.println(nameValidation(lname));

		System.out.print("Enter the Address : ");
		String address = input.nextLine();

		System.out.print("Enter the City : ");
		String city = input.nextLine();

		System.out.print("Enter the state : ");
		String state = input.nextLine();

		System.out.print("Enter the Zip Code : ");
		String zip = input.nextLine();

		System.out.print("Enter the phone number: ");
		String phone = input.nextLine();
		System.out.println(mobileNumValidation(phone));
		input.nextLine();
		System.out.print("Enter the Email: ");
		String email = input.nextLine();
		System.out.println(email(email));

		PersonDetail.add(new ContactDetails(fname, lname, address, city, state, zip, phone, email));

		for (ContactDetails str : PersonDetail) {
			System.out.println(str + " ");
		}
		return PersonDetail;
	}
}
