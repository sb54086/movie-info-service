package com.bp.bo;

import java.util.Date;

public class TravelCriteriaBo {
	protected int busProviderNo;
	protected String providerName;
	protected String  source;
	protected String destination;
	protected Date travelDate;
	protected int minPrice;
	protected int maxPrice;
	public int getBusProviderNo() {
		return busProviderNo;
	}
	public void setBusProviderNo(int busProviderNo) {
		this.busProviderNo = busProviderNo;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	public TravelCriteriaBo(int busProviderNo, String providerName, String source, String destination, Date travelDate,
			int minPrice, int maxPrice) {
		this.busProviderNo = busProviderNo;
		this.providerName = providerName;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}
	public TravelCriteriaBo() {
	}
	

}
