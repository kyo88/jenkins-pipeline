package vn.kyo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tools {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static boolean validateMail(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub check mail  
		System.out.println(validateMail("longta@gmail.com"));

	}

	public boolean isEmail(String email) {
		return false;
	}

}
