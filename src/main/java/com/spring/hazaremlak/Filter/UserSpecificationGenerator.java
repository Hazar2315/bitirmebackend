package com.spring.hazaremlak.Filter;

import com.spring.hazaremlak.model.UserFilter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.Predicate;
import com.spring.hazaremlak.model.User;
public class UserSpecificationGenerator {

	public static Specification<User> filter(UserFilter filter){
		return ((root,query,criteriaBuilder)->{
			List<Predicate> predicates=new ArrayList<>();
			predicates.add(
					criteriaBuilder.or(
							criteriaBuilder.like(root.get("userName"), "%"+filter.getUserName() +"%"),
							criteriaBuilder.like(root.get("surName"), "%"+filter.getSurName() +"%"),
							criteriaBuilder.like(root.get("role"), "%"+filter.getRole() +"%")
							)
					);
			
	//		predicates.add(criteriaBuilder.like(root.get("userName"), "%"+filter.getUserName() +"%"));
	//		predicates.add(criteriaBuilder.like(root.get("surName"), "%"+filter.getSurName() +"%"));
	//		predicates.add(criteriaBuilder.like(root.get("role"), "%"+filter.getRole() +"%"));
			return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()])); 
		});		
	}
}
