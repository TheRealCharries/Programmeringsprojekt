import java.util.*;
import java.util.Arrays;
import java.io.*;
import java.lang.String;

public class TVSeriesReader
{
    private String fileName;
    private ArrayList<TVSerie> series;

    public TVSeriesReader()
    {
        this.fileName = "tvText.txt";
        series = new ArrayList<TVSerie>();
    }

    public List<TVSerie> read() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<TVSerie> series = read(br);
        br.close();
        return series;
    }
    
    public List<TVSerie> read(BufferedReader br)
    {
        try{
            String line = br.readLine();
            while(br.ready() && line != null){
                line = br.readLine();
                String[] splitInfo = line.split(";");
                String title = splitInfo[0].trim();
                //int year = Integer.parseInt(splitInfo[1].trim());
                String[] years = null;
                int startYear = 0;
                int endYear = 0;
                if(splitInfo[1].contains("-")){
                    years = splitInfo[1].split("-");
                    startYear = Integer.parseInt(years[0].trim());
                    
                    if(years.length == 2){
                        if(years[1] != null){
                            endYear = Integer.parseInt(years[1]);
                        }
                    }
                } else {
                    startYear = Integer.parseInt(splitInfo[1].trim());
                }
                
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
                String[] allSeasons = splitInfo[4].split(",");
                int[][] seasons = new int[allSeasons.length][];
                int x = 0;
                for(String s : allSeasons){
                    String[] se = allSeasons[x].split("-");
                    int e = Integer.parseInt(se[1].trim());
                    seasons[x] = new int[e];
                    for(int i = 0 ; i < e ; i++){
                        seasons[x][i] = i+1;
                    }
                    x++;
                }
                
                TVSerie t = new TVSerie(title, seasons, startYear, endYear, genres, rating);
                series.add(t);
            }
        }catch(IOException e){
            
        }
        return series;
    }
    
    public void sortAlphbetic(){
        Collections.sort(series, Comparator.comparing(TVSerie::getTitle));
    }
    
    public void sortByStartYear(){
        Collections.sort(series, Comparator.comparing(TVSerie::getStartYear));
    }
    
    public ArrayList<TVSerie> sortByGenre(String genre){
        ArrayList<TVSerie> rightGenre = new ArrayList<TVSerie>();
        for(TVSerie t : series){
            for(String g : t.getGenre()){
                if(genre.equals(g)){
                    rightGenre.add(t);
                }
            }
        }
        
        return rightGenre;
    }
}
