package com.example.app.exception.handler;

import com.example.app.exception.DeviceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {
    private static final Logger LOGGER= LoggerFactory.getLogger(BaseExceptionHandler.class);
    
    @ExceptionHandler(DeviceNotFoundException.class)
    public ResponseEntity<Object> handleDeviceNotFoundException(DeviceNotFoundException e){
        LOGGER.error("Handling DeviceNotFoundException",e);
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Device Found");
    }
}
