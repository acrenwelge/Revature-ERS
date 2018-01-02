package com.ers.model;

public class Request {
	private int reqID; // primary key
	private int empID; // foreign key
	private int mgrID; // foreign key
	private double amount;
	private String description;
	private String dateSubmitted;
	private String dateResolved;
	private boolean isPending;
	private boolean isApproved;
	
	public Request(int reqID,int empID,int mgrID,String date) {
		this.reqID = reqID;
		this.empID = empID;
		this.mgrID = mgrID;
		this.dateSubmitted = date;
		this.isPending = true;
		this.isApproved = false;
	}
	
	public Request() {
		// TODO Auto-generated constructor stub
	}

	public int getReqID() {
		return reqID;
	}
	public void setReqID(int reqID) {
		this.reqID = reqID;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getMgrID() {
		return mgrID;
	}
	public void setMgrID(int mgrID) {
		this.mgrID = mgrID;
	}
	public String getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	public boolean isPending() {
		return isPending;
	}
	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getDateResolved() {
		return dateResolved;
	}

	public void setDateResolved(String dateResolved) {
		this.dateResolved = dateResolved;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}