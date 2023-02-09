package AbstractFactory;

public class AutomobileElectrique extends Automobile{
    public AutomobileElectrique(String modele, String couleur, int puissance, double espace){
        super(modele, couleur, puissance, espace);

    }

    public void afficheCarracteristiques(){
        System.out.println("Automobile electrique de modele: " + modele + " de couleur: " + couleur + " de puissance: " + puissance +" d'espace: " + espace); 
    }
}