package com.revature.flashcards.review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int reviewId;
	private int userId, flashcardId, rating;
	private String commentStr, date;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Review(int reviewId, int userId, int flashcardId, int rating, String commentStr, String date) {
		super();
		this.reviewId = reviewId;
		this.userId = userId;
		this.flashcardId = flashcardId;
		this.rating = rating;
		this.commentStr = commentStr;
		this.date = date;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlashcardId() {
		return flashcardId;
	}

	public void setFlashcardId(int flashcardId) {
		this.flashcardId = flashcardId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCommentStr() {
		return commentStr;
	}

	public void setCommentStr(String commentStr) {
		this.commentStr = commentStr;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentStr == null) ? 0 : commentStr.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + flashcardId;
		result = prime * result + rating;
		result = prime * result + reviewId;
		result = prime * result + userId;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (commentStr == null) {
			if (other.commentStr != null)
				return false;
		} else if (!commentStr.equals(other.commentStr))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (flashcardId != other.flashcardId)
			return false;
		if (rating != other.rating)
			return false;
		if (reviewId != other.reviewId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", userId=" + userId + ", flashcardId=" + flashcardId + ", rating="
				+ rating + ", commentStr=" + commentStr + ", date=" + date + "]";
	}

}