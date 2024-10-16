package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FirstToSecondDataTransformationRef extends Ref {

    
    
    protected DataTransformationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DataTransformationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DataTransformationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}