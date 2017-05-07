package debut;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener {
  private Panneau pan = new Panneau();
  private JButton forme = new JButton("Dessiner");
  private JButton modification = new JButton("Modification");
  private JButton copie = new JButton ("Copie");
  private JButton calcul = new JButton("Calcul");
  private JPanel container = new JPanel();
  
  public Fenetre(){
	
	// intitialisation de la fenêtre
    this.setTitle("Projet JAVA L3");
    this.setSize(800, 700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setLocationRelativeTo(null);
    
    // ajout des boutons
    pan.add(forme);
    pan.add(modification);
    pan.add(copie);
    pan.add(calcul);
    
    //positionnement
    container.setBackground(Color.red);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    
   // utilisation de la souris ->  class anonymes, sans doutes moins lourd car que une action. si plus faire des class dans la class
   forme.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		  System.out.println("forme");
	}});
   modification.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			  System.out.println("modif");
		}});
   copie.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			  System.out.println("copie");
		}});
   calcul.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			  System.out.println("calcul");
		}});
   
   // permet de voir
    this.setContentPane(container);
    this.setVisible(true);    
  }

 } 