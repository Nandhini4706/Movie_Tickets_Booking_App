package Model;

public class Movie {
    private int movieId;
    private String movieName;
    private int moviePrice;
    private String movieClass;

    public Movie(int movieId, String movieName, int moviePrice, String movieClass){
        this.movieId=movieId;
        this.movieName=movieName;
        this.moviePrice=moviePrice;
        this.movieClass=movieClass;
    }

    public int getMovieId() {
        return movieId;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getMoviePrice(){
        return moviePrice;
    }
    public String getMovieClass(){
        return movieClass;
    }
}
