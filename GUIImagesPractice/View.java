import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.nio.file.*;
import java.awt.event.ActionListener;
import java.util.List;

public class View extends JFrame implements Observer{
    private JPanel imagePanel, buttonPanel;
    private SingleView singleView;
    private ActionListener actionListener;
    private GridView gridView;
    
    public View(){
        this.singleView = new SingleView();
        this.gridView = new GridView();
    }
    
    public void addController(ActionListener actionListener){
        this.actionListener = actionListener;
        singleView.addActionListener(actionListener);
    }
    
    public void update(Observable o, Object arg){
        if(arg instanceof ImageComponent){
            singleView.showImage((ImageComponent)arg);
        } else {
            List<ImageComponent> list = (List<ImageComponent>) arg;
            gridView.showImages(list);
        }
    }
    
    public void makeFrame(){
        setSize(500, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ImageViewer");
        
        //singleView.makePanel();
        //add(singleView, BorderLayout.CENTER);
        
        gridView.makePanel();
        add(gridView, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    
}