package com.bp.dto;

public class MatchedJourneyDto {
	protected String buisnessName;
	protected String primaryBuisnessContactNo;
	protected String primaryBuisnessEmailAdress;
	protected float cost;
	protected int timeInHours;
	public MatchedJourneyDto(String buisnessName, String primaryBuisnessContactNo, String primaryBuisnessEmailAdress,
			float cost, int timeInHours) {
		super();
		this.buisnessName = buisnessName;
		this.primaryBuisnessContactNo = primaryBuisnessContactNo;
		this.primaryBuisnessEmailAdress = primaryBuisnessEmailAdress;
		this.cost = cost;
		this.timeInHours = timeInHours;
	}
	public String getBuisnessName() {
		return buisnessName;
	}
	public void setBuisnessName(String buisnessName) {
		this.buisnessName = buisnessName;
	}
	public String getPrimaryBuisnessContactNo() {
		return primaryBuisnessContactNo;
	}
	public void setPrimaryBuisnessContactNo(String primaryBuisnessContactNo) {
		this.primaryBuisnessContactNo = primaryBuisnessContactNo;
	}
	public String getPrimaryBuisnessEmailAdress() {
		return primaryBuisnessEmailAdress;
	}
	public void setPrimaryBuisnessEmailAdress(String primaryBuisnessEmailAdress) {
		this.primaryBuisnessEmailAdress = primaryBuisnessEmailAdress;
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
	
	

}
