package com.amaone.prime.bean;

public class Movie {
	private int movieId;
	private String description;
	private String movieName;
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Movie(int movieId, String description) {
		super();
		this.movieId = movieId;
		this.description = description;
	}
	public Movie() {
		super();
	}
	

}
