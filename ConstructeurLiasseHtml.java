public class ConstructeurLiasseHtml extends ConstructeurLiasse{
    public ConstructeurLiasseHtml(){
        liasse = new LiasseHtml();
    }

    public void construitBonDeCommande(String nomClient){
        String document;
        document = "<HTML>Bon de commande Client : " + nomClient + "</HTML>";
        liasse.ajouteDocument(document);
    }

    public void construiDemandeImmatriculation(String nomDemandeur){
        String document;
        document = "<HTML>Demande d'immatriculation Demandeur: " + nomDemandeur + "</HTML>";
        liasse.ajouteDocument(document);
    }
}