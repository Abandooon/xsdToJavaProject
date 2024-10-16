package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-MODULE-CONFIGURATION-VALUES-REF-CONDITIONAL")
public class EcucModuleConfigurationValuesRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EcucModuleConfigurationValuesRef ecucModuleConfigurationValuesRef;
    
    
    
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
    
    
    
    @XmlElement(name="ECUC-MODULE-CONFIGURATION-VALUES-REF")
    public EcucModuleConfigurationValuesRef getEcucModuleConfigurationValuesRef() {
    return this.ecucModuleConfigurationValuesRef;
}

    public void setEcucModuleConfigurationValuesRef(EcucModuleConfigurationValuesRef value) {
        this.ecucModuleConfigurationValuesRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}