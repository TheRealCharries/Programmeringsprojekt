import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.nio.file.*;

public class ImageViewer extends JFrame{
    private JPanel buttonPanel;
    private JPanel imagePanel;
    private ArrayList<ImageComponent> images;
    private Path imagesPath = FileSystems.getDefault().getPath("C:/Users/fthom/Desktop/ImagesToJava/serieforsider/Serier - billeder");
    private File dir;
    private int index;
    
    enum DIR{LEFT, RIGHT}
    
    
    public ImageViewer(){
        dir = imagesPath.toFile();
        images = new ArrayList<>();       
        buttonPanel = new JPanel();
        index = 0;
        
        makeFrame();
        addButtons();        
        addImages();
    }
    
    private void loadImages(){
        if(dir.isDirectory()){
            File[] imageFiles = dir.listFiles(new ImageFormatFilter());
            for(File file : imageFiles){
                ImageComponent ic;
                try{
                    BufferedImage img = ImageIO.read(file);
                    ic = new ImageComponent(img);
                    images.add(ic);
                }catch(IOException ioe){
                    System.out.println(ioe.getMessage());
                }               
            }
        } else{
            System.out.println("De'jo ikk' en mapp'");
        }
    }
    
    private void addImages(){
        loadImages();
        imagePanel = new JPanel();
        add(imagePanel, BorderLayout.CENTER);
        imagePanel.add(images.get(0));
        revalidate();
        repaint();
    }
    
    private void displayNextImage(DIR dir){
        int oldIndex = index;
        if (dir == DIR.LEFT){
            if(index-1 < 0){
                index = images.size()-1;
            } else {
                index--;
            }
        } else if (dir == DIR.RIGHT){
            if(index+1 > images.size()-1){
                index = 0;
            } else {
                index++;
            }
        }
        imagePanel.remove(images.get(oldIndex));
        imagePanel.add(images.get(index));
        revalidate();
        repaint();
    }
    
    private void addButtons(){
        JButton left = new JButton("<<");
        left.addActionListener(e -> displayNextImage(DIR.LEFT));
        JButton right = new JButton(">>");
        right.addActionListener(e -> displayNextImage(DIR.RIGHT));
        
        buttonPanel.add(left);
        buttonPanel.add(right);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ImageViewer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
    
    class ImageComponent extends JComponent{
        private BufferedImage img;
        
        public ImageComponent(BufferedImage img){
            this.img = img;
        }
        
        public void paint(Graphics g){
            g.drawImage(img, 0, 0, null);
        }
        
        public Dimension getPreferredSize() {
            if (img == null) {
                return new Dimension(100,100);
            } else {
                return new Dimension(img.getWidth(null), img.getHeight(null));
            }
        }
    }
    

    
    
    public static void main(String[] args){
        ImageViewer app = new ImageViewer();
        app.setVisible(true);
    }
}