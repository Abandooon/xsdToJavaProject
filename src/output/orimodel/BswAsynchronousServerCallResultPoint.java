package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
public class BswAsynchronousServerCallResultPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected ArrayList<ContextLimitationRef> contextLimitationRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint asynchronousServerCallPointRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElementWrapper(name="CONTEXT-LIMITATION-REFS")
@XmlElement(name="CONTEXT-LIMITATION-REF")
    public ArrayList<ContextLimitationRef> getContextLimitationRefs() {
    return this.contextLimitationRefs;
}

    public void setContextLimitationRefs(ArrayList<ContextLimitationRef> value) {
        this.contextLimitationRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-POINT-REF")
    public AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint getAsynchronousServerCallPointRef() {
    return this.asynchronousServerCallPointRef;
}

    public void setAsynchronousServerCallPointRef(AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint value) {
        this.asynchronousServerCallPointRef = value;
    }
    
    
}