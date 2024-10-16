package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransformerChainRef extends Ref {

    
    
    protected TransformationTechnologySubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TransformationTechnologySubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TransformationTechnologySubtypesEnum value) {
        this.dest = value;
    }
    
    
}