package com.tyson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MoneyValidator.class)
public @interface Money {
    String message() default "不是金额形式";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
