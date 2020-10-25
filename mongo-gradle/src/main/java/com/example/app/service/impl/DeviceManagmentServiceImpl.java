package com.example.app.service.impl;

import com.example.app.exception.DeviceNotFoundException;
import com.example.app.model.Device;
import com.example.app.repository.DeviceRepository;
import com.example.app.service.DeviceManagmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deviceManagementService")
public class DeviceManagmentServiceImpl implements DeviceManagmentService {
    private static final Logger LOGGER= LoggerFactory.getLogger(DeviceManagmentServiceImpl.class);
    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public Device getDeviceByName(String deviceName) {
        return deviceRepository
                .findDeviceByName(deviceName)
                .get();
    }

    @Override
    public Device getDeviceById(String deviceId) {
        return deviceRepository
                .findById(deviceId)
                .orElseThrow(()->new DeviceNotFoundException("Device Not found for Id"+deviceId));
    }

    @Override
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public Device saveDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Device device) {

        deviceRepository.delete(device);
    }

    @Override
    public void deleteDeviceById(String deviceId) {
        LOGGER.info("Deleting the device by id {}",deviceId);
         deviceRepository
                 .findById(deviceId)
                 .orElseThrow(()->new DeviceNotFoundException("Device Not found for Id"+deviceId));
        deviceRepository.deleteById(deviceId);
    }
}
