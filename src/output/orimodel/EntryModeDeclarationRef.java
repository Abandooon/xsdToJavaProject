package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EntryModeDeclarationRef extends Ref {

    
    
    protected ModeDeclarationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ModeDeclarationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}