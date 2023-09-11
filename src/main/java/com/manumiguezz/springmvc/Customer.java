package com.manumiguezz.springmvc;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName = "";

    @Max(value = 10, message = "must be less than ten")
    @Min(value = 0, message = "must be greater than zero")
    private int age;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Pattern(regexp = "[a-zA-Z0-9]{5}", message = "only 5 chars input entry")
    private String postalCode;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
