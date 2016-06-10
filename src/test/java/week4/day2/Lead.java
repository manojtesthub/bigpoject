package week4.day2;

import org.testng.annotations.Test;

import week4.day1.TestngAnnotations;

public class Lead extends TestngAnnotations{
  @Test
  public void launchBrowser (){
		launchbrowser("firefox" , "http://demo1.opentaps.org/opentaps/control/main");
		System.out.println("Launch successful");
	}
  }
