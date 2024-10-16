package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DefinitionRef_EcucAddInfoParamValue extends Ref {

    
    
    protected EcucParameterDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucParameterDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucParameterDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}