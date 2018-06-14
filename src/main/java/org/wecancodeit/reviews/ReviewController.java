package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/show-reviews") //controller controlling end points where we're mapping to
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		//(attribute name(model name), and attributeValue(everything going to show on template)
		return "reviews";
	}
}
