package org.wecancodeit.reviews;

public class Review {

	private long reviewId;

	public Review(long reviewId, String reviewTitle, String reviewCategory, String Content, String imageUrl,
			int rating) {
		this.reviewId = reviewId;
	}

	public Long getId() {
		return reviewId;
	}

}
