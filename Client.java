public class Client{
    public static void main(String[] args){
        FabriqueCommande fabrique;
        fabrique = new FabriqueCommandeComptant();
        fabrique.nouvelleCommande(1500.0);
        fabrique.nouvelleCommande(8500.0);
        
        fabrique = new FabriqueCommandeCredit();
        fabrique.nouvelleCommande(1500.0);
        fabrique.nouvelleCommande(8500.0);
    }
}