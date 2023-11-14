package personnages;

public class Commercant extends Humain {
	
	static String boisson = "thé";
	
	public Commercant(String nom, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		int oldargent = argent;
		this.argent = 0; 
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return oldargent;
	}
	
//	public void recevoir(int argent) {
//		
//	}
}

//Un commerçant est un humain dont la boisson préférée est le thé. Il peut se faire
//extorquer son argent : il perd tout son argent et il parle pour dire que le monde est
//vraiment trop injuste. Il peut aussi recevoir de l’argent d’un ronin qu’il remercie alors
//avec déférence.
//a. Écrire la classe Commercant : coder les méthodes int seFaireExtorquer() et void
//recevoir(int argent). Concernant la méthode seFaireExtorquer :
//- précision : l’entier retourné est la somme dont le commerçant c’est fait
//extorqué,
//- remarque : vous n’arriverez pas à visualiser l’attribut argent de votre classe
//mère Humain. Pour résoudre ce problème vous aurez le choix entre 2 solutions,
//lesquelles ?
