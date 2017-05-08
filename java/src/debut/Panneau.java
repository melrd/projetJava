package debut;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.input.MouseEvent;

public class Panneau extends JPanel {
	private String forme = "";
	
	public void paintComponent(Graphics g){
		if (this.forme.equals("CARRE") || this.forme.equals("CARRÉ"))
			g.fillRect(0,0,50,50);
		if (this.forme.equals("ROND"))
			g.fillOval(10, 10, 50, 80);
		if(this.forme.equals("POLYGONE"))
			g.fillPolygon(null);
	}
	
	public void setForme (String form){
		this.forme = form.toUpperCase();
		paintComponent(null);
	}
}

/*
mouseCliked (MouseEvent e){
	if (e.getButton() ==MouseEvent.BUTTON){
		System.out.println("x=%d , y = %d", e.getX(), e.getY());
	}
}*/