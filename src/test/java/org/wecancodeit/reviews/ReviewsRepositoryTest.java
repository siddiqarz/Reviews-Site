package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewsRepositoryTest {
	ReviewRepository underTest;

	private long reviewId = 1L;
	private long secondReviewId = 2L;

	private Review review = new Review(reviewId, "reviewTitle", "reviewCategory", "content", "/images/dubai", "4");
	private Review secondReview = new Review(secondReviewId, "reviewTitle", "reviewCategory", "content", "", "4");
	

	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(review);
		Review result = underTest.findOne(reviewId);
		assertThat(result, is(review));
	}

	@Test
	public void shouldFindASecondReviewById() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(review, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(review, secondReview));
	}
	
}
