package com.github.LightManA.Tests;

import com.codeborne.selenide.Configuration;
import com.github.LightManA.Components.DateOfBirthFieldAndCalendar;
import com.github.LightManA.Components.FormWithSubmittedData;
import com.github.LightManA.Pages.PracticeFormPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

public class GeneralElements {

    // Создание новых объектов для наборов элементов, чтобы через extends в основном классе их использовать
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    DateOfBirthFieldAndCalendar dateOfBirthFieldAndCalendar = new DateOfBirthFieldAndCalendar();
    FormWithSubmittedData formWithSubmittedData = new FormWithSubmittedData();
    //Faker faker = new Faker();

    @BeforeAll
    static void setMaxBrowserSize() {
        Configuration.browserSize = "1400x1030";
    }
}
