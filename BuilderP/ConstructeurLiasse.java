package BuilderP;

public abstract class ConstructeurLiasse{
    protected Liasse liasse;
    public ConstructeurLiasse(Liasse l){
        this.liasse = l;
    }

    public abstract void construireBonCommande(String nomClient);
    public abstract void construireDemandeImmatriculation(String nomDemandeur);
    public abstract void construireCertificatCession(String nomDemandeur);

    public Liasse resultat(){
        return liasse;
    }
}