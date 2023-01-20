package com.spring.hazaremlak.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.hazaremlak.model.CommentRating;

public interface CommentRatingRepository extends JpaRepository<CommentRating,Integer> {

	@Query("select c from CommentRating c where c.realEstates.id= :id")
	List<CommentRating> findAllByRealId(@Param("id")Integer id);
}
