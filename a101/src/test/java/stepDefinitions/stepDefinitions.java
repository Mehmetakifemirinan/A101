package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_001;
import utilities.utilities.ConfigReader;
import utilities.utilities.ReusableMethods;

import java.sql.Driver;

public class stepDefinitions {
    US_001 A101Page = new US_001();
    Actions actions = new Actions(Driver.getDriver());
    WebElement il= A101Page.ilDropdown;
    WebElement ilce= A101Page.ilceDropdown;
    JavascriptExecutor jse =(JavascriptExecutor) Driver.getDriver();
    Select select;

    @Given("Kullanici {string} anasayfasina giris yapar")
    public void kullanici_anasayfasina_giris_yapar(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
    }

    @Then("Kullanici Giyim&Aksesuar secenegine tiklar")
    public void kullanici_giyim_aksesuar_secenegine_tiklar() {

        A101Page.giyimAksesuarSecenegi.click();
    }

    @Then("Kullanici kadin ic giyim secenegine tiklar")
    public void kullanici_kadin_ic_giyim_secenegine_tiklar() {

        A101Page.kadinIcGiyimSecenegi.click();
    }

    @When("Kullanici dizalti corap secenegine tiklar")
    public void kullanici_dizalti_corap_secenegine_tiklar() {

        A101Page.dizaltiCorapSecenegi.click();
    }

    @When("Kullanici acilan urunun siyah oldugunu dogrular")
    public void kullanici_acilan_urunun_siyah_oldugunu_dogrular() {

        Assert.assertTrue(A101Page.siyahYazisi.isDisplayed());
    }

    @When("Kullanici urun adedini secer ve adet ekle secenegine tiklar")
    public void kullanici_urun_adedini_secer_ve_adet_ekle_secenegine_tiklar() {

        A101Page.adetEkleSecenegi.click();
    }

    @When("Kullanici sepete ekle secenegine tiklar")
    public void kullanici_sepete_ekle_secenegine_tiklar() {

        A101Page.sepeteEkleSecenegi.click();
    }

    @When("Kullanici sepeti goruntule secenegine tiklar")
    public void kullanici_sepeti_goruntule_secenegine_tiklar() {

        A101Page.sepetiGoruntuleSecenegi.click();
    }

    @When("Kullanici sepeti onayla secenegine tiklar")
    public void kullanici_sepeti_onayla_secenegine_tiklar() {

        A101Page.sepetiOnaylaSecenegi.click();
    }

    @When("Kullanici uye olmadan devam et secenegine tiklar")
    public void kullanici_uye_olmadan_devam_et_secenegine_tiklar() {

        A101Page.uyeOlmadanDevamEtSecenegi.click();
    }

    @When("Kullanici mail bilgisini girer ve devam secenegine tiklar")
    public void kullanici_mail_bilgisini_girer_ve_devam_secenegine_tiklar() {

        A101Page.eMailtextBox.sendKeys("salihemir407@gmail.com");
        A101Page.devamEtSecenegi.click();
    }

    @When("Kullanici Adres olustur secenegine tiklar ve texboxlari doldurur")
    public void kullanici_adres_olustur_secenegine_tiklar_ve_texboxlari_doldurur() throws InterruptedException {

        A101Page.yeniAdresOlusturSecenegi.click();
        A101Page.adresBasligiTextBox.sendKeys("ev");
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        A101Page.adTextBox.sendKeys("Mehmet");
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        A101Page.soyadTextBox.sendKeys("inan");
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        A101Page.cepTelefonuTextBox.sendKeys("05526426316");
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        A101Page.ilDropdown.click();
        ReusableMethods.waitFor(3);
        //Driver.waitForVisibility(il, 5);
        Select select1 = new Select(il);
        Thread.sleep(3000);
        select1.selectByValue("ADANA");
        actions.sendKeys(Keys.TAB).perform();
        A101Page.ilceDropdown.click();
        ReusableMethods.waitFor(3);
        //Driver.waitForVisibility(ilce, 5);
        Select select2 = new Select(ilce);
        Thread.sleep(3000);
        select2.selectByValue("KOZAN");
        actions.sendKeys(Keys.TAB).perform();
        A101Page.mahalleDropdown.click();
        ReusableMethods.waitFor(3);
        //Driver.waitForVisibility(ilce, 5);
        Select select3 = new Select(ilce);
        Thread.sleep(3000);
        select3.selectByValue("CUMHURIYET MAH");
        actions.sendKeys(Keys.TAB).perform();
        A101Page.adresTextBox.click();
        A101Page.adresBasligiTextBox.sendKeys("cumhuriyet mah 2 sokak no 5");
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        A101Page.postaKoduTextBox.click();
        A101Page.adresBasligiTextBox.sendKeys("01500");
        ReusableMethods.waitFor(3);

    }

    @When("Kullanici kaydet secenegini tiklar")
    public void kullanici_kaydet_secenegini_tiklar() {

        A101Page.kaydetSecenegi.click();
    }

    @When("Kullanici istedigi kargo firmasini secer kaydet ve devam et secenegine tiklar")
    public void kullanici_istedigi_kargo_firmasini_secer_kaydet_ve_devam_et_secenegine_tiklar() {

        A101Page.kargoRadioButonu.click();
        A101Page.kaydetVeDevamEtSecenegi.click();
    }

}
