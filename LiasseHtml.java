public class LiasseHtml extends Liasse{
    public void ajouteDocument(String document){
        if (document.startsWith("<HTML>"))
            contenu.add(document);
    }
    public void imprime(){
        System.out.println("Liasse HTML");
        for (String s: contenu)
            System.out.println(s);
    }
}