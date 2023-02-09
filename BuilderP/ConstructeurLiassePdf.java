package BuilderP;

public class ConstructeurLiassePdf extends ConstructeurLiasse{
    public ConstructeurLiassePdf(Liasse l){
        super(l);
    }
    public void construireBonCommande(String nomClient){
        String document;
        document = "<PDF>Bon de commande Client : " + nomClient + "</PDF>";
        liasse.setBonCommande(document);
    }

    public void construireDemandeImmatriculation(String nomDemandeur){
        String document;
        document = "<PDF>Demande d'immatriculation Demandeur: " + nomDemandeur + "</PDF>";
        liasse.setDemandeImmatriculation(document);
    }
    public void construireCertificatCession(String nomDemandeur){
        String document;
        document = "<PDF>Certificat de Cession: " + nomDemandeur + "</PDF>";
        liasse.setCertificatCession(document);
    }
}