package com.spring.hazaremlak.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="real_estates_images")
public class RealEstatesImage {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="image_id")
	private int id;
	
	private String base64;
	
	
	@ManyToOne( cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="real_estates_id")
	private RealEstates realEstates;
	
	
	
	
	
	public RealEstatesImage() {
		super();
	}

	public RealEstatesImage(String base64, String contentType, RealEstates realEstates) {
		super();
		this.base64 = base64;
		this.realEstates = realEstates;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}



	public RealEstates getRealEstates() {
		return realEstates;
	}

	public void setRealEstates(RealEstates realEstates) {
		this.realEstates = realEstates;
	}


	
	
}
