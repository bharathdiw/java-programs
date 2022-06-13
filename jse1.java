package seleniumnew;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse1 {

	public static void main(String[] args) throws InterruptedException {
		ConfigFileReader configFileReader = new ConfigFileReader();
		
		String driverPath = configFileReader.getDriverPath();
		String urlPath = configFileReader.getURL();
		
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = null;
		try {
			driver = OpenBrowser.start(BrowserNames.CHROME, urlPath);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		//driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String mainwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement srinu = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border= '9px solid red'", srinu);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", srinu);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		String ajay = js.executeScript("return document.title;").toString();
		System.out.println(ajay);
		WebElement srinu1 = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[5]/div/span"));
		String color = "#000000";
		String color1 = srinu1.getCssValue("backgroundColor");
	    js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", srinu1);
	    Thread.sleep(3000);
	    js.executeScript("arguments[0].style.backgroundColor = '" + color1 + "'", srinu1);
	    Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", srinu1);
		js.executeScript("arguments[0].style.border= '9px solid yellow'", srinu1);
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,360)");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom = '50%'");
		String pofficer3 = "bharath";
		
		js.executeScript("alert('" + pofficer3 + "')");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
