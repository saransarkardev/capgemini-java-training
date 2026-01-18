package netflix_app;

public class Movie{
    private String name;
    private String language;
    private String duration;
    private String genre;

    Movie() {

    }
    Movie(String name, String language, String duration, String genre) {
        this.name = name;
        this.language = language;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void showMovieDetails() {
        System.out.println("Name: "+ name);
        System.out.println("Language: "+ language);
        System.out.println("Duration: "+ duration);
        System.out.println("Genre: "+ genre);
    }
}