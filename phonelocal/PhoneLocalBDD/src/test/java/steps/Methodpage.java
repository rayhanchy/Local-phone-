package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class Methodpage {
	
	public ChromeDriver driver;
	
	@Given("Launch browser and Load URL")
	public void launchBrowserAndLoadURL() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\PhoneLocalBDD\\Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.localphone.com/");
		
		
	}

	@Given("Click Log In link")
	public void clickLogInLink() {
		
		driver.findElementByLinkText("Log in").click();
	    
	}

	@Given("Enter email as rhchowdhury@hotmail.com")
	public void enterEmailAsRhchowdhuryHotmailCom() {
		
		driver.findElementById("userName").sendKeys("rhchowdhury@hotmail.com");
	    
	}

	@Given("Enter password rayhan{int}")
	public void enterPasswordRayhan(Integer int1) {
		
		driver.findElementById("password").sendKeys("rayhan73");
	    
	}

	@When("Click Login Button")
	public void clickLoginButton() {
		
		driver.findElementByXPath("//button[@class='standard']").click();
		
	    
	}

	@Then("Navigate to Local phone page")
	public void navigateToLocalPhonePage() {
		
		System.out.println(driver.getTitle());
	    
	}
					//Add new contact
	
	@Then("Click on Add Contact")
	public void clickOnAddContact() {
		
		driver.findElementByLinkText("Add contact").click();
	    
	}

	@Then("Enter Name")
	public void enterName() {
		
		driver.findElementById("contactDescription").sendKeys("YousufQA");
	    
	}

	@Then("Enter Country")
	public void enterCountry() {
		WebElement element = driver.findElementById("contactCountryCode");
		Select obj = new Select(element);
		obj.selectByVisibleText("Bangladesh");
		
	    
	}

	@Then("Enter Phone Number")
	public void enterPhoneNumber() {
		
		driver.findElementById("contactPhoneNumber").sendKeys("0660310021");
	    
	}

	@Then("Click on Add a new Contact Button")
	public void clickOnAddANewContactButton() {
		
		driver.findElementByXPath("//button[@class='standard']").click();
	   
	}
	
	/*@When("Get Data Chuto Bhai")
	public void get_Data_Chuto_Bhai() {
		
		driver.findElementByXPath("//span[text()='chuto bhai']").getText();
		System.out.println(driver);
	   
	}*/

	@Then("Click Edit")
	public void click_Edit() {
		driver.findElementByXPath("(//p[@class='edit'])[27]").click();
		
	   
	}

	@Then("Click Delete data")
	public void click_Delete_data() {
		
		driver.findElementByXPath("(//button[@class='standard'])[2]").click();
	    
	}
	
	
}
