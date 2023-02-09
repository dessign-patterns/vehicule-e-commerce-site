package FactoryMethod;
public class FabriqueCommandeComptant extends FabriqueCommande{
    public Commande creerCommande(double montant, int id){
        return new CommandeComptant(montant, id);
    }
}