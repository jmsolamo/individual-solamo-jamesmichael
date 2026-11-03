package com.joysistvi.day15.oopintro;

public class Main {

    public static void main(String[] args) {

        // Class Instantiation / Create an object of a class
        Phone phone = new Phone();

        phone.brand = "Samsung";
        phone.model = "Galaxy S25";
        phone.color = "Blue";
        phone.operatingSystem = "Android";
        phone.storageInGb = 256;
        phone.ramInGb = 12;
        phone.screenSizeInInches = 6.2;
        phone.price = 45999;

        phone.makeCalls();
        phone.sendMessages();
        phone.takePhotos();
        phone.browseInternet();


        Phone phone2 = new Phone();

        phone2.brand = "Apple";
        phone2.model = "iPhone 17";
        phone2.color = "Black";
        phone2.operatingSystem = "iOS";
        phone2.storageInGb = 256;
        phone2.ramInGb = 8;
        phone2.screenSizeInInches = 6.3;
        phone2.price = 54990;

        phone2.makeCalls();
        phone2.playMusic();
        phone2.takePhotos();
        phone2.playGames();


        Phone phone3 = new Phone();

        phone3.brand = "Xiaomi";
        phone3.model = "Redmi Note 14";
        phone3.color = "Green";
        phone3.operatingSystem = "Android";
        phone3.storageInGb = 128;
        phone3.ramInGb = 8;
        phone3.screenSizeInInches = 6.67;
        phone3.price = 9999;

        phone3.sendMessages();
        phone3.browseInternet();
        phone3.playMusic();
        phone3.playGames();

    }
}