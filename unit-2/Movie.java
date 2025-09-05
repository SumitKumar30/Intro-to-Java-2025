public class Movie {
    private int movieId;
    private String movieName;
    private String movieGenre;
    private String movieDirector;
    private double movieRating;
    private String movieDescription;

    public Movie(int movieId, String movieName, String movieGenre, String movieDirector, double movieRating, String movieDescription) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
        this.movieDescription = movieDescription;
    }

    public Movie(){}

    // getter and setter methods
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    // @Override
    // public String toString() {
    //     return "Movie{" +
    //             "movieId=" + movieId +
    //             ", movieName='" + movieName + '\'' +
    //             ", movieGenre='" + movieGenre + '\'' +
    //             ", movieDirector='" + movieDirector + '\'' +
    //             ", movieRating=" + movieRating +
    //             ", movieDescription='" + movieDescription + '\'' +
    //             '}';
    // }

    public static void main(String[] args) {
        Movie movie = new Movie(1, "Inception", "Sci-Fi", "Christopher Nolan", 8.8, "A mind-bending thriller about dreams within dreams.");
        System.out.println(movie);

        movie.setMovieRating(10);
    }
}
