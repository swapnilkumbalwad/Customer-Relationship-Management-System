package com.main.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.main.entity.Customer;

@Component
public class CustomerValidator implements Validator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern PHONE_PATTERN = Pattern.compile(
        "^\\d{10}$|^\\d{3}-\\d{3}-\\d{4}$");

    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;

        // Validate Name
        if (customer.getName() == null || customer.getName().trim().isEmpty()) {
            errors.rejectValue("name", "name.required", "Name is required");
        }

        // Validate Email
        if (customer.getEmail() == null || customer.getEmail().trim().isEmpty()) {
            errors.rejectValue("email", "email.required", "Email is required");
        } else if (!EMAIL_PATTERN.matcher(customer.getEmail()).matches()) {
            errors.rejectValue("email", "email.invalid", "Invalid email format");
        }

        // Validate Phone (optional, but must match pattern if provided)
        if (customer.getPhone() != null && !customer.getPhone().trim().isEmpty()) {
            if (!PHONE_PATTERN.matcher(customer.getPhone()).matches()) {
                errors.rejectValue("phone", "phone.invalid", 
                    "Phone must be 10 digits or format XXX-XXX-XXXX");
            }
        }
    }
}