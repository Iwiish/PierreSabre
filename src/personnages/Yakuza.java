package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquerCommercant(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		this.reputation = reputation + 1;
		parler("J’ai piqué les " + victime.getArgent() + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma\r\n"
				+ "poche. Hi ! Hi !");
		victime.seFaireExtorquer();
	}

	public String getClan() {
		return clan;
	}

	public int gagner(int gain) {
		argent = argent + gain;
		reputation++;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + "?\r\n"
				+ "//Je l'ai dépouillé de ses 54 sous.");
		return argent;
	}
	
	public int perdre() {
		argent = 0;
		reputation--;
		parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de\r\n"
				+ clan);
		return argent;
	}
	
//	 perdre (méthode int perdre()) il perd tout son argent, perd un point de
//	 réputation, et annonce sa défaite.
//	 ● gagner (méthode gagner(int gain)) : il prend l’argent gagné à son adversaire,
//	 gagne en réputation et crie sa victoire.
}
//(Roro) - J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.
//(Yaku Le Noir) - Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ?
//Je l'ai dépouillé de ses 54 sous.
