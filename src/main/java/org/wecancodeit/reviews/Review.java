package org.wecancodeit.reviews;

public class Review {

	private long reviewId;

	public Review(long reviewId, String string, String string2) {
		this.reviewId = reviewId;
	}

	public Long getId() {
		return reviewId;
	}

}
