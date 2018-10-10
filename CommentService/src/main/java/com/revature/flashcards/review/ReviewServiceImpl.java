package com.revature.flashcards.review;

import java.util.List;
import com.revature.flashcards.review.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	ReviewDao rd;
	
	@Override
	public void addReview(Review rev) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateReview(Review rev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteReview(Review rev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Review> getReviewsByUser(int userId) {
		// matched name to dao layer
		return rd.findByuserid(userId);
	}

	@Override
	public List<Review> getReivewsByCard(int cardId) {
		// matched name to dao layer
		return rd.findBycardid(cardId);
	}

	@Override
	public Review getReviewById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
