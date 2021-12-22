package com.github.LightManA.Components;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormWithSubmittedData {

    public void checkingСorrectnessOfSubmittedData(
            String firstName,
            String lastName,
            String email,
            String gender,
            String phoneNumber,
            String day,
            String month,
            String year,
            String education,
            String hobby,
            String photoFile,
            String house,
            String state,
            String city) {
        $(byText(firstName + " " + lastName)).shouldBe(visible, Duration.ofSeconds(5));
        $(byText(email)).shouldBe(visible);
        $(byText(gender)).shouldBe(visible);
        $(byText(phoneNumber)).shouldBe(visible);
        $(byText(day + " " + month + "," + year)).shouldBe(visible);
        $(byText(education)).shouldBe(visible);
        $(byText(hobby)).shouldBe(visible);
        $(byText(photoFile)).shouldBe(visible);
        $(byText(house)).shouldBe(visible);
        $(byText(state + " " + city)).shouldBe(visible);
    }
}
