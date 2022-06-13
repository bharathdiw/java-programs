package seleniumnew;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement searc = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value = 'mi romba '", searc);
	for (int i = 0; i < 4; i++) {
		searc.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		
	} 
	searc.click();
	Thread.sleep(3000);
	driver.close();
	
		
	
	
	
}
}