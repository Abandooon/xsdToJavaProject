package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwSystemconstRef extends Ref {

    
    
    protected SwSystemconstSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwSystemconstSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwSystemconstSubtypesEnum value) {
        this.dest = value;
    }
    
    
}