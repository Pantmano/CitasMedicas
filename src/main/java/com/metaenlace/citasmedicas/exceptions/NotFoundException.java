package com.metaenlace.citasmedicas.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String error){
        super(error);
    }
}
