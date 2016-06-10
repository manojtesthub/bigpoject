package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement security = driver.findElementById("userRegistrationForm:securityQ");
		Select sec = new Select(security);
	//	sec.selectByIndex(3);
	//	dropdown.selectByVisibleText("Business Manager/Executive");
		
		List <WebElement> option = sec.getOptions();
		for(WebElement values : option){
			System.out.println("All values" + values.getText());
		}
		sec.selectByIndex(option.size()-1);

		
		
	}




	}

