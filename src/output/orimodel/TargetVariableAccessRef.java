package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetVariableAccessRef extends Ref {

    
    
    protected VariableAccessSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public VariableAccessSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(VariableAccessSubtypesEnum value) {
        this.dest = value;
    }
    
    
}