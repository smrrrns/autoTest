package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTab {
    public WebDriver driver;

    public NewTab(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(name = "q")
    WebElement inputField;

    public void inputRequest(String request){
        inputField.sendKeys(request);
    }

    public void sendRequest(){
       inputField.submit();
    }
}
