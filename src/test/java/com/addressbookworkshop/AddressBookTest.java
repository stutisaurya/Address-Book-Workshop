package com.addressbookworkshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddressBookTest {
	@Test
	public void firstNameTrueTest() {
		AddressBook FirstName = new AddressBook();
		boolean result = FirstName.nameValidation("Stuti");
		assertEquals(true, result);
	}

	@Test
	public void firstNameSadTest() {
		boolean result = AddressBook.nameValidation("st");
		assertEquals(false, result);
	}

	@Test
	public void lastNameTest() {
		AddressBook LastName = new AddressBook();
		boolean result = LastName.nameValidation("Saurya");
		assertEquals(true, result);
	}

	@Test
	public void lastNameSadTest() {
		AddressBook LastName = new AddressBook();
		boolean result = LastName.nameValidation("sa");
		assertEquals(false, result);
	}

	@Test
	public void emailTest() {
		AddressBook email = new AddressBook();
		boolean result = email.email("abc@gmail.com");
		assertEquals(true, result);
	}

	@Test
	public void emailSadTest() {
		AddressBook email = new AddressBook();
		boolean result = email.email("abc@gmail");
		assertEquals(true, result);
	}

	@Test
	public void mobileNumValidation() {
		AddressBook mobileNum = new AddressBook();
		boolean result = mobileNum.mobileNumValidation("91 9523546770");
		assertEquals(true, result);
	}

	@Test
	public void mobileNumValidationSad() {
		AddressBook mobileNum = new AddressBook();
		boolean result = mobileNum.mobileNumValidation("523546770");
		assertEquals(false, result);
	}
}
