package FactoryMethod;
import java.util.*;

public abstract class FabriqueCommande{
    // protected List<Commande> commandes = new ArrayList<Commande>();
    public abstract Commande creerCommande(double montant, int id);
    
    // public void validerCommande(double montant){
    //     Commande commande = this.creerCommande(montant);
    //     if (commande.valider()){
    //         commande.payer(montant);
    //         commandes.add(commande);
    //     }
    // }
}