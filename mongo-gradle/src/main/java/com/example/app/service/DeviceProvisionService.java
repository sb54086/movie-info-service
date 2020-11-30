package com.example.app.service;

import com.example.app.model.UpdateRegostrationDetails;

public interface DeviceProvisionService {
    void update(UpdateRegostrationDetails updateRegostrationDetails,String accessToken);
}
