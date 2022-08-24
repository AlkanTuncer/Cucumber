package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11;
import utilities.Driver;
import utilities.ReusableMethods;

public class N11_StepDefs {

    N11 n11Page = new N11();

    @Given("Kullanici ana sayfayi dogrular")
    public void kullanici_ana_sayfayi_dogrular() {
        n11Page.anaPop.click();
        Assert.assertTrue(Driver.getDriver().getTitle().equals("n11 - Hayat Sana Gelir"));
    }

    @Then("Kullanici giriş yap butonuna basar")
    public void kullanici_giriş_yap_butonuna_basar() {
        n11Page.girisYapButonu.click();
    }

    @Then("Email kısmına {string} password kısmına {string} girer")
    public void email_kısmına_password_kısmına_girer(String string, String string2) {
        n11Page.emailPlace.sendKeys(string);
        n11Page.passwordPlace.sendKeys(string2);
        n11Page.loginButton.click();
    }

    @Then("Login işlemi kontrol edilir")
    public void login_işlemi_kontrol_edilir() {
        Assert.assertTrue(n11Page.hesabim.isDisplayed());
    }

    @Then("Arama kismina Iphone yazilir")
    public void arama_kismina_iphone_yazilir() {
        n11Page.searchBox.sendKeys("Iphone", Keys.ENTER);
    }

    @Then("Iphone kelimesinin aratildigi kontrol edilir")
    public void iphone_kelimesinin_aratildigi_kontrol_edilir() {
        Assert.assertTrue(n11Page.resultText.getText().contains("Iphone"));
    }

    @When("Arama sonuclari sayfalarindan ikinci sayfaya gidilir")
    public void arama_sonuclari_sayfalarindan_ikinci_sayfaya_gidilir() {
        n11Page.page2.click();
    }

    @When("Ikinci sayfada olundugu kontrol edilir")
    public void ikinci_sayfada_olundugu_kontrol_edilir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Sayfa 2"));
    }

    @Then("Sayfadaki ücüncü ürün favorilere eklenir")
    public void sayfadaki_ücüncü_ürün_favorilere_eklenir() {
        n11Page.page2Product3AddFavorites.click();
    }

    @Then("Hesabımdan istek listem favorilerim sayfasina gidilir")
    public void hesabımdan_istek_listem_favorilerim_sayfasina_gidilir() {
        ReusableMethods.hover(n11Page.hesabim);
        n11Page.favorilerimListelerim.click();
        n11Page.favorilerim.click();
    }

    @Then("Favorilerim sayfasinin acildiği kontrol edilir")
    public void favorilerim_sayfasinin_acildiği_kontrol_edilir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Favorilerim"));
    }

    @Then("Eklenen urun favorilerden silinir ve silme islemi kontrol edilir")
    public void eklenen_urun_favorilerden_silinir_ve_silme_islemi_kontrol_edilir() {
        n11Page.deleteProduct.click();
        Assert.assertTrue(n11Page.deleteResult.isDisplayed());
        n11Page.deleteResultAccept.click();
    }

    @Then("Uye cikis islemi yapılır.")
    public void uye_cikis_islemi_yapılır() {
        ReusableMethods.hover(n11Page.hesabim);
        n11Page.cikisYapButton.click();
    }


}
