package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CoupledClusterRef_UdpNmClusterCoupling extends Ref {

    
    
    protected UdpNmClusterSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public UdpNmClusterSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(UdpNmClusterSubtypesEnum value) {
        this.dest = value;
    }
    
    
}