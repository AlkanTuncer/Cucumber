package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonSearchTest_StepDefs {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanıcı amazon sayfasına gider")
    public void kullanıcı_amazon_sayfasına_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonURL"));
    }
    @Given("Iphone için arama yapar")
    public void iphone_için_arama_yapar() {
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }
    @Then("Sonucların iphone içerdiğini test eder")
    public void sonucların_iphone_içerdiğini_test_eder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("iphone"));
    }
    @Given("Tea pot için arama yapar")
    public void tea_pot_için_arama_yapar() {
        amazonPage.searchBox.sendKeys("tea pot",Keys.ENTER);

    }
    @Then("Sonucların tea pot içerdiğini test eder")
    public void sonucların_tea_pot_içerdiğini_test_eder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("tea pot"));
    }
    @Given("Flower için arama yapar")
    public void flower_için_arama_yapar() {
        amazonPage.searchBox.sendKeys("flower",Keys.ENTER);
    }
    @Then("Sonucların flower içerdiğini test eder")
    public void sonucların_flower_içerdiğini_test_eder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("flower"));
    }


}
