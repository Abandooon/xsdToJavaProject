package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TpConnectionControlRef extends Ref {

    
    
    protected FlexrayTpConnectionControlSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FlexrayTpConnectionControlSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FlexrayTpConnectionControlSubtypesEnum value) {
        this.dest = value;
    }
    
    
}