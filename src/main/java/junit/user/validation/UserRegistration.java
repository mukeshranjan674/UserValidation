package junit.user.validation;

public class UserRegistration {

	public boolean checkFirstName(String input) {
		String regex = "^[A-Z][a-z]{2,}";
		return input.matches(regex);
	}

	public boolean checkLastName(String input) {
		String regex = "^[A-Z][a-z]{2,}";
		return input.matches(regex);
	}

	public boolean checkEmail(String input) {
		String regex = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$";
		return input.matches(regex);
	}

	public boolean checkMobile(String input) {
		String regex = "^[1-9]{1,3}[ ][6-9]{1}[0-9]{9}$";
		return input.matches(regex);
	}

	public boolean checkPassword(String input) {
		String regex = "(?=.{8,})(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[^a-zA-Z0-9 ][a-zA-Z0-9]*";
		return input.matches(regex);
	}
}
