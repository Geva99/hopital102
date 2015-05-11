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
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gunness
 */
public class resinf extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private final JLabel titre; // declaration du titre


    private final JTextField affrequetes;//decaration de textfield pour les noms et prenoms à rechercher
    
      public resinf() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Résultat"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("res.png"));
        panelmenu.setLayout(null);
 
        
        affrequetes=new JTextField();
        
        String texttitre1=" Affichage des résultats :";
        titre = new JLabel(texttitre1,JLabel.CENTER );

         

       
        titre.setBounds(100,120,300,100);
       
       
        affrequetes.setBounds(70, 185, 600, 300);
        affrequetes.addActionListener(this);
        

 
        
       
        panelmenu.add(titre);
  
        
        panelmenu.add(affrequetes);

        
        fenetremenu.pack();
        fenetremenu.setResizable(true);
        fenetremenu.setSize(700, 700);
        fenetremenu.setLocationRelativeTo(null);
        fenetremenu.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent tada) 
    {
     
      if(tada.getSource()==affrequetes)
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

