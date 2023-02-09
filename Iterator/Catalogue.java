import java.util.*;

public abstract class Catalogue <TElement extends Element, TIterateur extends Iterateur<TElement>>{
    protected List<TElement> contenu = new ArrayList<TElement>();
    protected abstract TIterateur creerIterateur();

    public TIterateur recherche(String motCleRequete){
        TIterateur resultat = creerIterateur();
        resultat.setMotCleRequete(motCleRequete, contenu);
        return resultat;
    }
}