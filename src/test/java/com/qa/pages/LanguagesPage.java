package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LanguagesPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Deutsch']" )
    public WebElement selectDeutschLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English']" )
    public WebElement selectEnglishLanguageButton;


    public void selectLanguage(String language){
        if(language.equalsIgnoreCase("DE")){
            selectDeutschLanguageButton.click();
        }else if(language.equalsIgnoreCase("EN")){
            selectEnglishLanguageButton.click();
        }else{
            System.out.println("something wrong with language");
        }
    }






}
