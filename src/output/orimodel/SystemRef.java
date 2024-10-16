package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SystemRef extends Ref {

    
    
    protected SystemSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SystemSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SystemSubtypesEnum value) {
        this.dest = value;
    }
    
    
}