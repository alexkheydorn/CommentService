package com.revature.flashcards.review;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
	List<Review> findByuserId(Integer userId);
	List<Review> findByflashcardId(Integer flashcardId);
}
