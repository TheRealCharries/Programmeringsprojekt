import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.util.ArrayList;
import java.nio.file.*;

public class SerieBilleder extends JPanel {
    private JPanel billedPanel;
    private ArrayList<ImageComponent> billeder;
    private Path billedSti = FileSystems.getDefault().getPath("C:/Users/fthom/Desktop/ProgrammeringsProjekt/serieforsider/Serier - billeder");
    private File filesDirectory;


    public SerieBilleder() {        
        filesDirectory = billedSti.toFile();
        billeder = new ArrayList<>();
        
        billedPanel = new JPanel();
        billedPanel.setLayout(new GridLayout(0,6,9,9));
        billedPanel.setBackground(new Color(26,25,25));
        addBilleder();
        
        
        JScrollPane skrålBar = new JScrollPane();
        skrålBar.setPreferredSize(new Dimension(1000, 600));
        skrålBar.getViewport().add(billedPanel);
        skrålBar.getVerticalScrollBar().setUnitIncrement(25);
        

        this.add(skrålBar);
        
    }
    
    
    private void hentBilleder() {
        if(filesDirectory.isDirectory()) {
            File[] billedFiler = filesDirectory.listFiles(new qq());
            for(File billed : billedFiler) {
                ImageComponent ic;
                try {                    
                    BufferedImage img = ImageIO.read(billed);
                    img.getScaledInstance(100, 140, Image.SCALE_DEFAULT);
                    ic = new ImageComponent(img);
                    billeder.add(ic);
                } catch(IOException ioe) {
                    System.out.println(ioe);
                }
            }
        } else {
            System.out.println("De'jo ikk' en mapp' :(");
        }
    }
    
    private void addBilleder() {
        hentBilleder();
        for(ImageComponent ic : billeder){
            billedPanel.add(ic);
        }
        revalidate();
        repaint();
    }
    

 
    
    class qq implements FilenameFilter {
        private String[] EXTENSIONS = new String[]{
            "jpg"
        };
        
        @Override
        public boolean accept(File filesDirectory, String name) {
            for(String extension : EXTENSIONS) {
                if (name.toLowerCase().endsWith("." + extension)) {
                    return true;
                }
            }
            return false;
        }
    }

    class ImageComponent extends JComponent{
        private BufferedImage img;

        public ImageComponent(BufferedImage img) {
            this.img = img;
        }

        public void paint(Graphics g) {
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

    public static void main(String[] args)  {               
        SerieBilleder app = new SerieBilleder();
        app.setVisible(true);
    }
}