import java.util.ArrayList;

public class MovieCollection
{
    private static ArrayList<Movie> movies;

    public MovieCollection() {
        this.movies = new ArrayList<>();

    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public void addMovieToList(Movie movie) throws Exception {
        for (Movie movie1 : movies) {
            if (movie1.getId() == movie.getId()) {
                throw new Exception("Duplicate ID: " + movie.getId());
            }
        }
        movies.add(movie);

    }
    public void removeMovieFromList(int id) throws Exception {
        for(Movie movie : movies) {
            if(movie.getId() == id)
            {
                movies.remove(movie);
                System.out.println("Movie removed successfully");
                return;
            } else {
                System.out.println("Movie with id " + movie.getId() + " not found");
            }

        }
    }



}
