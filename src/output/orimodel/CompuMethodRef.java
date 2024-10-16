package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CompuMethodRef extends Ref {

    
    
    protected CompuMethodSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CompuMethodSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CompuMethodSubtypesEnum value) {
        this.dest = value;
    }
    
    
}