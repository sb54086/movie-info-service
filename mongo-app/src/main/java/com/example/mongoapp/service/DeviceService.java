package com.example.mongoapp.service;

import com.example.mongoapp.model.OnBoard;

import java.util.List;

public interface DeviceService {
    OnBoard onBoardDevice(OnBoard onBoard);
    List<OnBoard> getAllBoardDevices();
}
