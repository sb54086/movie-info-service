package com.example.mongoapp.controller;

import com.example.mongoapp.model.OnBoard;
import com.example.mongoapp.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/va/device")
public class DeviceProvisioningController {
    @Autowired
    private DeviceService deviceService;

    @PostMapping(path = "/onboard")
    public ResponseEntity<Object> onBoardDevice(
            @RequestHeader(name = "Authorization",required = true) String token,
            @RequestBody  OnBoard onboard){



        return new ResponseEntity(deviceService.onBoardDevice(onboard), HttpStatus.OK);
    }
}
