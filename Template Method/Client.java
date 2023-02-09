public class Client {
    public static void main(String[] args){
        Commande commandeCameroun = new CommandeCameroun();
        commandeCameroun.setMontantHt(100000);
        commandeCameroun.calculMontantTtc();
        commandeCameroun.affiche();

        CommandeSenegal commandeSenegal = new CommandeSenegal();
        commandeSenegal.setMontantHt(100000);
        commandeSenegal.calculMontantTtc();
        commandeSenegal.affiche();
    }
}