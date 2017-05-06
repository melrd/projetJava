package debut;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	
	public void paintComponent(Graphics g){
		System.out.println("Exceution");
		int x1 = this.getWidth()/4; //centre l'objet
	    int y1 = this.getHeight()/4;
	    g.fillOval(x1, y1, x1*2, y1 * 2);
	}

}


/* serait bien à utiliser quand on fera les boutons pour créer les formes*/