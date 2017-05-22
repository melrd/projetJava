/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.geom.Ellipse2D;
/**
 *
 * @author nrali
 */
public class Ellipse extends Ellipse2D.Double{
    
    private double aire;
    private double perimetre;
    
    public Ellipse(int x, int y, int w, int h){
        super(x, y, w, h);
        aire = 0;
        perimetre = 0;
        
        if (w == h){
            aire = (Math.PI) * w * w;
            perimetre = 2 * (Math.PI) * w;
        }
        else{
            aire = (Math.PI) * w * h;
            perimetre = (2 * (Math.PI) * Math.sqrt((1/2) * ((w * w) + (h * h))));
        }
    }
    public double getAire(){
        return aire;
    }
    public double getPerimetre(){
        return perimetre;
    }
}
