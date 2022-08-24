package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11 {

    public N11() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class=\"btn baseBtn-green\"]")
    public WebElement anaPop;

    @FindBy(xpath = "//button[@class=\"dn-slide-accept-btn\"]")
    public WebElement popUp;

    @FindBy(xpath = "//a[@class=\"btnSignIn\"]")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement emailPlace;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement passwordPlace;

    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@title=\"Hesabım\"]")
    public WebElement hesabim;

    @FindBy(xpath = "//input[@id=\"searchData\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class=\"resultText \"]")
    public WebElement resultText;

    @FindBy(xpath = "//*[text()=\"2\"]")
    public WebElement page2;

    @FindBy(xpath = "//*[@id=\"p-550814774\"]/div/a/div/span")
    public WebElement page2Product3AddFavorites;

    @FindBy(xpath = "//a[@title=\"Favorilerim / Listelerim\"]")
    public WebElement favorilerimListelerim;

    @FindBy(xpath = "//h4[@class=\"listItemTitle\"]")
    public WebElement favorilerim;

    @FindBy(xpath = "//span[@class=\"deleteProFromFavorites\"]")
    public WebElement deleteProduct;

    @FindBy(xpath = "//span[@class=\"message\"]")
    public WebElement deleteResult;

    @FindBy(xpath = "//span[@class=\"btn btnBlack confirm\"]")
    public WebElement deleteResultAccept;

    @FindBy(xpath = "//a[@class=\"logoutBtn\"]")
    public WebElement cikisYapButton;

}
