package com.example.mongoapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

@XmlRootElement
@Document(collection = "onBoard")
public class OnBoard implements Serializable {

    private String domain;
    private String modelId;
    private String modelVersion;
    @Id
    private String deviceId; //mandetory
    private String alias;
    private boolean isActive;
    private Map<String, String> deviceProperties;
    private Map<String, String> encryptionDetails;

    public String getDomain() {
        return domain;
    }

    public String getModelId() {
        return modelId;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getAlias() {
        return alias;
    }

    public boolean isActive() {
        return isActive;
    }

    public Map<String, String> getDeviceProperties() {
        return deviceProperties;
    }

    public Map<String, String> getEncryptionDetails() {
        return encryptionDetails;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDeviceProperties(Map<String, String> deviceProperties) {
        this.deviceProperties = deviceProperties;
    }

    public void setEncryptionDetails(Map<String, String> encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnBoard)) return false;
        OnBoard onBoard = (OnBoard) o;
        return isActive == onBoard.isActive &&
                Objects.equals(domain, onBoard.domain) &&
                Objects.equals(modelId, onBoard.modelId) &&
                Objects.equals(modelVersion, onBoard.modelVersion) &&
                Objects.equals(deviceId, onBoard.deviceId) &&
                Objects.equals(alias, onBoard.alias) &&
                Objects.equals(deviceProperties, onBoard.deviceProperties) &&
                Objects.equals(encryptionDetails, onBoard.encryptionDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, modelId, modelVersion, deviceId, alias, isActive, deviceProperties, encryptionDetails);
    }

    public OnBoard(String domain, String modelId, String modelVersion, String deviceId, String alias, boolean isActive, Map<String, String> deviceProperties, Map<String, String> encryptionDetails) {
        this.domain = domain;
        this.modelId = modelId;
        this.modelVersion = modelVersion;
        this.deviceId = deviceId;
        this.alias = alias;
        this.isActive = isActive;
        this.deviceProperties = deviceProperties;
        this.encryptionDetails = encryptionDetails;
    }

    @Override
    public String toString() {
        return "OnBoard{" +
                "domain='" + domain + '\'' +
                ", modelId='" + modelId + '\'' +
                ", modelVersion='" + modelVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", alias='" + alias + '\'' +
                ", isActive=" + isActive +
                ", deviceProperties=" + deviceProperties +
                ", encryptionDetails=" + encryptionDetails +
                '}';
    }

    public OnBoard() {
    }
}
