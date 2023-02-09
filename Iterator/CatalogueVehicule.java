public class CatalogueVehicule extends Catalogue<Vehicule, IterateurVehicule>{
    public CatalogueVehicule(){
        contenu.add(new Vehicule("vehicule bon marche"));
        contenu.add(new Vehicule("petit vehicule bon marche"));
        contenu.add(new Vehicule("vehicule grande qualite"));
    }

    protected IterateurVehicule creerIterateur(){
        return new IterateurVehicule();
    }
}