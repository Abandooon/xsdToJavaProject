package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DirectPduRef extends Ref {

    
    
    protected NPduSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public NPduSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(NPduSubtypesEnum value) {
        this.dest = value;
    }
    
    
}