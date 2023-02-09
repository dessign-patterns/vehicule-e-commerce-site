package BuilderP;

import java.util.*;

public class Liasse{
    private String demandeImmatriculation = null;
    private String certificatCession = null;
    private String bonCommande = null;

    private static Liasse instance = null;
    private String type = null;
    private Liasse(){
        System.out.println("Creation d'une liasse vierge.");
    }

    public static Liasse getInstance(){
        if(instance == null)
            instance = new Liasse();
        return instance;
    }
    public void setDemandeImmatriculation (String nom){
        this.demandeImmatriculation = nom;
    }
    public String getDemandeImmatricule(){
        return demandeImmatriculation;
    }

    public void setCertificatCession (String nom){
        this.certificatCession = nom;
    }
    public String getCertificatCession(){
        return certificatCession;
    }

    public void setBonCommande (String nom){
        this.bonCommande = nom;
    }
    public String getBonCommande(){
        return bonCommande;
    }

    public void imprime(){
        if (demandeImmatriculation == null && certificatCession == null && bonCommande == null){
            System.out.println("Impossible d'imprimer une liasse vierge.");
        }
        else{
            System.out.println("Impression de \n1. "+demandeImmatriculation+" \n2. "+certificatCession+" \n3. "+bonCommande+" effectues.");

        }
    }
}