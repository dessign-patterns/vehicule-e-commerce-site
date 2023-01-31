public class ScooterEssence extends Scooter{
    public ScooterEssence(String modele, String couleur, int puissance){
        super(modele, couleur, puissance);
    }

    public void afficheCarracteristiques(){
        System.out.println("Scooter essence de modele: " + modele + " de couleur: " + couleur + " de puissance" + puissance); 
    }
}