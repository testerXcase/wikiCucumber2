package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {


    @AndroidFindBy(id = "org.wikipedia:id/search_src_text" )
    public WebElement searchFieldOnSearches;

    @AndroidFindBy(id = "org.wikipedia:id/page_list_item_container" )
    public WebElement firstResult;

    @AndroidFindBy(id = "org.wikipedia:id/search_empty_text" )
    public WebElement noResultMessage;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/search_lang_button" )
    public WebElement languageButton;



}
