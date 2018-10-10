package com.revature.flashcard.driver;

import com.revature.flashcards.review.ReviewService;
import com.revature.flashcards.review.ReviewServiceImpl;

public class Driver {

	public static void main(String[] args) {
		ReviewService rs = new ReviewServiceImpl();
		System.out.println(rs.getReviewById(2));
	}
}
