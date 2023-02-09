public class Marque extends Decorateur{
    public Marque(ComposantVehicule composant){
        super(composant);
    }

    protected void afficheLogo(){
        System.out.println("Logo de la marque");
    }

    public void affiche(){
        super.affiche();
        this.afficheLogo();
    }
}