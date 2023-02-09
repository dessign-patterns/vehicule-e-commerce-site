import java.util.*;
public class SocieteMere extends Societe{
    protected List<Societe> filiales = new ArrayList<Societe>();
    public boolean ajouteFiliale(Societe filiale){
        return filiales.add(filiale);
    }

    public double calculCoutFlotte(){
        double cout = 0.0;
        for (Societe filiale: filiales)
            cout = cout + filiale.calculCoutFlotte();
        return cout + nbrVehicules * prixUnitVehicule;
    }

    public void getFiliales(){
        for (Societe filiale: filiales)
            System.out.println(filiale);
    }

    public void retireFiliale(Societe filiale){
        filiales.remove(filiale);
    }
}