package junit.user.validation;

@FunctionalInterface
public interface UserValidationInterface {
	public boolean check(String input , String exp);

}
