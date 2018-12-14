import java.awt.*;
import javax.swing.ImageIcon;

public class Movie extends Video
{
    private String title;
    private int year;
    private String[] genre;
    private double rating;
    private String[] rRatedGenres;

    public Movie(String title, int year, String[] genre, double rating)
    {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        String[] rRatedGenres = new String[]{"Crime", "War", "Thriller", "Action", "Horror"};
    }

    public String getTitle(){
        return title;
    }
    
    public String[] getGenre(){
        return genre;
    }
    
    public int getYear(){
        return year;
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
        Image image = new ImageIcon("MPics/" + title + ".jpg").getImage();
        return image;
    }
}
