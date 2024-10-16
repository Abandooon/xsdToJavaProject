package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ExecutableEntityRef extends Ref {

    
    
    protected ExecutableEntitySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ExecutableEntitySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ExecutableEntitySubtypesEnum value) {
        this.dest = value;
    }
    
    
}