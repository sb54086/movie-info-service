package com.example.app.cotroller;

import com.example.app.model.Device;
import com.example.app.service.DeviceManagmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/")
public class DeviceManagmentController {
    private static final Logger LOGGER= LoggerFactory.getLogger(DeviceManagmentController.class);

    @Autowired
    private DeviceManagmentService deviceManagmentService;

    @PostMapping(path = "/devices",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Device saveOrUpdateDevice(@RequestBody Device  device){
        LOGGER.info("Storing Device={}",device);
        return deviceManagmentService.saveDevice(device);
    }

    @GetMapping(path = "/devices",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getDevice(@RequestParam(name = "id",required = false)String deviceId
            , @RequestParam(name = "name",required = false)String deviceName){
       if(deviceId!=null){
           LOGGER.info("Getting device by ID={}",deviceId);
           return ResponseEntity.ok(deviceManagmentService.getDeviceById(deviceId));
       }
       if (deviceName!=null){
           LOGGER.info("Getting device by Name={}",deviceName);
           return ResponseEntity.ok(deviceManagmentService.getDeviceByName(deviceName));
       }
        return ResponseEntity.status(HttpStatus.OK).body(deviceManagmentService.getAllDevices());
    }

    @DeleteMapping(path ="/devices/{id}" )
    public ResponseEntity<Object> deleteDevice(@PathVariable("id")String deviceId){
        deviceManagmentService.deleteDeviceById(deviceId);
        return  ResponseEntity.noContent().build();
    }
}
