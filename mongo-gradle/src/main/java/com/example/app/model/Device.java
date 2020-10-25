package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

@XmlRootElement
@Document(collection = "devices")
@JsonSerialize
public class Device {
    @Id
    @JsonProperty("id")
    @Generated(value = "increment")
    private String deviceId;
    @JsonProperty
    private String name;
    @JsonProperty
    private String model;
    @JsonProperty
    private String version;
    @JsonProperty
    private Date manufactureDate;
    @JsonProperty
    private boolean isActive;
    @JsonProperty("properties")
    private Map<String,String> deviceProperties;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Map<String, String> getDeviceProperties() {
        return deviceProperties;
    }

    public void setDeviceProperties(Map<String, String> deviceProperties) {
        this.deviceProperties = deviceProperties;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", version='" + version + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", isActive=" + isActive +
                ", deviceProperties=" + deviceProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return isActive == device.isActive &&
                Objects.equals(deviceId, device.deviceId) &&
                Objects.equals(name, device.name) &&
                Objects.equals(model, device.model) &&
                Objects.equals(version, device.version) &&
                Objects.equals(manufactureDate, device.manufactureDate) &&
                Objects.equals(deviceProperties, device.deviceProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, name, model, version, manufactureDate, isActive, deviceProperties);
    }
}
