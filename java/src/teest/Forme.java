package teest;
import java.awt.Color;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class Forme {
	private Color couleur = Color.black;
	private String type = "";
	private List pointX = new ArrayList ();
	private List pointY = new ArrayList ();
	
	public Forme (String str, Color nom, int X, int Y){
		this.type = str;
		this.couleur = nom;
		this.pointX.add(X);
		this.pointY.add(Y);
	}
	
	public Forme (int X, int Y){
		this.pointX.add(X);
		this.pointY.add(Y);
	}
	
	public Color getColor(){
		return this.couleur;
	}
	
	public int getX(){
		return this.getX();
	}
	
	public int getY(){
		return this.getY();
	}
	
	public String getType (){
		return this.type;
	}
}
