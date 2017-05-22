/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author nrali
 */
public class Fenetre extends JFrame{
    
    private JMenuBar menuBar  = new JMenuBar();
   // private JPanel container = new JPanel();
    private Dessin dessin = new Dessin();
    private int nbSommets = 0;
    
    private JMenu forme = new JMenu ("Forme"),
        calcul = new JMenu ("Calcul"),
        modification = new JMenu ("Modification"),
        copie = new JMenu ("Copie"),
        /*couleurfond = new JMenu("Couleur Fond"),*/
        couleurforme = new JMenu ("Couleur forme"),
        couleur = new JMenu ("Couleur"),
        effacer = new JMenu ("Effacer");

	// créations des sous menu
    private JMenuItem ellipse = new JMenuItem ("Ellipse"),
        rond = new JMenuItem ("Rond"),
        polygone = new JMenuItem ("Polygone"),
        ligne = new JMenuItem ("Ligne"),
        pinceau = new JMenuItem ("Pinceau"),
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
        jaune = new JMenuItem ("Jaune");
       /* fondVert = new JMenuItem("Vert"),
        fondRouge = new JMenuItem ("Rouge"),
        fondBlanc = new JMenuItem ("Blanc"),
        fondBleu = new JMenuItem ("Bleu"),
        fondJaune = new JMenuItem ("Jaune");*/

    
	// Listener
    /*PinceauListener pin = new PinceauListener();
	CarreListener dessin_carre = new CarreListener();
	CalculListener calc = new CalculListener();
	ModifListener modif = new ModifListener();
	
	EffacerListener effac = new EffacerListener();
*/
        LigneListener lig = new LigneListener();
        CercleListener dessinCercle = new CercleListener();
        EllipseListener dessinEllipse = new EllipseListener();
        CouleurListener coul = new CouleurListener();
        PolygoneListener dessinPolygone = new PolygoneListener();
        //FondCouleurListener col = new FondCouleurListener();
        EffacerListener efface = new EffacerListener();
        
	public Fenetre(){
		// intitialisation de la fenêtre
		this.setTitle("Projet JAVA L3");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);
		this.getContentPane().add(dessin, BorderLayout.CENTER);
		// permet de voir
                System.out.println("1b");
		this.initMenu();
                System.out.println("2");
               //this.setContentPane(dessin);

		this.setVisible(true);
                System.out.println("3");
	}
    
        private void initMenu(){
            /*this.couleurfond.add(fondVert);
            this.couleurfond.add(fondBlanc);
            this.couleurfond.add(fondBleu);
            this.couleurfond.add(fondRouge);
            this.couleurfond.add(fondJaune);*/
            this.couleurforme.add(vert);
            this.couleurforme.add(blanc);
            this.couleurforme.add(bleu);
            this.couleurforme.add(rouge);
            this.couleurforme.add(jaune); 
            // ajout des sous menu
            this.forme.add(ellipse);
            this.forme.add(rond);
            //this.forme.add(pinceau);
            this.forme.add(ligne);
            this.forme.add(polygone);
            /*this.calcul.add(aire);
            this.calcul.add(distance);
            this.calcul.add(perimetre);
            this.modification.add(agrandissement);
            this.modification.add(symétrie);
            this.modification.add(translation);
            this.modification.add(rotation);
            this.couleur.add(couleurfond);*/
            this.couleur.add(couleurforme);


            // création du menu
            this.menuBar.add(forme);
            this.menuBar.add(couleur);
            this.menuBar.add(effacer);/*
            //this.menuBar.add(couleurforme);
            this.menuBar.add(modification);
            this.menuBar.add(effacer);
            this.menuBar.add(copie);
            this.menuBar.add(calcul);*/

            //ajout du menu
            
            this.setJMenuBar(menuBar);
            
            ligne.addActionListener(lig);
            rond.addActionListener(dessinCercle);
            ellipse.addActionListener(dessinEllipse);       
            polygone.addActionListener(dessinPolygone);
    		vert.addActionListener(coul);
    		blanc.addActionListener(coul);
    		bleu.addActionListener(coul);
    		jaune.addActionListener(coul);
    		rouge.addActionListener(coul);
                effacer.addActionListener(efface);
                
           // this.container.add(dessin);
        }
        
        class LigneListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) {
                dessin.repaint();
                dessin.azer("ligne", nbSommets);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
        class CercleListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) { 
                dessin.azer("cercle", nbSommets);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
        class EllipseListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) {
                dessin.azer("ellipse", nbSommets);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
        class PolygoneListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) {                
            nbSommets = Integer.parseInt(JOptionPane.showInputDialog(dessin, "Combien de sommets pour le polygone ?"));
            System.out.println("nbSommets : "+nbSommets);
            dessin.azer("polygone", nbSommets);
            nbSommets = 0;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
    	class CouleurListener implements ActionListener{
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("changement de couleur");
    			if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
    				System.out.println("OK !");
    				if(e.getSource()==vert)dessin.setPointerColor(Color.green);
    				else if(e.getSource()==bleu)dessin.setPointerColor(Color.blue);
    				else if(e.getSource()==jaune)dessin.setPointerColor(Color.yellow);
    				else if(e.getSource()==rouge)dessin.setPointerColor(Color.red);
    				else dessin.setPointerColor(Color.black);
    			}
    		}    
    	}
        
        class EffacerListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent ae) {
                
               dessin = new Dessin();
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        }
}