package org.product.exception;

/*
 * @author Isha Sethia
 * */


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

