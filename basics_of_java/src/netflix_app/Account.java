package netflix_app;

public class Account {
    private String username;
    private String password;
    private Movie[] movies;   // aggregation
    private int movieCount = 0;

    Account(String username, String password, int size) {
        this.username = username;
        this.password = password;
        movies = new Movie[size];
    }

    public void addMovie(Movie movie) {
        if (movieCount < movies.length) {
            movies[movieCount++] = movie;
        }
    }

    public Movie[] getMovies() {
        return movies;
    }

}