package netflix_app;

public class Netflix{
    private User[] users; // Aggregation
    private Movie[] movies; // Aggregation
    private int userCount = 0;
    private int movieCount = 0;

    Netflix() {

    }
    Netflix(int userSize, int movieSize) {
        users = new User[userSize];
        movies = new Movie[movieSize];
    }

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
        }
    }

    public void addMovie(Movie movie) {
        if (movieCount < movies.length) {
            movies[movieCount++] = movie;
        }
    }

    public User[] getUsers() {
        return users;
    }
}