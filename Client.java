import java.util.*;

public class Client{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ConstructeurLiasse constructeur;
        System.out.print("Voulez vous construire des liasses HTML (1) ou PDF (2): ");
        String choix = reader.next();
        
        if (choix.equals("1")){
            constructeur = new ConstructeurLiasseHtml();
        }
        else{
            constructeur = new ConstructeurLiassePdf();
        }

        Vendeur  vendeur = new Vendeur(constructeur);
        Liasse liasse = vendeur.construit("Essi");
        liasse.imprime();
    }
}