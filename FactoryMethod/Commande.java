package FactoryMethod;

public abstract class Commande{
    protected double montant;
    protected int id;

    public void setMontant(Double mnt){
        this.montant = mnt;
    }
    public double getMontant(){
        return this.montant;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getId(){
        return this.id;
    }

    public Commande(double montant, int id){
        this.id = id;
        this.montant = montant;
    }

    public abstract boolean valider();
    public abstract void payer( double montant);
}