package AbstractFactory;

public class ScooterElectrique extends Scooter{
    public ScooterElectrique(String modele, String couleur, int puissance){
        super(modele, couleur, puissance);
    }

    public void afficheCarracteristiques(){
        System.out.println("Scooter electrique de modele: " + modele + " de couleur: " + couleur + " de puissance" + puissance); 
    }
}