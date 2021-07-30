package viacom_001.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viacome_AddtoCart {
	public WebDriver driver;
	@FindBy(xpath="//span[.='add to cart']")
	private WebElement addtocartbutton;
	public Viacome_AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver ,this);
			this.driver=driver;
	}
	
	public void CartButton() throws InterruptedException {
		Thread.sleep(5000);
		addtocartbutton.click();
	}

}
