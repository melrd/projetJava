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
	//private Panneau pan = new Panneau();
	//private JPanel container = new JPanel();
	private JMenuBar menuBar = new JMenuBar();
	private DrawPanel drawPanel = new DrawPanel();

	// création des menus
	private JMenu forme = new JMenu ("Forme"),
			calcul = new JMenu ("Calcul"),
			modification = new JMenu ("Modification"),
			copie = new JMenu ("Copie"),
			couleurfond = new JMenu("Couleur Fond"),
			couleurforme = new JMenu ("Couleur forme"),
			couleur = new JMenu ("Couleur"),
			effacer = new JMenu ("Effacer");

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
			vert = new JMenuItem("Vert"),
			rouge = new JMenuItem ("Rouge"),
			blanc = new JMenuItem ("Blanc"),
			bleu = new JMenuItem ("Bleu"),
			jaune = new JMenuItem ("Jaune"),
			fondVert = new JMenuItem("Vert"),
			fondRouge = new JMenuItem ("Rouge"),
			fondBlanc = new JMenuItem ("Blanc"),
			fondBleu = new JMenuItem ("Bleu"),
			fondJaune = new JMenuItem ("Jaune");

	// Listener
	FormeListener fl = new FormeListener();
	CalculListener calc = new CalculListener();
	ModifListener modif = new ModifListener();
	CouleurListener coul = new CouleurListener();
	FondCouleurListener col = new FondCouleurListener();
	EffacerListener effac = new EffacerListener();

	public Fenetre(){
		// intitialisation de la fenêtre
		this.setTitle("Projet JAVA L3");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);

		//positionnement
		/*container.setBackground(Color.BLUE);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER); */

		// permet de voir
		this.initMenu();
		//this.setContentPane(pan);
		this.getContentPane().add(drawPanel, BorderLayout.CENTER);
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
		blanc.addActionListener(coul);
		bleu.addActionListener(coul);
		jaune.addActionListener(coul);
		rouge.addActionListener(coul);
		fondVert.addActionListener(col);
		fondBlanc.addActionListener(col);
		fondBleu.addActionListener(col);
		fondJaune.addActionListener(col);
		fondRouge.addActionListener(col);
		effacer.addActionListener(effac);

		copie.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent event){
				//a voir plus tard 
				System.out.println("faire l'action de copie"); // pas fonctionnel
			}
		});

		this.couleurfond.add(fondVert);
		this.couleurfond.add(fondBlanc);
		this.couleurfond.add(fondBleu);
		this.couleurfond.add(fondRouge);
		this.couleurfond.add(fondJaune);
		this.couleurforme.add(vert);
		this.couleurforme.add(blanc);
		this.couleurforme.add(bleu);
		this.couleurforme.add(rouge);
		this.couleurforme.add(jaune);
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
		this.couleur.add(couleurfond);
		this.couleur.add(couleurforme);

		// création du menu
		this.menuBar.add(forme);
		this.menuBar.add(couleur);
		//this.menuBar.add(couleurforme);
		this.menuBar.add(modification);
		this.menuBar.add(effacer);
		this.menuBar.add(copie);
		this.menuBar.add(calcul);

		//ajout du menu
		this.setJMenuBar(menuBar);
	}

	class FormeListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Dessin en cours");
			if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
				if(e.getSource()==carre) 
					drawPanel.setPointerType("SQUARE");
				else 
					drawPanel.setPointerType("CIRCLE");
			}
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
		public void actionPerformed(ActionEvent e) {
			System.out.println("changement de couleur");
			System.out.println(e.getSource().getClass().getName());
			if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
				System.out.println("OK !");
				if(e.getSource()==vert)drawPanel.setPointerColor(Color.green);
				else if(e.getSource()==bleu)drawPanel.setPointerColor(Color.blue);
				else if(e.getSource()==jaune)drawPanel.setPointerColor(Color.yellow);
				else if(e.getSource()==rouge)drawPanel.setPointerColor(Color.red);
				else drawPanel.setPointerColor(Color.black);
			}
		}    
	}

	class FondCouleurListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("changement de couleur");
			System.out.println(e.getSource().getClass().getName());
			if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
				System.out.println("OK !");
				if (e.getSource() == fondVert) drawPanel.setPointerColor(Color.green);
				else if (e.getSource() == fondRouge) drawPanel.setPointerColor(Color.red);
				else if (e.getSource() == fondJaune) drawPanel.setPointerColor(Color.yellow);
				else if (e.getSource() == fondBleu) drawPanel.setPointerColor(Color.blue);
				else if (e.getSource() == fondBlanc) drawPanel.setPointerColor(Color.white);
			}
		}
	}

	class EffacerListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("effacer");
		}
	}
}