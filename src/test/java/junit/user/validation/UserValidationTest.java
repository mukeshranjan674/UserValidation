package junit.user.validation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	@Test
	public void whenGiven_ProperFirstName_ShouldReturn_True() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkFirstName("Mukesh");
			Assert.assertTrue(result);
		}catch(InvalidUserException e) {
			
		}
	}

	@Test
	public void whenGiven_ShortFirstName_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkFirstName("Mu");
			
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid First Name",e.getMessage());
		}
	}

	@Test
	public void whenGiven_NotLetterFirst_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkFirstName("Mukesh*");
			
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid First Name",e.getMessage());
		}
	}

	@Test
	public void whenGiven_NotCapitalFirst_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkFirstName("mukesh");
			
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid First Name",e.getMessage());
		}
	}

	@Test
	public void whenGiven_ProperLastName_ShouldReturn_True() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkLastName("Ranjan");
			Assert.assertTrue(result);
		}catch(InvalidUserException e) {
			
		}
	}

	@Test
	public void whenGiven_ShortName_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkLastName("Ra");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Last Name",e.getMessage());
		}
		
	}

	@Test
	public void whenGiven_NotLetterLast_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkLastName("ranjan789");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Last Name",e.getMessage());
		}
	
	}

	@Test
	public void whenGiven_NotCapitalLast_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkLastName("ranjan");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Last Name",e.getMessage());
		}

	}

	@Test
	public void whenGiven_ProperEmail_ShouldReturn_True() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkEmail("abc.100@bl.co.in");
			Assert.assertTrue(result);
		}catch(InvalidUserException e) {
			
		}
	}

	@Test
	public void whenGiven_ImProperEmail_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkEmail("abc.@gmail.com");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Email",e.getMessage());
		}
	}

	@Test
	public void whenGiven_ProperMobile_ShouldReturn_True() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkMobile("91 8989898989");
			Assert.assertTrue(result);
		}catch(InvalidUserException e) {
			
		}
	}

	@Test
	public void whenGiven_LessDigits_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkMobile("91 89874");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Mobile Number",e.getMessage());
		}
	}

	@Test
	public void whenGiven_ImproperCountryCode_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkMobile("00 8987489898");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Mobile Number",e.getMessage());
		}
	}

	@Test
	public void whenGiven_WithoutCountryCode_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkMobile("8987489898");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Mobile Number",e.getMessage());
		}
	}

	@Test
	public void whenGiven_MoreThanTenDigits_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkMobile("91 89898989889");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Mobile Number",e.getMessage());
		}
	}

	@Test
	public void whenGiven_ProperPassword_ShouldReturn_True() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkPassword("India@2020");
			Assert.assertTrue(result);
		}catch(InvalidUserException e) {
			
		}
	}

	@Test
	public void whenGiven_LessThanEightDigits_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkPassword("India@6");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Password",e.getMessage());
		}
	}

	@Test
	public void whenGiven_WithoutCapitalLetter_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkPassword("india@2020");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Password",e.getMessage());
		}
	}

	@Test
	public void whenGiven_WithoutNumber_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkPassword("India@oooo");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Password",e.getMessage());
		}
	}

	@Test
	public void whenGiven_WithoutSpecialCharater_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkPassword("India2020");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Password",e.getMessage());
		}
	}

	@Test
	public void whenGiven_MoreThanOneSpecialCharater_ShouldThrow_CustomException() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.checkPassword("India@@2020");
		}catch(InvalidUserException e) {
			Assert.assertEquals("Invalid Password",e.getMessage());
		}
	}

}
