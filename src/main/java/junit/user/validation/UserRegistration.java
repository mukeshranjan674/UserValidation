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
		String regex = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$";
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

		LOG.info("\nEnter Password ( 8 characters ,capital letter, digit, 1 spl char)\n");
		String input = sc.nextLine();
		String regex = "(?=.{8,})(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[^a-zA-Z0-9 ][a-zA-Z0-9]*";
		LOG.info("\n" + input);
		return input.matches(regex) ;
	}
	public boolean validateEmail() {

		LOG.info("\nSample emails check\n");
		String[] emails = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
				"abc@gmail.com.aa.au" };
		
		for (String currentEmail : emails) {
			boolean result = 
			currentEmail.matches("^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$");
			
			LOG.info("\n" + currentEmail + ": " + result);
		}
		return true;
	}
		
	
	public static void main(String[] args) {
		LOG.info("\n***** Welcome to User Registration System *****");
		UserRegistration user = new UserRegistration();
		LOG.info("\n" + user.checkFirstName());
		LOG.info("\n" + user.checkLastName());
		LOG.info("\n" + user.checkEmail());
		LOG.info("\n" + user.checkMobile());
		LOG.info("\n" + user.checkPassword());
		LOG.info("\n" + user.validateEmail());
	}

}
