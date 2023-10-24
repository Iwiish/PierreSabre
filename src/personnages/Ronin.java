package personnages;

public class Ronin extends Humain {

	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
//	Le ronin est un humain, il a un attribut d’honneur initialisé à 1.
//	On lui ajoute une méthode lui permettant de donner 10% de son argent à un
//	commerçant,
//	a. Écrire la classe Ronin : coder la méthode void donner(Commercant beneficiaire).
	
	public void donner(Commercant beneficiaire) {
		parler(beneficiaire.getNom() + " prend cet argent.");
		beneficiaire.gagnerArgent((int) (this.argent*(0.10)));
	}
	
}
