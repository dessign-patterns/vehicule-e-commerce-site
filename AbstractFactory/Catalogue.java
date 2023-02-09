import java.util.*;
public class Catalogue{
    public static int nbAutos = 3;
    public static int nbScooters = 2;

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        FabriqueVehicule fabrique;
        Automobile[] autos = new Automobile[nbAutos];
        Scooter[] scooters = new Scooter[nbScooters];
        System.out.println("Voulez vous utiliser des vehicules electriques(1) ou a essence (2) ?");
        String choix = reader.next();
        if (choix.equals("1")){
            fabrique = new FabriqueVehiculeElectrique();

        }else{
            fabrique = new FabriqueVehiculeEssence();
        }

        for (int i = 0; i < nbAutos; i++){
            autos[i] = fabrique.creerAutomobile("Sport", "rouge", 6+i, 3.2+i);
        }
        for (int i = 0; i < nbScooters; i++){
            scooters[i] = fabrique.creerScooter("Standard", "bleu", 2+i);
        }

        for (Automobile auto: autos){
            auto.afficheCarracteristiques();
        }
        for (Scooter scooter: scooters){
            scooter.afficheCarracteristiques();
        }
    }
}