package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CoupledClusterRef_FlexrayNmClusterCoupling extends Ref {

    
    
    protected FlexrayNmClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayNmClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayNmClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}