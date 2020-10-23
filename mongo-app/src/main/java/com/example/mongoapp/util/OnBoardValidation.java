package com.example.mongoapp.util;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy=BoardValidator.class)
@Documented
public @interface OnBoardValidation {
    String message() default "";

    Class<?> [] groups() default {};

   // Class<? extends Payload> payload() default {};

}
