package debut;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javafx.scene.input.MouseEvent;

public class Panneau extends JPanel {
	private String forme = "";
	private Color couleurforme = Color.RED; // inutile pour le moment mais peut changer
	private Color couleurfond = Color.BLUE;
	private Color couleurcontour = Color.GREEN;


	public void paintComponent(Graphics g){
		g.setColor(couleurforme);
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

	public void setCouleurFond (Color color){
		this.couleurfond = color;
	}

	public void setCouleurForme (Color color){
		this.couleurforme = color;
	}
}