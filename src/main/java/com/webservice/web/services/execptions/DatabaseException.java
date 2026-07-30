package com.webservice.web.services.execptions;

public class DatabaseException extends RuntimeException{

    private static final long serialVersionUIT = 1L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
