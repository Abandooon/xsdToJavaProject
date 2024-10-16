package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRef extends Ref {

    
    
    protected ImplementationDataTypeElementSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ImplementationDataTypeElementSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ImplementationDataTypeElementSubtypesEnum value) {
        this.dest = value;
    }
    
    
}