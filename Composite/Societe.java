public abstract class Societe{
    protected static double prixUnitVehicule = 5.0;
    protected int nbrVehicules;

    public void ajouteVehicule(){
        nbrVehicules = nbrVehicules + 1;
    }

    public abstract double calculCoutFlotte();
}