package com.estudo.curso.services.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 42L;

    public DatabaseException(String msg) {
        super(msg);
    }

}
