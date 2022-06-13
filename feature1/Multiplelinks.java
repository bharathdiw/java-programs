package seleniumnew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplelinks {

	public static void main(String[] args) throws AWTException, Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	String mainwindow = driver.getWindowHandle();
			System.out.println(mainwindow);
	driver.manage().window().maximize();
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	for (WebElement link : alllinks) {
		if(link.isDisplayed())
		{
			Actions action = new Actions(driver);
			action.contextClick(link).build().perform();
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			Set<String>allwindows = driver.getWindowHandles();
			for (String win : allwindows) {
				if(!win.equals(mainwindow))
				{
					driver.switchTo().window(win);
					Thread.sleep(3000);
					driver.close();
				}
			}
			Thread.sleep(3000);
			driver.switchTo().window(mainwindow);
		}
	}
	

	}

}
