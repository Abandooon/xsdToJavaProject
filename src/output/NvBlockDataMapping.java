package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class NvBlockDataMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AutosarVariableRef nvRamBlockElement;
    
    
    
    protected AutosarVariableRef readNvData;
    
    
    
    protected AutosarVariableRef writtenNvData;
    
    
    
    protected AutosarVariableRef writtenReadNvData;
    
    
    
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
    
    
    
    @XmlElement(name="NV-RAM-BLOCK-ELEMENT")
    public AutosarVariableRef getNvRamBlockElement() {
        return this.nvRamBlockElement;
    }

    public void setNvRamBlockElement(AutosarVariableRef value) {
        this.nvRamBlockElement = value;
    }
    
    
    
    @XmlElement(name="READ-NV-DATA")
    public AutosarVariableRef getReadNvData() {
        return this.readNvData;
    }

    public void setReadNvData(AutosarVariableRef value) {
        this.readNvData = value;
    }
    
    
    
    @XmlElement(name="WRITTEN-NV-DATA")
    public AutosarVariableRef getWrittenNvData() {
        return this.writtenNvData;
    }

    public void setWrittenNvData(AutosarVariableRef value) {
        this.writtenNvData = value;
    }
    
    
    
    @XmlElement(name="WRITTEN-READ-NV-DATA")
    public AutosarVariableRef getWrittenReadNvData() {
        return this.writtenReadNvData;
    }

    public void setWrittenReadNvData(AutosarVariableRef value) {
        this.writtenReadNvData = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}