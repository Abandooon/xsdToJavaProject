package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SoftwareCompositionTref extends Ref {

    
    
    protected CompositionSwComponentTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CompositionSwComponentTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CompositionSwComponentTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}