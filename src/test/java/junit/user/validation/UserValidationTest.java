package junit.user.validation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	@Test
	public void whenGiven_ProperFirstName_ShouldReturn_True() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkFirstName("Mukesh");
		Assert.assertTrue(result);
	}

	@Test
	public void whenGiven_ShortFirstName_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkFirstName("Mu");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_NotLetterFirst_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkFirstName("Mukesh*");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_NotCapitalFirst_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkFirstName("mukesh");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_ProperLastName_ShouldReturn_True() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkLastName("Ranjan");
		Assert.assertTrue(result);
	}

	@Test
	public void whenGiven_ShortName_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkLastName("Ra");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_NotLetterLast_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkLastName("ranjan789");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_NotCapitalLast_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkLastName("ranjan");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_ProperEmail_ShouldReturn_True() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkEmail("abc.100@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void whenGiven_ImProperEmail_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkEmail("abc.@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_ProperMobile_ShouldReturn_True() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkMobile("91 8989898989");
		Assert.assertTrue(result);
	}

	@Test
	public void whenGiven_LessDigits_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkMobile("91 89874");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_ImproperCountryCode_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkMobile("00 8987489898");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_WithoutCountryCode_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkMobile("8987489898");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_MoreThanTenDigits_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkMobile("91 89898989889");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_ProperPassword_ShouldReturn_True() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkPassword("India@2020");
		Assert.assertTrue(result);
	}

	@Test
	public void whenGiven_LessThanEightDigits_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkPassword("India@6");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_WithoutCapitalLetter_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkPassword("india@2020");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_WithoutNumber_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkPassword("India@oooo");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_WithoutSpecialCharater_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkPassword("India2020");
		Assert.assertFalse(result);
	}

	@Test
	public void whenGiven_MoreThanOneSpecialCharater_ShouldReturn_False() {
		UserRegistration user = new UserRegistration();
		boolean result = user.checkPassword("India@@2020");
		Assert.assertFalse(result);
	}

}
