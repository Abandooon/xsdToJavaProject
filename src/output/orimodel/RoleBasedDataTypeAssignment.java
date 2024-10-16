package stdgui.data.model.orimodel;
@XmlRootElement(name = "ROLE-BASED-DATA-TYPE-ASSIGNMENT")
public class RoleBasedDataTypeAssignment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier role;
    
    
    
    protected UsedImplementationDataTypeRef usedImplementationDataTypeRef;
    
    
    
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
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
    return this.role;
}

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    
    
    @XmlElement(name="USED-IMPLEMENTATION-DATA-TYPE-REF")
    public UsedImplementationDataTypeRef getUsedImplementationDataTypeRef() {
    return this.usedImplementationDataTypeRef;
}

    public void setUsedImplementationDataTypeRef(UsedImplementationDataTypeRef value) {
        this.usedImplementationDataTypeRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}