package com.spring.hazaremlak.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spring.hazaremlak.Filter.RealEstatesSpecificationGenerator;
import com.spring.hazaremlak.dto.CommentRatingDTO;
import com.spring.hazaremlak.dto.RealEstatesImageDTO;
import com.spring.hazaremlak.exception.ResourceNotFoundException;
import com.spring.hazaremlak.model.CommentRating;
import com.spring.hazaremlak.model.RealEstates;
import com.spring.hazaremlak.model.RealEstatesFilter;
import com.spring.hazaremlak.model.RealEstatesImage;
import com.spring.hazaremlak.model.User;
import com.spring.hazaremlak.respository.CommentRatingRepository;
import com.spring.hazaremlak.respository.RealEstatesImageRepository;
import com.spring.hazaremlak.respository.RealEstatesRepository;
import com.spring.hazaremlak.respository.UserRepository;
import com.spring.hazaremlak.service.RealEstatesService;

@Service
public class RealEstatesServiceImpl implements RealEstatesService {
	
	private RealEstatesRepository realEstatesRepository;
	private RealEstatesImageRepository realEstatesImageRepository;
	private UserRepository userRepository;
	private CommentRatingRepository commentRatingRepository;
	public RealEstatesServiceImpl(RealEstatesRepository realEstatesRepository,RealEstatesImageRepository realEstatesImageRepository,UserRepository userRepository,CommentRatingRepository commentRatingRepository) {
		super();
		this.realEstatesRepository = realEstatesRepository;
		this.realEstatesImageRepository=realEstatesImageRepository;
		this.userRepository=userRepository;
		this.commentRatingRepository=commentRatingRepository;
	}

	@Override
	public RealEstates saveRealEstates(RealEstates realEstates) {
		// TODO Auto-generated method stub
		return realEstatesRepository.save(realEstates);
	}

	@Override
	public RealEstates getRealEstatesById(int id) {
		// TODO Auto-generated method stub
		return realEstatesRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("RealEstates","Id",id) 
				);
	}

	@Override
	public RealEstates updateRealEstates(RealEstates realEstates, int id) {
		RealEstates existingRealEstates=realEstatesRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("RealEstates","Id",id)
				);
		existingRealEstates.setHeaderText(realEstates.getHeaderText());
		existingRealEstates.setBodyText(realEstates.getBodyText());
		existingRealEstates.setKiralikSatilik(realEstates.getKiralikSatilik());
		existingRealEstates.setFiyat(realEstates.getFiyat());
		existingRealEstates.setMetrekare(realEstates.getMetrekare());
		existingRealEstates.setOdaSayisi(realEstates.getOdaSayisi());
		existingRealEstates.setBinaYasi(realEstates.getBinaYasi());
		existingRealEstates.setRealEstateType(realEstates.getRealEstateType());
		
		realEstatesRepository.save(existingRealEstates);
		
		return existingRealEstates;
	}

	@Override
	public void deleteRealEstates(int id) {

		realEstatesRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("RealEstates","Id",id));
		realEstatesRepository.deleteById(id);
		
	}

	@Override
	public List<RealEstates> getAllRealEstates() {
		// TODO Auto-generated method stub
		return realEstatesRepository.findAll();	}
	
	public List<RealEstates> getAllByFilter(RealEstatesFilter filter){
		return realEstatesRepository.findAll(RealEstatesSpecificationGenerator.filter(filter));
	}
    public Page<RealEstates> getPageByFilter(RealEstatesFilter filter,Pageable pageable){
		return realEstatesRepository.findAll(RealEstatesSpecificationGenerator.filter(filter),pageable);
	}

	@Override
	public RealEstatesImage upload(RealEstatesImageDTO realEstatesImageDTO) {
		// TODO Auto-generated method stub
		RealEstatesImage realEstatesImage=new RealEstatesImage();
		realEstatesImage.setRealEstates(realEstatesRepository.findById(realEstatesImageDTO.getId()).get());
		realEstatesImage.setBase64(realEstatesImageDTO.getBase64());
		return realEstatesImageRepository.save(realEstatesImage) ;
	}

	@Override
	public List<RealEstatesImage> getAllRealEstatesImage() {
		// TODO Auto-generated method stub
		return realEstatesImageRepository.findAll();
		//return realEstatesRepository.findAll();	
	}

	@Override
	public RealEstatesImage getRealEstatesImageById(int id) {
		// TODO Auto-generated method stub
		return realEstatesImageRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("RealEstatesImages","Id",id));
	}

	@Override
	public void deleteImages(int id) {
		// TODO Auto-generated method stub
		realEstatesImageRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Images","Id",id));
		realEstatesImageRepository.deleteById(id);
	}

	
	

	
	

	
	

}
