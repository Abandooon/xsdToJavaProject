package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL")
public class ModeDeclarationGroupPrototypeRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ModeDeclarationGroupPrototypeRef modeDeclarationGroupPrototypeRef;
    
    
    
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
    
    
    
    @XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE-REF")
    public ModeDeclarationGroupPrototypeRef getModeDeclarationGroupPrototypeRef() {
    return this.modeDeclarationGroupPrototypeRef;
}

    public void setModeDeclarationGroupPrototypeRef(ModeDeclarationGroupPrototypeRef value) {
        this.modeDeclarationGroupPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}