package viacom_001.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViacomSearchPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@class=\"dp-widget-link\"]")
	private List<WebElement> mobilesection;
	
	public ViacomSearchPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void VeacomSearchpageMethod() throws InterruptedException {
	Thread.sleep(5000);
		int pace= mobilesection.size();
		for(int i=0;i<= mobilesection.size();i++) {
			
			mobilesection.get(1).click();
			break;
				
			}
			
		
					
				}
			}
		
		
		
		


