package com.example.demo4;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
    SelenideElement title = $("#search-section > div > div.row > div > h1");


    public String  text(){
        String text = title.getText();
        return text;
    }

    @Test
    public void test(){
        Selenide.sleep(10000);
        open("https://staff.am/");
        Selenide.sleep(10000);
        Assert.assertEquals(text(), "CAREER SEARCH STARTS HERE.");

    }

}
