public class FabriqueCommandeComptant extends FabriqueCommande{
    protected Commande creerCommande(double montant){
        return new CommandeComptant(montant);
    }
}