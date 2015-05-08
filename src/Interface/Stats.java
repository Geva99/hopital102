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
public class Stats extends Parent{
    
    Stats(){
        Rectangle rec = new Rectangle();
        Text stat;
        
        rec.setWidth(300);
        rec.setHeight(100);
        rec.setFill(
             new LinearGradient(0f, 0f, 0f, 1f, true, CycleMethod.NO_CYCLE,
                new Stop[] {
                    new Stop(0, Color.web("#333333")),
                    new Stop(1, Color.web("#000000"))
                }
            )
        );
        rec.setStroke(Color.DARKGREEN);
        rec.setStrokeWidth(5);
        rec.setArcHeight(30);
        rec.setArcWidth(30);
        
        Reflection r = new Reflection();//on applique un effet de réflection
        r.setFraction(0.08);
        r.setBottomOpacity(0);
        r.setTopOpacity(0.5);
        rec.setEffect(r);
        
        stat = new Text ("Statistiques");
        stat.setFill(Color.ORANGE);
        stat.setFont(new Font(46));
        stat.setX(33);
        stat.setY(65);
       
        
        this.setTranslateX(250); //on positionne le groupe en entier plutôt que le rectangle uniquement
        this.setTranslateY(410);
        this.getChildren().add(rec);
        this.getChildren().add(stat);//on ajoute le bandeau au groupe
        
    }
    }
