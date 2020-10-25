package com.example.app.repository;

import com.example.app.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeviceRepository extends MongoRepository<Device,String> {
    Optional<Device> findDeviceByName(String deviceName);
}
