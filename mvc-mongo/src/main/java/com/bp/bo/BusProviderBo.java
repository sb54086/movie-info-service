package com.bp.bo;

import java.util.Date;

public class BusProviderBo {
	protected int busProviderId;
	protected String buisnessName;
	protected Date associationDate;
	protected String primaryBuisnessContactNo;
	protected String primaryBuisnessEmailAdress;
	protected String status;
	public int getBusProviderId() {
		return busProviderId;
	}
	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}
	public String getBuisnessName() {
		return buisnessName;
	}
	public void setBuisnessName(String buisnessName) {
		this.buisnessName = buisnessName;
	}
	public Date getAssociationDate() {
		return associationDate;
	}
	public void setAssociationDate(Date associationDate) {
		this.associationDate = associationDate;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BusProviderBo(int busProviderId, String buisnessName, Date associationDate, String primaryBuisnessContactNo,
			String primaryBuisnessEmailAdress, String status) {
		this.busProviderId = busProviderId;
		this.buisnessName = buisnessName;
		this.associationDate = associationDate;
		this.primaryBuisnessContactNo = primaryBuisnessContactNo;
		this.primaryBuisnessEmailAdress = primaryBuisnessEmailAdress;
		this.status = status;
	}
	

}
