public class CommandeCredit extends Commande{
    public CommandeCredit(double montant){
        super(montant);
    }

    public void payer(){
        System.out.println("le Paiement de la commande au credit de : "+ montant +" est effectuee");
    }

    public boolean valider(){
        return (montant >= 1000.0) && (montant <= 5000.0);
    }
}