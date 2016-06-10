package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*for(WebElement allLinks  : driver.findElementsByTagName("a"){
			System.out.println("Total links:" +allLinks.size());
			System.out.println("Total links:" +allLinks.size());
		*/
		List <WebElement> allLinks = driver.findElementsByTagName("a");
		System.out.println("Total links:" +allLinks.size());
		
		int i = 0;
		for(WebElement links  : allLinks){
			
			System.out.println(links.getText());
			
			if(links.getText().contains("a")){
			    i = i + 1;
				
			}	
			
			
		   // System.out.println(links.isDisplayed());
		
    //if(links.getText().contains("a") ||links.getText().contains("A")){
	//	}
		// for (int i = 0; i < 10; i++) {
		 //}
		 }
		System.out.println(i);
		
		
	}
}

