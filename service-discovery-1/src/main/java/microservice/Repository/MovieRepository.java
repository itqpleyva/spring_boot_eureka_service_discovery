package microservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

	
}
