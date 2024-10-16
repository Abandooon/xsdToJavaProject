package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DestinationRef_EcucSymbolicNameReferenceDef extends Ref {

    
    
    protected EcucParamConfContainerDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucParamConfContainerDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucParamConfContainerDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}