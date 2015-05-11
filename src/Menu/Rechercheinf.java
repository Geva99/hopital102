/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Connexion.Connexion;
import Recherche.Recherchedocteur;
import javax.swing.JTextField;

/**
 *
 * @author Gunness
 */
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

/**
 *
 * @author Gunness
 */
public class Rechercheinf extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private final JLabel titre; // declaration du titre
    private final JLabel titre2;
    private final JLabel titre3; // declaration du titre
    private final JLabel titre4;
    private final JLabel titre5; // declaration du titre
    private JButton enter;
    private final JTextField rechnom;//decaration de textfield pour les noms et prenoms à rechercher
    private final JTextField rechnprn;
    private final JTextField rechnom2;
    private Recherchedocteur doc1;
    
      public Rechercheinf(Connexion coco) throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Recherche d'infromation"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("rinch.png"));
        panelmenu.setLayout(null);
 
        
        rechnom=new JTextField();
        rechnprn=new JTextField();
        rechnom2=new JTextField();
        String texttitre1=" Recherche d'un personne dans la base de donnée :";
        titre = new JLabel(texttitre1,JLabel.CENTER );
         String texttitre2=" Annuaire :";
         titre2 = new JLabel(texttitre2,JLabel.LEFT );
        
         String texttitre3=" Prénom :";
         titre3 = new JLabel(texttitre3,JLabel.LEFT );
         String texttitre4=" Nom :";
         titre4 = new JLabel(texttitre4,JLabel.LEFT );
         titre5 = new JLabel(texttitre4,JLabel.LEFT );
           enter = new JButton("Enter");
        enter.setBounds(450,550,150,50);
        enter.addActionListener(this);
        panelmenu.add(enter);

       
        titre.setBounds(195,220,300,100);
        titre2.setBounds(195,320,300,100);
        titre3.setBounds(195,240,300,100);
        titre4.setBounds(195,260,300,100);
        titre5.setBounds(195,345,300,100);
       
        rechnom.setBounds(270, 285, 100, 20);
        rechnom.addActionListener(this);
        
        rechnprn.setBounds(270, 310, 100, 20);
        rechnprn.addActionListener(this);
        
        rechnom2.setBounds(270, 390, 100, 20);
        rechnom2.addActionListener(this);
        
 
        
       
        panelmenu.add(titre);
        panelmenu.add(titre2);
        panelmenu.add(titre3);
        panelmenu.add(titre4);
        panelmenu.add(titre5);
        
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
     
      if(tada.getSource()==enter)
     {
          try {
              String nomp= rechnom.getText();
              String prenomp= rechnprn.getText();
              String nomp2= rechnom2.getText(); //rechDocteur (String nomDocteur, String prenomDocteur, Connexion coco)
              //doc1.rechDocteur(nomp,prenomp,"");
              affichageresrech page= new affichageresrech();
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
