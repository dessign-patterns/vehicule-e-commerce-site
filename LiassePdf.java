public class LiassePdf extends Liasse{
    public void ajouteDocument(String document){
        if (document.startsWith("<PDF>"))
            contenu.add(document);
    }
    public void imprime(){
        System.out.println("Liasse PDF");
        for (String s: contenu)
            System.out.println(s);
    }
}