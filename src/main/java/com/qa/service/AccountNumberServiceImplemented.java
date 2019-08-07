package com.qa.service;

import org.springframework.stereotype.Service;

@Service
public class AccountNumberServiceImplemented implements AccountNumberService {

	public String getAccountNumber6() {

		Integer randomNumber = 10000000 + (int) (Math.random() * 9999999);
		String number = randomNumber.toString();

		String letter = "";
		int num = (int) (Math.random() * 3);
		switch (num) {
		case 0:

			letter = "a";
			break;
		case 1:
			letter = "b";
			break;
		case 2:
			letter = "c";
			break;
		}

		String accountNumber = letter + number;
		return accountNumber;

	}

	public String getAccountNumber8() {

		Integer randomNumber = 10000000 + (int) (Math.random() * 9999999);
		String number = randomNumber.toString();

		System.out.println(number);

		String letter = "";
		int num = (int) (Math.random() * 3);
		switch (num) {
		case 0:
			letter = "a";
			break;
		case 1:
			letter = "b";
			break;
		case 2:
			letter = "c";
			break;
		}

		String accountNumber = letter + number;
		return accountNumber;
	}

	public String getAccountNumber10() {

		Integer randomNumber = 1000000000 + (int) (Math.random() * 999999999);
		String number = randomNumber.toString();

		String letter = "";
		int num = (int) (Math.random() * 3);
		switch (num) {
		case 0:
			letter = "a";
			break;
		case 1:
			letter = "b";
			break;
		case 2:
			letter = "c";
			break;
		}

		String accountNumber = letter + number;
		return accountNumber;
	}

}
