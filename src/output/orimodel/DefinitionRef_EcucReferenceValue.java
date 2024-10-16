package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DefinitionRef_EcucReferenceValue extends Ref {

    
    
    protected EcucAbstractReferenceDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucAbstractReferenceDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucAbstractReferenceDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}