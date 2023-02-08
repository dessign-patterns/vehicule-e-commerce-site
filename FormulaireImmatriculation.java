public abstract class FormulaireImmatriculation{
    protected String contenu;
    protected FormulaireImpl implantation;

    public FormulaireImmatriculation(FormulaireImpl implantation){
        this.implantation = implantation;
    }

    public void afficher(){
        implantation.afficherTexte("numero de plaque existante: ");
    }

    public void genererDocument(){
        implantation.afficherTexte("Demande d'immatriculation");
        implantation.afficherTexte("Numero de plaque: "+ contenu);
    }

    public boolean gererSaisie(){
        contenu = implantation.gererZoneSaisie();
        return this.controlerSaisie(contenu);
    }

    protected abstract boolean controlerSaisie(String plaque);
}