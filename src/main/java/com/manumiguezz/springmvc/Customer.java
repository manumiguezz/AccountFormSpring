package com.manumiguezz.springmvc;

import com.manumiguezz.springmvc.validation.IndAnnotation;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName = "";

    @NotNull(message="is required")
    @Max(value = 110, message = "please enter a valid age")
    @Min(value = 13, message = "must be older than 13")
    private Integer age;

    @Pattern(regexp = "[a-zA-Z0-9]{5}", message = "only 5 chars input entry")
    private String postalCode;

    @IndAnnotation
    private String indAnnotation;

//    getters and setters

    public String getIndAnnotation() {
        return indAnnotation;
    }

    public void setIndAnnotation(String indAnnotation) {
        this.indAnnotation = indAnnotation;
    }

    public String getPostalCode() {
        return postalCode;
    }


    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
