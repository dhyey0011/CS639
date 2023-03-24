package com.example.employeedatabase;

public class Employee {
    private String key;
    private String firstName;
    private String lastName;

    public Employee() {
        // Default constructor required for calls to DataSnapshot.getValue(Employee.class)
    }

    public Employee(String key, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
}

