package AbstractFactory;

public class FabriqueVehiculeEssence extends FabriqueVehicule{
    public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace){
        return new AutomobileEssence(modele, couleur, puissance, espace);
    }

    public Scooter creerScooter(String modele, String couleur, int puissance){
        return new ScooterEssence(modele, couleur, puissance);
    }
}