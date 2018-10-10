package com.revature.flashcards.review;

import java.util.List;
import com.revature.flashcards.review.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	ReviewRepository rd;
	
	@Override
	public void addReview(Review rev) {
		// TODO Auto-generated method stub
		rd.save(rev);
	}

	@Override
	public void updateReview(Review rev) {
		// TODO Auto-generated method stub
		rd.save(rev);
	}

	@Override
	public void deleteReview(Review rev) {
		// TODO Auto-generated method stub
		rd.delete(rev);
	}

	@Override
	public List<Review> getReviewsByUserId(Integer userId) {
		return rd.findByuserId(userId);
	}

	@Override
	public List<Review> getReviewsByFlashcardId(Integer flashcardId) {
		return rd.findByflashcardId(flashcardId);
	}

	@Override
	public Review getReviewById(int id) {
		// TODO Auto-generated method stub
		return rd.findOne(id);
	}

}
