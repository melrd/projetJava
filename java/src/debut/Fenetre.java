package debut;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener {
  private Panneau pan = new Panneau();
  private JPanel container = new JPanel();
  
  private JMenuBar menuBar = new JMenuBar();
  
  private JMenu forme = new JMenu ("Forme");
  private JMenu calcul = new JMenu ("Calcul");
  private JMenu modification = new JMenu ("Modification");
  private JMenu copie = new JMenu ("Copie");
  
  private JMenuItem carre = new JMenuItem ("Carré");
  private JMenuItem rond = new JMenuItem ("Rond");
  private JMenuItem ligne = new JMenuItem ("Ligne");
  private JMenuItem polygone = new JMenuItem ("Polygone");
  private JMenuItem perimetre = new JMenuItem ("Périmètre");
  private JMenuItem aire = new JMenuItem ("Aire");
  private JMenuItem distance = new JMenuItem ("Distance");
  private JMenuItem translation = new JMenuItem ("Translation");
  private JMenuItem symétrie = new JMenuItem ("Symétrie");
  private JMenuItem rotation = new JMenuItem ("Rotation");
  private JMenuItem agrandissement = new JMenuItem ("Agrandissement");
  
  
  public Fenetre(){
	
	// intitialisation de la fenêtre
    this.setTitle("Projet JAVA L3");
    this.setSize(800, 700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setLocationRelativeTo(null);
    
    // ajout des sous menu
    this.forme.add(carre);
    this.forme.add(rond);
    this.forme.add(polygone);
    this.forme.add(ligne);    
    this.calcul.add(aire);
    this.calcul.add(distance);
    this.calcul.add(perimetre);
    this.modification.add(agrandissement);
    this.modification.add(symétrie);
    this.modification.add(translation);
    this.modification.add(rotation);
    
    // création du menu
    this.menuBar.add(forme);
    this.menuBar.add(modification);
    this.menuBar.add(copie);
    this.menuBar.add(calcul);
    
    //ajout du menu
    this.setJMenuBar(menuBar);
    
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