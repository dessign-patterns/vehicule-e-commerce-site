public class Vendeur{
    protected ConstructeurLiasse constructeur;

    public Vendeur(ConstructeurLiasse constructeur){
        this.constructeur = constructeur;
    }

    public Liasse construit(String nomClient){
        constructeur.construitBonDeCommande(nomClient);
        constructeur.construiDemandeImmatriculation(nomClient);
        Liasse liasse = constructeur.resultat();
        return liasse;
    }
}