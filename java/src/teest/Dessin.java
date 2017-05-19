package teest;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author acces_libre
 */
public class Dessin extends JPanel{
    
    private ArrayList<Integer> listX = new ArrayList<Integer>();
    private ArrayList<Integer> listY = new ArrayList<Integer>();
    private String voulu;
    private int nbSommets = 0;
        
    public void azer(String str, int a){
        voulu = str;
        nbSommets = a;
        System.out.println("azerty");
    }
    public Dessin(){
       this.addMouseListener(new MouseAdapter(){
       
           public void mousePressed(MouseEvent e){
           System.out.println("5");
               listX.add(e.getX());
               listY.add(e.getY());  
               System.out.println("5b");
               repaint();
               
           }
       });
    }

    
    public void paintComponent(Graphics g){
        
        // ligne
        System.out.println("7" + nbSommets);
        if((listX.size() >= 2) && voulu.equals("ligne")){
            System.out.println("8");
            g.drawLine(listX.get((listX.size())-2), listY.get((listY.size())-2), listX.get((listX.size())-1), listY.get((listY.size())-1));
            listX.clear();
            listY.clear();
       }
       else if ((listX.size() >= 2) && voulu.equals("cercle")){
           int r = (int) Math.sqrt((Math.pow((listX.get((listX.size())-2) -  listX.get((listX.size())-1)),2) + Math.pow((listY.get((listY.size())-2) -  listY.get((listY.size())-1)),2)));
           g.drawOval(listX.get((listX.size())-2), listY.get((listY.size())-2), r, r);
           listX.clear(); 
           listY.clear();
       }
       else if((listX.size() >= 2) && voulu.equals("ellipse")){
           g.drawOval(listX.get((listX.size())-2), listY.get((listY.size())-2), listX.get((listX.size())-1), listY.get((listY.size())-1));
           listX.clear(); 
           listY.clear();
       }
      else if ((listX.size() != nbSommets) && (nbSommets != 0) &&voulu.equals("polygone")){
           for (int i = 2; i < nbSommets; i++){
               g.drawLine(listX.get(i-2), listY.get(i-2), listX.get(i-1), listY.get(i-1));
           }
       }
        System.out.println("9");
    }
    
    
}