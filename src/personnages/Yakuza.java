package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquerCommercant(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		this.reputation = reputation + 1;
		parler("J’ai piqué les " + victime.getArgent() + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma\r\n"
				+ "poche. Hi ! Hi !");
	}
	

}
