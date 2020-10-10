package junit.user.validation;

public class UserRegistration {

	UserValidationInterface userLambda = (input,exp) -> {return (input.matches(exp) ? true : false);};
	
	public boolean checkFirstName(String input) throws InvalidUserException {
		String regex = "^[A-Z][a-z]{2,}";
		if(userLambda.check(input, regex))
			return true;
		else
			throw new InvalidUserException("Invalid First Name");
	}

	public boolean checkLastName(String input) throws InvalidUserException {
		String regex = "^[A-Z][a-z]{2,}";
		if(userLambda.check(input, regex))
			return true;
		else
			throw new InvalidUserException("Invalid Last Name");
	}

	public boolean checkEmail(String input) throws InvalidUserException {
		String regex = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$";
		if(userLambda.check(input, regex))
			return true;
		else
			throw new InvalidUserException("Invalid Email");
	}

	public boolean checkMobile(String input) throws InvalidUserException {
		String regex = "^[1-9]{1,3}[ ][6-9]{1}[0-9]{9}$";
		if(userLambda.check(input, regex))
			return true;
		else
			throw new InvalidUserException("Invalid Mobile Number");
	}

	public boolean checkPassword(String input) throws InvalidUserException {
		String regex = "(?=.{8,})(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[^a-zA-Z0-9 ][a-zA-Z0-9]*";
		if(userLambda.check(input, regex))
			return true;
		else
			throw new InvalidUserException("Invalid Password");
	}
}
