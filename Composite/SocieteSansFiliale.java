public class SocieteSansFiliale extends Societe{
    public double calculCoutFlotte(){
        return nbrVehicules*prixUnitVehicule;
    }
}