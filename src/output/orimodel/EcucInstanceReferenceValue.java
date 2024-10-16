package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-INSTANCE-REFERENCE-VALUE")
public class EcucInstanceReferenceValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger index;
    
    
    
    protected DefinitionRef_EcucReferenceValue definitionRef;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected AnyInstanceRef valueIref;
    
    

    
    
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
    
    
    
    @XmlElement(name="INDEX")
    public PositiveInteger getIndex() {
    return this.index;
}

    public void setIndex(PositiveInteger value) {
        this.index = value;
    }
    
    
    
    @XmlElement(name="DEFINITION-REF")
    public DefinitionRef_EcucReferenceValue getDefinitionRef() {
    return this.definitionRef;
}

    public void setDefinitionRef(DefinitionRef_EcucReferenceValue value) {
        this.definitionRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="VALUE-IREF")
    public AnyInstanceRef getValueIref() {
    return this.valueIref;
}

    public void setValueIref(AnyInstanceRef value) {
        this.valueIref = value;
    }
    
    
}