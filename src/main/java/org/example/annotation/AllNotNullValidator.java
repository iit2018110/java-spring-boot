package org.example.annotation;

import org.apache.commons.lang3.ObjectUtils;
import org.example.StudentRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AllNotNullValidator implements ConstraintValidator<AllNotNull, StudentRequest> {

    @Override
    public boolean isValid(StudentRequest request, ConstraintValidatorContext context) {
        return ObjectUtils.allNotNull(request.getAge(), request.getName());
    }
}
