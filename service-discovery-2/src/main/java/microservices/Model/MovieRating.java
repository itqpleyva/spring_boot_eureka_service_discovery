package microservices.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieRating {

	@Id
	@GeneratedValue
	private int id;
	private int movieId;
	private int userId;
	private int rating;
	

	public MovieRating() {}
	
	public MovieRating(int id, int movieId, int userId, int rating) {
		super();
		this.id =id;
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
