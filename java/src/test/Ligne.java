/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.geom.Line2D;

/**
 *
 * @author nrali
 */

public class Ligne extends Line2D.Double{
    
    private double aire;
    private double perimetre;
    
    public Ligne(int x1, int y1, int x2, int y2){
    
        super(x1, y1, x2, y2);
        aire = 0;
        perimetre = 0;// calculer le perimetre !!!!!!!
    }
    
    public double getAire(){
        return aire;
    }
    public double getPerimetre(){
        return perimetre;
    }
    public void setAire(double r){
        aire = r;
    }
    public void setPerimetre(double p){
        perimetre = p;
    }
}
