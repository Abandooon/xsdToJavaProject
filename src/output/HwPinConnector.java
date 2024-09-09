package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwPinConnector {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected HwPinRefs hwPinRefs;
    
    
    
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
    
    
    
    @XmlElement(name="HW-PIN-REFS")
    public HwPinRefs getHwPinRefs() {
        return this.hwPinRefs;
    }

    public void setHwPinRefs(HwPinRefs value) {
        this.hwPinRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    


    
    public static class HwPinRefs {
        
        protected ArrayList<HwPinRef> hwPinRef;
        

        
        @XmlElement(name="HW-PIN-REF")
        public ArrayList<HwPinRef> getHwPinRef() {
            return this.hwPinRef;
        }

        public void setHwPinRef(ArrayList<HwPinRef> value) {
            this.hwPinRef = value;
        }
        

        
        
        public static class HwPinRef extends Ref {
            
            protected HwPinSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public HwPinSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(HwPinSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
}