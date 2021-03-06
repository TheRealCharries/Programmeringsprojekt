import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.nio.file.*;

public class Model extends Observable{
    private ArrayList<ImageComponent> images;
    private Path imagesPath = FileSystems.getDefault().getPath("C:/Users/fthom/Desktop/ImagesToJava/serieforsider/Serier - billeder");
    private File dir;
    private int index;
    
    public Model(){
        dir = imagesPath.toFile();
        System.out.println(dir.getPath());
        images = new ArrayList<>();
        loadImages();
    }
    
    public void initializeImage(){
        setChanged();
        notifyObservers(images.get(index));
    }
    
    public void initializeImages(){
        setChanged();
        notifyObservers(images);
    }
    
    private void loadImages(){
        if(dir.isDirectory()){
            File[] imageFiles = dir.listFiles(new ImageFormatFilter());
            for(File file : imageFiles){
                try{
                    String filename = file.getName();
                    BufferedImage img = ImageIO.read(file);
                    ImageComponent ic = new ImageComponent(img, filename);
                    images.add(ic);
                }catch(IOException ioe){
                    System.out.println(ioe.getMessage());
                }               
            }
            Collections.sort(images, (ic1, ic2) -> {
                return ic1.getFilename().compareTo(ic2.getFilename());
            });
        } else{
            System.out.println("Not a directory");
        }
    }
    
    public void increaseIndex(){
        if(index+1 > images.size()-1){
                index = 0;
            } else {
                index++;
        }
        
        setChanged();
        notifyObservers(images.get(index));
    }
    
    public void decreaseIndex(){
        if(index-1 < 0){
                index = images.size()-1;
            } else {
                index--;
        }
        
        setChanged();
        notifyObservers(images.get(index));
    }
    
    class ImageFormatFilter implements FilenameFilter{
        private String[] EXTENSIONS = new String[]{
            "png", "jpg"
        };
        
        public boolean accept(File dir, String name){
            for(String extension : EXTENSIONS){
                if (name.toLowerCase().endsWith("." + extension)){
                    return true;
                }
            }
            return false;
        }
    }
    
    
}