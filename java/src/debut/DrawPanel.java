package debut;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel{

	private Color pointerColor = Color.red;
	private String pointerType = "CIRCLE";
	private int posX = -10, oldX = -10;
	private int posY = -10, oldY = -10;
	private boolean erasing = true; //Pour savoir si on doit dessiner ou non
	private int pointerSize = 15; //Taille du pointeur
	private ArrayList<Point> points = new ArrayList<Point>();//Collection de points !   

	public DrawPanel(){
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				points.add(new Point(e.getX() - (pointerSize / 2), e.getY() - (pointerSize / 2), pointerSize, pointerColor, pointerType));
				repaint();
			}
		});

		this.addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e) {
				//On r�cup�re les coordonn�es de la souris et on enl�ve la moiti� de la taille du pointeur pour centrer le trac�
				points.add(new Point(e.getX() - (pointerSize / 2), e.getY() - (pointerSize / 2), pointerSize, pointerColor, pointerType));
				repaint();
			}

			public void mouseMoved(MouseEvent e) {}
		});

	}

	// Vous la connaissez maintenant, celle-l�
	public void paintComponent(Graphics g) {

		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		//Si on doit effacer, on ne passe pas dans le else => pas de dessin
		if(this.erasing){
			this.erasing = false;
		}
		else{
			//On parcourt notre collection de points
			for(Point p : this.points)
			{
				g.setColor(p.getColor()); //On r�cup�re la couleur

				//Selon le type de point
				if(p.getType().equals("SQUARE")){
					g.fillRect(p.getX(), p.getY(), p.getSize(), p.getSize());
				}
				else{
					g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
				}
			}
		}        
	}

	//Efface le contenu
	public void erase(){
		this.erasing = true;
		this.points = new ArrayList<Point>();
		repaint();
	}

	//D�finit la couleur du pointeur
	public void setPointerColor(Color c){
		this.pointerColor = c;
	}

	//D�finit la forme du pointeur
	public void setPointerType(String str){
		this.pointerType = str;
	}      
}