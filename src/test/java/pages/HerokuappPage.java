package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {

    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    public WebElement addElementButton;

    @FindBy(xpath = "//*[@id=\"elements\"]/button")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@id=\"elements\"]")
    public WebElement deleteText;

}
