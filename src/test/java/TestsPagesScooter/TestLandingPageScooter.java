package TestsPagesScooter;

import PagesScooter.LandingPageScooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.*;

public class TestLandingPageScooter {

    private WebDriver driver;

    @Before
    public void initialize() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.get(new LandingPageScooter(driver).LANDING_URL);
    }

    @Test
    public void testClickHowMuchQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        landingPageScooter.clickHowMuchQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-0']/p")).getText());
    }

    @Test
    public void testClickIWantMoreQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        landingPageScooter.clickIWantMoreQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-1']/p")).getText());
    }

    @Test
    public void testClickRentTimeQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        landingPageScooter.clickRentTimeQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-2']/p")).getText());
    }

    @Test
    public void testClickTodayOrderQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        landingPageScooter.clickTodayOrderQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-3']/p")).getText());
    }

    @Test
    public void testClickReturnEarlierQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        landingPageScooter.clickReturnEarlierQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-4']/p")).getText());
    }

    @Test
    public void testClickChargingQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        landingPageScooter.clickChargingQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-5']/p")).getText());
    }

    @Test
    public void testClickOrderCancellationQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        landingPageScooter.clickOrderCancellationQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-6']/p")).getText());
    }

    @Test
    public void testClickZamkadyeQuestion() {
        // создать объект класса страницы лэндинга
        LandingPageScooter landingPageScooter = new LandingPageScooter(driver);
        //Прокрутить страницу до FAQ
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        landingPageScooter.clickZamkadyeQuestion();
        assertEquals(expected, driver.findElement(By.xpath(".//div[@id='accordion__panel-7']/p")).getText());
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
