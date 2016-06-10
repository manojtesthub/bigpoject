package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchNamesGoogle {

	public static void main(String[] args) {
		
/*Search in google with your name and 
print the names of links that has your name in either case 
and the length of the link (str.length()) is more than 20 characters*/
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("lst-ib").sendKeys("Manoj");
		driver.findElementByClassName("lsb").click();
		driver.navigate().refresh();
		List <WebElement> names = driver.findElementsByTagName("a");
		System.out.println("Total links: " +names.size());
		int i = 0;
		for(WebElement allnames : names){
			//System.out.println(allnames.getText());
			if(allnames.getText().contains("Manoj")|| allnames.getText().contains("manoj")){
				
				String str = allnames.getText();
				if(str.length()>24){
						System.out.println(allnames.getText());
				i = i+1;  
				}
			}
					
		}
		System.out.println(i);
		
	}
	
	
}