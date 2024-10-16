package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class InitialModeRef extends Ref {

    
    
    protected ModeDeclarationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ModeDeclarationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(ModeDeclarationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}