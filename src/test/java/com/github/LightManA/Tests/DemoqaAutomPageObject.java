package com.github.LightManA.Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.github.LightManA.Tests.TestData.*;

public class DemoqaAutomPageObject extends GeneralElements {

    @Test
    void fillingAndCheckRegForm() {

        practiceFormPage.openPage(demoqaURL);

        practiceFormPage.enteringFirstAndLastName(firstName, lastName)
                .enteringСontactInformation(email, phoneNumber)
                .selectionOfGender()
                .selectionOfEducation(education)
                .selectionOfHobby()
                .uploadingOfPhoto(nameOfFileWithPhoto)
                .enteringOfFullAddress(addressHouse, addressState, addressCity);

        dateOfBirthFieldAndCalendar.selectingDateOfBirth(yearOfBirth, monthOfBirth, dayOfBirth);

        practiceFormPage.submittingСompletedForm();

        formWithSubmittedData.checkingСorrectnessOfSubmittedData(
                firstName,
                lastName,
                email,
                gender,
                phoneNumber,
                dayOfBirth,
                monthOfBirth,
                yearOfBirth,
                education,
                hobby,
                nameOfFileWithPhoto,
                addressHouse,
                addressState,
                addressCity);

        sleep(10000);
    }
}
