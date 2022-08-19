package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.EditorDataTablesPage;

public class EditorDataTables_StepDefs {

    EditorDataTablesPage editorDataTablesPage = new EditorDataTablesPage();

    @Given("New butonuna basar")
    public void newButonunaBasar(){
        editorDataTablesPage.newButton.click();
    }

    @Then("First name olarak {string} girer")
    public void firstNameOlarakGirer(String firstName){
        editorDataTablesPage.firstName.sendKeys(firstName);
    }

    @Then("Last name olarak {string} girer")
    public void lastNameOlarakGirer(String lastName){
        editorDataTablesPage.lastName.sendKeys(lastName);
    }

    @Then("Position olarak {string} girer")
    public void positionOlarakGirer(String position){
        editorDataTablesPage.position.sendKeys(position);
    }

    @Then("Office olarak {string} girer")
    public void officeOlarakGirer(String office){
        editorDataTablesPage.office.sendKeys(office);
    }

    @Then("Extension olarak {string} girer")
    public void extensionOlarakGirer(String extension){
        editorDataTablesPage.extension.sendKeys(extension);
    }

    @Then("Start date olarak {string} girer")
    public void startDateOlarakGirer(String startDate){
        editorDataTablesPage.startDate.sendKeys(startDate);
    }

    @Then("Salary olarak {string} girer")
    public void salaryOlarakGirer(String salary){
        editorDataTablesPage.salary.sendKeys(salary);
    }

    @Then("Kullanici Create butonuna basar")
    public void kullaniciCreateButonunaBasar(){
        editorDataTablesPage.createButton.click();
    }

    @Then("Kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String string){
        editorDataTablesPage.searchBoxElement.sendKeys(string);
    }

    @Then("First name bölümünde {string} oldugunu dogrular")
    public void firstNameBolumundeOldugunuDogrular(String string){
        Assert.assertTrue(editorDataTablesPage.aramasonucuElement.getText().contains(string));
    }

}
