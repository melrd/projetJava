package debut;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class Carre extends JPanel {
	private int Ox = 0,
			Oy = 5,
			Px = 6,
			Py = 4;
	
	public Carre(){
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				Ox = e.getX();
				Oy = e.getY();
			}
		});
		
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				Px = e.getX();
				Py = e.getY();
			}
		});
		
		//repaint();
	}
	public void paintComponent (Graphics g)
	{	
		double d = distance(Ox, Oy, Px, Py);
		double c =  d*Math.sqrt(2.0);
		g.setColor(Color.green); // couleur par défaut
		g.fillRect((int)Ox, (int)Oy, (int)c, (int)c);
		//enregistrement(Ox,Oy,Px,Py, 4*c, Math.pow(c, 2), "carré");
	}
	public double distance(double Ox2, double Oy2, double Px2, double Py2){
		return Math.sqrt(Math.pow(Ox2-Px2, 2.0) + Math.pow(Oy2-Py2, 2.0));
	}
	
	public void blabla (Graphics g){
		System.out.println("blabla");
		super.paintComponent(g);
		paintComponent(g);
	}
	public void enregistrement (double Ox1, double Oy1, double Px1, double Px2, double perim, double aire, String dessin){
		//on va attendre de savoir ce qu on fait
	}
	
	
	private void addMouseListener(MouseAdapter mouseAdapter) {
		// TODO Auto-generated method stub
		public void mousePressed(MouseEvent e){
			Px = e.getX();
			Py = e.getY();
		}
	}
	}
}
