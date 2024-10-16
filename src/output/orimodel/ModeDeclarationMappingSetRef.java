package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ModeDeclarationMappingSetRef extends Ref {

    
    
    protected ModeDeclarationMappingSetSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationMappingSetSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ModeDeclarationMappingSetSubtypesEnum value) {
        this.dest = value;
    }
    
    
}