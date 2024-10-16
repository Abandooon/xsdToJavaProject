package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransmitterRef extends Ref {

    
    
    protected CanTpNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CanTpNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CanTpNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}