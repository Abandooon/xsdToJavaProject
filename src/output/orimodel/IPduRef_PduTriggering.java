package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class IPduRef_PduTriggering extends Ref {

    
    
    protected PduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PduSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}