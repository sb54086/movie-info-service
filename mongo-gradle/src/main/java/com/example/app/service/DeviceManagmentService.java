package com.example.app.service;

import com.example.app.model.Device;

import java.util.List;

public interface DeviceManagmentService {
    Device getDeviceByName(String deviceName);
    Device getDeviceById(String deviceId);
    List<Device> getAllDevices();
    Device saveDevice(Device device);
    void deleteDevice(Device device);
    void deleteDeviceById(String deviceId);


}
