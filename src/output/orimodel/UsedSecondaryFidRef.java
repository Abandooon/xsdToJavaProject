package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class UsedSecondaryFidRef extends Ref {

    
    
    protected FunctionInhibitionNeedsSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public FunctionInhibitionNeedsSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(FunctionInhibitionNeedsSubtypesEnum value) {
        this.dest = value;
    }
    
    
}