package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RequestPage {
   public WebDriver driver;

    public RequestPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public String getTitle(){
       return driver.getTitle();
    }
}
