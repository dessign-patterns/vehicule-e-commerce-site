public class Modele extends Decorateur{
    public Modele(ComposantVehicule composant){
        super(composant);
    }

    protected void afficheInfoTechnique(){
        System.out.println("Informations Techniques du modele");
    }
    public void affiche(){
        super.affiche();
        this.afficheInfoTechnique();
    }
}