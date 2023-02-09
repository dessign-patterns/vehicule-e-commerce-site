package TemplateMethod;

public class CommandeSenegal extends CommandeC{
    protected void calculTva(){
        montantTva = montantHt * 0.18;
    }
}