package PetShop.Online.tests;

import PetShop.Online.data.MainElements;
import PetShop.Online.pages.SearchPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {
    SearchPage searchPage = new SearchPage();


    @DisplayName("Проверка открытия главной страницы")
    @Test
    void openMainPage() {
        step("Логин в систему", () -> {
            searchPage.openMainPage();
        });

        step("Проверка, что страница открылась", () -> {
            String expectedTitle = "Товары для животных, зоотовары онлайн, корма для домашних животных купить в интернет-магазине Petshop.ru";
            String actualTitle = title();
            Assertions.assertEquals(expectedTitle, actualTitle, String.valueOf(Duration.ofSeconds(3)));
        });
    }

    // @DisplayName("{Проверка поиска по категориям для запроса}")
    @ParameterizedTest(name = "{Проверка поиска по категориям для запроса} [{0}]")
    @ValueSource(strings = {"pro plan", "felix"})
    void searchItemsTests(String testData) {
        step("Логин в систему", () -> {
            searchPage.openMainPage();
        });

        step("Проверка появления Каталога после успешного поиска", () -> {
            searchPage.searchItem(testData);
            searchPage.catalogField.shouldHave(text("Каталог"), Duration.ofSeconds(6));
        });

    }

    @DisplayName("Проверка наличия табов")
    @EnumSource(MainElements.class)
    @ParameterizedTest
    void checkTitleItems(MainElements mainElements) {
        step("Логин в систему", () -> {
            searchPage.openMainPage();
        });

        step("Проверка, что все табы на месте", () -> {
            searchPage.findItems(mainElements);
        });

    }

    @DisplayName("Проверка данных о компании")
    @Test
    void aboutCompany() {
        step("Логин в систему", () -> {
            searchPage.openMainPage();
        });

        step("Проверка наличия блока о Компании", () -> {
            searchPage.companyInfo();
            searchPage.aboutCompany.shouldHave(Condition.partialText("Petshop.ru является самым крупным интернет-магазином товаров для животных в России"));
        });

    }

    @Test
    @DisplayName("Проверка работы кнопки 'Магазины'")
    void shopButtonCheck() {
        step("Логин в систему", () -> {
            searchPage.openMainPage();
        });

        step("Проверка данных в блоке 'Магазины'", () -> {
            searchPage.shopButton();
            searchPage.shopData
                    .shouldHave(Condition.partialText("При заказе через интернет-магазин и выборе такого способа доставки, как самовывоз из магазина, действует цена сайта на момент оформления заказа."));
        });


    }


}
