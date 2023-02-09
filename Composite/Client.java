public class Client{
    public static void main(String[] args){
        Societe societe1 = new SocieteSansFiliale();
        societe1.ajouteVehicule();

        Societe societe2 = new SocieteSansFiliale();
        societe2.ajouteVehicule();
        societe2.ajouteVehicule();

        SocieteMere groupe = new SocieteMere();
        groupe.ajouteFiliale(societe1);
        groupe.ajouteFiliale(societe2);
        groupe.ajouteVehicule();

        System.out.println("Prix de toute la flotte du groupe: " + groupe.calculCoutFlotte());
    }
}