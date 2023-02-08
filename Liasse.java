import java.util.*;

public abstract class Liasse{
    protected List<String> contenu = new ArrayList<String>();

    public abstract void ajouteDocument(String document);
    public abstract void imprime();
}