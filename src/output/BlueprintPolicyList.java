package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BlueprintPolicyList {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String attributeName;
    
    
    
    protected DocumentationBlock blueprintDerivationGuide;
    
    
    
    protected PositiveIntegerValueVariationPoint maxNumberOfElements;
    
    
    
    protected PositiveIntegerValueVariationPoint minNumberOfElements;
    
    

    
    
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
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-ELEMENTS")
    public PositiveIntegerValueVariationPoint getMaxNumberOfElements() {
        return this.maxNumberOfElements;
    }

    public void setMaxNumberOfElements(PositiveIntegerValueVariationPoint value) {
        this.maxNumberOfElements = value;
    }
    
    
    
    @XmlElement(name="MIN-NUMBER-OF-ELEMENTS")
    public PositiveIntegerValueVariationPoint getMinNumberOfElements() {
        return this.minNumberOfElements;
    }

    public void setMinNumberOfElements(PositiveIntegerValueVariationPoint value) {
        this.minNumberOfElements = value;
    }
    
    
}