package com.revature.flashcards.review;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.revature.flashcards.review.Review;


public interface ReviewDao extends CrudRepository<Review, Integer> {
	public List<Review> getReviewsByUser(Object user);
	public List<Review> getReivewsByCard(Object card);

}
