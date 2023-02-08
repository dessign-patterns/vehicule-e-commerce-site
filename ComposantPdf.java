public class ComposantPdf{
    protected String contenu;

    public void pdfFixeContenu(String contenu){
        this.contenu = contenu;
    }

    public void pdfPrepareAffichage(){
        System.out.println("Affichage PDF : debut");
    }

    public void pdfRafraichir(){
        System.out.println("Affichage contenu PDF: "+ contenu);
    }

    public void pdfTermineAffichge(){
        System.out.println("Affichage PDF : Fin");
    }

    public void pdfEnvoieImprimante(){
        System.out.println("Impression PDF : "+ contenu);
    }
}