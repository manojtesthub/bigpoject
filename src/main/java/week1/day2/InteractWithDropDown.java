package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractWithDropDown {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement job = driver.findElementById("job_role");
		Select dropdown = new Select(job);
	//	dropdown.selectByIndex(2);
	//	dropdown.selectByVisibleText("Business Manager/Executive");
		
		List <WebElement> options = dropdown.getOptions();
		for(WebElement option : options){
			System.out.println("All values" + option.getText());
		}
		dropdown.selectByIndex(options.size()-1);

		
		
	}

}
