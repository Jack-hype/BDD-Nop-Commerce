package NopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_NopCommerce {

	@FindBy(xpath="//i[@class='nav-icon far fa-user']")
	private WebElement customersmenu;
	
	@FindBy(xpath="//p[text()=' Customers']")
	private WebElement customersoption;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/Create']")
	private WebElement Addnew;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	private WebElement male;
	
	@FindBy(xpath="//button[@name='save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	private WebElement successfulladd;
	
	private WebDriver driver;
	public Dashboard_NopCommerce(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public String pagetitle()
	{
		return driver.getTitle();
	}
	
	public void clickcustomersmenu()
	{
		customersmenu.click();
	}
	
	public void clickcustomers()
	{
		customersoption.click();
	}

	public void clickaddnewoption()
	{
		Addnew.click();
	}
	
	public void enteremail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void enterpassword(String Pass)
	{
		password.sendKeys(Pass);
	}
	
	public void enterFname(String Fname)
	{
		Email.sendKeys(Fname);
	}
	
	public void enterLname(String Lname)
	{
		Email.sendKeys(Lname);
	}
	
	public void clickmalebutton()
	{
		male.click();
	}
	
	public void clickSAVEbutton()
	{
		savebutton.click();
	}
	
	public void successfull()
	{
		successfulladd.getText();
		
	}
	
	
}
