package com.example.app.service.impl;

import com.example.app.model.UpdateRegostrationDetails;
import com.example.app.service.DeviceProvisionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DeviceProvisionServiceImpl implements DeviceProvisionService {
    private static final Logger LOGGER= LoggerFactory.getLogger(DeviceProvisionServiceImpl.class);

    @Override
    public void update(UpdateRegostrationDetails updateRegostrationDetails, String accessToken) {
        LOGGER.info("Updated Successfully {} ",updateRegostrationDetails);


    }
}
