package com.github.LightManA.Tests;

import com.github.javafaker.Faker;

public class TestData {

    static Faker faker = new Faker();

    static String demoqaURL = "https://demoqa.com/automation-practice-form";
    static String firstName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String email = faker.bothify("????##@gmail.com");
    static String phoneNumber = faker.regexify("77[0-9]{8}");
    static String yearOfBirth = faker.regexify("198[0-9]{1}|199[0-9]{1}|200[0-3]{1}");
    static String monthOfBirth = faker.regexify("November|December|January|February");
    static String dayOfBirth = faker.regexify("0[1-9]{1}|1[0-9]{1}|2[0-8]{1}");
    static String education = "Computer Science";
    static String nameOfFileWithPhoto = "Leopard.jpg";
    static String addressHouse = faker.address().streetAddress();
    static String addressState = "Uttar Pradesh";
    static String addressCity = "Agra";
    static String gender = "Male";
    static String hobby = "Music";
}
