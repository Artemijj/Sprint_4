package PagesScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageScooter {
    private  WebDriver driver;
    //конструктор класса
    public LandingPageScooter(WebDriver driver){
        this.driver = driver;
    }
    public String LANDING_URL = "https://qa-scooter.praktikum-services.ru/";
    //Кнопка Заказать в заголовке страницы
    By orderTop = By.className("Button_Button__ra12g");
    //Кнопка Заказать на 3 части страницы
    By orderBottom = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    //FAQ на 4 части страницы
    By faq = By.className("Home_FAQ__3uVm4");
    //Вопрос - Сколько это стоит? И как оплатить?
    By howMuch = By.id("accordion__heading-0");
    //Вопрос - Хочу сразу несколько самокатов! Так можно?
    By iWantMore = By.id("accordion__heading-1");
    //Ответ
    //Вопрос - Как рассчитывается время аренды?
    By rentTime = By.id("accordion__heading-2");
    //Ответ
    //Вопрос - Можно ли заказать самокат прямо на сегодня?
    By todayOrder = By.id("accordion__heading-3");
    //Ответ
    //Вопрос - Можно ли продлить заказ или вернуть самокат раньше?
    By returnEarlier = By.id("accordion__heading-4");
    //Ответ
    //Вопрос - Вы привозите зарядку вместе с самокатом?
    By charging = By.id("accordion__heading-5");
    //Ответ
    //Вопрос - Можно ли отменить заказ?
    By orderCancellation = By.id("accordion__heading-6");
    //Ответ
    //Вопрос - Я жизу за МКАДом, привезёте?
    By zamkadye = By.id("accordion__heading-7");
    //Ответ

    //Метод нажимает на вопрос - Сколько это стоит? И как оплатить?
    public void clickHowMuchQuestion() {
        driver.findElement(howMuch).click();
    }

    //Метод нажимает на вопрос - Хочу сразу несколько самокатов! Так можно?
    public void clickIWantMoreQuestion() {
        driver.findElement(iWantMore).click();
    }

    //Метод нажимает на вопрос - Как рассчитывается время аренды?
    public void clickRentTimeQuestion() {
        driver.findElement(rentTime).click();
    }

    //Метод нажимает на вопрос - Можно ли заказать самокат прямо на сегодня?
    public void clickTodayOrderQuestion() {
        driver.findElement(todayOrder).click();
    }

    //Метод нажимает на вопрос - Можно ли продлить заказ или вернуть самокат раньше?
    public void clickReturnEarlierQuestion() {
        driver.findElement(returnEarlier).click();
    }

    //Метод нажимает на вопрос - Вы привозите зарядку вместе с самокатом?
    public void clickChargingQuestion() {
        driver.findElement(charging).click();
    }

    //Метод нажимает на вопрос - Можно ли отменить заказ?
    public void clickOrderCancellationQuestion() {
        driver.findElement(orderCancellation).click();
    }

    //Метод нажимает на вопрос - Я жизу за МКАДом, привезёте?
    public void clickZamkadyeQuestion() {
        driver.findElement(zamkadye).click();
    }

    //Метод нажимает кнопку  Заказать в заголовке страницы
    public void clickTopButtonOrder() {
        driver.findElement(orderTop).click();
    }

    //Метод нажимает кнопку Заказать на 3 части страницы
    public void clickBottomButtonOrder() {
        driver.findElement(orderBottom).click();
    }
}
