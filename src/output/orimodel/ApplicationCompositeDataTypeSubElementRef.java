package stdgui.data.model.orimodel;
@XmlRootElement(name = "APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF")
public class ApplicationCompositeDataTypeSubElementRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ApplicationCompositeElementInPortInterfaceInstanceRef applicationCompositeElementIref;
    
    

    
    
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
    
    
    
    @XmlElement(name="APPLICATION-COMPOSITE-ELEMENT-IREF")
    public ApplicationCompositeElementInPortInterfaceInstanceRef getApplicationCompositeElementIref() {
    return this.applicationCompositeElementIref;
}

    public void setApplicationCompositeElementIref(ApplicationCompositeElementInPortInterfaceInstanceRef value) {
        this.applicationCompositeElementIref = value;
    }
    
    
}