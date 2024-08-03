package org.example.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Documented
@Constraint(validatedBy = AllNotNullValidator.class)
public @interface AllNotNull {
    String message() default "Any field cannot be null.";

    Class<?>[] groups() default  {};

    Class<? extends Payload>[] payload() default {};
}
