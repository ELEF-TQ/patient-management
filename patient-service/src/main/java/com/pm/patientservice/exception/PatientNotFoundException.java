package com.pm.patientservice.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;


public class PatientNotFoundException extends RuntimeException{
    public PatientNotFoundException(String message){
        super(message);
    }
}
