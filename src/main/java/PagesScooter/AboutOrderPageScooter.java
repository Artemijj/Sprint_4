package PagesScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutOrderPageScooter {
    private WebDriver driver;
    //конструктор класса
    public AboutOrderPageScooter(WebDriver driver){
        this.driver = driver;
    }

    //Поле Когда привезти самокат
    By whenBring = By.xpath(".//div[@class ='react-datepicker__input-container']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Выбор даты 15.07.2022
    By fifteenthDate = By.xpath(".//div/div[text()='15']");
    //Выбор даты 21.07.2022
    By twentyFirstDate = By.xpath(".//div/div[text()='21']");
    //Поле срок аренды
    By timeRent = By.className("Dropdown-placeholder");
    //Выбор срока аренды Сутки
    By oneDayRent = By.xpath(".//div[text()='сутки']");
    //Выбор срока аренды Сутки
    By sevenDayRent = By.xpath(".//div[text()='семеро суток']");
    //Чекбокс Чёрный жемчуг
    By checkBoxBlack = By.id("black");
    //Чекбокс Серая безысходность
    By checkBoxGrey = By.id("grey");
    //Поле Комментарий для курьера
    By commentField = By.xpath(".//div[@class ='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Кнопка Заказать
    By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //Кнопка Да на всплывающем окне Хотите оформить заказ?
    By yesButton = By.xpath(".//button[text()='Да']");
    //Всплывающее окно Заказ оформлен
    By orderIsReady = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    //Метод делает нажатие на поле Когда привезти самокат
    public void clickWhenBring() {
        driver.findElement(whenBring).click();
    }
    //Метод выбирает дату 15.07.2022
    public void setFifteenthDate() {
        driver.findElement(fifteenthDate).click();
    }
    //Метод выбирает дату 21.07.2022
    public void setTwentyFirstDate() {
        driver.findElement(twentyFirstDate).click();
    }
    //Метод делает нажатие на поле Срок аренды
    public void clickTimeRent() {
        driver.findElement(timeRent).click();
    }
    //Метод выбирает срок аренды Сутки
    public void setOneDayRent() {
        driver.findElement(oneDayRent).click();
    }
    //Метод выбирает срок аренды Семеро суток
    public void setSevenDayRent() {
        driver.findElement(sevenDayRent).click();
    }
    //Метод выбирает Цвет самоката Чёрный жемчуг
    public void setCheckBoxBlack() {
        driver.findElement(checkBoxBlack).click();
    }
    //Метод выбирает Цвет самоката Серая безысходность
    public void setCheckBoxGrey() {
        driver.findElement(checkBoxGrey).click();
    }
    //Метод вводит комментарий
    public void setCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    //Метод нажимает кнопку Заказать
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }
    //Метод нажимает кнопку Да на всплывающем окне Хотите оформить заказ?
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }
    public String orderIsProcessed() {
        return driver.findElement(By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']")).getText();
    }
    public void firstFieldsAboutOrderLoad() {
        clickWhenBring();
        setFifteenthDate();
        clickTimeRent();
        setOneDayRent();
        setCheckBoxBlack();
    }
    public void secondFieldsAboutOrderLoad() {
        clickWhenBring();
        setTwentyFirstDate();
        clickTimeRent();
        setSevenDayRent();
        setCheckBoxGrey();
    }
}
