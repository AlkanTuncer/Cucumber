package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuappHomework_StepDefs {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("Kullanici verilen sayfaya gider")
    public void kullanici_verilen_sayfaya_gider() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @Then("Add Element butona basar")
    public void add_element_butona_basar() {
        herokuappPage.addElementButton.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButton,2);
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        String deleteText = herokuappPage.deleteText.getText();
        Assert.assertFalse(deleteText.contains("Delete"));
    }


}
