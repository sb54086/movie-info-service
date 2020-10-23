package com.bp.dto;

public class BusProviderDto {
	protected int busProviderId;
	protected String providerName;
	public BusProviderDto(int busProviderId, String providerName) {
		this.busProviderId = busProviderId;
		this.providerName = providerName;
	}
	public int getBusProviderId() {
		return busProviderId;
	}
	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	

}
