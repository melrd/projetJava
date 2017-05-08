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
  
  // création des menus
  private JMenu forme = new JMenu ("Forme"),
  calcul = new JMenu ("Calcul"),
  modification = new JMenu ("Modification"),
  copie = new JMenu ("Copie");
  
  // créations des sous menu
  private JMenuItem carre = new JMenuItem ("Carré"),
  rond = new JMenuItem ("Rond"),
  ligne = new JMenuItem ("Ligne"),
  polygone = new JMenuItem ("Polygone"),
  perimetre = new JMenuItem ("Périmètre"),
  aire = new JMenuItem ("Aire"),
  distance = new JMenuItem ("Distance"),
  translation = new JMenuItem ("Translation"),
  symétrie = new JMenuItem ("Symétrie"),
  rotation = new JMenuItem ("Rotation"),
  agrandissement = new JMenuItem ("Agrandissement");
  
  
  public Fenetre(){
	// intitialisation de la fenêtre
    this.setTitle("Projet JAVA L3");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setLocationRelativeTo(null);
    
    //positionnement
    container.setBackground(Color.red);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    
    // permet de voir
    this.setContentPane(container);
    this.initMenu();
    this.setVisible(true);   
  }
  
  private void initMenu(){
	 // Réactivité des boutons -> faire un listener pour chaque type de bouton?
    FormeListener fl = new FormeListener();
    carre.addActionListener(fl);
    rond.addActionListener(fl);
    polygone.addActionListener(fl);
    ligne.addActionListener(fl);
    CalculListener calc = new CalculListener();
    aire.addActionListener(calc);
    distance.addActionListener(calc);
    perimetre.addActionListener(calc);
    ModifListener modif = new ModifListener();
    agrandissement.addActionListener(modif);
    symétrie.addActionListener(modif);
    translation.addActionListener(modif);
    rotation.addActionListener(modif);
    
    copie.addActionListener(new ActionListener (){
    	public void actionPerformed (ActionEvent event){
    		//a voir plus tard 
    		System.out.println("faire l'action de copie"); // pas fonctionnel
    	}
    });
    
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
  }
  
 class FormeListener implements ActionListener{
	 public void actionPerformed (ActionEvent e){
		pan.setForme(((JMenuItem)e.getSource()).getText()); 
		System.out.println("Dessin en cours");
		// faire avec des positions
		// faire les couleurs
	 }
 }

 class CalculListener implements ActionListener{
	 public void actionPerformed (ActionEvent e){
		 // calculer & afficher le texte dans une partie de l'écran <=> autre class
		 System.out.println("Faire les calculs");
	 }
 }
 
 class ModifListener implements ActionListener{
	 public void actionPerformed (ActionEvent e){
		 // on verra ca plus tard!
		 System.out.println("rendre possible les animations");
	 }
 }
 }