package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigurationReader;


public class HotelMyCampTests_StepDefs {

    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

    @Then("Login linkine tıklar")
    public void login_linkine_tıklar() {
        hotelMyCampPage.logInButton.click();
    }
    @Then("Username olarak {string} girer.")
    public void username_olarak_girer(String string) {
        hotelMyCampPage.username.sendKeys(ConfigurationReader.getProperty(string));
    }
    @Then("Password olarak {string} girer.")
    public void password_olarak_girer(String string) {
        hotelMyCampPage.password.sendKeys(ConfigurationReader.getProperty(string));
    }
    @Then("Login butonuna tıklar.")
    public void login_butonuna_tıklar() {
        hotelMyCampPage.btnSubmit.click();
    }
    @Then("Basarili olarak giris yaptigini test eder.")
    public void basarili_olarak_giris_yaptigini_test_eder() {
        Assert.assertTrue(hotelMyCampPage.listOfUsers.isDisplayed());
    }

    @And("Giris yapma isleminin basarisiz oldugunu test eder.")
    public void girisYapmaIslemininBasarisizOldugunuTestEder() {
        Assert.assertTrue(hotelMyCampPage.wrongDataText.isDisplayed());
    }
}
