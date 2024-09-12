package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.DotCoverPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class DotCoverTest extends BaseTest {

    private DotCoverPage DotCoverPage;

    @BeforeEach
    @Override
    @Step("Переход в раздел DotCover")
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/dotcover/");
        DotCoverPage = new DotCoverPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Download' активна")
    public void checkDownload() {
        assertTrue(DotCoverPage.checkActivityOfDownload(), "Кнопка неактивна");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Pricing' активна")
    public void checkPricing() {
        assertTrue(DotCoverPage.checkActivityOfPricing(), "Кнопка 'Pricing' неактивна");
    }

    @Test
    @DisplayName("Проверка наличия текста 'dotCover'")
    public void checkDotCover() {
        assertTrue(DotCoverPage.checkDotCoverEl(), "Текст dotCover не появился");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Discover all features' активна")
    public void checkFeatures() {
        assertTrue(DotCoverPage.checkActivityOfAllFeatures(), "Кнопка 'Discover all features' неактивна");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'Docs & Demos'")
    public void docsDemosButtonClickCheck() {
        DotCoverPage.docsDemosButtonClick();
        assertEquals("https://www.jetbrains.com/dotcover/documentation/", getDriver().getCurrentUrl(), "Неверная ссылка");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'Blog & Social'")
    public void blogSocialButtonClickCheck() {
        DotCoverPage.blogSocialButtonClick();
        assertEquals("https://www.jetbrains.com/dotcover/social/", getDriver().getCurrentUrl(), "Неверная ссылка");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'Features'")
    public void featuresButtonCheck() {
        DotCoverPage.featureButtonClick();
        assertEquals("https://www.jetbrains.com/dotcover/features/", getDriver().getCurrentUrl(), "Неверная ссылка");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'What's New'")
    public void whatsNewButtonCheck() {
        DotCoverPage.whatsNewButtonClick();
        assertEquals("https://www.jetbrains.com/dotcover/whatsnew/", getDriver().getCurrentUrl(), "Неверная ссылка");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Language Picker активна'")
    public void checkLangPick() {
        assertTrue(DotCoverPage.checkLanguagePicker(), "Кнопка 'Language Picker' неактивна");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Cart action' активна")
    public void checkCartAct() {
        assertTrue(DotCoverPage.checkCartAction(), "Кнопка 'Cart action' неактивна");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'Profile Action'")
    public void profileActionCheck() {
        DotCoverPage.profileActionClick();
        assertEquals("https://account.jetbrains.com/login", getDriver().getCurrentUrl(), "Неверная ссылка");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Search action' активна")
    public void checkSearchAct() {
        assertTrue(DotCoverPage.checkSearchAction(), "Кнопка 'Search action' неактивна");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Store' отображается")
    public void storeButtonCheck() {
        assertTrue(DotCoverPage.storeButtonAction(), "Кнопка 'Store' не отображается");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Support' отображается")
    public void supportButtonCheck() {
        assertTrue(DotCoverPage.supportButtonAction(), "Кнопка 'Support' не отображается");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Solutions' отображается")
    public void solutionsButtonCheck() {
        assertTrue(DotCoverPage.solutionsButtonAction(), "Кнопка 'Solution' не отображается");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Education' отображается")
    public void educationButtonCheck() {
        assertTrue(DotCoverPage.educationButtonAction(), "Кнопка 'Education' не отображается");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Team Tools' отображается")
    public void teamToolsButtonCheck() {
        assertTrue(DotCoverPage.teamToolsButtonAction(), "Кнопка 'Team Tools' не отображается");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Developer Tools' отображается")
    public void develToolsButtonCheck() {
        assertTrue(DotCoverPage.devToolsButtonAction(), "Кнопка 'Developer Tools' не отображается");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'Community forum'")
    public void comForumButtonCheck() {
        DotCoverPage.comForumActionClick();
        assertEquals("https://dotnettools-support.jetbrains.com/hc/en-us/community/topics/200379915-dotCover",
                getDriver().getCurrentUrl(),
                "Неверная ссылка");
    }

    @Test
    @DisplayName("Проверка нажатия кнопки 'Bug and issue tracker'")
    public void bugTrackerButtonCheck() {
        DotCoverPage.bugTrackerActionClick();
        assertEquals("https://youtrack.jetbrains.com/issues/DCVR", getDriver().getCurrentUrl(), "Неверная ссылка");
    }
}