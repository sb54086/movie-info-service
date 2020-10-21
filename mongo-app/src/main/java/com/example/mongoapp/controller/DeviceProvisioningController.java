package com.example.mongoapp.controller;

import com.example.mongoapp.model.OnBoard;
import com.example.mongoapp.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

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
    @GetMapping(path = {"/onboard"})
    public ResponseEntity<Object> getAllOnboardDevices(){
        return  ResponseEntity.ok(deviceService.getAllBoardDevices());
    }
    @GetMapping(path = {"/onboard/demo"})
    public ResponseEntity<Object> getAllOnboardDevices2(){
        OnBoard board;
        board = new OnBoard("domain1","model1","version.1.2","dvId0klapi",
                "hostPrinter",true,
                Collections.singletonMap("deviceProp1","valu1"),
                Collections.singletonMap("encryptionKey1","Value1"));
        ; return  ResponseEntity.ok(Collections.singletonList(board));
    }
}
