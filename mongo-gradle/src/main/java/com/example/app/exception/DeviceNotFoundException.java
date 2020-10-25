package com.example.app.exception;

import java.util.function.Supplier;

public class DeviceNotFoundException extends BaseException{
    public DeviceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeviceNotFoundException(String message) {
        super(message);
    }

}
