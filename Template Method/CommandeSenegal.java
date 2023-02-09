public class CommandeSenegal extends Commande{
    protected void calculTva(){
        montantTva = montantHt * 0.18;
    }
}