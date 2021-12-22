package com.github.LightManA.Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DateOfBirthFieldAndCalendar {

    private SelenideElement
            dateOfBirthInput = $("#dateOfBirthInput"),
            yearSelect = $("[class*='year-select']"),
            monthSelect = $("[class*='month-select']");

    public void selectingDateOfBirth(String year, String month, String day) {
        $(dateOfBirthInput).click();
        $(yearSelect).selectOptionContainingText(year);
        $(monthSelect).selectOptionContainingText(month);
        $("[class*='day--0" + day + "']").click();
    }
}
