public class LiasseVierge{
    private static LiasseVierge instance = null;

    private LiasseVierge(){
        documents = new ArrayList<String>();
    }

    public static LiasseVierge getInstance(){
        if(instance == null)
            instance = new LiasseVierge();
        return instance;
    }

    public void ajouter(String doc){
        documents.add(doc);
    }

    public void retirer(doc){
        int index = documents.indexOf(doc);
        if(index > 0)
            documents.remove(index);
    }
}