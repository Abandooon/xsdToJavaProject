package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TxPduPoolRef extends Ref {

    
    
    protected FlexrayTpPduPoolSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayTpPduPoolSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayTpPduPoolSubtypesEnum value) {
        this.dest = value;
    }
    
    
}