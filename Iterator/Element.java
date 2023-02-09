public abstract class Element{
    protected String description;

    public Element(String description){
        this.description = description;
    }

    public boolean motcleValide(String motCle){
        return description.indexOf(motCle) != -1;
    }
}