package com.revature.flashcards.review;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.revature.flashcards.review.Review;


public interface ReviewDao extends CrudRepository<Review, Integer> {
	// Changed the method name to match what the query wanted
	public List<Review> findByuserid(int userId);
	public List<Review> findBycardid(int cardId);
}
