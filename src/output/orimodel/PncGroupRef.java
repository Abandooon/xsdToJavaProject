package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class PncGroupRef extends Ref {

    
    
    protected ISignalIPduGroupSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalIPduGroupSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalIPduGroupSubtypesEnum value) {
        this.dest = value;
    }
    
    
}