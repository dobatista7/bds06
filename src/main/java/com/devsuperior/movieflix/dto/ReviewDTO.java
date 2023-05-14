package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String text;

	private List<MovieDTO> movie = new ArrayList<>();

	private List<UserDTO> user = new ArrayList<>();
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text) {
		this.id = id;
		this.text = text;
	}
	
	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
	}
	
	public ReviewDTO(Review entity, List<MovieDTO> movie,List<UserDTO> user ) {
		this(entity);
		movie.forEach(mov -> this.movie.add(new MovieDTO()));
		user.forEach(u -> this.user.add(new UserDTO()));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<MovieDTO> getMovie() {
		return movie;
	}

	public void setMovie(List<MovieDTO> movie) {
		this.movie = movie;
	}

	public List<UserDTO> getUser() {
		return user;
	}

	public void setUser(List<UserDTO> user) {
		this.user = user;
	}
	
	

}
