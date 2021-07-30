package viacom_002.TestCases;





import org.junit.Assert;
import org.testng.annotations.Test;

import viacom_001.POM.ViacomHomePage;
import viacom_001.POM.ViacomSearchPage;
import viacom_001.POM.Viacome_AddtoCart;


public class TC_veiacom_001 extends BaseClass
{
	@Test
	public void viacomHome() throws Exception {
	
		ViacomHomePage link=new ViacomHomePage(driver);
link.searchbarmehod(name);

link.searchbuttonmethod();

link.SortbyListMethod();
if(driver.getTitle().contains("Snapdeal.com")) {
	Assert.assertTrue(true);
	System.out.println("home page pass");
}
else {
	Assert.assertTrue(false);
	System.out.println("home page fail");
}
	
ViacomSearchPage choice=new ViacomSearchPage(driver);
choice.VeacomSearchpageMethod();
Viacome_AddtoCart Add=new Viacome_AddtoCart(driver);
Add.CartButton();

}
	}	


