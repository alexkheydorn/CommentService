package com.revature.flashcards.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ratings")
public class ReviewController {
	@Autowired
	private ReviewService rs;
	
	@RequestMapping(method=RequestMethod.POST)
	void addReview(@RequestBody Review rev) {
		rs.addReview(rev);
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	List<Review> getReviewsByUserId(@PathVariable Integer id){
		return rs.getReviewsByUserId(id);
	}
	
	@RequestMapping(value="/card/{id}", method=RequestMethod.GET)
	List<Review> getReviewsByFlashcardId(@PathVariable Integer id){
		System.err.println("IN CONTROLLER");
		return rs.getReviewsByFlashcardId(id);
	}

	@RequestMapping(method=RequestMethod.DELETE)
	void deleteReview(@RequestBody Review rev) {
		rs.deleteReview(rev);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	void updateReview(@RequestBody Review rev) {
		rs.updateReview(rev);
	}
}
