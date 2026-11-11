package com.joysistvi.day23.polymorphism.methodoverloading;

public class User {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private String philhealthID;

    public User() {
    }

    public User(String firstName, String middleName, String lastName, String email, String password, String address) {

        this.firstName = isNotEmpty(firstName) ? firstName : null;
        this.middleName = isNotEmpty(middleName) ? middleName : null;
        this.lastName = isNotEmpty(lastName) ? lastName : null;
        this.email = (isNotEmpty(email) && emailFormat(email)) ? email : null;
        this.password = (isNotEmpty(password) && passwordFormat(password)) ? password : null;
        this.address = isNotEmpty(address) ? address : null;
    }

    public User(String middleName, String lastName, String firstName, String email, String password) {
        this.middleName = middleName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public User(String firstName, String email, String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public User(String firstName, String middleName, String lastName, String address, String email, String password, String philhealthID) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.philhealthID = philhealthID;
    }

    public static boolean isNotEmpty(String value) {

        if (value == null || value.trim().isEmpty()) {
            return false;
        }
        return true;
    }


    public static boolean emailFormat(String email) {

        if (!isNotEmpty(email)) {
            return false;
        }

        if (!email.matches("^[A-Za-z0-9._%+-]+@joysistvi\\.edu\\.ph$")) {
            System.out.println("Invalid email! Please use your joysistvi email address.\n");
            return false;
        }

        return true;
    }

    public static boolean passwordFormat(String password) {

        if (!isNotEmpty(password)) {
            return false;
        }

        boolean valid = true;

        if (password.length() < 8) {
            System.out.println("- Password must have at least 8 characters.");
            valid = false;
        }

        if (password.length() > 16) {
            System.out.println("- Password must not exceed 16 characters.");
            valid = false;
        }

        if (!password.matches(".*[^a-zA-Z0-9\\s].*")) {
            System.out.println("- Your password doesn't have a special character.");
            valid = false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("- Your password doesn't have an uppercase letter.");
            valid = false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("- Your password doesn't have a lowercase letter.");
            valid = false;
        }

        if (!password.matches(".*[0-9].*")) {
            System.out.println("- Your password doesn't have a number.");
            valid = false;
        }

        return valid;

    }

    @Override
    public String toString() {
        return
                "Full Name: " + firstName + " " + (middleName != null ? middleName + " " : "") + lastName +
                        "\nEmail: " + email +
                        "\nAddress: " + address;
    }
}
