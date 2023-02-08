import java.util.*;

public class FormHtml implements FormulaireImpl{
    Scanner reader = new Scanner(System.in);
    
    public void afficherTexte(String texte){
        System.out.println("<HTML> "+ texte +" <HTML>");
    }

    public String gererZoneSaisie(){
        return reader.next();
    }
}