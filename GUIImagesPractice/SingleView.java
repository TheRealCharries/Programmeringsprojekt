import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.nio.file.*;
import java.awt.event.ActionListener;

public class SingleView extends JPanel{
    private JPanel buttonPanel, imagePanel;
    private ActionListener actionListener;
    
    public void addActionListener(ActionListener actionListener){
        this.actionListener = actionListener;
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
        left.addActionListener(actionListener);
        //left.addActionListener(e -> displayNextImage(DIR.LEFT));
        JButton right = new JButton(">>");
        right.setActionCommand("right");
        right.addActionListener(actionListener);    
        //right.addActionListener(e -> displayNextImage(DIR.RIGHT));
        buttonPanel.add(left);
        buttonPanel.add(right);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    public void showImage(ImageComponent ic){
        imagePanel.removeAll();
        imagePanel.add(ic);
        revalidate();
        repaint();
    }
    
    public void makePanel(){
        setLayout(new BorderLayout());
        addImagePanel();
        addButtons();
    }
}