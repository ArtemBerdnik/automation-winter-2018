import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.IndexPage;

public class SeleniumPageObjectTest {

    private WebDriver driver;
    private IndexPage indexPage;

    @BeforeClass
    public void setUpPages() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        indexPage = PageFactory.initElements(driver, IndexPage.class);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test1() {

        //1
        driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");

        //2
        indexPage.login("epam", "1234");
    }
}
