public class ImmatriculationCameroun extends FormulaireImmatriculation{
    public ImmatriculationCameroun(FormulaireImpl implantation){
        super(implantation);
    }

    protected boolean controlerSaisie(String plaque){
        return (plaque.length() >= 7) && (plaque.length() <= 8);
    }
}