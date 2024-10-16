package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BswInternalTriggeringPointRef extends Ref {

    
    
    protected BswInternalTriggeringPointSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public BswInternalTriggeringPointSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(BswInternalTriggeringPointSubtypesEnum value) {
        this.dest = value;
    }
    
    
}