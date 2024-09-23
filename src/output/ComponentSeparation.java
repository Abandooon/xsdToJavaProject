package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ComponentSeparation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected MappingScopeEnum mappingScope;
    
    
    
    protected SeparatedComponentIrefs separatedComponentIrefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="MAPPING-SCOPE")
    public MappingScopeEnum getMappingScope() {
        return this.mappingScope;
    }

    public void setMappingScope(MappingScopeEnum value) {
        this.mappingScope = value;
    }
    
    
    
    @XmlElement(name="SEPARATED-COMPONENT-IREFS")
    public SeparatedComponentIrefs getSeparatedComponentIrefs() {
        return this.separatedComponentIrefs;
    }

    public void setSeparatedComponentIrefs(SeparatedComponentIrefs value) {
        this.separatedComponentIrefs = value;
    }
    
    
}