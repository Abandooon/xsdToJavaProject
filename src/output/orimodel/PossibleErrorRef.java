package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PossibleErrorRef extends Ref {

    
    
    protected ApplicationErrorSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationErrorSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationErrorSubtypesEnum value) {
        this.dest = value;
    }
    
    
}