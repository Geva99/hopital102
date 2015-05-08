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
public class MAJ extends Parent {
    
    MAJ(){
        Rectangle maj = new Rectangle();
        Text texte;
        
        maj.setWidth(500);
        maj.setHeight(100);
        maj.setFill(
             new LinearGradient(0f, 0f, 0f, 1f, true, CycleMethod.NO_CYCLE,
                new Stop[] {
                    new Stop(0, Color.web("#333333")),
                    new Stop(1, Color.web("#000000"))
                }
            )
        );
        maj.setStroke(Color.DARKGREEN);
        maj.setStrokeWidth(5);
        maj.setArcHeight(30);
        maj.setArcWidth(30);
        
        Reflection r = new Reflection();//on applique un effet de réflection
        r.setFraction(0.08);
        r.setBottomOpacity(0);
        r.setTopOpacity(0.5);
        maj.setEffect(r);
        
        texte = new Text ("Mise à jour de Données");
        texte.setFill(Color.ORANGE);
        texte.setFont(new Font(46));
        texte.setX(10);
        texte.setY(65);
       
        
        this.setTranslateX(150); //on positionne le groupe en entier plutôt que le rectangle uniquement
        this.setTranslateY(270);
        this.getChildren().add(maj);
        this.getChildren().add(texte);//on ajoute le bandeau au groupe
        
    }
    
}