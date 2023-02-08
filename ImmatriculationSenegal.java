public class ImmatriculationSenegal extends FormulaireImmatriculation{
    public ImmatriculationSenegal(FormulaireImpl implantation){
        super(implantation);
    }

    protected boolean controlerSaisie(String plaque){
        return (plaque.length() >= 7) && (plaque.length() <= 8);
    }
}