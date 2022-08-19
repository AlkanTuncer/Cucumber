package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;



public class WebUniversity_StepDefs {

    WebUniversityPage webUniversityPage = new WebUniversityPage();

    @Then("Login Portal elementine kadar asagi iner ve elemente tiklar.")
    public void login_portal_elementine_kadar_asagi_iner_ve_elemente_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(webUniversityPage.webUniversityLoginPortal).perform();
        webUniversityPage.webUniversityLoginPortal.click();
    }

    @Then("Diger windowa gecer")
    public void diger_windowa_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }

    @Then("{string} ve {string} kutularina deger yazar")
    public void ve_kutularina_deger_yazar(String username, String password) {
        webUniversityPage.webUniversityUserNameButton.sendKeys(username);
        webUniversityPage.webUniversityPasswordButton.sendKeys(password);
    }

    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
        webUniversityPage.webUniversityLoginButton.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String string) {
        String popText = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(popText,string);
    }

    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }

    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        String mainPageTitle = "WebDriverUniversity.com";
        Assert.assertEquals(Driver.getDriver().getTitle(),mainPageTitle);
    }

}
