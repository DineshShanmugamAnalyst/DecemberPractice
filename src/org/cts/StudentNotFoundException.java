package org.cts;
public class StudentNotFoundException extends Exception {

	@Override
	public String getMessage() {

		String msg = "Student Not Found ";
		return msg;
	}

}
     