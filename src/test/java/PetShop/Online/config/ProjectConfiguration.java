package PetShop.Online.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ProjectConfiguration {


    private final WebConfig webConfig;

    public ProjectConfiguration(WebConfig webConfig) {
        this.webConfig = webConfig;
    }

    public void webConfig() {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ProjectConfiguration.class);


        Configuration.baseUrl = webConfig.baseUrl();
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();

        logger.warn("baseUrl ", Configuration.baseUrl = webConfig.baseUrl());
        logger.warn("browser ",Configuration.browser = webConfig.browser());
        logger.warn("browserVersion ",Configuration.browserVersion = webConfig.browserVersion());

    if (webConfig.isRemote()) {
        Configuration.remote = webConfig.remoteWebDriverUrl();
        logger.warn("remoteUrl " ,Configuration.remote = webConfig.remoteWebDriverUrl());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        logger.warn("capabilities ", capabilities);
        }
    }

}


