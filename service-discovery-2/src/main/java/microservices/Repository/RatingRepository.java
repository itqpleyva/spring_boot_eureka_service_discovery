package microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.Model.MovieRating;

public interface RatingRepository extends JpaRepository<MovieRating, Integer>{

}
