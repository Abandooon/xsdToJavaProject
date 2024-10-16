package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ActivationReasonRepresentationRef extends Ref {

    
    
    protected ExecutableEntityActivationReasonSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExecutableEntityActivationReasonSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ExecutableEntityActivationReasonSubtypesEnum value) {
        this.dest = value;
    }
    
    
}