/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.scene.Parent;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author guillaume
 */
public class Recherche extends Parent{
    
    Recherche(){
        Rectangle bandeau_infos = new Rectangle();
        Text recherche;
        
        bandeau_infos.setWidth(500);
        bandeau_infos.setHeight(100);
        bandeau_infos.setStroke(Color.DARKGREEN);
        bandeau_infos.setStrokeWidth(5);
        bandeau_infos.setArcWidth(30);
        bandeau_infos.setArcHeight(30);
        bandeau_infos.setFill(
             new LinearGradient(0f, 0f, 0f, 1f, true, CycleMethod.NO_CYCLE,
                new Stop[] {
                    new Stop(0, Color.web("#333333")),
                    new Stop(1, Color.web("#000000"))
                }
            )
        );
        
        Reflection r = new Reflection();//on applique un effet de réflection
        r.setFraction(0.08);
        r.setBottomOpacity(0);
        r.setTopOpacity(0.5);
        bandeau_infos.setEffect(r);
        
        recherche = new Text ("Rechercher");
        recherche.setFill(Color.ORANGE);
        recherche.setFont(new Font(70));
        recherche.setX(80);
        recherche.setY(75);
        
        
        this.setTranslateX(150); //on positionne le groupe en entier plutôt que le rectangle uniquement
        this.setTranslateY(130);
        this.getChildren().add(bandeau_infos);//on ajoute le bandeau au groupe
        this.getChildren().add(recherche);
    }
    
}