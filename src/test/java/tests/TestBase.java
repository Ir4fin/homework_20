package tests;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import owner.config.WebDriverConfig;

public class TestBase {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    @BeforeAll
    static void webConfig() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        if (config.isBrowserRemote()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = config.getRemoteURL();

        }
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();

    }
}
