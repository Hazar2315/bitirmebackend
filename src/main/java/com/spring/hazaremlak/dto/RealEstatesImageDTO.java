package com.spring.hazaremlak.dto;

public class RealEstatesImageDTO {

	private int id;
	private String base64;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}

	
	@Override
	public String toString() {
		return "RealEstatesImageDTO [id=" + id + ", base64=" + base64 + "]";
	}
	
	
	
}
