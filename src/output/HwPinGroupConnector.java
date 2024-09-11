package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwPinGroupConnector {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected HwPinConnections hwPinConnections;
    
    
    
    protected HwPinGroupRefs hwPinGroupRefs;
    
    
    
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
    
    
    
    @XmlElement(name="HW-PIN-CONNECTIONS")
    public HwPinConnections getHwPinConnections() {
        return this.hwPinConnections;
    }

    public void setHwPinConnections(HwPinConnections value) {
        this.hwPinConnections = value;
    }
    
    
    
    @XmlElement(name="HW-PIN-GROUP-REFS")
    public HwPinGroupRefs getHwPinGroupRefs() {
        return this.hwPinGroupRefs;
    }

    public void setHwPinGroupRefs(HwPinGroupRefs value) {
        this.hwPinGroupRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    


    
    public static class HwPinConnections {
        

        

        
    }
    
    public static class HwPinGroupRefs {
        

        

        
    }
    
}