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
public class majdoc extends JFrame implements ActionListener {
    
    private final JFrame fenetremenu; // declaration d'une fenetre pour acceuil
    private JPanel panelmenu; //declaration d'un panneau accueil
    private JButton enter;
    private final JLabel titre; // declaration du titre
    private final JLabel titre2;
    private final JLabel titre3; // declaration du titre
    private final JLabel titre4;
    private final JLabel titre5; // declaration du titre
     
    private final JLabel titre6; // declaration du titre
    private final JLabel titre7; // declaration du titre
    private final JLabel titre8; // declaration du titre
    //private final JLabel titre9; // declaration du titre
    //private final JLabel titre10; // declaration du titre  
    private final JTextField rechnom;//decaration de textfield pour les noms et prenoms à rechercher
    private final JTextField rechnprn;
    private final JTextField addresse;
    private final JTextField mail;
    private final JTextField tel;
    private final JTextField codserv;
    //private final JTextField rot;
    //private final JTextField salaire;
    
      public majdoc() throws IOException 
    {
       
        fenetremenu=new JFrame();//creation d'une fenetre pour le menu
        fenetremenu.setTitle("Hopital 102 : Mise à jour des docteurs"); // titre de la fenetre
        fenetremenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        panelmenu = new JPanel();//creation d'un panneau menu
        
        panelmenu = setImage(fenetremenu, new File("doc.png"));
        panelmenu.setLayout(null);
 
        
        rechnom=new JTextField();
        rechnprn=new JTextField();
        addresse=new JTextField();
        mail=new JTextField();
        tel=new JTextField();
        codserv=new JTextField();
       // rot=new JTextField();
        //salaire=new JTextField();
        
        String texttitre1=" Veuillez remplir les champs:";
        titre = new JLabel(texttitre1,JLabel.CENTER );
         String texttitre2="";
         titre2 = new JLabel(texttitre2,JLabel.LEFT );
        
         String texttitre3=" Prénom :";
         titre3 = new JLabel(texttitre3,JLabel.LEFT );
         String texttitre4=" Nom :";
         String texttitre5=" Addresse :";
         String texttitre6=" Mail :";
         String texttitre7=" Tel :";
         String texttitre8=" Specialité:";

         titre4 = new JLabel(texttitre4,JLabel.LEFT );
         titre5 = new JLabel(texttitre5,JLabel.LEFT );
         
         titre6 = new JLabel(texttitre6,JLabel.LEFT );
         titre7 = new JLabel(texttitre7,JLabel.LEFT );
         titre8 = new JLabel(texttitre8,JLabel.LEFT );
        
       
        titre.setBounds(185,220,300,20);
        titre2.setBounds(185,260,300,20);
        titre3.setBounds(185,280,300,20);
        titre4.setBounds(185,300,300,20);
        titre5.setBounds(185,320,300,20);
        titre6.setBounds(185,340,300,20);
        titre7.setBounds(185,360,300,20);
        titre8.setBounds(185,380,300,20);
        
       
        enter = new JButton("Enter");
        enter.setBounds(450,550,150,50);
        enter.addActionListener(this);
        panelmenu.add(enter);
        
        rechnom.setBounds(270, 285, 100, 20);
        rechnom.addActionListener(this);
        
        rechnprn.setBounds(270, 305, 100, 20);
        rechnprn.addActionListener(this);
        
        addresse.setBounds(270, 325, 100, 20);
        addresse.addActionListener(this);
        
        mail.setBounds(270, 345, 100, 20);
        mail.addActionListener(this);
        
        tel.setBounds(270, 365, 100, 20);
        tel.addActionListener(this);
        
        codserv.setBounds(270, 385, 100, 20);
        codserv.addActionListener(this);
        
        //rot.setBounds(270, 405, 100, 20);
        //rot.addActionListener(this);
        
        //salaire.setBounds(270, 425, 100, 20);
        //salaire.addActionListener(this);
 
        
       
        panelmenu.add(titre);
        panelmenu.add(titre2);
        panelmenu.add(titre3);
        panelmenu.add(titre4);
        panelmenu.add(titre5);
        panelmenu.add(titre6);
        panelmenu.add(titre7);
        panelmenu.add(titre8);
      
        
        panelmenu.add(rechnom);
        panelmenu.add(rechnprn);
        panelmenu.add(addresse);
        panelmenu.add(mail);
        panelmenu.add(tel);
        panelmenu.add(codserv);
        //panelmenu.add(rot);
        //panelmenu.add(salaire);
        

        
        fenetremenu.pack();
        fenetremenu.setResizable(true);
        fenetremenu.setSize(700, 700);
        fenetremenu.setLocationRelativeTo(null);
        fenetremenu.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent tada) 
    {
     
      if(tada.getSource()==rechnom)
     {
         
         fenetremenu.setVisible(false);
     }
      
      if(tada.getSource()==rechnprn)
     {
          
         fenetremenu.setVisible(false);
     }
      
      if(tada.getSource()==addresse)
     {
         
         fenetremenu.setVisible(false);
     }
      
      if(tada.getSource()==mail)
     {
          
         fenetremenu.setVisible(false);
     }
      
      if(tada.getSource()==tel)
     {
         
         fenetremenu.setVisible(false);
     }
      
      if(tada.getSource()==codserv)
     {
          
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