package week7.day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("http://my.naukri.com/manager/createacc2.php?&othersrcp=7304&wExp=N&gclid=CjwKEAiAmY-3BRDh7pjvg46p1iYSJADQ78gNKinI8UQq81_b394vuaJHgRSuZFAljcR667JrhsxmBhoCMz_w_wcB");
		driver.findElement(By.xpath("//button[@class='action-btn fresh']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='uploadCV']")).click();

		Thread.sleep(5000);
		StringSelection stringSelect = new StringSelection("c:\\Draggable.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard()
		.setContents(stringSelect, null);
		
		//Paste using Robot class
		
		Robot robot = new Robot();
		
		// Enter to confirm it is uploaded
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
	
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
