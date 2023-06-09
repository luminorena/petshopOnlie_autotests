package PetShop.Online.tests;

import PetShop.Online.config.ProjectConfiguration;
import PetShop.Online.config.WebConfig;
import PetShop.Online.config.ConfigReader;
import PetShop.Online.helpers.Attach;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

public class TestBase {

    @BeforeAll
    public static void setUp() throws IOException {
        SelenideLogger.addListener("allure", new AllureSelenide());
        ProjectConfiguration.loadWebConfig();


    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}
