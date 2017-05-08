package debut;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class Fenetre extends JFrame implements ActionListener {
  private Panneau pan = new Panneau();
  private JPanel container = new JPanel();
  private JMenuBar menuBar = new JMenuBar();
  
  // création des menus
  private JMenu forme = new JMenu ("Forme"),
  calcul = new JMenu ("Calcul"),
  modification = new JMenu ("Modification"),
  copie = new JMenu ("Copie"),
  couleur = new JMenu("Couleur");
  
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
  agrandissement = new JMenuItem ("Agrandissement"),
  fond = new JMenuItem ("Fond"),
  contour = new JMenuItem ("Contour"),
  intérieur = new JMenuItem ("Remplissage"),
  vert = new JMenuItem("Vert");
  
  // création des couleurs -> temporaire car vraiment moche
 // private JCheckBoxMenuItem vert = new JCheckBoxMenuItem("vert");
		  /*rouge = new JCheckBoxMenuItem("rouge"),
		  blanc = new JCheckBoxMenuItem("blanc"),
		  jaune = new JCheckBoxMenuItem("jaune"),
		  bleu = new JCheckBoxMenuItem("bleu");*/
		  
  FormeListener fl = new FormeListener();
  CalculListener calc = new CalculListener();
  ModifListener modif = new ModifListener();
  CouleurListener coul = new CouleurListener();
  
  public Fenetre(){
	// intitialisation de la fenêtre
    this.setTitle("Projet JAVA L3");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setLocationRelativeTo(null);
    
    //positionnement
    container.setBackground(Color.BLUE);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    
    // permet de voir
    this.setContentPane(container);
    this.initMenu();
    this.setVisible(true);   
  }
  
  private void initMenu(){
	 // Réactivité des boutons
    carre.addActionListener(fl);
    rond.addActionListener(fl);
    polygone.addActionListener(fl);
    ligne.addActionListener(fl);
    aire.addActionListener(calc);
    distance.addActionListener(calc);
    perimetre.addActionListener(calc);
    agrandissement.addActionListener(modif);
    symétrie.addActionListener(modif);
    translation.addActionListener(modif);
    rotation.addActionListener(modif);
    vert.addActionListener(coul);
    /*blanc.addActionListener(coul);
    bleu.addActionListener(coul);
    jaune.addActionListener(coul);
    rouge.addActionListener(coul);*/
    
    copie.addActionListener(new ActionListener (){
    	public void actionPerformed (ActionEvent event){
    		//a voir plus tard 
    		System.out.println("faire l'action de copie"); // pas fonctionnel
    	}
    });
    
    this.fond.add(vert);
    /*this.fond.add(blanc);
    this.fond.add(bleu);
    this.fond.add(rouge);
    this.fond.add(jaune);
    this.contour.add(blanc);
    this.contour.add(vert);
    this.contour.add(bleu);
    this.contour.add(rouge);
    this.contour.add(jaune);
    this.intérieur.add(blanc);
    this.intérieur.add(vert);
    this.intérieur.add(bleu);
    this.intérieur.add(rouge);
    this.intérieur.add(jaune);*/
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
    this.couleur.add(fond);
    //this.couleur.add(this.contour);
    //this.couleur.add(this.intérieur);
    
    
    // création du menu
    this.menuBar.add(forme);
    this.menuBar.add(couleur);
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
 
 class CouleurListener implements ActionListener{
	 public void actionPerformed (ActionEvent e){
		 // on verra ca plus tard!
		 System.out.println("changement de couleur");
	 }
 }
 }