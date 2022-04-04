package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.modals.CatalogItem;
import com.example.demo.modals.Movie;
import com.example.demo.modals.Rating;
import com.example.demo.modals.UserRating;

@RestController
@RequestMapping("/MovieCatalog")
public class MovieCatalogController {
	
	public static String CLASS_NAME = "MovieCatalogController";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{userID}")
	public List<CatalogItem> getMovieCatalog(@PathVariable("userID") String userID) {
		System.out.println(CLASS_NAME+"-"+userID);
		
		List<CatalogItem> catalogIteam = new ArrayList<>();
		
		UserRating ratings = restTemplate.getForObject("http://MOVIE-RATING-SERVICE/RatingApp/movieList/"+userID, UserRating.class);
		System.out.println(ratings.toString());
		
        for (Rating rating : ratings.getUserRatingList()) {
        	System.out.println("Rating:****"+rating.getMovieId());
        	 Movie movie = restTemplate.getForObject("http://MOVIE-INFO-SERVICE/MovieApp/getMovies/"+rating.getMovieId(), Movie.class);
        	 System.out.println("MovieName***"+movie.getMovieName());
        	 CatalogItem citem = new CatalogItem(userID, movie.getMovieId(), movie.getMovieName(), movie.getDescription() , rating.getRating());
            catalogIteam.add(citem);
        }
		
     		
		return catalogIteam;
		
	}
}
