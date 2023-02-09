package FactoryMethod;
public class CommandeComptant extends Commande{
    public CommandeComptant(double montant, int id){
        super(montant, id);
    }

    public void payer(double montant){
        System.out.println("le Paiement de la commande au comptant du vehicule "+this.id+" : "+ montant +" est effectuee");
    }

    public boolean valider(){
        return true;
    }

}