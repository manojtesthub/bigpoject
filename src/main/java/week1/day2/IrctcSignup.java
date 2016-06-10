package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("manojra15");
		driver.findElementById("userRegistrationForm:checkavail").click();
		//Thread.sleep(20);
		driver.findElementById("userRegistrationForm:password").sendKeys("trainRail1");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("trainRail1");
		
		WebElement security = driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown = new Select(security);
		dropdown.selectByIndex(2);
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("petit");

		//
		WebElement lang = driver.findElementById("userRegistrationForm:prelan");
		Select langdropdown = new Select(lang);
		langdropdown.selectByIndex(0);

		driver.findElementById("userRegistrationForm:firstName").sendKeys("manoj");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("kumar");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("puru");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		WebElement dob = driver.findElementById("userRegistrationForm:dobDay");
		Select dobdropdown = new Select(dob);
		dobdropdown.selectByVisibleText("15");

		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select monthdropdown = new Select(month);
		monthdropdown.selectByVisibleText("AUG");

		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yeardropdown = new Select(year);
		yeardropdown.selectByVisibleText("1986");
//
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occdropdown = new Select(occupation);
		occdropdown.selectByIndex(3);
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("562367");
		driver.findElementById("userRegistrationForm:idno").sendKeys("a2jsh34");
		driver.findElementById("userRegistrationForm:email").sendKeys("manoj@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("12345");
		
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select natdropdown = new Select(nationality);
		natdropdown.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("#5");
		driver.findElementById("userRegistrationForm:street").sendKeys("aiforceroad");
		driver.findElementById("userRegistrationForm:area").sendKeys("tambram");
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select condropdown = new Select(country);
		condropdown.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("605003", Keys.TAB);
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("tn");
		
		//driver.findElementById("userRegistrationForm:statesName").click();
		Thread.sleep(1000);
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select citydropdown = new Select(city);
		
		
		citydropdown.selectByIndex(1);
	//	citydropdown.selectByVisibleText("Pondicherry");
	
		Thread.sleep(1000);	
		WebElement postoff = driver.findElementById("userRegistrationForm:postofficeName");
		Select postdropdown = new Select(postoff);
		postdropdown.selectByIndex(1);
	//	postdropdown.selectByVisibleText("Muthialpet S.O");
				
		driver.findElementById("userRegistrationForm:landline").sendKeys("0442323487");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		
		
		
		
		
		
		
		
		
	}

}
