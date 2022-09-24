package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.utilities.utilities.utilities.Driver;

public class US_001 {

    public US_001() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]")
    public WebElement giyimAksesuarSecenegi;

    @FindBy (xpath = "//a[@data-value='1565']")
    public WebElement kadinIcGiyimSecenegi;

    @FindBy (xpath = "//a[@data-value='1567']")
    public WebElement dizaltiCorapSecenegi;

    @FindBy (xpath = "//h3[@class='name'][1]")
    public WebElement siyahYazisi;

    @FindBy (xpath = "//span[@class='hidden-mobile'][1]")
    public WebElement adetEkleSecenegi;

    @FindBy (xpath = "//button[@data-pk='18864']")
    public WebElement   sepeteEkleSecenegi;

    @FindBy (xpath = "//a[@class='go-to-shop']")
    public WebElement sepetiGoruntuleSecenegi;

    @FindBy (xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnaylaSecenegi;

    @FindBy (xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEtSecenegi;

    @FindBy (xpath = "//input[@name='user_email']")
    public WebElement eMailtextBox;

    @FindBy (xpath = "//button[@class='button block green']")
    public WebElement devamEtSecenegi;

    @FindBy (xpath = "//a[@title='Yeni adres oluştur'][1]")
    public WebElement yeniAdresOlusturSecenegi;

    @FindBy (xpath = "//input[@name='title']")
    public WebElement adresBasligiTextBox;

    @FindBy (xpath = "//input[@name='first_name']")
    public WebElement adTextBox;

    @FindBy (xpath = "//input[@name='last_name']//input[@name='last_name']")
    public WebElement soyadTextBox;

    @FindBy (xpath = "//input[@name='phone_number']")
    public WebElement cepTelefonuTextBox;


    @FindBy (xpath = "//select[@type='text'][1]")
    public WebElement ilDropdown;

    @FindBy (xpath = "//select[@name='township']")
    public WebElement ilceDropdown;

    @FindBy (xpath = "//select[@name='district']")
    public WebElement mahalleDropdown;

    @FindBy (xpath = "//textarea[@name='line']")
    public WebElement adresTextBox;

    @FindBy (xpath = "//input[@type='text'][2]")
    public WebElement postaKoduTextBox;

    @FindBy (xpath = "//button[@type='button'][1]")
    public WebElement kaydetSecenegi;

     @FindBy (xpath = "//label[@class='js-checkout-cargo-item'][1]")
     public WebElement kargoRadioButonu;

     @FindBy (xpath = "//button[@type='submit'][1]")
     public WebElement kaydetVeDevamEtSecenegi;



}
