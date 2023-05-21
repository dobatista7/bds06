package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.projections.ReviewMinProjection;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

	@Query(nativeQuery = true, value = "SELECT tb_review.id, tb_review.text,"
			+ "tb_review.movie_id,tb_review.user_id "
			+ "FROM tb_review "
			+ "INNER JOIN tb_movie ON tb_review.id = tb_movie.id"
			+"Where tb_movie.id = :listId"
			+"ORDER BY tb_movie.id")
	List<ReviewMinProjection> searchByList(long listId);
}
