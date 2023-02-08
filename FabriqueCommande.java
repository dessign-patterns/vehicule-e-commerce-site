import java.util.*;

public abstract class FabriqueCommande{
    protected List<Commande> commandes = new ArrayList<Commande>();
    protected abstract Commande creerCommande(double montant);
    
    public void nouvelleCommande(double montant){
        Commande commande = this.creerCommande(montant);
        if (commande.valider()){
            commande.payer();
            commandes.add(commande);
        }
    }
}