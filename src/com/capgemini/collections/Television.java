package com.capgemini.collections;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean is3Denabled;
	private double price;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String company, String type, boolean is3Denabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.is3Denabled = is3Denabled;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", is3Denabled=" + is3Denabled + ", price=" + price
				+ "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIs3Denabled() {
		return is3Denabled;
	}

	public void setIs3Denabled(boolean is3Denabled) {
		this.is3Denabled = is3Denabled;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public int hashCode() {
		return Objects.hash(company,type);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Television television = (Television) obj;
		return this.type==television.type && this.company==television.company;
	}
}

