package stdgui.data.model.orimodel;
@XmlRootElement(name = "IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF")
public class ImplementationDataTypeSubElementRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArVariableInImplementationDataInstanceRef implementationDataTypeElement;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-ELEMENT")
    public ArVariableInImplementationDataInstanceRef getImplementationDataTypeElement() {
    return this.implementationDataTypeElement;
}

    public void setImplementationDataTypeElement(ArVariableInImplementationDataInstanceRef value) {
        this.implementationDataTypeElement = value;
    }
    
    
}