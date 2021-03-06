import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.nio.file.*;

public class ImageComponent extends JComponent implements Comparable<ImageComponent>{
    private BufferedImage img;
    private String filename;
        
    public ImageComponent(BufferedImage img, String filename){
            this.img = img;
            this.filename = filename;
    }
        
    public void paint(Graphics g){
            g.drawImage(img, 0, 0, null);
    }
    
    public String getFilename(){
        return filename;
    }
        
    public Dimension getPreferredSize() {
            if (img == null) {
                return new Dimension(100,100);
            } else {
                return new Dimension(img.getWidth(null), img.getHeight(null));
            }
    }
    
    @Override
    public int compareTo(ImageComponent ic){
        return this.filename.compareTo(ic.getFilename());
    }
}