package TemplateMethod;

public abstract class CommandeC {
    protected double montantHt;
    protected double montantTva;
    protected double montantTtc;

    protected abstract void calculTva();

    public double calculMontantTtc(){
        this.calculTva();
        montantTtc = montantHt + montantTva;
        return montantTtc;
    }

    public void setMontantHt(double montantHt){
        this.montantHt = montantHt;
    }

    public void affiche(){
        System.out.println("Commande");
        System.out.println("Montant HT "+ montantHt);
        System.out.println("Montant TTC "+ montantTtc);
    }
}