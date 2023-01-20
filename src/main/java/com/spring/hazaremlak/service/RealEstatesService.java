package com.spring.hazaremlak.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.spring.hazaremlak.dto.CommentRatingDTO;
import com.spring.hazaremlak.dto.RealEstatesImageDTO;
import com.spring.hazaremlak.model.CommentRating;
import com.spring.hazaremlak.model.RealEstates;
import com.spring.hazaremlak.model.RealEstatesFilter;
import com.spring.hazaremlak.model.RealEstatesImage;


public interface RealEstatesService {
	List<RealEstates>  getAllRealEstates();
	RealEstates saveRealEstates(RealEstates realEstates);
	RealEstates getRealEstatesById(int id);
	RealEstatesImage getRealEstatesImageById(int id);
	RealEstates updateRealEstates(RealEstates realEstates,int id);
	void deleteRealEstates(int id);	
	RealEstatesImage upload(RealEstatesImageDTO realEstatesImageDTO);
	List<RealEstatesImage> getAllRealEstatesImage();
	List<RealEstates>getAllByFilter(RealEstatesFilter filter);
	Page<RealEstates>getPageByFilter(RealEstatesFilter filter,Pageable pageable);	
	void deleteImages(int id);
}
