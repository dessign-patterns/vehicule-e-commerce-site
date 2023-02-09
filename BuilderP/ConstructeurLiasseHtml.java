package BuilderP;

public class ConstructeurLiasseHtml extends ConstructeurLiasse{
    public ConstructeurLiasseHtml(Liasse l){
        // if (l == null){
        //     System.out.println("Vous devez d'abord creer l'instance unique. [Request 4]");
        // }
        super(l);
    }
    public void construireBonCommande(String nomClient){
        String document;
        document = "<HTML>Bon de commande Client : " + nomClient + "</HTML>";
        liasse.setBonCommande(document);
    }

    public void construireDemandeImmatriculation(String nomDemandeur){
        String document;
        document = "<HTML>Demande d'immatriculation Demandeur: " + nomDemandeur + "</HTML>";
        liasse.setDemandeImmatriculation(document);
    }
    public void construireCertificatCession(String nomDemandeur){
        String document;
        document = "<HTML>Certificat de Cession: " + nomDemandeur + "</HTML>";
        liasse.setCertificatCession(document);
    }
}