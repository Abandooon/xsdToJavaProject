package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwElementRefConditional {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected HwElementRef hwElementRef;
    
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
    
    @XmlElement(name="HW-ELEMENT-REF")
    public HwElementRef getHwElementRef() {
        return this.hwElementRef;
    }

    public void setHwElementRef(HwElementRef value) {
        this.hwElementRef = value;
    }
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    

    
    public static class HwElementRef extends Ref {
        
        protected HwElementSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public HwElementSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(HwElementSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}