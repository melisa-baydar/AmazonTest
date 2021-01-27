package Pages;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import io.cucumber.java.en.When;

public class LoginPageAmazon {

	protected WebDriver driver;

	private By txt_Kategori = By.id("nav-search-dropdown-card");
	private By txt_Listele = By.id("searchDropdownDescription");
	private By txt_ÜrünAra = By.id("twotabsearchtextbox");
	private By txt_AraButton = By.id("nav-search-submit-button");
	private By txt_Popupkapat = By.id("sp-cc-accept");
	private By txt_SayfaSec = By.className("a-last");
	private By txt_UrunSec = By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(3) > h2 > a");
	private By txt_SepeteEkle = By.id("add-to-cart-button");
	private By txt_SepeteGit = By.id("nav-cart-count");
	private By txt_SepettenSil = By.className("a-color-link");
	

	public LoginPageAmazon(WebDriver driver) {

		this.driver = driver;
		if (!driver.getTitle().equals("Amazon.com.tr")) {

		}
	}

	//public void Uye_giris_yapilir() {
	//	driver.findElement(By.id("nav-link-accountList")).click();
	//}

	//public void mail_sifre_girilir() {
	//	driver.findElement(By.id("ap_email")).sendKeys( "..............");
	//	driver.findElement(By.id("continue")).click();
	//	driver.findElement(By.id("ap_password")).sendKeys(".............");
	//	driver.findElement(By.id("signInSubmit")).click();
	//}

	public void kategorilere_tiklanir() {
		driver.findElement(txt_Kategori).click();
	}

	public void bilgisayar_secilir() {
		List<WebElement> elements = driver.findElements(txt_Listele);
		boolean check = true;
		for (WebElement element : elements) {
			if (element.getText().equals("Bilgisayarlar")) {
				element.click();
				check = true;
				break;
			}
		}
		assertTrue( "Element Bulunamadý",check);
	}

	public void arama_msi_yazilir() {
		driver.findElement(txt_ÜrünAra).sendKeys("msi");
	}
	
	public void arama_yapilir() {
		driver.findElement(txt_AraButton).click();
	}

	public void Cerezler_kapatilir() {
		driver.findElement(txt_Popupkapat).click();
	}

	public void sayfa_secilir() {
		driver.findElement(txt_SayfaSec).click();
		List<WebElement> elements = driver.findElements(txt_SayfaSec);
		boolean check = true;
		for (WebElement element : elements) {
			if (element.getText().equals("2")) {
				element.click();
				check = true;
				break;
			}
		}
		assertTrue( "Element Bulunamadý",check);
	}

	public void urun_secilir() {
		driver.findElement(txt_UrunSec).click();
	}

	public void urun_sepete_eklenir() {
		driver.findElement(txt_SepeteEkle).click();
	}

	public void sepete_gidilir() {

		driver.findElement(txt_SepeteGit).click();
	}

	public void eklenen_urun_sepetten_silinir() {
		driver.findElement(txt_SepettenSil).click();
	}
	public void cikis_yapilir(){
		driver.close();
	}
	

	
	//public void uye_cikis_islemi_yapilir() {
		//driver.findElement(by)		
	//}

}
