public class Utilisateur{
    public static void main(String[] args){
        CatalogueVehicule catalogue = new CatalogueVehicule();
        IterateurVehicule iterateur = catalogue.recherche("bon marche");
        Vehicule vehicule;
        iterateur.debut();
        vehicule = iterateur.item();
        while ( vehicule != null){
            vehicule.affiche();
            iterateur.suivant();
            vehicule = iterateur.item();
        }
    }
}