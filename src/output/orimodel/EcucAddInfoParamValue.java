package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-ADD-INFO-PARAM-VALUE")
public class EcucAddInfoParamValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger index;
    
    
    
    protected DefinitionRef_EcucAddInfoParamValue definitionRef;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected Boolean isAutoValue;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected DocumentationBlock value;
    
    

    
    
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
    public DefinitionRef_EcucAddInfoParamValue getDefinitionRef() {
    return this.definitionRef;
}

    public void setDefinitionRef(DefinitionRef_EcucAddInfoParamValue value) {
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
    
    
    
    @XmlElement(name="IS-AUTO-VALUE")
    public Boolean getIsAutoValue() {
    return this.isAutoValue;
}

    public void setIsAutoValue(Boolean value) {
        this.isAutoValue = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public DocumentationBlock getValue() {
    return this.value;
}

    public void setValue(DocumentationBlock value) {
        this.value = value;
    }
    
    
}