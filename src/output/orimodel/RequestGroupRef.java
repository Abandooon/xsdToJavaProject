package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RequestGroupRef extends Ref {

    
    
    protected SystemSignalGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SystemSignalGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SystemSignalGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}