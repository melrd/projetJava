package debut;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.input.MouseEvent;

public class Panneau extends JPanel {
	
	public void paintComponent(Graphics g){
		int x1 = this.getWidth()/4; //centre l'objet
	    int y1 = this.getHeight()/4;
	    g.drawOval(x1, y1, x1*2, y1 * 2);
	}

}

/*
mouseCliked (MouseEvent e){
	if (e.getButton() ==MouseEvent.BUTTON){
		System.out.println("x=%d , y = %d", e.getX(), e.getY());
	}
}*/