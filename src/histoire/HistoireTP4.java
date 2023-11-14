package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

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
		
//		(Marco) - Bonjour ! Je m’appelle Marco et j’aime boire du thé.
//		(Marco) - J’ai tout perdu! Le monde est trop injuste...
//		(Marco) - 15 sous ! Je te remercie généreux donateur!
//		(Marco) - Mmmm, un bon verre de thé ! GLOUPS !
		
		Commercant Marco = new Commercant("Marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.gagnerArgent(15);
		Marco.boire();
		
//		b. Tester dans la classe HistoireTP4 pour obtenir le scénario ci-dessous. Le yakuza
//		à 30 sous en poche à sa création et fait partie du clan Warsong.
//		(Yaku Le Noir) - Bonjour ! Je m’appelle Yaku Le Noir et j’aime boire du whisky.
//		(Yaku Le Noir) - Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?
//		(Yaku Le Noir) - Marco, si tu tiens à la vie donne moi ta bourse !
//		(Marco) - J’ai tout perdu! Le monde est trop injuste...
//		(Yaku Le Noir) - J’ai piqué les 15 sous de Marco, ce qui me fait 45 sous dans ma
//		poche. Hi ! Hi !
		
		Yakuza Yaku = new Yakuza("Yaku Le Noir", "whiksy", 30, "Warsong");
		Yaku.direBonjour();
		Yaku.extorquerCommercant(Marco);
		
//		b. Tester dans la classe HistoireTP4 pour obtenir le scénario ci-dessous. Le ronin à
//		60 sous en poche à sa création.
//		(Roro) - Bonjour ! Je m’appelle Roro et j’aime boire du shochu.
//		4
//		TP4 : héritage
//		(Roro) - Marco prend ces 6 sous.
//		(Marco) - 6 sous ! Je te remercie généreux donateur!
//		c. Sauvegarder votre travail sous GitHub (cf p1 - Historisation périodique de votre
//		projet - exemple de message pour le commit “création de la classe Ronin”).

		Ronin Roro = new Ronin("Roro", "sochu", 60);
		Roro.direBonjour();
		Roro.donner(Marco);
		
		
		
		
	}

}
