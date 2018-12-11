import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.nio.file.*;

public class ViewOld extends JFrame implements Observer{
    private JPanel imagePanel, buttonPanel;
    private Controller controller;
    
    public void addController(Controller controller){
        this.controller = controller;
    }
    
    public void update(Observable o, Object arg){
        if(arg instanceof ImageComponent){
            ImageComponent ic = (ImageComponent) arg;
            imagePanel.removeAll();
            ImageComponent currentImage = ic;
            imagePanel.add(currentImage);
            revalidate();
            repaint();
        }
    }
    
    private void addImagePanel(){
        imagePanel = new JPanel();
        add(imagePanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    private void addButtons(){
        buttonPanel = new JPanel();
        JButton left = new JButton("<<");
        left.setActionCommand("left");
        left.addActionListener(controller);
        //left.addActionListener(e -> displayNextImage(DIR.LEFT));
        JButton right = new JButton(">>");
        right.setActionCommand("right");
        right.addActionListener(controller);    
        //right.addActionListener(e -> displayNextImage(DIR.RIGHT));
        buttonPanel.add(left);
        buttonPanel.add(right);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    public void makeFrame(){
        addButtons();
        setSize(500, 420);
        addImagePanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ImageViewer");
        setVisible(true);
    }
    
    
}