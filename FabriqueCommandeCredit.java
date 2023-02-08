public class FabriqueCommandeCredit extends FabriqueCommande{
    protected Commande creerCommande(double montant){
        return new CommandeCredit(montant);
    }
}