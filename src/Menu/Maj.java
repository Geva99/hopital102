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

/**
 *
 * @author Gunness
 */
public class Maj extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private final JButton Docteur ;   //Bouton Docteur
    private JButton Infirmier;  //Bouton Infirmier
    private JButton Malade;  //Bouton Malade
    private final JLabel titre; // declaration du titre
    
    
      public Maj() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Miseà jour de la base"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("maj.png"));
        panelmenu.setLayout(null);
        Docteur = new JButton("Docteur");
        Infirmier = new JButton("Infirmier");
        Malade = new JButton("Malade");
         String texttitre="";
        titre = new JLabel(texttitre,JLabel.CENTER );

       
        titre.setBounds(195,20,300,100);
       
        Docteur .setBounds(220,295,250,50);
        Docteur .addActionListener(this);
        Infirmier.setBounds(220,225,250,50);
        Infirmier.addActionListener(this);
        Malade.setBounds(220,360,250,50);
        Malade.addActionListener(this);
        
        panelmenu.add(Docteur );
        panelmenu.add(Infirmier);
        panelmenu.add(Malade);
        panelmenu.add(titre);

        
        fenetremenu.pack();
        fenetremenu.setResizable(true);
        fenetremenu.setSize(700, 700);
        fenetremenu.setLocationRelativeTo(null);
        fenetremenu.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent tada) 
    {
     if(tada.getSource()==Docteur)
     {
         try {
             majdoc pageinf= new majdoc();
         } catch (IOException ex) {
             Logger.getLogger(Maj.class.getName()).log(Level.SEVERE, null, ex);
         }
         fenetremenu.setVisible(false);
     }
     if(tada.getSource()==Infirmier)
     {
         try {
             majinfirmier paginf= new majinfirmier();
         } catch (IOException ex) {
             Logger.getLogger(Maj.class.getName()).log(Level.SEVERE, null, ex);
         }
         fenetremenu.setVisible(false);
     }
     if(tada.getSource()==Malade)
     {
         try {
             majmal pagehisto= new majmal();
         } catch (IOException ex) {
             Logger.getLogger(Maj.class.getName()).log(Level.SEVERE, null, ex);
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
