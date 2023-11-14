package personnages;

public class Humain {
	protected String nom;
	private String boisson; 
	protected int argent;
	protected int nbCo;
	public String[] connaissances = new String[30]; 
	
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

	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		
	}
	
	private void memoriser(Humain humain) {
		if(nbCo == 30){
			for(int a = 0; a<29; a++){
				connaissances[a] = connaissances[a+1];
			}
			nbCo--;
		}

		connaissances[nbCo] = humain.getNom();
		nbCo++;
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerCo() {
		int i = 0;
		System.out.print("Je connais beaucoup de monde dont : ");
		while(i<nbCo) {
			System.out.print(connaissances[i]);
			
			if(nbCo>1 && i<nbCo-1) {
				System.out.print(", ");
			}
			i++;
		}
		System.out.print(".");
		System.out.println("");
	}
}

//Solution 1 : mettre en protected
//Solution 2 : utiliser un getArgent();