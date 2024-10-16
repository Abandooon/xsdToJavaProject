package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-TRIGGER-DIRECT-IMPLEMENTATION")
public class BswTriggerDirectImplementation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MasteredTriggerRef masteredTriggerRef;
    
    
    
    protected Identifier task;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="MASTERED-TRIGGER-REF")
    public MasteredTriggerRef getMasteredTriggerRef() {
    return this.masteredTriggerRef;
}

    public void setMasteredTriggerRef(MasteredTriggerRef value) {
        this.masteredTriggerRef = value;
    }
    
    
    
    @XmlElement(name="TASK")
    public Identifier getTask() {
    return this.task;
}

    public void setTask(Identifier value) {
        this.task = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}