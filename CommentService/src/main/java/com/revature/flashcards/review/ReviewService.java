package com.revature.flashcards.review;

import java.util.List;
import com.revature.flashcards.review.Review;

public interface ReviewService {
	public void addReview(Review rev);
	public void updateReview(Review rev);
	public void deleteReview(Review rev);
	public List<Review> getReviewsByUser(Object user);
	public List<Review> getReivewsByCard(Object card);
	public Review getReviewById(int id);
}
