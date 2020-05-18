package com.training.java;

public class PrimeNumberRunner {

	public static void main(String[] args) {
		// Calculate prime numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println("Prime number " + i);
			}
		}
	}

	private static boolean isPrime(int number) {
		// 1 and below are not prime nos.
		if (number < 2)
			return false;

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
