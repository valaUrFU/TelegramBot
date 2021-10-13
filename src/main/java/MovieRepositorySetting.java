public class MovieRepositorySetting {
    private String title;
    private String genre;
    private String category;
    private Integer yearOfIssue;
    private String country;
    private Double rating;
    private String director;

    public MovieRepositorySetting(String title, String genre, String category,
                            Integer yearOfIssue, String country, Double rating, String director) {
        this.title = title;
        this.genre = genre;
        this.category = category;
        this.yearOfIssue = yearOfIssue;
        this.country = country;
        this.rating = rating;
        this.director = director;
    }

    public MovieRepositorySetting(){}


    public String getTitle(){
        return title;
    }

    public void setTitle(String userInputTitle){
        this.title = userInputTitle;
    }

    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String userInputGenre){
        this.genre = userInputGenre;
    }

    public String getCategory(){
        return category;
    }

    public Integer getYearOfIssue(){
        return yearOfIssue;
    }

    public String getCountry(){
        return country;
    }

    public Double getRating(){
        return rating;
    }

    public String getDirector(){
        return director;
    }
}
