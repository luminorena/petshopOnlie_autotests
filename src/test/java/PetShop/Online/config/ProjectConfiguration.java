package PetShop.Online.config;

import com.codeborne.selenide.Configuration;
import com.google.common.base.Strings;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;


public class ProjectConfiguration {


    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void loadWebConfig() throws IOException {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ProjectConfiguration.class);
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();

        logger.warn(Configuration.baseUrl = config.baseUrl());
        logger.warn(Configuration.browser = config.browser());
        logger.warn(Configuration.browserVersion = config.browserVersion());


        String remoteUrl = config.remoteWebDriverUrl();
        if (!Strings.isNullOrEmpty(remoteUrl)) {
            Configuration.remote = remoteUrl;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            logger.warn(Configuration.remote = config.remoteWebDriverUrl());
        }



    }

}


