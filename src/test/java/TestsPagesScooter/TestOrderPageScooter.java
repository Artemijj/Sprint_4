package TestsPagesScooter;

import PagesScooter.AboutOrderPageScooter;
import PagesScooter.LandingPageScooter;
import PagesScooter.WhoseScooterPageScooter;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.hamcrest.CoreMatchers.startsWith;

public class TestOrderPageScooter {
    private WebDriver driver;

    @Before
    public void initialize() {
        ChromeOptions options = new ChromeOptions(); //Драйвер для браузера
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.get(new LandingPageScooter(driver).LANDING_URL);
    }

    @Test
    public void testTopButtonOrderScooter() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        landingPageScooter.clickTopButtonOrder();
        // создать объект класса страницы заказа Для кого самокат
        WhoseScooterPageScooter whoseScooterPageScooter = new WhoseScooterPageScooter(driver);
        //Заполнить поля формы Для кого самокат
        whoseScooterPageScooter.whoseScooterForm("Иван", "Иванов", "Иванова 1", "+74951111111");
        whoseScooterPageScooter.firstFieldMetroLoad();
        whoseScooterPageScooter.clickNextButton();
        //Создать объект класса страницы Про аренду
        AboutOrderPageScooter aboutOrderPageScooter = new AboutOrderPageScooter(driver);
        //Заполнить поля формы Про аренду
        aboutOrderPageScooter.firstFieldsAboutOrderLoad();
        aboutOrderPageScooter.setCommentField("Комментарий.");
        aboutOrderPageScooter.clickOrderButton();
        aboutOrderPageScooter.clickYesButton();
        //Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа
        String actual = aboutOrderPageScooter.orderIsProcessed();
        String expected = "Заказ оформлен";
        MatcherAssert.assertThat(actual, startsWith(expected));
    }

    @Test
    public void testBottomButtonOrderScooter() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до второй кнопки Заказать
        WebElement element = driver.findElement(By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        landingPageScooter.clickBottomButtonOrder();
        // создать объект класса страницы заказа Для кого самокат
        WhoseScooterPageScooter whoseScooterPageScooter = new WhoseScooterPageScooter(driver);
        //Заполнить поля формы Для кого самокат
        whoseScooterPageScooter.whoseScooterForm("Степан", "Степанов", "Степанова 2", "+74952222222");
        whoseScooterPageScooter.secondFieldMetroLoad();
        whoseScooterPageScooter.clickNextButton();
        //Создать объект класса страницы Про аренду
        AboutOrderPageScooter aboutOrderPageScooter = new AboutOrderPageScooter(driver);
        //Заполнить поля формы Про аренду
        aboutOrderPageScooter.secondFieldsAboutOrderLoad();
        aboutOrderPageScooter.setCommentField("Комментарий комментарий.");
        aboutOrderPageScooter.clickOrderButton();
        aboutOrderPageScooter.clickYesButton();
        //Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа
        String actual = aboutOrderPageScooter.orderIsProcessed();
        String expected = "Заказ оформлен";
        MatcherAssert.assertThat(actual, startsWith(expected));
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
