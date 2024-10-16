package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DataTransformationRef extends Ref {

    
    
    protected DataTransformationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataTransformationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataTransformationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}