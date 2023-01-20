package com.spring.hazaremlak.model;

import lombok.Builder;

@Builder
public class RealEstatesFilter {
	
	
	private String kiralikSatilik;
	private int minMetrekare;
	private int maxMetrekare;
	
	private String odaSayisi;
	private int minFiyat;
	private int maxFiyat;
	private int minBinaYasi;
	private int maxBinaYasi;
	private int fiyat;
	private int metrekare;
	private int binaYasi;
	private String realEstateType;


	


	public int getMaxMetrekare() {
		return maxMetrekare;
	}
	public void setMaxMetrekare(int maxMetrekare) {
		this.maxMetrekare = maxMetrekare;
	}
	public int getMinMetrekare() {
		return minMetrekare;
	}
	public void setMinMetrekare(int minMetrekare) {
		this.minMetrekare = minMetrekare;
	}
	
	public String getKiralikSatilik() {
		return kiralikSatilik;
	}
	public void setKiralikSatilik(String kiralikSatilik) {
		this.kiralikSatilik = kiralikSatilik;
	}

	public String getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(String odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public String getRealEstateType() {
		return realEstateType;
	}
	public void setRealEstateType(String realEstateType) {
		this.realEstateType = realEstateType;
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
	public int getBinaYasi() {
		return binaYasi;
	}
	public void setBinaYasi(int binaYasi) {
		this.binaYasi = binaYasi;
	}
	public int getMinFiyat() {
		return minFiyat;
	}
	public void setMinFiyat(int minFiyat) {
		this.minFiyat = minFiyat;
	}
	public int getMaxFiyat() {
		return maxFiyat;
	}
	public void setMaxFiyat(int maxFiyat) {
		this.maxFiyat = maxFiyat;
	}
	public int getMinBinaYasi() {
		return minBinaYasi;
	}
	public void setMinBinaYasi(int minBinaYasi) {
		this.minBinaYasi = minBinaYasi;
	}
	public int getMaxBinaYasi() {
		return maxBinaYasi;
	}
	public void setMaxBinaYasi(int maxBinaYasi) {
		this.maxBinaYasi = maxBinaYasi;
	}
	public RealEstatesFilter(String kiralikSatilik,  int minMetrekare,int maxMetrekare, String odaSayisi, int minFiyat,
			int maxFiyat, int minBinaYasi, int maxBinaYasi, int fiyat, int metrekare, int binaYasi,
			String realEstateType) {
		super();
		this.kiralikSatilik = kiralikSatilik;
		this.minMetrekare = minMetrekare;
		this.maxMetrekare = maxMetrekare;
		this.odaSayisi = odaSayisi;
		this.minFiyat = minFiyat;
		this.maxFiyat = maxFiyat;
		this.minBinaYasi = minBinaYasi;
		this.maxBinaYasi = maxBinaYasi;
		this.fiyat = fiyat;
		this.metrekare = metrekare;
		this.binaYasi = binaYasi;
		this.realEstateType = realEstateType;
	}





	

	
	

	
	
}
