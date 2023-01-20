package com.spring.hazaremlak.dto;

public class RealEstatesImagesResponse {

	private int id;
	private String base64;
	private String contentType;
	public RealEstatesImagesResponse(int id, String base64, String contentType) {
		super();
		this.id = id;
		this.base64 = base64;
		this.contentType = contentType;
	}
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
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	
	
}
