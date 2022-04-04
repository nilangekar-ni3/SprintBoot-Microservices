package com.microapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microapp.modals.Movie;

@RestController
@RequestMapping("/MovieApp")
public class MovieController {
	
	static List<Movie> movieList =null;
	
	static {
		try {
			movieList = Arrays.asList(new Movie(1, "KKHH", "LOVE MOVIE"),new Movie(2, "KKKG", "MIX MOVIE"), 
					new Movie(3, "KGF1", "KGF1 MOVIE"),new Movie(4, "KGF2", "KGF2 MOVIE"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GetMapping(("getMovies/{movieID}"))
	public Movie getMovieDetails(@PathVariable("movieID") int movieID) {
		
		Movie m1 =null;
		
		System.out.println("movieID-"+movieID);
		for (Movie m : movieList) {
			
			if(m.getMovieId() == movieID) {
				m1 = m;
			}
		}
		
		return m1;
		
	}
	
}
