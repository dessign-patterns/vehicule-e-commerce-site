package AbstractFactory;

public abstract class FabriqueVehicule{
    public abstract Automobile creerAutomobile(String modele, String couleur, int puissance, double espace);
    public abstract Scooter creerScooter(String modele, String couleur, int puissance);
}