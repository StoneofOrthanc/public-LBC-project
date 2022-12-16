package com.kenzie.appserver.Exceptions;

/** This file was created by Raymond Morales **/

public class DuplicateThreadException extends Exception {

    public DuplicateThreadException() {
    }
    public DuplicateThreadException(String message) {
        super(message);
    }
    public DuplicateThreadException(String message, Throwable err) {
        super(message, err);
    }
}
