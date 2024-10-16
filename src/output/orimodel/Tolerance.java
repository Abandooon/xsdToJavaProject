package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Tolerance {

    
    
    protected AbsoluteTolerance absoluteTolerance;
    
    
    
    protected RelativeTolerance relativeTolerance;
    
    

    
    
    @XmlElement(name="ABSOLUTE-TOLERANCE")
    public AbsoluteTolerance getAbsoluteTolerance() {
    return this.absoluteTolerance;
}

    public void setAbsoluteTolerance(AbsoluteTolerance value) {
        this.absoluteTolerance = value;
    }
    
    
    
    @XmlElement(name="RELATIVE-TOLERANCE")
    public RelativeTolerance getRelativeTolerance() {
    return this.relativeTolerance;
}

    public void setRelativeTolerance(RelativeTolerance value) {
        this.relativeTolerance = value;
    }
    
    
}