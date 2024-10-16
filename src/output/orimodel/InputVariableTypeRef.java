package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class InputVariableTypeRef extends Ref {

    
    
    protected ApplicationPrimitiveDataTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ApplicationPrimitiveDataTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ApplicationPrimitiveDataTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}