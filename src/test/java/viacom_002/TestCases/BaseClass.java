package viacom_002.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import viacom_001.utility.Readconfig;

public class BaseClass {
	Readconfig read=new Readconfig();
	public String baseURL=read.geturl();
	public String name=read.searchObject();
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		if (browser.contains("chrome")){
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver","./Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void Runurl() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
}
