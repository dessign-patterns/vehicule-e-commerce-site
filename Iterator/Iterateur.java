import java.util.*;

public abstract class Iterateur<TElement extends Element>{
    protected String motCleRequete;
    protected int index;
    protected List<TElement> contenu;

    public void setMotCleRequete(String motCleRequete, List<TElement> contenu){
        this.motCleRequete = motCleRequete;
        this.contenu = contenu;
    }

    public void debut(){
        index = 0;
        int taille = contenu.size();
        while ((index < taille) && (!contenu.get(index)
            .motcleValide(motCleRequete)))
            index++;
    }

    public void suivant(){
        int taille =contenu.size();
        index++;
        while((index < taille) && (!contenu.get(index)
            .motcleValide(motCleRequete)))
            index++;
    }

    public TElement item(){
        if (index < contenu.size())
            return contenu.get(index);
        else
            return null;
    }
}