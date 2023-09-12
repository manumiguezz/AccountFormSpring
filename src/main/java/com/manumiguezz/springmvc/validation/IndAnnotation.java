package com.manumiguezz.springmvc.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = )
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IndAnnotation {
    public String value() default "IND";

    public String message() default "Must start with 'IND'";

    public Class<?>[] groups() default {};

    public Class<? extends Payload> [] payload() default {};
}
