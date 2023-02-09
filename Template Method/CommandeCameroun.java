public class CommandeCameroun extends Commande{
    protected void calculTva(){
        montantTva = montantHt * 0.1925;
    }
}