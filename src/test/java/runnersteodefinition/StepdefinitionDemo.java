package runnersteodefinition;

	import org.openqa.selenium.By;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import Orangehrm.Loginpage;

	public class StepdefinitionDemo extends BaseClass{
		
		
	    private  Loginpage pg;

		@Given("I am on the OrangeHRM login page")
		public void i_am_on_the_orange_hrm_login_page() {
			
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  pg = new Loginpage(driver); 
		}
		@Given("I have entered a valid username and password")
		public void i_have_entered_a_valid_username_and_password() {
			pg.username("Admin");
			pg.password("admin123");
		}


		@When("I click on the login button")
		public void i_click_on_the_login_button() {
			pg.clbtn();
		}

		@Then("I should be logged in successfully")
		public void i_should_be_logged_in_successfully() {
		    
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}

		@Given("I have entered invalid {string} and {string}")
		public void i_have_entered_invalid_and(String user, String pass) {
		   pg.username(user);
		   pg.password(pass);
		}
		@Then("I should see an error message indicating {string}")
		public void i_should_see_an_error_message_indicating(String string) {
			 Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed());
				
		}
	
	}

