package com.tyson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {MinValidator.class}
)
public @interface Min {
    int value() default 0;

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
