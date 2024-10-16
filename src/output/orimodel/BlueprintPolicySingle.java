package stdgui.data.model.orimodel;
@XmlRootElement(name = "BLUEPRINT-POLICY-SINGLE")
public class BlueprintPolicySingle {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String attributeName;
    
    
    
    protected DocumentationBlock blueprintDerivationGuide;
    
    

    
    
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
    
    
    
    @XmlElement(name="ATTRIBUTE-NAME")
    public String getAttributeName() {
    return this.attributeName;
}

    public void setAttributeName(String value) {
        this.attributeName = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-DERIVATION-GUIDE")
    public DocumentationBlock getBlueprintDerivationGuide() {
    return this.blueprintDerivationGuide;
}

    public void setBlueprintDerivationGuide(DocumentationBlock value) {
        this.blueprintDerivationGuide = value;
    }
    
    
}