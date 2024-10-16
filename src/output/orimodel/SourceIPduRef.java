package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SourceIPduRef extends Ref {

    
    
    protected PduTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public PduTriggeringSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(PduTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}