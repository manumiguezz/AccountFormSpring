package com.manumiguezz.springmvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IndConstraintValidator implements ConstraintValidator <IndAnnotation, String> {

    private String indPrefix;

    @Override
    public void initialize(IndAnnotation theIndAnnotation) {
        indPrefix = theIndAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = theCode.startsWith(indPrefix);

        return result;
    }
}
