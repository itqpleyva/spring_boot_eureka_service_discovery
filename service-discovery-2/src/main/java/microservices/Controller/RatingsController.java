package microservices.Controller;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.Model.MovieRating;
import microservices.Repository.RatingRepository;

@RestController
@RequestMapping("/api/ratings")
public class RatingsController {

	@Autowired
	RatingRepository ratingRepository;
	
	@RequestMapping("/")
	public List<MovieRating> getAllRatings(){
		
		return ratingRepository.findAll();
	}
	@PostMapping("/")
	public MovieRating postRating(@RequestBody MovieRating rating){
		
		ratingRepository.save(rating);
		return rating;
	}
	@PutMapping("/{id}")
	public MovieRating updateRating(@PathVariable int id, @RequestBody MovieRating rating){
		
		ratingRepository.save(rating);
		
		return rating;
	}
	@DeleteMapping("/{id}")
	public String deleteRating(@PathVariable int id){
		
		ratingRepository.deleteById(id);
		return "Elemento eliminado con exito";
	}
	
}
