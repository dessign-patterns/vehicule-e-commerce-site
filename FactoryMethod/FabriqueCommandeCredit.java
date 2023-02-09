package FactoryMethod;
public class FabriqueCommandeCredit extends FabriqueCommande{
    public Commande creerCommande(double montant, int id){
        return new CommandeCredit(montant, id);
    }
}