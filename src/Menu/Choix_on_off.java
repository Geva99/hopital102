/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
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
 * @author alexandre
 */
public class Choix_on_off extends JFrame implements ActionListener{
    
    private JFrame fenetre;
    private JLabel nom_bdd;
    private JTextField nom_bdd_String;
    private String nom_bddString;
    private JPanel contente;
    
    public Choix_on_off()
    {
        //Création d'une JFrame
        fenetre=new JFrame();
        fenetre.setTitle("Hopital Base de données");
        fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);//fermer sur croix
        Image icone = Toolkit.getDefaultToolkit().getImage("icon.PNG");//on change l'icone dégueulasse de java
        fenetre.setIconImage(icone);//par quelque chose de plus funky
        fenetre.setLayout(null);//ON définit aucune méthode de rangement
        
        //création d'un JPanel integrer à la JFrame avec l'image de fond
        try {
            contente = setImage(fenetre, new File("choix_on_off.png"));
        } catch (IOException e) {
            contente = new JPanel();
        }
        contente.setLayout(null);
        
        //Affichage
        fenetre.pack();
        fenetre.setResizable(false);
        fenetre.setSize(256, 256);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
    
    
    
    //permet de tout nettoyer derrière,afin d'éviter les fuites mémoires
    private void nettoyage_on_off()
    {
        getContentPane().removeAll();
        getContentPane().revalidate();
        getContentPane().repaint();
    }
    
        //Permet de mettre une image en fond d'écran
    public static JPanel setImage(JFrame frame, final File fichierimage) throws IOException {
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1;
            private final BufferedImage buf = ImageIO.read(fichierimage);

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(buf, 0, 0, null);
            }
        };

        frame.setContentPane(panel);

        return panel;
    }
}

