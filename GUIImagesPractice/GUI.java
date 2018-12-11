import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GUI extends JFrame{
    JPanel panel;
    JMenuBar menubar;
    
    
    public GUI(){
        JFrame frame = new JFrame();
        panel = new JPanel(new BorderLayout(2,2));
        
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(400, 50));
        
        frame.setJMenuBar(menubar);
        frame.setSize(500,420);
        frame.getContentPane().setBackground(new Color(80,20,20));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void loadImage(){
        String imagePath = "C:/Users/fthom/Desktop/ImagesToJava/image1.jpg";
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:/Users/fthom/Desktop/ImagesToJava/image1.jpg"));
        } catch (IOException e) {
        }
        
        JLabel picLabel = new JLabel(new ImageIcon(img));
        JPanel panel = new JPanel();
        panel.add(picLabel);
        
        JFrame f = new JFrame();
        f.setSize(new Dimension(img.getWidth(), img.getHeight()));
        f.add(panel);
        f.setVisible(true);
    }
}