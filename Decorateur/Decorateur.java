public abstract class Decorateur implements ComposantVehicule{
    protected ComposantVehicule composant;
    public Decorateur (ComposantVehicule composant){
        this.composant =composant;
    }

    public void affiche(){
        composant.affiche();
    }
}