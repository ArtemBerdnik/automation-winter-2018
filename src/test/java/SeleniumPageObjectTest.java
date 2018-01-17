import enums.IndexPageTextsEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.IndexPage;

import static enums.IndexPageTextsEnum.TEXT_1;

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
        indexPage.open(driver);

        //2
        indexPage.login("epam", "1234");

        //3
        indexPage.checkPageTitle(driver);

        //4
        indexPage.checkTextsUnderImages(TEXT_1);

        //5
        indexPage.checkTextsUnderImages(IndexPageTextsEnum.values());
    }
}
