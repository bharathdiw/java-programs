package seleniumnew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateprogram {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUxNDg2MjYwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    WebElement srinu =	driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    srinu.sendKeys("yalamarthybharath@gmail.com");
	    Thread.sleep(3000);
	/*	JavascriptExecutor bharath = (JavascriptExecutor)driver;
		bharath.executeScript("arguments[0].value = 'LiveTech s'", srinu);*/
	   /* Robot robo = new Robot();
	    robo.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    robo.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    robo.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    
	    robo.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    robo.keyPress(KeyEvent.VK_ENTER);*/
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("saty@777");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
        
	}

}
