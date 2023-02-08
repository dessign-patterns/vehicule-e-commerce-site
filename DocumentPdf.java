public class DocumentPdf implements Document{
    protected ComposantPdf outilPdf = new ComposantPdf();

    public void setContenu(String contenu){
        outilPdf.pdfFixeContenu(contenu);
    }

    public void afficher(){
        outilPdf.pdfPrepareAffichage();
        outilPdf.pdfRafraichir();
        outilPdf.pdfTermineAffichge();
    }

    public void imprimer(){
        outilPdf.pdfEnvoieImprimante();
    }
}