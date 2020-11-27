package com.sfl.docProcessing.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email = "Empty email";

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Employee(String firstName, String lastName, String position, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
    }

    public Employee(){}

    @Override
    public String toString() {
        return firstName + " " +
                lastName +
                ", position='" + position + '\'';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
