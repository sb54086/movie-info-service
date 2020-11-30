package com.example.app.service.impl;

import com.example.app.service.DeviceProvisionService;
import com.example.app.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateServiceImpl {
    @Autowired
    private DeviceProvisionService provisionService;
    @Autowired
    private UserInterface userInterface;




}
