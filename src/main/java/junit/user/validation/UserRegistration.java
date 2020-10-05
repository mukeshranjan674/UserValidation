package junit.user.validation;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	
	private static final Logger LOG= LogManager.getLogger(UserRegistration.class);
	Scanner sc = new Scanner(System.in);
	
	public boolean checkFirstName() {

		LOG.info("\nEnter First Name\n");
		String input = sc.nextLine();
		String regex = "^[A-Z][a-z]{2,}";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean checkLastName() {

		LOG.info("\nEnter Last Name\n");
		String input = sc.nextLine();
		String regex = "^[A-Z][a-z]{2,}";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean checkEmail() {

		LOG.info("\nEnter Email\n");
		String input = sc.nextLine();
		String regex = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@](bl)[/.](co)([/.]?(in))?$";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean checkMobile() {

		LOG.info("\nEnter Mobile\n");
		String input = sc.nextLine();
		String regex = "^[0-9]{1,3}[ ][6-9]{1}[0-9]{9}$";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean checkPassword() {

		LOG.info("\nEnter Password ( minimum 8 characters )\n");
		String input = sc.nextLine();
		String regex = ".{8,}";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
		
	
	public static void main(String[] args) {
		LOG.info("\n***** Welcome to User Registration System *****");
		UserRegistration user = new UserRegistration();
		LOG.info("\n" + user.checkFirstName());
		LOG.info("\n" + user.checkLastName());
		LOG.info("\n" + user.checkEmail());
		LOG.info("\n" + user.checkMobile());
		LOG.info("\n" + user.checkPassword());
	}

}
