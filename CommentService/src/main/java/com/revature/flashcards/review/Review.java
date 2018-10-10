package com.revature.flashcards.review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int reviewid;
	private int userid, cardid, rating;
	private String comment, date;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Review(int reviewid, int userid, int cardid, int rating, String comment, String date) {
		super();
		this.reviewid = reviewid;
		this.userid = userid;
		this.cardid = cardid;
		this.rating = rating;
		this.comment = comment;
		this.date = date;
	}
	
	public int getReviewid() {
		return reviewid;
	}
	
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public int getCardid() {
		return cardid;
	}
	
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
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
		result = prime * result + cardid;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + rating;
		result = prime * result + reviewid;
		result = prime * result + userid;
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
		if (cardid != other.cardid)
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (rating != other.rating)
			return false;
		if (reviewid != other.reviewid)
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", userid=" + userid + ", cardid=" + cardid + ", rating=" + rating
				+ ", comment=" + comment + ", date=" + date + "]";
	}

}