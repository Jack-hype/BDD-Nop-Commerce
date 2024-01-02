package NopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStoreLogin {

	@FindBy(xpath="//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;
	
	
	public YourStoreLogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String uname)
	{
		email.clear();
		email.sendKeys(uname);
	}
	
	public void enterpass(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	
	public void hitloginbutton()
	{
		loginbutton.click();
	}
	public void hitlogoutbutton()
	{
		logoutbutton.click();
	}
}
