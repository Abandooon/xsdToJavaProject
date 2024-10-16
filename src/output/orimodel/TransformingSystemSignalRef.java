package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransformingSystemSignalRef extends Ref {

    
    
    protected SystemSignalSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SystemSignalSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SystemSignalSubtypesEnum value) {
        this.dest = value;
    }
    
    
}