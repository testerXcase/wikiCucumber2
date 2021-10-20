package com.qa.stepDefs;


import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.qa.pages.ContentPage;
import com.qa.pages.LanguagesPage;
import com.qa.pages.SearchPage;
import com.qa.pages.BasePage;

public class SearchStepDef {

    @When("user taps on search field")
    public void user_taps_on_search_field() {
        new BasePage().searchFieldHome.click();
    }

    @When("user types {string} on search field")
    public void user_type_on_search_field(String searchTitle) {
        new SearchPage().searchFieldOnSearches.sendKeys(searchTitle);
    }

    @When("user taps on first result")
    public void user_taps_on_first_result() {
        new SearchPage().firstResult.click();
    }

    @Then("user reads the result as {string} on Content Page")
    public void user_reads_the_result_as_on_Content_Page(String Berlin) {
        Assert.assertEquals(Berlin, new ContentPage().resultTitle.getText());
    }

    @Then("user reads {string} on Search Page")
    public void user_reads_on_Search_Page(String InvalidSearchTitle) {
        Assert.assertEquals(InvalidSearchTitle, new SearchPage().noResultMessage.getText());
    }

    @When("user taps on language button")
    public void user_taps_on_language_button() {
        new SearchPage().languageButton.click();
    }

    @When("user selects {string} language")
    public void user_selects_language(String language) {
        new LanguagesPage().selectLanguage(language);

    }
    @Then("user is able to see {string} content")
    public void user_is_able_to_see_content(String contentLanguage) {
       Assert.assertTrue(new ContentPage().subTextLanguage(contentLanguage));
    }





}
