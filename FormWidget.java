import java.util.*;

public class FormWidget implements FormulaireImpl{
    Scanner reader = new Scanner(System.in);
    
    public void afficherTexte(String texte){
        System.out.println("Widget: "+ texte);
    }

    public String gererZoneSaisie(){
        return reader.next();
    }
}