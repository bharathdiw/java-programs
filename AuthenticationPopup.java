package seleniumnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "C:\\selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//https://the-internet.herokuapp.com/basic_auth
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

}
