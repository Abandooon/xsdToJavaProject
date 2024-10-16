package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class NmNodeRef extends Ref {

    
    
    protected NmNodeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NmNodeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(NmNodeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}