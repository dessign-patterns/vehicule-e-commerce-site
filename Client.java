public class Client{
    public static void main(String[] args){

        ImmatriculationSenegal formulaire1 = new ImmatriculationSenegal(new FormHtml());
        formulaire1.afficher();

        if (formulaire1.gererSaisie())
            formulaire1.genererDocument();
        System.out.println();

        ImmatriculationCameroun formulaire2 = new ImmatriculationCameroun(new FormWidget());
        formulaire2.afficher();

        if (formulaire1.gererSaisie()){
            formulaire1.genererDocument();
        }
    }
}