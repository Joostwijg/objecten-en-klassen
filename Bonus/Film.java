package Bonus;

public class Film {
    public String director;
    public String releaseDate;
    public String genre;

    public void film(String director, String releaseDate, String genre) {
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public void printFilm (){
        System.out.println("Director: " + director + "releaseDate: " + releaseDate + "genre: " + genre);
    }
}


