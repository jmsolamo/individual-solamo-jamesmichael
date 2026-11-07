package com.joysistvi.day20.encapsulation.activity13_solamo;

public class UserAccountRegistration {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {

        return middleName;
    }

    public void setMiddleName(String middleName) {

        this.middleName = middleName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getEmail() {

        return email;
    }

    public boolean setEmail(String email) {

        if (emailFormat(email)) {
            this.email = email;
            return true;
        } else {
            return false;
        }

    }

    public String getPassword() {

        return password;
    }

    public boolean setPassword(String password) {

        if (passwordFormat(password)) {
            this.password = password;
            return true;
        } else {
            return false;
        }

    }

    public static boolean emailFormat(String email) {

        if (email == null || email.isEmpty()) {
            System.out.println("Email cannot be empty!");
            return false;
        }

        if (!email.matches("^[A-Za-z0-9._%+-]+@joysistvi\\.edu\\.ph$")) {
            System.out.println("Invalid email!, Please use your joysistvi email address.\n");
            return false;
        }

        return true;

    }

    public static boolean passwordFormat(String password) {

        if (password == null || password.isEmpty()) {
            System.out.println("Password cannot be empty!");
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

}
