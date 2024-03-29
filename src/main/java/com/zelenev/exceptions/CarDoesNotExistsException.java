package com.zelenev.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CarDoesNotExistsException extends RuntimeException {

    public CarDoesNotExistsException(String message) {
        super(message);
    }
}
