public class Client{
    public static void main(String[] args){
        Document document1, document2;

        document1 = new DocumentHtml();
        document1.setContenu("Salut");
        document1.afficher();
        System.out.println();
        document2 = new DocumentPdf();
        document2.setContenu("Bonjour");
        document2.afficher();
    }
}