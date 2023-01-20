package com.spring.hazaremlak.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="real_estates")
public class RealEstates {

	@Column(name="real_estates_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="header_text",nullable=false)
	private String headerText;
	
	@Column(name="body_text",nullable=false)
	private String bodyText;
	
	@Column(name="kiralik_satilik",nullable=false)
	private String kiralikSatilik;
	
	@Column(name="fiyat",nullable=false)
	private int fiyat;
	
	@Column(name="metrekare",nullable=false)
	private int metrekare;
	
	@Column(name="oda_sayisi",nullable=false)
	private String odaSayisi;
	
	@Column(name="bina_yasi",nullable=false)
	private int binaYasi;
	
	
	@Column(name="real_estate_type",nullable=false)
	private String realEstateType;
	
	@OneToMany(mappedBy="realEstates",cascade = CascadeType.ALL)
	private Set<CommentRating>commentRating;
	 
	@OneToMany(mappedBy="realEstates",cascade = CascadeType.ALL)
	private Set<RealEstatesImage>realEstatesImage;
	
	public RealEstates() {
		super();
	}
	
	
	
	public RealEstates( String headerText, String bodyText, String kiralikSatilik, int fiyat, int metrekare,
			String odaSayisi, int binaYasi,  String realEstateType,int id
			
			) {
		super();
		this.id=id;
		this.headerText = headerText;
		this.bodyText = bodyText;
		this.kiralikSatilik = kiralikSatilik;
		this.fiyat = fiyat;
		this.metrekare = metrekare;
		this.odaSayisi = odaSayisi;
		this.binaYasi = binaYasi;

		this.realEstateType = realEstateType;
		
	}

	
	
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getHeaderText() {
		return headerText;
	}



	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}



	public String getBodyText() {
		return bodyText;
	}



	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}



	public String getKiralikSatilik() {
		return kiralikSatilik;
	}



	public void setKiralikSatilik(String kiralikSatilik) {
		this.kiralikSatilik = kiralikSatilik;
	}



	public int getFiyat() {
		return fiyat;
	}



	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}



	public int getMetrekare() {
		return metrekare;
	}



	public void setMetrekare(int metrekare) {
		this.metrekare = metrekare;
	}



	public String getOdaSayisi() {
		return odaSayisi;
	}



	public void setOdaSayisi(String odaSayisi) {
		this.odaSayisi = odaSayisi;
	}



	public int getBinaYasi() {
		return binaYasi;
	}



	public void setBinaYasi(int binaYasi) {
		this.binaYasi = binaYasi;
	}







	public String getRealEstateType() {
		return realEstateType;
	}



	public void setRealEstateType(String realEstateType) {
		this.realEstateType = realEstateType;
	}
	
	
	
	
}
