package PetShop.Online.pages;

import PetShop.Online.config.WebConfig;
import PetShop.Online.data.MainElements;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.aeonbits.owner.ConfigFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SearchPage {

    private final SelenideElement
            searchInput = $("input[placeholder=\"Я ищу…\"]"),
            aboutUs = $x("//a[contains(text(),'О нас')]"),
            shopButton = $(new ByAttribute("data-testid", "Button")),
            goToBottom = $(new ByAttribute("data-testid", "NavBar__link"));

    private final ElementsCollection
            tabsList = $$(".action-header-menu__inner");

    public final SelenideElement
            catalogField = $x("//h1"),
            aboutCompany = $(".about-page-text"),
            shopData = $(".oupost-content-text");

    public void openMainPage() throws IOException {
        String baseUrl = "";
        InputStream inputStream = null;
        try {
            Properties prop = new Properties();
            String propFileName = "local.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("файл не надйден");
            }
            baseUrl = prop.getProperty("baseUrl");
            System.out.println(baseUrl);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        open(baseUrl);
    }

    public void searchItem(String testData) {
        searchInput.setValue(testData).pressEnter();
    }


    public void checkItemsVisibility(MainElements mainElements) {
        tabsList.find(text(mainElements.getTitle())).shouldBe(visible);
    }

    public void showCompanyInfo() {
        goToBottom.scrollIntoView(true);
        aboutUs.click();

    }

    public void clickShopButton() {
        shopButton.click();

    }

}
