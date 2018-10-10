package com.revature.flashcards.review;

import java.util.List;
import com.revature.flashcards.review.Review;

public interface ReviewService {
	public void addReview(Review rev);
	public void updateReview(Review rev);
	public void deleteReview(Review rev);
	public List<Review> getReviewsByUserId(Integer userId);
	public List<Review> getReviewsByFlashcardId(Integer flashcardId);
	public Review getReviewById(int id);
}
