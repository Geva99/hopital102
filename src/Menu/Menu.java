/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Connexion.Connexion;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
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
public class Menu extends JFrame implements ActionListener{
      
    private final JFrame fenetremenu; // declaration d'une fenetre pour le menu
    private JPanel panelmenu; //declaration d'un panneau menu
    private final JButton OnlineNutton;   //Bouton online
    private JButton OfflineNutton;  //bouton offline 
    private final JLabel titre; // declaration du titre
    
    private final JTextField nom;//decaration de textfield pour les noms et prenoms à rechercher
    private final JTextField mdp;
    private final JTextField nombdd;
    private final JTextField mdpbdd;
    private final JTextField nom2;
    private final JTextField mdp2;
    private final JLabel titre2;
    private final JLabel titre3; // declaration du titre
    private final JLabel titre4;
    private final JLabel titre5; // declaration du titre
     
    private final JLabel titre6; // declaration du titre
    private final JLabel titre7; // declaration du titre

    
    public Menu() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Menu Hopital 102: Connexion"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("hop1.png"));
        panelmenu.setLayout(null);
        OnlineNutton = new JButton("Connexion Online");
        OfflineNutton = new JButton("Connexion Offline");
         String texttitre="Bienvenue dans le Menu d'Hopital 102";
        titre = new JLabel(texttitre,JLabel.CENTER );
        nom=new JTextField();
        mdp=new JTextField();
        nombdd=new JTextField();
        mdpbdd=new JTextField();
        nom2=new JTextField();
        mdp2=new JTextField();
        String texttitre2="nom base :";
         titre2 = new JLabel(texttitre2,JLabel.LEFT );
        
         String texttitre3=" mdp base :";
         titre3 = new JLabel(texttitre3,JLabel.LEFT );
         String texttitre4=" login ece :";
         String texttitre5=" mdp ece :";
         String texttitre6=" nom base :";
         String texttitre7=" mdp base :";
         titre4 = new JLabel(texttitre4,JLabel.LEFT );
         titre5 = new JLabel(texttitre5,JLabel.LEFT );
         
         titre6 = new JLabel(texttitre6,JLabel.LEFT );
         titre7 = new JLabel(texttitre7,JLabel.LEFT );

       
        titre.setBounds(175,20,300,100);
        
         titre2.setBounds(385,235,100,20);
        titre3.setBounds(385,265,100,20);
        titre4.setBounds(385,295,100,20);
        titre5.setBounds(385,325,100,20);
        titre6.setBounds(385,355,100,20);
        titre7.setBounds(385,385,100,20);
        
        nom2.setBounds(480, 235, 100, 20);
        nom2.addActionListener(this);
        
        mdp2.setBounds(480, 265, 100, 20);
        mdp2.addActionListener(this);
        
        
        
        
        nom.setBounds(480, 295, 100, 20);
        nom.addActionListener(this);
        
        mdp.setBounds(480, 325, 100, 20);
        mdp.addActionListener(this);
        
        nombdd.setBounds(480, 355, 100, 20);
       nombdd.addActionListener(this);
        
        mdpbdd.setBounds(480, 385, 100, 20);
        mdpbdd.addActionListener(this);
        
       
        OnlineNutton.setBounds(170,295,200,50);
        OnlineNutton.addActionListener(this);
        OfflineNutton.setBounds(170,225,200,50);
        OfflineNutton.addActionListener(this);
         panelmenu.add(titre2);
        panelmenu.add(titre3);
        panelmenu.add(titre4);
        panelmenu.add(titre5);
        panelmenu.add(titre6);
        panelmenu.add(titre7);
         panelmenu.add(nom);
        panelmenu.add(mdp);
        panelmenu.add(nombdd);
        panelmenu.add(mdpbdd);
        panelmenu.add(nom2);
        panelmenu.add(mdp2);
        panelmenu.add(OnlineNutton);
        panelmenu.add(OfflineNutton);
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
     if(tada.getSource()==OnlineNutton)
     {
         try {
             String login= nom.getText();
             String mdpf=mdp.getText();
             String nombddf= nombdd.getText();
             String mdpbddf=mdpbdd.getText();
            // Connexion Connexion1=new Connexion(login,mdpf,nombddf,mdpbddf);
             Accueil acucu =new Accueil();
             fenetremenu.setVisible(false);
         } catch (IOException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         //} catch (SQLException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        // } catch (ClassNotFoundException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     if(tada.getSource()==OfflineNutton)
     {
         try {
             String nombdd= nom2.getText();
             String mdp=mdp2.getText();
            // Connexion Connexion1=new Connexion(nombdd,mdp);
             Accueil acucu =new Accueil();
             
         } catch (IOException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         //} catch (SQLException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        // } catch (ClassNotFoundException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
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
                g.drawImage(buf, 0, 0, null);
            }
        };

        frame.setContentPane(panel);

        return panel;
    }
}
