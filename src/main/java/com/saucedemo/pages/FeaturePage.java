package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FeaturePage extends Utility {

    private static final Logger log = LogManager.getLogger(FeaturePage.class.getName());

    public FeaturePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(className = "login_wrapper")
    WebElement saucedemopage;

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernme;

    @CacheLookup
    @FindBy(id = "password")
    WebElement Password;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement clickonloginbutton;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement filterproducts;

    @CacheLookup
    @FindBy(id = "item_5_title_link")
    WebElement selectproduct;



    public void saucedemopage() {
        clickOnElement(saucedemopage);
    }

    public void enteruserName(String usernm){
        sendTextToElement(usernme,usernm);
        log.info("enter on username"+usernme.toString());
    }
    public void enterPasswordFiled(String password1){
        sendTextToElement(Password,password1);
        log.info("enter on password"+Password.toString());
    }
    public void clickOnloginButton(){
        clickOnElement(clickonloginbutton);
        log.info("click on login button"+clickonloginbutton.toString());
    }
    public void filterproducts(String filter){
        clickOnElement(By.id(filter));
        selectByValueFromDropDown(filterproducts,"hilo");
    }

    public void selectproducts(){
        clickOnElement(selectproduct);

    }


}
