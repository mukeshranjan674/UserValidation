package junit.user.validation;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	
	private static final Logger LOG= LogManager.getLogger(UserRegistration.class);
	Scanner sc = new Scanner(System.in);
	
	public boolean checkFirstName() {

		LOG.info("\nEnter First Name\n");
		String input = sc.next();
		String regex = "^[A-Z][a-z]{2,}";
		return input.matches(regex) ;
	}
		
	
	public static void main(String[] args) {
		LOG.info("\n***** Welcome to User Registration System *****");
		UserRegistration user = new UserRegistration();
		LOG.info("\n" + user.checkFirstName());
	}

}
