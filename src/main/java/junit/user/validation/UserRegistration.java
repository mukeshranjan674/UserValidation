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
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean checkLastName() {

		LOG.info("\nEnter Last Name\n");
		String input = sc.next();
		String regex = "^[A-Z][a-z]{2,}";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean checkEmail() {

		LOG.info("\nEnter Email\n");
		String input = sc.next();
		String regex = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@](bl)[/.](co)([/.]?(in))?$";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
		
	
	public static void main(String[] args) {
		LOG.info("\n***** Welcome to User Registration System *****");
		UserRegistration user = new UserRegistration();
		LOG.info("\n" + user.checkFirstName());
		LOG.info("\n" + user.checkLastName());
		LOG.info("\n" + user.checkEmail());
	}

}
