package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		//c. Tester dans la classe HistoireTP4 pour obtenir le scénario ci-dessous.
		//(Prof) - Bonjour ! Je m’appelle Prof et j’aime boire du kombucha.
		//(Prof) - J'ai 54 sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous
		//(Prof) - Mmmm, un bon verre de kombucha ! GLOUPS !
		//(Prof) - J'ai 42 sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous
		//(Prof) - Je n'ai plus que 40 sous en poche. Je ne peux même pas m'offrir un kimono à
		//50 sous.
		
		Humain Prof = new Humain("Prof", "kombucha", 54);
		Prof.direBonjour();
		Prof.acheter("boisson", 12);
		Prof.boire();
		Prof.acheter("jeu", 2);
		Prof.acheter("kimono", 50);

	}

}