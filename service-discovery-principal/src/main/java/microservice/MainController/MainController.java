package microservice.MainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import microservice.Models.Movie;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/movies")
	public List<Object> test() {
		
		ResponseEntity<List<Object> > ratings_body = restTemplate.exchange("http://service-rating/api/ratings/", 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Object>>() {});
				List<Object> ratings =  ratings_body.getBody();  
				
		ResponseEntity<List<Object> > movie_body = restTemplate.exchange("http://services-movies/api/movies/", 
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Object>>() {});
					List<Object> movies =  movie_body.getBody();     
     
					return movies;

	}
	
	
}
