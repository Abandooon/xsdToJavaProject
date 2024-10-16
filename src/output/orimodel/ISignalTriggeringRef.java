package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ISignalTriggeringRef extends Ref {

    
    
    protected ISignalTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ISignalTriggeringSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ISignalTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}