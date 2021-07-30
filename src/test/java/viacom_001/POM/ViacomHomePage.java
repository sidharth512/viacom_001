package viacom_001.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViacomHomePage {
	 WebDriver driver;
	@FindBy(id="inputValEnter")
	private WebElement searchBar;
   @FindBy(xpath="//span[@class=\"searchTextSpan\"]")
   private  WebElement searchButton;
	@FindBy(xpath="//span[.='Sort by:']")
	private WebElement SortbyList;
	@FindBy (xpath="(//li[@class=\"search-li\"])")
	private List<WebElement> SortdropListbar;
	public ViacomHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void searchbarmehod(String name)
	 {
		searchBar.sendKeys(name);
	 }
	public void searchbuttonmethod() {
		searchButton.click();
	}
	public void SortbyListMethod() {
		SortbyList.click();
		for(int i=0;i<SortdropListbar.size();i++) {
			if(SortdropListbar.get(i).getText().contains("Price Low To High")){
				
				SortdropListbar.get(i).click();
		
			break;
			}
	

}
	}
}
