package debut;
import java.awt.Color;
import java.awt.Graphics;

public class Forme {
	private double Ox = 2.0,
			Oy = 3.5,
			Px = 8.6,
			Py = 9.4;
	
	public Forme(Object str){
		if (str == "carre")
			carre(null);
		if (str == "rond")
			rond(null);
		if (str == "ligne")
			ligne(null);
		if (str == "polygone")
			polygone (null);
	}
	
	public double distance(double Ox2, double Oy2, double Px2, double Py2){
		return Math.sqrt(Math.pow(Ox2-Px2, 2.0) + Math.pow(Oy2-Py2, 2.0));
	}
	
	public void enregistrement (double Ox1, double Oy1, double Px1, double Px2, double perim, double aire, String dessin){
		//on va attendre de savoir ce qu on fait
	}
	
	public void carre (Graphics g){
		double d = distance(Ox, Oy, Px, Py);
		double c =  d*Math.sqrt(2.0);
		g.setColor(Color.green); // couleur par défaut
		g.fillRect((int)Ox, (int)Oy, (int)c, (int)c);
		enregistrement(Ox,Oy,Px,Py, 4*c, Math.pow(c, 2), "carré");
	}
	
	public void rond (Graphics g){
		double r = distance(Ox, Oy, Px, Py);
		g.setColor(Color.green); // couleur par défaut
		g.fillOval((int)Ox, (int)Oy, (int)r, (int)r);
		enregistrement(Ox,Oy,Px,Py, 2*r*Math.PI, Math.PI*Math.pow(r, 2), "cercle");
	}
	
	public void ligne (Graphics g){
		g.setColor(Color.green);
		g.drawLine((int)Ox, (int)Oy, (int)Px, (int)Py);
		enregistrement(Ox,Oy,Px,Py, distance(Ox, Oy, Px, Py), 0, "ligne"); 
	}
	
	public void polygone (Graphics g){
	//faire polygone permettra le triangle	
	}
}
