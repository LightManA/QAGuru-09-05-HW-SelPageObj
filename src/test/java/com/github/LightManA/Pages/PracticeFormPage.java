package com.github.LightManA.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {

    // locators & elements
    private final String FORM_TITLE = "Student Registration Form";

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneNumberInput = $("#userNumber"),
            genderRadio = $("[for=gender-radio-1]"),
            educationInput = $("#subjectsInput"),
            hobbyCheckbox = $("[for=hobbies-checkbox-3]"),
            photoUploadButton = $("#uploadPicture"),
            addressHouseInput = $("#currentAddress"),
            addressStateInput = $("#react-select-3-input"),
            addressCityInput = $("#react-select-4-input"),
            submitButton = $("[id=submit]");

    // actions
    public void openPage(String url) {
        open(url);
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public PracticeFormPage enteringFirstAndLastName(String firstName, String lastName) {
        $(firstNameInput).setValue(firstName);
        $(lastNameInput).setValue(lastName);
        return this;
    }

    public PracticeFormPage enteringСontactInformation(String email, String phoneNumber) {
        $(emailInput).setValue(email);
        $(phoneNumberInput).setValue(phoneNumber);
        return this;
    }

    public PracticeFormPage selectionOfGender() {
        $(genderRadio).click();
        return this;
    }

    public PracticeFormPage selectionOfEducation(String education) {
        $(educationInput).setValue(education).pressEnter();
        return this;
    }

    public PracticeFormPage selectionOfHobby() {
        $(hobbyCheckbox).click();
        return this;
    }

    public PracticeFormPage uploadingOfPhoto(String photoFile) {
        $(photoUploadButton).uploadFromClasspath(photoFile);
        return this;
    }

    public PracticeFormPage enteringOfFullAddress(String house, String state, String city) {
        $(addressHouseInput).setValue(house);
        $(addressStateInput).setValue(state).pressEnter();
        $(addressCityInput).setValue(city).pressEnter();
        return this;
    }

    public PracticeFormPage submittingСompletedForm() {
        $(submitButton).pressEnter();
        return this;
    }
}
