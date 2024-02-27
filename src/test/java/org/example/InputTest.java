package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class InputTest {
    public static WebDriver driver;
    public static String url = "http://www.google.com";
    public static String request = "selenium";
    public static String titleExpected = request + " - Поиск в Google";
    public static NewTab newTab;
    public static RequestPage requestPage;

    @BeforeClass
    public static void openChrome() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        newTab = new NewTab(driver);
        requestPage = new RequestPage(driver);
    }


    @Test
    public void requestTest() {
        newTab.inputRequest(request);
        newTab.sendRequest();
        String title = requestPage.getTitle();
        Assert.assertEquals(titleExpected, title);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
