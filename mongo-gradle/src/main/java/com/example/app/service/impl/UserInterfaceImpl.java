package com.example.app.service.impl;

import com.example.app.service.UserInterface;
import org.springframework.stereotype.Service;

@Service
public class UserInterfaceImpl implements UserInterface {
    @Override
    public boolean detachDevice(String domain, String accessToken) {
        return false;
    }

    @Override
    public String getDomainUUID(String domain, String accessToken) {
        return null;
    }
}
