package PagesScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhoseScooterPageScooter {
    private  WebDriver driver;
    //конструктор класса
    public WhoseScooterPageScooter(WebDriver driver){
        this.driver = driver;
    }
    //Поле Имя
    By firstNameField = By.xpath(".//input[@placeholder='* Имя']");
    //Поле Фамилия
    By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле Адрес
    By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле Станция метро
    By metroField = By.xpath(".//input[@placeholder='* Станция метро']");
    //Поле Телефон
    By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка Далее
    By nextButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    // Станция метро Бульвар Рокоссовского
    By firstStation = By.xpath(".//button[@value='1']");
    //Станция метро Черкизовская
    By secondStation = By.xpath(".//button[@value='2']");

    //Метод вводит данные в поле Имя
    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    //Метод вводит данные в поле Фамилия
    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    //Метод вводит данные в поле Адрес
    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    //Метод производит нажатие на поле Станция метро
    public void metroFieldClick() {
        driver.findElement(metroField).click();
    }
    //Метод выбирает станцию метро Бульвар Рокоссовского
    public void firstStationClick() {
        driver.findElement(firstStation).click();
    }
    //Метод выбирает станцию метро Черкизовская
    public void secondStationClick() {
        driver.findElement(secondStation).click();
    }
    //Метод вводит данные в поле Телефон
    public void setPhoneNumberField(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }
    //Метод нажимает кнопку Далее
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
    //Метод заполняет форму Для кого самокат
    public void whoseScooterForm(String firstName, String lastName, String address, String phoneNumber) {
        setFirstNameField(firstName);
        setLastNameField(lastName);
        setAddressField(address);
        setPhoneNumberField(phoneNumber);
        clickNextButton();
    }
    public void firstFieldMetroLoad() {
        metroFieldClick();
        firstStationClick();
    }
    public void secondFieldMetroLoad() {
        metroFieldClick();
        secondStationClick();
    }
}
