package personnages;

public class Humain {
	private String nom;
	private String boisson; 
	protected int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent < prix) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrire un " + 
																		bien + " à " + prix + " sous.");
		}
		else {
			parler("J'ai "+ argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			this.argent = argent - prix;
		}
	}
	
	public void gagnerArgent(int gain) {
		parler(gain + " sous ! Je te remercie généreux donateur!");
		this.argent = argent + gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent = argent - perte;
	}

}

//Solution 1 : mettre en protected
//Solution 2 : utiliser un getArgent();