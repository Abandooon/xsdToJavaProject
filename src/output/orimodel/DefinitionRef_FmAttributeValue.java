package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DefinitionRef_FmAttributeValue extends Ref {

    
    
    protected FmAttributeDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FmAttributeDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FmAttributeDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}