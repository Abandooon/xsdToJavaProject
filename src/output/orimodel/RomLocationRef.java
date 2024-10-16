package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class RomLocationRef extends Ref {

    
    
    protected ParameterDataPrototypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ParameterDataPrototypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ParameterDataPrototypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}