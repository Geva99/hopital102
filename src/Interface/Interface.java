/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Interface.MAJ;
import Interface.Recherche;
import Interface.Stats;
import static javafx.application.Application.launch;
import javafx.scene.text.Font;

/**
 *
 * @author guillaume
 */
public class Interface extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Group root = new Group();
      Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
      primaryStage.setScene(scene);
      
      Text menu;
      
      menu= new Text("Menu");
      menu.setFill(Color.MIDNIGHTBLUE);
      menu.setFont(new Font(65));
      menu.setX(310);
      menu.setY(75);
      menu.setUnderline(true);
     
      
      Recherche infos = new Recherche();
      MAJ boutton = new MAJ();
      Stats button = new Stats();
      
      root.getChildren().add(menu);
      root.getChildren().add(infos);
      root.getChildren().add(boutton);
      root.getChildren().add(button);//ajout du bouton au groupe root
      
      primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }
    
}
