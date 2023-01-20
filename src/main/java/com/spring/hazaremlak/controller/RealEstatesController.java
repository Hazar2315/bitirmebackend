package com.spring.hazaremlak.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hazaremlak.dto.CommentRatingDTO;
import com.spring.hazaremlak.dto.RealEstatesImageDTO;
import com.spring.hazaremlak.dto.RealEstatesResponse;
import com.spring.hazaremlak.model.CommentRating;
import com.spring.hazaremlak.model.RealEstates;
import com.spring.hazaremlak.model.RealEstatesFilter;
import com.spring.hazaremlak.model.RealEstatesImage;
import com.spring.hazaremlak.model.User;
import com.spring.hazaremlak.service.RealEstatesService;



@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/realEstates")
public class RealEstatesController {
	private RealEstatesService realEstatesService;

	public RealEstatesController(RealEstatesService realEstatesService) {
		super();
		this.realEstatesService = realEstatesService;
	}
	@GetMapping()
	public List<RealEstates> getAllUsers(){
		return realEstatesService.getAllRealEstates();
	}
	
	@PostMapping("/saveRealEstates")
	public ResponseEntity<RealEstatesResponse>saveRealEstates(@RequestBody RealEstates realEstates){
		RealEstates responseObject=realEstatesService.saveRealEstates(realEstates);
		RealEstatesResponse saveResponse=new RealEstatesResponse(responseObject.getId(),responseObject.getBodyText());
		return new ResponseEntity<RealEstatesResponse>(saveResponse,HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	public ResponseEntity<RealEstates>getRealEstatesById(@PathVariable("id")int id){
		return new ResponseEntity<RealEstates>(realEstatesService.getRealEstatesById(id),HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public ResponseEntity<RealEstates> updateRealEstates(@PathVariable("id")int id, @RequestBody RealEstates realEstates){
		return new ResponseEntity<RealEstates>(realEstatesService.updateRealEstates(realEstates, id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteRealEstates(@PathVariable("id")int id){
		realEstatesService.deleteRealEstates(id);
		return new ResponseEntity<String>("User deleted successfuly!.",HttpStatus.OK);
	}
	
	@PostMapping("/uploadImage")
	public ResponseEntity<RealEstatesImage> upload(@RequestBody RealEstatesImageDTO realEstatesImage ){
		return new ResponseEntity<RealEstatesImage>(realEstatesService.upload(realEstatesImage),HttpStatus.CREATED);
	}
	@PostMapping("/pageFilter")
	public Page<RealEstates> filter(@RequestBody RealEstatesFilter realEstatesFilter,Pageable pageable ){
		return realEstatesService.getPageByFilter(realEstatesFilter,pageable);
	}
	@PostMapping("/listFilter")
	public List<RealEstates> listFilter(@RequestBody RealEstatesFilter realEstatesFilter){
		return realEstatesService.getAllByFilter(realEstatesFilter);
	}
	@GetMapping("/getImage/{id}")
	public ResponseEntity<RealEstatesImage> getAllRealEstatesImage(@PathVariable("id")int id){
		return new ResponseEntity<RealEstatesImage>(realEstatesService.getRealEstatesImageById(id),HttpStatus.OK);
	}
	@DeleteMapping("/deleteImage/{id}")
	public ResponseEntity<String> deleteImages(@PathVariable("id")int id){
		realEstatesService.deleteImages(id);
		return new ResponseEntity<String>("Real Estates Images Deleted!.",HttpStatus.OK);
	}
	
}
