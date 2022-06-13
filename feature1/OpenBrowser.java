package seleniumnew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenBrowser {

	static WebDriver driver = null;

	public static WebDriver start(String myBrowser, String urlPath) throws MalformedURLException {
        
		
		ChromeOptions options = new ChromeOptions();

		DesiredCapabilities caps = new DesiredCapabilities();

		if ((myBrowser.equalsIgnoreCase(BrowserNames.CHROME))) {
			caps.setBrowserName(myBrowser);

			options.addArguments(BrowserArguments.DISABLE_DEV_SHM);
			caps.setPlatform(Platform.WIN10);
			options.merge(caps);
			driver = new ChromeDriver();
			driver.get(urlPath);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.FIREFOX))) {
			caps.setBrowserName(myBrowser);
			caps.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL(urlPath), caps);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.MICROSOFT_EDGE))) {
			caps.setBrowserName(myBrowser);
			caps.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL(urlPath), caps);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.IPHONE_6))) {
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			Map<String, String> deviceMobEmu = new HashMap<>();
			deviceMobEmu.put("deviceName", myBrowser);

			options.setExperimentalOption("mobileEmulation", deviceMobEmu);
			Dimension d = new Dimension(375, 667);
			options.merge(caps);
			String nodeUrl = urlPath;
			driver = new RemoteWebDriver(new URL(nodeUrl), options);
			driver.manage().window().setSize(d);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.IPHONE_6_PLUS))) {
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			Map<String, String> deviceMobEmu = new HashMap<>();
			deviceMobEmu.put("deviceName", myBrowser);

			options.setExperimentalOption("mobileEmulation", deviceMobEmu);
			Dimension d = new Dimension(414, 736);
			options.merge(caps);
			String nodeUrl = urlPath;
			driver = new RemoteWebDriver(new URL(nodeUrl), options);
			driver.manage().window().setSize(d);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.IPHONE_7))) {
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			Map<String, String> deviceMobEmu = new HashMap<>();
			deviceMobEmu.put("deviceName", myBrowser);

			options.setExperimentalOption("mobileEmulation", deviceMobEmu);
			Dimension d = new Dimension(375, 667);
			options.merge(caps);
			String nodeUrl = urlPath;
			driver = new RemoteWebDriver(new URL(nodeUrl), options);
			driver.manage().window().setSize(d);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.IPHONE_7_PLUS))) {
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			Map<String, String> deviceMobEmu = new HashMap<>();
			deviceMobEmu.put("deviceName", myBrowser);

			options.setExperimentalOption("mobileEmulation", deviceMobEmu);
			Dimension d = new Dimension(414, 736);
			options.merge(caps);
			String nodeUrl = urlPath;
			driver = new RemoteWebDriver(new URL(nodeUrl), options);
			driver.manage().window().setSize(d);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.IPHONE_8))) {
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			Map<String, String> deviceMobEmu = new HashMap<>();
			deviceMobEmu.put("deviceName", myBrowser);

			options.setExperimentalOption("mobileEmulation", deviceMobEmu);
			Dimension d = new Dimension(375, 667);
			options.merge(caps);
			String nodeUrl = urlPath;
			driver = new RemoteWebDriver(new URL(nodeUrl), options);
			driver.manage().window().setSize(d);
		}

		if ((myBrowser.equalsIgnoreCase(BrowserNames.IPHONE_8_PLUS))) {
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			Map<String, String> deviceMobEmu = new HashMap<>();
			deviceMobEmu.put("deviceName", myBrowser);

			options.setExperimentalOption("mobileEmulation", deviceMobEmu);
			Dimension d = new Dimension(414, 736);
			options.merge(caps);
			String nodeUrl = urlPath;
			driver = new RemoteWebDriver(new URL(nodeUrl), options);
			driver.manage().window().setSize(d);
		}

	

		return driver;
	}

}
