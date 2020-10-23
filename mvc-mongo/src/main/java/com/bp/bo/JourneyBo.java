package com.bp.bo;

import java.io.Serializable;
import java.util.Date;

public class JourneyBo implements Serializable{
	protected int journeyId;
	protected String source;
	protected String destination;
	protected Date travelDate;
	protected float cost;
	protected int timeInHours;
	BusProviderBo busProviderBo;
	public int getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getTimeInHours() {
		return timeInHours;
	}
	public void setTimeInHours(int timeInHours) {
		this.timeInHours = timeInHours;
	}
	public BusProviderBo getBusProviderBo() {
		return busProviderBo;
	}
	public void setBusProviderBo(BusProviderBo busProviderBo) {
		this.busProviderBo = busProviderBo;
	}
	public JourneyBo(int journeyId, String source, String destination, Date travelDate, float cost, int timeInHours,
			BusProviderBo busProviderBo) {
		this.journeyId = journeyId;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.cost = cost;
		this.timeInHours = timeInHours;
		this.busProviderBo = busProviderBo;
	}
	
	
	

}
