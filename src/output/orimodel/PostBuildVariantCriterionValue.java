package stdgui.data.model.orimodel;
@XmlRootElement(name = "POST-BUILD-VARIANT-CRITERION-VALUE")
public class PostBuildVariantCriterionValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariantCriterionRef variantCriterionRef;
    
    
    
    protected IntegerValueVariationPoint value;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIANT-CRITERION-REF")
    public VariantCriterionRef getVariantCriterionRef() {
    return this.variantCriterionRef;
}

    public void setVariantCriterionRef(VariantCriterionRef value) {
        this.variantCriterionRef = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public IntegerValueVariationPoint getValue() {
    return this.value;
}

    public void setValue(IntegerValueVariationPoint value) {
        this.value = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
}