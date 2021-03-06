import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GridView extends JPanel{
    private JPanel imagePanel;
    private JScrollPane scrollPane;
    
    public void addImagePanel(){
        scrollPane = new JScrollPane();
        imagePanel = new JPanel();
        imagePanel.setLayout(new GridLayout(0, 5));
        scrollPane.getViewport().add(imagePanel);
        add(scrollPane, BorderLayout.CENTER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        revalidate();
        repaint();
    }
    
    public void makePanel(){
        setLayout(new BorderLayout());
        addImagePanel();
    }
    
    public void showImages(List<ImageComponent> images){
        imagePanel.removeAll();
        for(ImageComponent ic : images){
            imagePanel.add(ic);
        }
        revalidate();
        repaint();
    }
}