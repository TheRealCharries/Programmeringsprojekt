public class TVSeries {//extends Movies{
    private String name;
    private String genre;
    private int year;
    private double rating;
    private boolean isRrated;
    
    public TVSeries(String name, String genre, int year, double rating, boolean isRrated){
        //Throws exception
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.isRrated = isRrated;
    }
    
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public int getYear(){
        return year;
    }
    public void addTVSeries(){
        
    }
    public double getRating(){
        return rating;
    }
    public boolean isRrated(){
        return isRrated;
    }
}