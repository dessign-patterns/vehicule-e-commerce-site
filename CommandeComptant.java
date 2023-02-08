public class CommandeComptant extends Commande{
    public CommandeComptant(double montant){
        super(montant);
    }

    public void payer(){
        System.out.println("le Paiement de la commande au comptant de : "+ montant +" est effectuee");
    }

    public boolean valider(){
        return true;
    }
}