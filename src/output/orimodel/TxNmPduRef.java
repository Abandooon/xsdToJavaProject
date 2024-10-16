package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TxNmPduRef extends Ref {

    
    
    protected NmPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NmPduSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(NmPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}