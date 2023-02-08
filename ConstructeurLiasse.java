public abstract class ConstructeurLiasse{
    protected Liasse liasse;

    public abstract void construitBonDeCommande(String nomClient);
    public abstract void construiDemandeImmatriculation(String nomDemandeur);

    public Liasse resultat(){
        return liasse;
    }
}