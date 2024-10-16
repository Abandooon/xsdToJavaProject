package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SwGenericAxisParamTypeRef extends Ref {

    
    
    protected SwGenericAxisParamTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public SwGenericAxisParamTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(SwGenericAxisParamTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}