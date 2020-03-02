package microservice.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import microservice.Model.Movie;
import microservice.Repository.MovieRepository;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	@Autowired
	MovieRepository movieRepository;

	@RequestMapping("/")
	public List<Movie> getAllMovies(){
		
		List<Movie> movies = movieRepository.findAll();
		return movies;
	}
	@RequestMapping("/{movieId}")
	public Optional<Movie> getMovie(@PathVariable int movieId){
		
		
		return movieRepository.findById(movieId);
	}
	@PostMapping("/insert")
	public Movie postMovie(Movie movie){	
		
		movieRepository.save(movie);
		return movie;
	}
	@PutMapping("/update/{movieId}")
	public Movie updateMovie(@PathVariable int movieId, @RequestBody Movie movie){
		
		movieRepository.save(movie);
		return movie;
		
	}
	@RequestMapping( method=RequestMethod.DELETE, value="/delete/{movieId}")
	public String deleteMovie(@PathVariable int movieId){
		
		movieRepository.deleteById(movieId);
		
		return "Elemento borrado con exito";
	}
}
