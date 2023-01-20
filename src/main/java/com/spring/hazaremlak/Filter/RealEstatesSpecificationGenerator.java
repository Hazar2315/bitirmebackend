package com.spring.hazaremlak.Filter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.spring.hazaremlak.model.RealEstates;
import com.spring.hazaremlak.model.RealEstatesFilter;

public class RealEstatesSpecificationGenerator {

	
	public static Specification<RealEstates> filter(RealEstatesFilter filter){
		return ((root,query,criteriaBuilder)->{
			List<Predicate> predicates=new ArrayList<>();
			
			if(filter.getKiralikSatilik()!=null) {
				predicates.add(criteriaBuilder.equal(root.get("kiralikSatilik"), filter.getKiralikSatilik()));
			}
			/*if(filter.getFiyat()==0) {
				predicates.add(
						
						(Predicate) query.orderBy(
								criteriaBuilder.asc(root.get("fiyat"))
								));
			}
			if(filter.getFiyat()==0) {
				predicates.add(
						
						(Predicate) query.orderBy(
								criteriaBuilder.desc(root.get("fiyat"))
								));
			}*/
			if(filter.getMinMetrekare()!=0 && filter.getMaxMetrekare()!=0) {
	      predicates.add(criteriaBuilder.between(root.get("metrekare"),filter.getMinMetrekare(),filter.getMaxMetrekare()));	
	     
			}
			
			if(filter.getOdaSayisi()!=null) {
				predicates.add(criteriaBuilder.equal(root.get("odaSayisi"), filter.getOdaSayisi()));
			}
			if(filter.getMinBinaYasi()!=0 && filter.getMaxBinaYasi()!=0) {
			predicates.add(criteriaBuilder.between(root.get("binaYasi"), filter.getMinBinaYasi(),filter.getMaxBinaYasi()));
			}
			
			if(filter.getMinFiyat()!=0 && filter.getMaxFiyat()!=0) {
				predicates.add(criteriaBuilder.between(root.get("fiyat"), filter.getMinFiyat(),filter.getMaxFiyat()));
				}
			
			if(filter.getRealEstateType()!=null) {
				predicates.add(criteriaBuilder.equal(root.get("realEstateType"), filter.getRealEstateType()));
			}

			
			return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			
		});
		
	
		
		
		
	}
		
	}

