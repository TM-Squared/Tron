/**
 * 
 */
package org.view;

import org.contract.ObjetJeu;

/**
 * @author TOUSSI Manoel
 *
 */
public class Collision extends ObjetJeu {
	
	public Collision() {
		this.CollisionMurJoueur();
		this.CollisonFenetre();
	}

	@Override
	public void CollisonFenetre() {
		// TODO Auto-generated method stub
		if (Clavier.j1.getX() == 1) {
			Clavier.j1.setX(GameFrame.largFen-20);
			Clavier.j1.setY(Clavier.j1.getY());
		}
		
		if (Clavier.j1.getX() == (GameFrame.largFen)-19) {
			Clavier.j1.setX(1);
			Clavier.j1.setY(Clavier.j1.getY());
		}
		
		
		if (Clavier.j1.getY() == 0) {
			Clavier.j1.setX(Clavier.j1.getX());
			Clavier.j1.setY(GameFrame.hautFen-40);
		}
		
		if (Clavier.j1.getY() == (GameFrame.hautFen)-39) {
			Clavier.j1.setY(1);
			Clavier.j1.setX(Clavier.j1.getX());
		}
		
		
	}
	
	public void collisionFenetre2() {
		if (Clavier2.j2.getX() == 1) {
			Clavier2.j2.setX(GameFrame.largFen-20);
			Clavier2.j2.setY(Clavier2.j2.getY());
		}
		
		if (Clavier2.j2.getX() == (GameFrame.largFen)-19) {
			Clavier2.j2.setX(1);
			Clavier2.j2.setY(Clavier2.j2.getY());
		}
		
		
		if (Clavier2.j2.getY() == 0) {
			Clavier2.j2.setX(Clavier2.j2.getX());
			Clavier2.j2.setY(GameFrame.hautFen-40);
		}
		
		if (Clavier2.j2.getY() == (GameFrame.hautFen)-39) {
			Clavier2.j2.setY(1);
			Clavier2.j2.setX(Clavier2.j2.getX());
		}
		
	}


	@Override
	public void CollisionMurJoueur() {
		// TODO Auto-generated method stub
		for(int i = 0; i < Clavier.red.size(); i++) {
			for(int j=0; j < Clavier2.blue.size(); j++) {
			//QUAND IL RENCONTRE LE MUR ADVERSE joueur2 vs mur1
				if(Clavier.red.get(i).getX() == Clavier2.j2.getX() && Clavier.red.get(i).getY() == Clavier2.j2.getY()){
					Clavier2.play2 = false;
					System.out.println(Clavier.play);
					System.out.println(Clavier2.play2);
				}
			// QUAND IL RENCONTRE LE MUR ADVERSE joueur1 vs mur2
				if(Clavier2.blue.get(j).getX() == Clavier.j1.getX() && Clavier2.blue.get(j).getY() == Clavier.j1.getY()) {
					Clavier.play = false;
					System.out.println(Clavier.play);
					System.out.println(Clavier2.play2);
				}
			
			}
			
		}
		
	}
	
	public void collisionOwnWall() {
		for(int i = 0; i < Clavier.red.size(); i++) {
			//QUAND IL RENCONTRE SON PROPRE MUR	JOUEUR 1
			if(Clavier.red.get(i).getX() == Clavier.j1.getX() && Clavier.red.get(i).getY() == Clavier.j1.getY() ){
				Clavier.play = false;
				System.out.println(Clavier.play);
				System.out.println(Clavier2.play2);
			}
			
		}
	
	}
	
	public void collisionOwnWall2() {
		for(int j=0; j < Clavier2.blue.size(); j++) {
			//QUAND IL RENCONTRE SON PROPRE MUR JOUEUR 2
			if(Clavier2.blue.get(j).getX() == Clavier2.j2.getX()  && Clavier2.blue.get(j).getY() == Clavier2.j2.getY()) {
				Clavier2.play2 = false;
				System.out.println(Clavier.play);
				System.out.println(Clavier2.play2);
			}
		}
	}
	
	public void collisionj1j2() {
		// JOUEUR 1 VS JOUEUR 2
		if(Clavier.j1.getX() == Clavier2.j2.getX() && Clavier.j1.getY() == Clavier2.j2.getY() ) {
			Clavier2.play2 = false;
			Clavier.play = false;
			System.out.println(Clavier.play);
			System.out.println(Clavier2.play2);
		}

	}

}
