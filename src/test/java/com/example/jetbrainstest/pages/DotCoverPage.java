package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.tests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class DotCoverPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DotCoverPage.class));

    WebDriver driver;

    @FindBy(css = "a[data-test='button'][href='/dotcover/download/']")
    private WebElement downloadButton;

    public Boolean checkActivityOfDownload() {
        LOG.info("Проверка работоспособности кнопки загрузки");
        return downloadButton.isEnabled();
    }

    @FindBy(css = "a[data-test='button'][href='/dotcover/buy/']")
    private WebElement pricingButton;

    public Boolean checkActivityOfPricing() {
        LOG.info("Проверка работоспособности кнопки цен");
        return pricingButton.isEnabled();
    }

    @FindBy(xpath = "//h1[@class='wt-col-inline rs-hero rs-hero_theme_dark']")
    private WebElement dotCoverEl;

    public Boolean checkDotCoverEl() {
        LOG.info("Проверка наличия текста логотипа на главной странице");
        return dotCoverEl.isDisplayed();
    }

    @FindBy(css = "a[data-test='button'][href='/dotcover/features']")
    private WebElement allFeaturesEl;

    public Boolean checkActivityOfAllFeatures() {
        LOG.info("Проверка работоспособности кнопки изучения всех особенностей");
        return allFeaturesEl.isEnabled();
    }

    @FindBy(css = "a[href='/dotcover/documentation/']")
    private WebElement docsDemosButton;

    public void docsDemosButtonClick() {
        LOG.info("Проверка нажатия кнопки документации и демо");
        docsDemosButton.click();
    }

    @FindBy(css = "a[href='/dotcover/social/']")
    private WebElement blogSocialButton;

    public void blogSocialButtonClick() {
        LOG.info("Проверка нажатия кнопки блога и социальных сетей");
        blogSocialButton.click();
    }

    @FindBy(css = "a[href='/dotcover/features/']")
    private WebElement featuresButton;

    public void featureButtonClick() {
        LOG.info("Проверка нажатия кнопки особенностей");
        featuresButton.click();
    }

    @FindBy(css = "a[href='/dotcover/whatsnew/']")
    private WebElement whatsNewButton;

    public void whatsNewButtonClick() {
        LOG.info("Проверка нажатия кнопки новостей");
        whatsNewButton.click();
    }

    @FindBy(css = "button[data-test='language-picker'][class$='1']")
    private WebElement languagePicker;

    public Boolean checkLanguagePicker() {
        LOG.info("Проверка работоспособности кнопки выбора языка");
        return languagePicker.isEnabled();
    }

    @FindBy(css = "a[data-test='site-header-cart-action']")
    private WebElement cartAction;

    public Boolean checkCartAction() {
        LOG.info("Проверка работоспособности кнопки корзины");
        return cartAction.isEnabled();
    }

    @FindBy(css = "a[data-test='site-header-profile-action']")
    private WebElement profileAction;

    public void profileActionClick() {
        LOG.info("Проверка нажатия кнопки личного кабинета");
        profileAction.click();
    }

    @FindBy(css = "button[data-test='site-header-search-action']")
    private WebElement searchAction;

    public Boolean checkSearchAction() {
        LOG.info("Проверка работоспособности кнопки поиска");
        return searchAction.isEnabled();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Store')]")
    private WebElement storeButton;

    public Boolean storeButtonAction() {
        LOG.info("Проверка отображения кнопки магазина");
        return storeButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Support')]")
    private WebElement supportButton;

    public Boolean supportButtonAction() {
        LOG.info("Проверка отображения кнопки поддержки");
        return supportButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Solutions')]")
    private WebElement solutionsButton;

    public Boolean solutionsButtonAction() {
        LOG.info("Проверка отображения кнопки решений");
        return solutionsButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Education')]")
    private WebElement educationButton;

    public Boolean educationButtonAction() {
        LOG.info("Проверка отображения кнопки образования");
        return educationButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Team Tools')]")
    private WebElement teamToolsButton;

    public Boolean teamToolsButtonAction() {
        LOG.info("Проверка отображения кнопки командных инструментов");
        return teamToolsButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Developer Tools')]")
    private WebElement develToolsButton;

    public Boolean devToolsButtonAction() {
        LOG.info("Проверка отображения кнопки инструментов разработчика");
        return develToolsButton.isDisplayed();
    }

    @FindBy(xpath = "(//div[@class='social-footer__link-text-wrapper'])[1]")
    private WebElement comForumAction;

    public void comForumActionClick() {
        LOG.info("Проверка нажатия кнопки форума");
        comForumAction.click();
    }

    @FindBy(xpath = "(//div[@class='social-footer__link-text-wrapper'])[2]")
    private WebElement bugTrackerAction;

    public void bugTrackerActionClick() {
        LOG.info("Проверка нажатия кнопки отслеживания ошибок");
        bugTrackerAction.click();
    }

    public DotCoverPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}