package com.revature.flashcards.review;

import java.util.List;
import com.revature.flashcards.review.Review;

public interface ReviewService {
	public void addReview(Review rev);
	public void updateReview(Review rev);
	public void deleteReview(Review rev);
	public List<Review> getReviewsByUser(int userId);
	public List<Review> getReivewsByCard(int cardId);
	public Review getReviewById(int id);
}
