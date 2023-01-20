package com.spring.hazaremlak.dto;

public class RealEstatesResponse {
	private int id;
	private String bodyText;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBodyText() {
		return bodyText;
	}

	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}

	public RealEstatesResponse(int id,String bodyText) {
		super();
		this.id = id;
		this.bodyText=bodyText;
	}
	
}
