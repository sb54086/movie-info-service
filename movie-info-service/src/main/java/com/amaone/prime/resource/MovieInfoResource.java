package com.amaone.prime.resource;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amaone.prime.bean.Movie;

@RestController
@RequestMapping("/movie")
public class MovieInfoResource {

	@RequestMapping(method = RequestMethod.GET,value = "/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId")int movieId) {
		Movie movie=null;
		movie=new Movie();
		movie.setMovieId(movieId);
		movie.setMovieName("Transformer");
		movie.setDescription("Nice With "+UUID.randomUUID().toString());
		return movie;
	}
	

}
