package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;

public class HMCScenarioOutline_StepDefs {

    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

    @Then("username olarak {string} girer.")
    public void username_olarak_girer(String string) {
        hotelMyCampPage.username.sendKeys(string);
    }
    @Then("password olarak {string} girer.")
    public void password_olarak_girer(String string) {
        hotelMyCampPage.password.sendKeys(string);
    }

}
