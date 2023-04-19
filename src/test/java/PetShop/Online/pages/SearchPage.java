package PetShop.Online.pages;

import PetShop.Online.config.WebConfig;
import PetShop.Online.data.MainElements;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.aeonbits.owner.ConfigFactory;

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

    public void openMainPage() {
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        open(config.baseUrl());

    }

    public void searchItem(String testData) {
        searchInput.setValue(testData).pressEnter();
    }


    public void findItems(MainElements mainElements) {
        tabsList.find(text(mainElements.getTitle())).shouldBe(visible);
    }

    public void companyInfo() {
        goToBottom.scrollIntoView(true);
        aboutUs.click();

    }

    public void shopButton() {
        shopButton.click();

    }

}
