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
import miseajour.infirmier;

/**
 *
 * @author Gunness
 */
public class majinfirmier extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private JButton enter;
     private JButton supp;
      private JButton maj;
       private JButton add;
    private final JLabel titre; // declaration du titre
    private final JLabel titre2;
    private final JLabel titre3; // declaration du titre
    private final JLabel titre4;
    private final JLabel titre5; // declaration du titre
     
    private final JLabel titre6; // declaration du titre
    private final JLabel titre7; // declaration du titre
    private final JLabel titre8; // declaration du titre
    private final JLabel titre9; // declaration du titre
    private final JLabel titre10; // declaration du titre  
    private final JTextField rechnom;//decaration de textfield pour les noms et prenoms à rechercher
    private final JTextField rechnprn;
    private final JTextField addresse;
    private final JTextField numinf;
    private final JTextField tel;
    private final JTextField codserv;
    private final JTextField rot;
    private final JTextField salaire;
    private infirmier inf1;
    
      public majinfirmier() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Mise à jour des infirmiers"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("inf.png"));
        panelmenu.setLayout(null);
 
        
        rechnom=new JTextField();
        rechnprn=new JTextField();
        addresse=new JTextField();
        numinf=new JTextField();
        tel=new JTextField();
        codserv=new JTextField();
        rot=new JTextField();
        salaire=new JTextField();
        
        String texttitre1=" Veuillez remplir les champs:";
        titre = new JLabel(texttitre1,JLabel.CENTER );
         String texttitre2="";
         titre2 = new JLabel(texttitre2,JLabel.LEFT );
        
         String texttitre3=" Prénom :";
         titre3 = new JLabel(texttitre3,JLabel.LEFT );
         String texttitre4=" Nom :";
         String texttitre5=" Addresse :";
         String texttitre6=" Num.Inf :";
         String texttitre7=" Tel :";
         String texttitre8=" code service :";
         String texttitre9=" Rotation :";
         String texttitre10=" Salaire :";
         titre4 = new JLabel(texttitre4,JLabel.LEFT );
         titre5 = new JLabel(texttitre5,JLabel.LEFT );
         
         titre6 = new JLabel(texttitre6,JLabel.LEFT );
         titre7 = new JLabel(texttitre7,JLabel.LEFT );
         titre8 = new JLabel(texttitre8,JLabel.LEFT );
         titre9 = new JLabel(texttitre9,JLabel.LEFT );
         titre10 = new JLabel(texttitre10,JLabel.LEFT );
       
        titre.setBounds(185,220,300,20);
        titre2.setBounds(185,260,300,20);
        titre3.setBounds(185,280,300,20);
        titre4.setBounds(185,300,300,20);
        titre5.setBounds(185,320,300,20);
        titre6.setBounds(185,340,300,20);
        titre7.setBounds(185,360,300,20);
        titre8.setBounds(185,380,300,20);
        titre9.setBounds(185,400,300,20);
        titre10.setBounds(185,420,300,20);
       
        enter = new JButton("Enter");
        enter.setBounds(450,550,150,50);
        enter.addActionListener(this);
        panelmenu.add(enter);
        supp = new JButton("Supprimer");
        supp.setBounds(450,500,150,50);
        supp.addActionListener(this);
        panelmenu.add(supp);
        maj = new JButton("M.A.J");
        maj.setBounds(450,450,150,50);
        maj.addActionListener(this);
        panelmenu.add(maj);
        add = new JButton("Ajouter");
        add.setBounds(450,400,150,50);
        add.addActionListener(this);
        panelmenu.add(add);
        
        rechnom.setBounds(270, 285, 100, 20);
        rechnom.addActionListener(this);
        
        rechnprn.setBounds(270, 305, 100, 20);
        rechnprn.addActionListener(this);
        
        addresse.setBounds(270, 325, 100, 20);
        addresse.addActionListener(this);
        
        numinf.setBounds(270, 345, 100, 20);
        numinf.addActionListener(this);
        
        tel.setBounds(270, 365, 100, 20);
        tel.addActionListener(this);
        
        codserv.setBounds(270, 385, 100, 20);
        codserv.addActionListener(this);
        
        rot.setBounds(270, 405, 100, 20);
        rot.addActionListener(this);
        
        salaire.setBounds(270, 425, 100, 20);
        salaire.addActionListener(this);
 
        
       
        panelmenu.add(titre);
        panelmenu.add(titre2);
        panelmenu.add(titre3);
        panelmenu.add(titre4);
        panelmenu.add(titre5);
        panelmenu.add(titre6);
        panelmenu.add(titre7);
        panelmenu.add(titre8);
        panelmenu.add(titre9);
        panelmenu.add(titre10);
        
        panelmenu.add(rechnom);
        panelmenu.add(rechnprn);
        panelmenu.add(addresse);
        panelmenu.add(numinf);
        panelmenu.add(tel);
        panelmenu.add(codserv);
        panelmenu.add(rot);
        panelmenu.add(salaire);
        

        
        fenetremenu.pack();
        fenetremenu.setResizable(true);
        fenetremenu.setSize(700, 700);
        fenetremenu.setLocationRelativeTo(null);
        fenetremenu.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent tada) 
    {
     
      if(tada.getSource()==add)
     {
          try {
              //insertInf (int numeroinf, String codeservice ,String rot, float sal, String nomemp, String prenomemp, String adresse,int tel)
              String nomp= rechnom.getText();
              String prenomp= rechnprn.getText();
              String adressp= addresse.getText();
              String telp=tel.getText();          
            int telpp = Integer.parseInt(telp);
            String codeservicep= codserv.getText();
            String rotp= rot.getText();
            String numinfpp=numinf.getText();
            int numinfp = Integer.parseInt(numinfpp);
            String sal=salaire.getText();
            float salp = Float.parseFloat(numinfpp);
            
            //infirmier inf1= new infirmier();
            inf1.insertInf(numinfp,codeservicep,rotp,salp,"",prenomp,adressp,telpp);
              Accueil pag1=new Accueil();
          } catch (IOException ex) {
              Logger.getLogger(Rechercheinf.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(majinfirmier.class.getName()).log(Level.SEVERE, null, ex);
          }
         fenetremenu.setVisible(false);
     }
      // modifInf (int anciennumeroinf, int numeroinf, String codeservice, String rot, float sal)
      if(tada.getSource()==maj)
     {
          try {
           
              String nomp= rechnom.getText();
              String prenomp= rechnprn.getText();
              String adressp= addresse.getText();
              String telp=tel.getText();          
            int telpp = Integer.parseInt(telp);
            String codeservicep= codserv.getText();
            String rotp= rot.getText();
            String numinfpp=numinf.getText();
            int numinfp = Integer.parseInt(numinfpp);
            String sal=salaire.getText();
            float salp = Float.parseFloat(numinfpp);
            
            //infirmier inf1= new infirmier();
            inf1.modifInf(numinfp,0,codeservicep,rotp,salp);
              Accueil pag1=new Accueil();
          } catch (IOException ex) {
              Logger.getLogger(Rechercheinf.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(majinfirmier.class.getName()).log(Level.SEVERE, null, ex);
          }
         fenetremenu.setVisible(false);
     }
       if(tada.getSource()==enter)
     {
          try {
              //resinf page2=new resinf();
              Accueil pag1=new Accueil();
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

