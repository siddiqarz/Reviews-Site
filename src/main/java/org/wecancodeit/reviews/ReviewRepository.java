package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review dubai = new Review(1L, "Dubai", "Asia",
				"Amazing city, bursting with life, super expensive but with multitudes of things to do.",
				"/images/dubai.jpg", "5");
		Review sydney = new Review(2L, "Sydney", "Australia",
				"Australia's newly renovated landmark, the Sydney Opera House, showcasing new machinery, lighting and improved acoustics, makes Sydney an amazing spot.",
				"/images/sydney.jpg", "4");
		Review newOrleans = new Review(3L, "New Orleans", "North America",
				"With its colorful demeanor and non-stop energy, the Big Easy doesn’t appear a day over 200.",
				"/images/New Orleans.jpg", "4");
		Review sanya = new Review(3L, "Sanya", "Asia",
				"The Hawaii of China. Sunny, tranquil stretch of South China Sea. A haven for beach lovers and foodies",
				"/images/Sanya.jpg", "5");
		Review paris = new Review(4L, "Paris", "Europe", "An abundance of museums, amazing cafes, stellar shopping experince, the city for lovers of art and history", "/images/paris.jpg", "4.5");
		
		reviewList.put(dubai.getId(), dubai);
		reviewList.put(sydney.getId(), sydney);
		reviewList.put(newOrleans.getId(), newOrleans);
		reviewList.put(sanya.getId(), sanya);
		reviewList.put(paris.getId(), paris);
	}

	public Review findOne(long reviewId) {
		return reviewList.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

	// Constructor for testing
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}

	}
}
