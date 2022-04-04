package com.microapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microapp.models.Rating;
import com.microapp.models.UserRating;

@RestController
@RequestMapping("RatingApp")
public class RatingController {

	@GetMapping("/movieList/{userID}")
	public UserRating getRatings(@PathVariable("userID") String userID) {

		List<Rating> ratingList = null;
		UserRating userRating = null;

		if (userID.equals("testUser1")) {

			ratingList = Arrays.asList(new Rating(1, 4, "KKHH"), new Rating(2, 3, "KKKG"));

			userRating = new UserRating(userID, ratingList);

		}else {
			ratingList = Arrays.asList(new Rating(3, 4, "KGF1"), new Rating(4, 3, "KGF2"));

			userRating = new UserRating(userID, ratingList);
		}

		System.out.println(ratingList.toString());
		return userRating;

	}
}
