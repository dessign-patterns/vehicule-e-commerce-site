public class ConstructeurLiassePdf extends ConstructeurLiasse{
    public ConstructeurLiassePdf(){
        liasse = new LiassePdf();
    }

    public void construitBonDeCommande(String nomClient){
        String document;
        document = "<PDF>Bon de commande Client : " + nomClient + "</PDF>";
        liasse.ajouteDocument(document);
    }

    public void construiDemandeImmatriculation(String nomDemandeur){
        String document;
        document = "<PDF>Demande d'immatriculation Demandeur: " + nomDemandeur + "</PDF>";
        liasse.ajouteDocument(document);
    }
}