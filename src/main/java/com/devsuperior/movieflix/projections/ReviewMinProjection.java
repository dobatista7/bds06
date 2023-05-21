package com.devsuperior.movieflix.projections;

import com.devsuperior.movieflix.dto.UserDTO;

public interface ReviewMinProjection {
	
	Long getId();
	String getText();
	Long getMovie();
	UserDTO getUser();

}
