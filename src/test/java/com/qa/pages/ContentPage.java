package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ContentPage extends BasePage {

    @AndroidFindBy(id = "org.wikipedia:id/view_page_title_text" )
    public WebElement resultTitle;

    @AndroidFindBy(id = "org.wikipedia:id/view_page_subtitle_text" )
    public WebElement subTitleTextContainer;


    public Boolean subTextLanguage(String contentLanguage){
        if(contentLanguage.equalsIgnoreCase("DE")){
          String expected = "Hauptstadt und Land der Bundesrepublik Deutschland";
          String actual = subTitleTextContainer.getText();
            if(expected.equals(actual)){
                return true;
            }else{
                return false;
            }

        }else if(contentLanguage.equalsIgnoreCase("EN")){
            String expected = "Capital and largest city of Germany";
            String actual = subTitleTextContainer.getText();
            if(expected.equals(actual)){
                return true;
            }else{
                return false;
            }

        }
        return false;
    }



}
