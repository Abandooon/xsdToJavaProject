package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class AffectedRef extends Ref {

    
    
    protected EcucCommonAttributesSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucCommonAttributesSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucCommonAttributesSubtypesEnum value) {
        this.dest = value;
    }
    
    
}