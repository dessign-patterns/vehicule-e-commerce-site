public class Client{
    public static void main(String[] args){
        VueVehicule vehicule = new VueVehicule();
        Modele modele = new Modele(vehicule);
        Marque marque = new Marque(modele);

        marque.affiche();
    }
}