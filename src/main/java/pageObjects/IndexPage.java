package pageObjects;

import com.codeborne.selenide.SelenideElement;
import enums.IndexPageTextsEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertEquals;

public class IndexPage {

    @FindBy(css = ".uui-profile-menu .dropdown-toggle")
    private SelenideElement loginFormButton;

    @FindBy(css = "#Login")
    private SelenideElement loginInput;

    @FindBy(css = "#Password")
    private SelenideElement passordInput;

    @FindBy(css = ".form-horizontal [type='submit']")
    private SelenideElement submitButton;

    public void open(WebDriver driver) {
        driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");
    }

    public void login(String name, String password) {
        loginFormButton.should(visible);
        loginFormButton.click();

        loginInput.sendKeys(name);
        passordInput.sendKeys(password);
        submitButton.click();
    }

    public void checkPageTitle(WebDriver driver) {
        assertEquals(driver.getTitle(), "");
    }

    public void checkTextsUnderImages(IndexPageTextsEnum text) {
        assertEquals("", text.text);
    }

    public void checkTextsUnderImages(IndexPageTextsEnum[] texts) {
        assertEquals("", "");
    }
}
