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
	public List<Review> getReviewsByUser(Object user) {
		return rd.getReviewsByUser(user);
	}

	@Override
	public List<Review> getReivewsByCard(Object card) {
		return rd.getReivewsByCard(card);
	}

	@Override
	public Review getReviewById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
