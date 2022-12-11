package org.cts;

public class School {

	public static void main(String[] args) throws StudentNotFoundException {

		String stdId = "12345";

		if (stdId.equals("12345")) {

			System.out.println("555");

		}

		else {

			throw new StudentNotFoundException();

			// System.out.println("666");
		}

	}

}
