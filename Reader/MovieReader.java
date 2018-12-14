import java.util.*;
import java.util.Arrays;
import java.io.*;
import java.lang.String;

public class MovieReader
{
    private String fileName;
    private ArrayList<Movie> movies;

    public MovieReader()
    {
        this.fileName = "mText.txt";
        movies = new ArrayList<Movie>();
    }

    public List<Movie> read() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<Movie> movies = read(br);
        br.close();
        return movies;
    }
    
    public List<Movie> read(BufferedReader br)
    {
        try{
            String line = br.readLine();
            while(br.ready() && line != null){
                line = br.readLine();
                String[] splitInfo = line.split(";");
                String title = splitInfo[0].trim();
                int year = Integer.parseInt(splitInfo[1].trim());
                String[] genres = splitInfo[2].split(",");
                for(String g : genres){
                    String newG = g.trim();
                    int index = -1;
                    for (int i=0;i<genres.length;i++) {
                        if (genres[i].equals(g)) {
                            index = i;
                            break;
                        }
                    }
                    genres[index] = newG;
                    }
                double rating = Double.parseDouble(splitInfo[3].trim().replace(",","."));
                
                Movie m = new Movie(title, year, genres, rating);
                movies.add(m);
            }
        }catch(IOException e){
            
        }
        return movies;
    }
    
    public void sortAlphbetic(){
        Collections.sort(movies, Comparator.comparing(Movie::getTitle));
    }
    
    public void sortByYear(){
        Collections.sort(movies, Comparator.comparing(Movie::getYear));
    }
    
    public ArrayList<Movie> sortByGenre(String genre){
        ArrayList<Movie> rightGenre = new ArrayList<Movie>();
        for(Movie m : movies){
            for(String g : m.getGenre()){
                if(genre.equals(g)){
                    rightGenre.add(m);
                }
            }
        }
        
        return rightGenre;
    }
}
