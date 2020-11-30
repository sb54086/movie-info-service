package com.example.app.service;

public interface UserInterface {
    boolean detachDevice(String domain,String accessToken);
    String getDomainUUID(String domain,String accessToken);
}
