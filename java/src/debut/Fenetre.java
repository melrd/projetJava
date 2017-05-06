package debut;
import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class Fenetre extends JFrame{
		
	public Fenetre(){

		this.setTitle("Projet Java L3"); //titre
		this.setSize(800,800); //dimensions
		this.setLocationRelativeTo(null); // positionne au milieu
		this.setResizable(true); //redimensionnement autorisé
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //arrete le run quand ferme
		
		this.setContentPane(new Panneau());
		this.getContentPane().add(new JButton("Youpidou!"), BorderLayout.NORTH); 
		this.setVisible(true); //rend visible
		}
}
