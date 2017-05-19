package debut;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


public class FormeTest extends JPanel {
	private int Ox = 0,
			Oy = 5,
			Px = 6,
			Py = 4,
			click = 0;
	private double d = 0,
			c = 0;
	
	public void paint (Graphics g){		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.green); // couleur par défaut
		g.fillRect((int)Ox, (int)Oy, (int)c, (int)c);
		//enregistrement(Ox,Oy,Px,Py, 4*c, Math.pow(c, 2), "carré");
	}


	FormeTest(){}
	
	public void formeTest(){
		
		this.addMouseListener(new MouseAdapter(){
			public void mouseCliked(MouseEvent e){
				click ++;
				
				if (click == 1){
					Ox = e.getX();
					Oy = e.getY();
					System.out.println ("Coordonnée à" + Ox + "et" + Oy);
				}
				else if (click == 2){
					Px = e.getX();
					Py = e.getY();
					System.out.println ("point 2" + e.getX() + e.getY());
					d = distance(Ox, Oy, Px, Py);
					c =  d*Math.sqrt(2.0);
					System.out.println("distance " + d + " cote " + c);
					update(getGraphics());
				}
			}
		});
	}
	
	public double distance(double Ox2, double Oy2, double Px2, double Py2){
		return Math.sqrt(Math.pow(Ox2-Px2, 2.0) + Math.pow(Oy2-Py2, 2.0));
	}
	
	public void enregistrement (double Ox1, double Oy1, double Px1, double Px2, double perim, double aire, String dessin){
		//on va attendre de savoir ce qu on fait
	}
	
		private void addMouseListener(MouseAdapter mouseAdapter) {
		// TODO Auto-generated method stub
		
	}
}
