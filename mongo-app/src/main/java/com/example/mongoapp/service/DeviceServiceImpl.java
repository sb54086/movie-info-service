package com.example.mongoapp.service;

import com.example.mongoapp.model.OnBoard;
import com.example.mongoapp.repository.OnBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deviceService")
public class DeviceServiceImpl implements  DeviceService {
    @Autowired
    private OnBoardRepository repository;

    @Override
    public OnBoard onBoardDevice(OnBoard onBoard) {

        return repository.save(onBoard);
    }

    /**
     *
     * @return List of Onboard Devices
     */
    @Override
    public List<OnBoard> getAllBoardDevices() {
        return repository.findAll();
    }
}
