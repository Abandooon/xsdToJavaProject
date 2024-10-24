package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-TO-ECU-MAPPING-CONSTRAINT")
public class SwcToEcuMappingConstraint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ComponentInSystemInstanceRef componentIref;
    
    
    
    protected ArrayList<EcuInstanceRef> ecuInstanceRefs;
    
    
    
    protected SwcToEcuMappingConstraintType swcToEcuMappingConstraintType;
    
    

    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="COMPONENT-IREF")
    public ComponentInSystemInstanceRef getComponentIref() {
    return this.componentIref;
}

    public void setComponentIref(ComponentInSystemInstanceRef value) {
        this.componentIref = value;
    }
    
    
    
    @XmlElementWrapper(name="ECU-INSTANCE-REFS")
@XmlElement(name="ECU-INSTANCE-REF")
    public ArrayList<EcuInstanceRef> getEcuInstanceRefs() {
    return this.ecuInstanceRefs;
}

    public void setEcuInstanceRefs(ArrayList<EcuInstanceRef> value) {
        this.ecuInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="SWC-TO-ECU-MAPPING-CONSTRAINT-TYPE")
    public SwcToEcuMappingConstraintType getSwcToEcuMappingConstraintType() {
    return this.swcToEcuMappingConstraintType;
}

    public void setSwcToEcuMappingConstraintType(SwcToEcuMappingConstraintType value) {
        this.swcToEcuMappingConstraintType = value;
    }
    
    
}