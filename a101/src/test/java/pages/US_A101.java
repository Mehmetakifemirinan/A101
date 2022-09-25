package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_A101 {

    public US_A101() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]")
    public WebElement giyimAksesuarSecenegi;

    @FindBy (xpath = "//a[@data-value='1565']")
    public WebElement kadinIcGiyimSecenegi;

    @FindBy (xpath = "//a[@data-value='1567']")
    public WebElement dizaltiCorapSecenegi;

    @FindBy (xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3")
    public WebElement siyahYazisi;

    @FindBy (xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/div[2]/div[2]/a/strong/span")
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

    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement soyadTextBox;

    @FindBy (xpath = "//input[@name='phone_number']")
    public WebElement cepTelefonuTextBox;


    @FindBy (xpath = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[5]")
    public WebElement ilDropdown;

    @FindBy (xpath = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[9]")
    public WebElement ilceDropdown;

    @FindBy (xpath = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select/option[20]")
    public WebElement mahalleDropdown;

    @FindBy (xpath = "//textarea[@name='line']")
    public WebElement adresTextBox;

    @FindBy (xpath = "//input[@type='text'][2]")
    public WebElement postaKoduTextBox;

    @FindBy (xpath = "//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/button[1]")
    public WebElement kaydetSecenegi;

     @FindBy (xpath = "/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li[2]/label/div[2]/span")
     public WebElement kargoRadioButonu;

     @FindBy (xpath = "/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button")
     public WebElement kaydetVeDevamEtSecenegi;



}
