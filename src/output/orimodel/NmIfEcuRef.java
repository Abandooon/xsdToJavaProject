package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NmIfEcuRef extends Ref {

    
    
    protected NmEcuSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NmEcuSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(NmEcuSubtypesEnum value) {
        this.dest = value;
    }
    
    
}