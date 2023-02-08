public class DocumentHtml implements Document{
    protected String contenu;

    public void setContenu(String contenu){
        this.contenu = contenu;
    }

    public void afficher(){
        System.out.println("Dessin document Html: "+ contenu);
    }

    public void imprimer(){
        System.out.println("Impression document Html: "+ contenu);
    }
}