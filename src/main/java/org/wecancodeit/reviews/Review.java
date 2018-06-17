package org.wecancodeit.reviews;

public class Review {

	private long reviewId;
	private String reviewTitle;
	private String reviewCategory;
	private String content;
	private String imageUrl;
	private String rating;

	public Review(long reviewId, String reviewTitle, String reviewCategory, String content, String imageUrl,
			String rating) {
		this.reviewId = reviewId;
		this.reviewTitle = reviewTitle;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.imageUrl = imageUrl;
		this.rating = rating;

	}

	public Long getId() {
		return reviewId;
	}

	public String getTitle() {
		return reviewTitle;
	}

	public String getCategory() {
		return reviewCategory;
	}

	public String getContent() {
		return content;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getRating() {
		return rating;
	}
}
