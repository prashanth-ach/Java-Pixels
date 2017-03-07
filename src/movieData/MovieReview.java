package movieData;


public class MovieReview {

	private int UserId;
	private int MovieId;
	private int Rating;
	private int Junk;
	private String TimeStamp;

	public void setUserid(int UserId) {
		this.UserId = UserId;
	}
	public int getUserid(int UserId) {
		return UserId;
	}
	public void setMovieid(int MovieId) {
		this.MovieId = MovieId;
	}
	public int getMovieid(int MovieId) {
		return MovieId;
	}

	public void setRating(int Rating) {
		this.Rating = Rating;
	}
	public int getRating(int Rating) {
		return Rating;
	}
	public void setJunk(int Junk) {
		this.Junk = Junk;

	}
	public int getJunk(int Junk) {
		return Junk;

	}
	public void setTimeStamp(String TimeStamp) {
		this.TimeStamp = TimeStamp;
	}
	public String getTimeStamp(String TimeStamp) {
	 return TimeStamp;
	}
	
	public static void main(String[] args)
	{
		
	}
}
