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
public class histo extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private final JButton recherche ;   //Bouton recherche
    private JButton maj;  //Bouton mise a jour
    private JButton histo;  //Bouton histogramme/reporting
    private final JLabel titre; // declaration du titre
    
      public histo() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Accueil"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("histo.png"));
        panelmenu.setLayout(null);
        recherche = new JButton("Recherche d'information dans la base");
        maj = new JButton("Mise à jourde la base");
        histo = new JButton("Histogramme et statistique de la base");
         String texttitre="";
        titre = new JLabel(texttitre,JLabel.CENTER );

       
        titre.setBounds(195,20,300,100);
       
        recherche .setBounds(220,295,250,50);
        recherche .addActionListener(this);
        maj.setBounds(220,225,250,50);
        maj.addActionListener(this);
        histo.setBounds(220,360,250,50);
        histo.addActionListener(this);
        
        panelmenu.add(recherche );
        panelmenu.add(maj);
        panelmenu.add(histo);
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
     if(tada.getSource()==recherche)
     {
        
         fenetremenu.setVisible(false);
     }
     if(tada.getSource()==maj)
     {
        
         fenetremenu.setVisible(false);
     }
     if(tada.getSource()==histo)
     {
         
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

