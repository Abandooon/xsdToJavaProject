package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TraceRef extends Ref {

    
    
    protected TraceableSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TraceableSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TraceableSubtypesEnum value) {
        this.dest = value;
    }
    
    
}