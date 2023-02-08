public abstract class Commande{
    protected double montant;

    public Commande(double montant){
        this.montant = montant;
    }

    public abstract boolean valider();
    public abstract void payer();
}