package TemplateMethod;

public class CommandeCameroun extends CommandeC{
    protected void calculTva(){
        montantTva = montantHt * 0.1925;
    }
}