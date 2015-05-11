/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gunness
 */
public class histo extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private final JLabel titre; // declaration du titre
    private final JLabel titre2;
    private final JLabel titre3; // declaration du titre
    private final JLabel titre4;
  //  private final JLabel titre5; // declaration du titre
    private JButton retour;
    private final JTextField rechnom;//decaration de textfield pour les noms et prenoms à rechercher
    private final JTextField rechnprn;
    private final JTextField rechnom2;
    
      public histo() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Histogramme et Statistique"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("stat.png"));
        panelmenu.setLayout(null);
 
        
        rechnom=new JTextField();
        rechnprn=new JTextField();
        rechnom2=new JTextField();
        String texttitre1="";
        titre = new JLabel(texttitre1,JLabel.CENTER );
         String texttitre2=" Nombre de docteur:";
         titre2 = new JLabel(texttitre2,JLabel.LEFT );
        
         String texttitre3=" Nombre de malade:";
         titre3 = new JLabel(texttitre3,JLabel.LEFT );
         String texttitre4=" Nombre de d'infirmier :";
         titre4 = new JLabel(texttitre4,JLabel.LEFT );
         //titre5 = new JLabel(texttitre4,JLabel.LEFT );
               retour = new JButton("Retour");
        retour.setBounds(450,550,150,50);
        retour.addActionListener(this);
        panelmenu.add(retour);

       
        titre.setBounds(195,220,300,100);
        titre2.setBounds(135,300,300,100);
        titre3.setBounds(135,240,300,100);
        titre4.setBounds(135,270,300,100);
        //titre5.setBounds(195,345,300,100);
       
        rechnom.setBounds(270, 285, 100, 20);
        rechnom.addActionListener(this);
        
        rechnprn.setBounds(270, 310, 100, 20);
        rechnprn.addActionListener(this);
        
        rechnom2.setBounds(270, 340, 100, 20);
        rechnom2.addActionListener(this);
        
 
        
       
        panelmenu.add(titre);
        panelmenu.add(titre2);
        panelmenu.add(titre3);
        panelmenu.add(titre4);
       // panelmenu.add(titre5);
        
        panelmenu.add(rechnom);
        panelmenu.add(rechnprn);
        panelmenu.add(rechnom2);

        
        fenetremenu.pack();
        fenetremenu.setResizable(true);
        fenetremenu.setSize(700, 700);
        fenetremenu.setLocationRelativeTo(null);
        fenetremenu.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent tada) 
    {
     
      if(tada.getSource()==retour)
     {
          try {
              Accueil pg1= new Accueil();
          } catch (IOException ex) {
              Logger.getLogger(Rechercheinf.class.getName()).log(Level.SEVERE, null, ex);
          }
         fenetremenu.setVisible(false);
     }
    }
    
    /**
     *
     * @param frame
     * @param fichierimage
     * @return
     * @throws IOException
     */
    public static JPanel setImage(JFrame frame, final File fichierimage) throws IOException {
        
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1;
            private final BufferedImage buf = ImageIO.read(fichierimage);

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(buf, 195, 20, null);
            }
        };

        frame.setContentPane(panel);

        return panel;
    }
}
