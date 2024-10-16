package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AssignedFrameTriggeringRef extends Ref {

    
    
    protected LinFrameTriggeringSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public LinFrameTriggeringSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(LinFrameTriggeringSubtypesEnum value) {
        this.dest = value;
    }
    
    
}