package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class VendorSpecificModuleDefRef extends Ref {

    
    
    protected EcucModuleDefSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public EcucModuleDefSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(EcucModuleDefSubtypesEnum value) {
        this.dest = value;
    }
    
    
}