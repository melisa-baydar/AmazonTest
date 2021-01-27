package StepDefinitions;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.LoginPageAmazon;
import io.cucumber.java.en.When;

public class LoginAmazonSteps {
		 	
	WebDriver driver;
	WebElement element;
  final static Logger logger = Logger.getLogger(LoginAmazonSteps.class);

	
	@When("Tarayiciya baglanilir")
	public void tarayiciya_baglanilir() {
			
		logger.info("Test baþlatýldý.");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@When("Siteye login yapilir")
	public void siteye_login_yapilir() {

		LoginPageAmazon login = new LoginPageAmazon(driver);
		driver.get("https://amazon.com.tr/");
		Assert.assertEquals(driver.getCurrentUrl(),"https://amazon.com.tr/");
		logger.info("Test Edilecek Sayfa : " + driver.getTitle());
		if (driver.getCurrentUrl().contains("https://www.amazon.com")) {
			System.out.println("Amazon ana sayfasina gidildi");
		} else {
			throw new WebDriverException("ilgili sayfaya acilamadi");
			
		}
		
	}

	// @When("Uye giris yapilir")
	// public void Uye_giris_yapilir(){
	// LoginPageAmazon Login = new LoginPageAmazon(driver);
	// Login.Uye_giris_yapilir();

	// }

	// @When( "mail sifre girilir")
	// public void mail_sifre_girilir(){
	// LoginPageAmazon Login = new LoginPageAmazon(driver);
	// Login.mail_sifre_girilir();

	// }

	@When("Kategorilere tiklanir")
	public void kategorilere_tiklanir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.kategorilere_tiklanir();
		logger.info("Kategorilere týklandý");
	}

	@When("Bilgisayar Secilir")
	public void bilgisayar_secilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.bilgisayar_secilir();
		logger.info("Bilgisayar seçeneðine týklandý");
	}

	@When("Arama msi yazilir")
	public void arama_msi_yazilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.arama_msi_yazilir();
		if (driver.getCurrentUrl().contains("msi") || driver.getCurrentUrl().contains("msi")) {
			System.out.println("Ýstenilen arama hakkýnda sonuçlar bulundu");
			System.out.println("msi");
		} else {
			System.out.println("arama baþarýsýz oldu");
			System.out.println("-----------------------------");
			logger.info("aramaya msi yazýldý");
		}
	}

	@When("Arama yapilir")
	public void arama_yapilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.arama_yapilir();
		logger.info("arama butonuna týklandý");

	}

	@When("Cerezler kapatilir")
	public void Cerezler_kapatilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.Cerezler_kapatilir();
		logger.info(" popup kapatýldý");

	}

	@When("sayfa secilir")
	public void sayfa_secilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.sayfa_secilir();
		if (driver.getCurrentUrl().contains("page=2")) {
			System.out.println("2.sayfadayiz");
		} else {
			throw new WebDriverException("2. sayfada degilsiniz");			
		}
		logger.info("2.sayfa seçildi");

	}

	@When("Urun Secilir")
	public void urun_secilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.urun_secilir();
		logger.info("urun seçildi");
		
	}

	@When("urun sepete eklenir")
	public void urun_sepete_eklenir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.urun_sepete_eklenir();
		logger.info("urun sepete eklendi");

	}

	@When("sepete gidilir")
	public void sepete_gidilir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.sepete_gidilir();
		logger.info("sepete gidildi");

	}

	@When("Eklenen urun sepetten silinir")
	public void eklenen_urun_sepetten_silinir() {
		LoginPageAmazon Login = new LoginPageAmazon(driver);
		Login.eklenen_urun_sepetten_silinir();
		logger.info( "eklenen urun sepetten silindi");

	}
	

	//@When("Uye cikis islemi yapilir")
	//public void uye_cikis_islemi_yapilir() {
	//	LoginPageAmazon Login = new LoginPageAmazon(driver);
	//	Login.uye_cikis_islemi_yapilir();

	//}

	//@When("Cikis isleminin yapildigi kontrol edilir")
	//public void cikis_isleminin_yapildigi_kontrol_edilir() {
	//	LoginPageAmazon Login = new LoginPageAmazon(driver);

	//}
	
	 @When( "cikis yapilir")
	 public void cikis_yapilir(){
		 LoginPageAmazon Login = new LoginPageAmazon(driver);
		 Login.cikis_yapilir();
		 logger.info("Test tamamlandý.");
	 }
}


        