/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author nrali
 */
public class Dessin extends JPanel{

	private ArrayList<Integer> listX = new ArrayList<Integer>();
	private ArrayList<Integer> listY = new ArrayList<Integer>();
	private String voulu;
	private int Sommets, i;
	private Color pointerColor = Color.black;

	public void azer(String str, int a){
		voulu = str;
		Sommets = a;
		System.out.println("azerty");
	}
	
	public Dessin(){
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				System.out.println("5");
				listX.add(e.getX());
				listY.add(e.getY());  
				System.out.println(listX.size());
                                repaint();
			}
		});
	}


	public void paintComponent(Graphics g){
            super.paintComponent(g);
            int i = listX.size();
            System.out.println("nbSommets2 : " + Sommets);
            g.setColor(pointerColor);
            if((listX.size() >= 2) && voulu.equals("ligne")){
                    g.drawLine(listX.get(i-2), listY.get(i-2), listX.get(i-1), listY.get(i-1));
                    
            }
            else if ((listX.size() >= 2) && voulu.equals("cercle")){
                int r = (int) Math.sqrt((Math.pow((listX.get((listX.size())-2) -  listX.get((listX.size())-1)),2) + Math.pow((listY.get((listY.size())-2) -  listY.get((listY.size())-1)),2)));
                g.fillOval(listX.get((listX.size())-2), listY.get((listY.size())-2), r, r);
                listX.clear(); 
                listY.clear();
            }

            else if((listX.size() >= 2) && voulu.equals("ellipse")){
                g.fillOval(listX.get((listX.size())-2), listY.get((listY.size())-2), listX.get((listX.size())-1), listY.get((listY.size())-1));
                listX.clear(); 
                listY.clear();
            }

            else if ((listX.size() >= 2) && voulu.equals("polygone")){
                for (i = 0; i < Sommets; i++){
                    System.out.println("i = " + i);

                    if (i == 0)
                            System.out.println("i= 0 sommet : " + Sommets);					
                    else //if (i != 0)
                    {
                        g.drawLine(listX.get((listX.size())-2), listY.get((listY.size())-2), listX.get((listX.size())-1), listY.get((listY.size())-1));
                        System.out.println(i);

                    }
                    if (listX.size() == Sommets){
                        System.out.println("Fin du dessin" + i + " s " + Sommets);
                        i++;
                        g.drawLine(listX.get(listX.size()-1), listY.get(listY.size()-1), listX.get(0), listY.get(0));
                        voulu = "";
                    }
                }
            }
	}

        public void clear(){
        
            removeAll();
            repaint(); 
       }
	//Définit la couleur du pointeur
	public void setPointerColor(Color c){
		this.pointerColor  = c;
	}

}