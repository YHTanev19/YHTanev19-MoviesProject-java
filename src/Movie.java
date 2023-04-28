public class Movie
{
    String title;
    String gentre;
    int year;
    Double movieLength;
    int id;

    public Movie(String title, String gentre, int year, Double movieLength, int id) {
        this.title = title;
        this.gentre = gentre;
        this.year = year;
        this.movieLength = movieLength;
        this.id = id;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setGentre(String gentre) {
        this.gentre = gentre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMovieLength(Double movieLength) {
        this.movieLength = movieLength;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettitle() {
        return title;
    }

    public String getGentre() {
        return gentre;
    }

    public int getYear() {
        return year;
    }

    public Double getMovieLength() {
        return movieLength;
    }

    public int getId() {
        return id;
    }
    public void displayMovie()
    {
        System.out.println("title: " + this.title);
        System.out.println("Gentre: " + this.gentre);
        System.out.println("Year: " + this.year);
        System.out.println("Movie length: " + this.movieLength);
        System.out.println("Id: " + this.id);
    }

}
