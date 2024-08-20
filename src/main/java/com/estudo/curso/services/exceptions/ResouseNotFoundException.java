package com.estudo.curso.services.exceptions;

public class ResouseNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 42L;

    public ResouseNotFoundException(Object id) {
        super("Resource not found with id: " + id);
    }
    
}
