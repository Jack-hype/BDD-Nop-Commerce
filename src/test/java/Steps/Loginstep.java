package Steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import NopCommerce.Dashboard_NopCommerce;
import NopCommerce.YourStoreLogin;
import io.cucumber.java.en.*;

public class Loginstep extends Baseclass {
	 
	@Given("user luanch the browser")
	public void user_luanch_the_browser() {
	   System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
	   driver= new ChromeDriver();
	   login=new YourStoreLogin(driver);
	  }
	
	@Given("open the url {string}")
	public void open_the_url(String url) {
	  driver.get(url);
	}
	
	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws InterruptedException 
	{
	   login.enteremail(email);
	   Thread.sleep(2000);
	   login.enterpass(password);  
	}
	
	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
	   login.hitloginbutton();
	   Thread.sleep(2000);
	}
	
	@Then("user is navigated on homepage")
	public void user_is_navigated_on_homepage() 
	{
	  System.out.println("then-1");
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String Title) {
		if(driver.getPageSource().contains("The credentials provided are incorrect"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(Title,driver.getTitle());
		}
	}
	
	@When("user click on logout option")
	public void user_click_on_logout_option() throws InterruptedException {
	    login.hitlogoutbutton();
	    Thread.sleep(2000);
	    
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	   driver.quit();
	}
	
	//add second testcase method
	
	
	@Then("user is navigated on Dashboard page")
	public void user_is_navigated_on_dashboard_page() 
	{
		custom =new Dashboard_NopCommerce(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", custom.pagetitle());
	}
	
	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException
	{
		Thread.sleep(2000);
		custom.clickcustomersmenu();  
	}
	
	@When("click on customers option")
	public void click_on_customers_option() throws InterruptedException
	{
		Thread.sleep(2000);
		custom.clickcustomers();
	}
	
	@When("click on Addnew option")
	public void click_on_addnew_option() throws InterruptedException
	{
		Thread.sleep(2000);
	    custom.clickaddnewoption();
	}
	
	@Then("user can see add new customer page")
	public void user_can_see_add_new_customer_page() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals("Add a new customer / nopCommerce administration", custom.pagetitle());
	}
	
	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException
	{
		custom.enteremail("abejug@gmail.com");
		Thread.sleep(2000);
		custom.enterpassword("abc@321");
		Thread.sleep(2000);
		custom.enterFname("jacckk");
		Thread.sleep(2000);
		custom.enterLname("kdjfhehe");
		Thread.sleep(2000);
		custom.clickmalebutton();
	}
	
	@When("user click on save buttion")
	public void user_click_on_save_buttion() throws InterruptedException
	{
		custom.clickSAVEbutton();
		Thread.sleep(2000);  
	}
	
	@Then("user can see configuration msg {string}")
	public void user_can_see_configuration_msg(String text)
	{	   
		custom.successfull();
		Assert.assertEquals(text,"The new customer has been added successfully.");
	}

}

