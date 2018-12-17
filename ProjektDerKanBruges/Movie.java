import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
    
    public JLabel getPicture(){
        JLabel imageLabel = new JLabel();
        ImageIcon image = new ImageIcon("C:/Users/fthom/Desktop/ProgrammeringsProjekt/filmforsider/" + title + ".jpg");
        imageLabel.setIcon(image);
        return imageLabel;
    }
}