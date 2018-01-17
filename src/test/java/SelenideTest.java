import base.BaseSelenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;

public class SelenideTest extends BaseSelenide {

    @AfterMethod
    public void closeBrowser() {
        close();
    }

    @Test
    public void test1() {
        open("https://www.epam.com");
        assertEquals(getWebDriver().getTitle(), "EPAM | Software Product Development Services");

        $(".header-search__button").click();

        SelenideElement menuButton = $(".hamburger-menu__button");
        menuButton.click();
        menuButton.should(visible);

        menuButton.should(text("MENU"));
    }

    @Test
    public void test2() {
        open("https://www.epam.com");
        assertEquals(getWebDriver().getTitle(), "EPAM | Software Product Development Services");

        $(".header-search__button").click();

        SelenideElement menuButton = $(".hamburger-menu__button");
        menuButton.click();
        menuButton.should(visible);

        menuButton.should(text("MENU"));
    }

    @Test
    public void test3() {
        open("https://www.epam.com");
        assertEquals(getWebDriver().getTitle(), "EPAM | Software Product Development Services");

        $(".header-search__button").click();

        SelenideElement menuButton = $(".hamburger-menu__button");
        menuButton.click();
        menuButton.should(visible);

        menuButton.should(text("MENU"));
    }
}
