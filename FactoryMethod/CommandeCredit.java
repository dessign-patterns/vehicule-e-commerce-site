package FactoryMethod;
public class CommandeCredit extends Commande{
    public CommandeCredit(double montant, int id){
        super(montant, id);
    }

    public void payer( double montant){
        System.out.println("le Paiement de la commande au comptant du vehicule "+this.id+" : "+ montant +" est effectuee");
    }

    public boolean valider(){
        return (montant >= 1000.0) && (montant <= 5000.0);
    }
}