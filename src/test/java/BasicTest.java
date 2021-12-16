import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class BasicTest {
    protected EventFiringWebDriver webDriver;
    protected WebDriverWait webDriverWait;
    String URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject";

    @BeforeEach
    void setUp() {
        webDriver = new EventFiringWebDriver(WebDriverManager.chromedriver().create());
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 7);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}