import java.awt.*;
import javax.swing.ImageIcon;

public class TVSerie extends Video
{
    private String title;
    private int[][] seasons;
    private int startYear;
    private int endYear;
    private String[] genre;
    private double rating;
    private String[] rRatedGenres;

    public TVSerie(String title, int[][] seasons, int startYear, int endYear, String[] genre, double rating)
    {
        this.title = title;
        this.seasons = seasons;
        this.startYear = startYear;
        this.endYear = endYear;
        this.genre = genre;
        this.rating = rating;
        String[] rRatedGenres = new String[]{"Crime", "War", "Thriller", "Action", "Horror"};
    }

    public String getTitle(){
        return title;
    }
    
    public int[][] getSeasons(){
        return seasons;
    }
    
    public int getStartYear(){
        return startYear;
    }
    
    public int getEndYear(){
        return endYear;
    }
    
    public String[] getGenre(){
        return genre;
    }
    
    public double getRating(){
        return rating;
    }
    
    public boolean isRrated(){
        if(genre == rRatedGenres){
            return true;
        } else {
            return false;
        }
    }
    
    public Image getPicture(){
        Image image = new ImageIcon("TVPics/" + title + ".jpg").getImage();
        return image;
    }
}
