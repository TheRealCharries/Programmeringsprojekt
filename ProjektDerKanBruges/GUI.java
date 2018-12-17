import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    JMenu filmMenu, TvSerierMenu;    
    JMenuItem item1,item2, item3, item4, item5, item6, subitem1, subitem2, subitem3,
    subitem4, subitem5, subitem6, subitem7, subitem8, subitem9, subitem10,
    subitem11, subitem12, subitem13, subitem14,
    subitem15, subitem16, subitem17, subitem18, subitem19, subitem20,
    useritem1, useritem2;    
    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout(2,2));
        JPanel npanel = new JPanel(new BorderLayout(2,2));
        StartSide startSide = new StartSide();
        JMenuBar menubar = new JMenuBar();    
        JMenu FilmMenu, submenu1, submenu2;
        item1 = new JMenuItem("          A-Z           ");
        item2 = new JMenuItem("          Årstal        ");
        item3 = new JMenuItem("          A-Z           ");
        item4 = new JMenuItem("          Årstal        ");
        item5 = new JMenuItem("          Søg i TV-serier        ");
        item6 = new JMenuItem("          Søg i Film        ");
        JMenu filmMenu= new JMenu("            Film             ");
        filmMenu.add(item1);
        filmMenu.add(item6);
        item1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMAtoZ();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        item2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMÅrstal();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        filmMenu.add(item2);
        filmMenu.addSeparator();
        submenu1 = new JMenu("          Genre     ");
        subitem1 = new JMenuItem("   Overblik   ");
        submenu1.add(subitem1);
        subitem1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           npanel.setVisible(true);
        }
      });
        subitem2 = new JMenuItem("   Action   ");
        submenu1.add(subitem2);
        subitem2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMAction();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem3 = new JMenuItem("   Drama   ");
        filmMenu.add(submenu1);
        submenu1.add(subitem3);
        subitem3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMDrama();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem4 = new JMenuItem("   Familie Film   ");
        submenu1.add(subitem4);    
        subitem4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMFamilieFilm();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem5 = new JMenuItem("   Gysere ");
        submenu1.add(subitem5);    
        subitem5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMGysere();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem6 = new JMenuItem("   Komedie   ");
        submenu1.add(subitem6);    
        subitem1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMKomedie();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem7 = new JMenuItem("   Krimi   ");
        submenu1.add(subitem7);    
        subitem7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMKrimi();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem8 = new JMenuItem("   Romantik   ");
        submenu1.add(subitem8);
        subitem8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMRomantik();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem9 = new JMenuItem("   Sci-fi og fantasy   ");
        submenu1.add(subitem9); 
        subitem9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMSciFiOgFantasy();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem10 = new JMenuItem("   Thriller   ");
        submenu1.add(subitem10);   
        subitem10.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListMThriller();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
      
        JMenu TvSeriesMenu = new JMenu("       Tv serier         ");
        TvSeriesMenu.add(item5);
        TvSeriesMenu.add(item3);
        item3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListAtoZ();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        item4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListÅrstal();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        TvSeriesMenu.add(item4);       
        TvSeriesMenu.addSeparator();
        submenu2 = new JMenu("          Genre     ");
        subitem11 = new JMenuItem("   Overblik   ");
        submenu2.add(subitem11);   
        subitem11.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           SerieBilleder serieBilleder = new SerieBilleder();
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(26,25,25));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           frame.getContentPane().add(serieBilleder,BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem12 = new JMenuItem("   Action  ");
        submenu2.add(subitem12);  
        subitem12.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListAction();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem13 = new JMenuItem("   Drama   ");;
        submenu2.add(subitem13);  
        subitem13.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListDrama();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem14 = new JMenuItem("   Gysere   ");
        submenu2.add(subitem14);
        subitem13.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListGysere();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem15 = new JMenuItem("   Familie Film   ");
        submenu2.add(subitem15);    
        subitem15.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListFamilieFilm();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem16 = new JMenuItem("   Komedie   ");
        submenu2.add(subitem16);
        subitem16.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListKomedie();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem17 = new JMenuItem("   Krimi   ");
        submenu2.add(subitem17);
        subitem17.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListKrimi();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem18 = new JMenuItem("   Romantik   ");
        submenu2.add(subitem18);  
        subitem18.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListRomantik();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem19 = new JMenuItem("   Sci-fi og fantasy   ");
        submenu2.add(subitem19);
        subitem19.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListSciFiOgFantasy();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
      });
        subitem20 = new JMenuItem("   Thriller   ");
        submenu2.add(subitem20);
        subitem20.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           frame.getContentPane().removeAll();
           frame.add(panel);
           frame.add(npanel);
           frame.setJMenuBar(menubar);
           frame.setSize(1000,800);
           frame.getContentPane().setBackground(new Color(0,25,120));
           frame.getContentPane().add(menubar,BorderLayout.NORTH);
           SortedByGenre sort = new SortedByGenre();
           sort.getSortedListThriller();
           frame.getContentPane().add(sort, BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.revalidate();
           frame.repaint();
           frame.setVisible(true);
        }
    });

        item6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           JButton søg = new JButton("Søg");
           JFrame lameFrame = new JFrame();
           JLabel lameLabel = new JLabel("Søg efter hele titlen :)");
           JTextField søgeFelt = new JTextField("Indtast filmtitel...");
           søgeFelt.setBounds(80,80,200,30);
           lameLabel.setBounds(80,40,200,30);
           søg.setBounds(80,150,100,30);
           lameFrame.add(lameLabel);
           lameFrame.add(søg);
           lameFrame.add(søgeFelt);
           lameFrame.setSize(400, 300);
           lameFrame.setLayout(null);
           lameFrame.setVisible(true);
           lameFrame.setLocation(800,450);
           søg.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                   try{
                       frame.getContentPane().removeAll();
                       frame.add(panel);
                       frame.add(npanel);
                       frame.setJMenuBar(menubar);
                       frame.setSize(1000,800);
                       frame.getContentPane().setBackground(new Color(0,25,120));
                       frame.getContentPane().add(menubar,BorderLayout.NORTH);
                       SortedByGenre sort = new SortedByGenre();
                       sort.getSearchedForMovie();
                       frame.getContentPane().add(sort, BorderLayout.CENTER);
                       frame.setLocationRelativeTo(null);
                       frame.revalidate();
                       frame.repaint();
                       frame.setVisible(true);
                   }catch(NumberFormatException exe){
                        
                   } 
               }
           });
        }
    });
        item5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           JButton søg = new JButton("Søg");
           JFrame lameFrame = new JFrame();
           JLabel lameLabel = new JLabel("Søg efter hele titlen :)");
           JTextField søgeFelt = new JTextField("Indtast serietitel...");
           søgeFelt.setBounds(80,80,200,30);
           lameLabel.setBounds(80,40,200,30);
           søg.setBounds(80,150,100,30);
           lameFrame.add(lameLabel);
           lameFrame.add(søg);
           lameFrame.add(søgeFelt);
           lameFrame.setSize(400, 300);
           lameFrame.setLayout(null);
           lameFrame.setVisible(true);
           lameFrame.setLocation(800,450);
           søg.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                   try{
                       frame.getContentPane().removeAll();
                       frame.add(panel);
                       frame.add(npanel);
                       frame.setJMenuBar(menubar);
                       frame.setSize(1000,800);
                       frame.getContentPane().setBackground(new Color(0,25,120));
                       frame.getContentPane().add(menubar,BorderLayout.NORTH);
                       SortedByGenre sort = new SortedByGenre();
                       sort.getSearchedForTVseries();
                       frame.getContentPane().add(sort, BorderLayout.CENTER);
                       frame.setLocationRelativeTo(null);
                       frame.revalidate();
                       frame.repaint();
                       frame.setVisible(true);
                   }catch(NumberFormatException exe){
                        
                   } 
               }
           });
        }
    });
        
        TvSeriesMenu.add(submenu2); 
        menubar.setLayout(new BorderLayout());
        menubar.add(filmMenu, BorderLayout.WEST);
        menubar.add(TvSeriesMenu,BorderLayout.CENTER);
        menubar.setPreferredSize(new Dimension(500, 50));
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(20,20));
        npanel.setLayout(new BorderLayout());
        npanel.setPreferredSize(new Dimension(20,20));
        npanel.setVisible(false);
        JMenuItem profil = new Profile(null);
        menubar.add(profil,BorderLayout.EAST);
        frame.add(panel);
        frame.add(npanel);
        frame.setJMenuBar(menubar);
        frame.setSize(1000,800);
        frame.getContentPane().setBackground(new Color(26,25,25));
        frame.getContentPane().add(menubar,BorderLayout.NORTH);
        frame.getContentPane().add(startSide,BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
        
    }    
}