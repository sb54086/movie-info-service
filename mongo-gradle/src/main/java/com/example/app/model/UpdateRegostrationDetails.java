package com.example.app.model;

import java.util.Map;

public class UpdateRegostrationDetails {
    private String domain;

    private String deviceId;
    private Map<String ,Object> deviceProperties;
    private Map<String,Object> encryptionDetails;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Map<String, Object> getDeviceProperties() {
        return deviceProperties;
    }

    public void setDeviceProperties(Map<String, Object> deviceProperties) {
        this.deviceProperties = deviceProperties;
    }

    public Map<String, Object> getEncryptionDetails() {
        return encryptionDetails;
    }

    public void setEncryptionDetails(Map<String, Object> encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
    }

    @Override
    public String toString() {
        return "UpdateRegostrationDetails{" +
                "domain='" + domain + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceProperties=" + deviceProperties +
                ", encryptionDetails=" + encryptionDetails +
                '}';
    }
}
