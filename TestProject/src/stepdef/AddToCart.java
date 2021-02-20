package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class AddToCart {
	HomePage home;
		@Given("user is on main page")
		    public void user_is_on_main_page() {
			home= new HomePage();
		}
         @When("user click show menu")
		    public void user_click_show_menu() throws InterruptedException {
			home.clickShowMenu();	
		}
		
		 @When("user click home button")
		    public void user_click_home_button() throws InterruptedException {
		   	home.clickHomeBtn();    
		}
		 @Then("three slides will appear")
		    public void three_slides_will_appear() throws InterruptedException {
			home.slider();    
		}
        @Then("available with three arrivals")
			public void available_with_three_arrivals() {
			home.arrivals();
			}
        @Then("image should be clickable and navigate")
			public void image_should_be_clickable_and_navigate() throws InterruptedException {
		    home.checkNavigation();
			}
		@Then("click on description tab")
			public void click_on_description_tab() {
		    home.clickDescriptionTab();
				    
				}
            
				
			    
			

			@Then("click on reviews tab")
			public void click_on_reviews_tab() {
			    home.clickReviewsTab();
			}



			


}


