package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwElementConnector {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected HwElementRefs hwElementRefs;
    
    
    
    protected HwPinGroupConnections hwPinGroupConnections;
    
    
    
    protected HwPinConnections hwPinConnections;
    
    
    
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
    
    
    
    @XmlElement(name="HW-ELEMENT-REFS")
    public HwElementRefs getHwElementRefs() {
        return this.hwElementRefs;
    }

    public void setHwElementRefs(HwElementRefs value) {
        this.hwElementRefs = value;
    }
    
    
    
    @XmlElement(name="HW-PIN-GROUP-CONNECTIONS")
    public HwPinGroupConnections getHwPinGroupConnections() {
        return this.hwPinGroupConnections;
    }

    public void setHwPinGroupConnections(HwPinGroupConnections value) {
        this.hwPinGroupConnections = value;
    }
    
    
    
    @XmlElement(name="HW-PIN-CONNECTIONS")
    public HwPinConnections getHwPinConnections() {
        return this.hwPinConnections;
    }

    public void setHwPinConnections(HwPinConnections value) {
        this.hwPinConnections = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    


    
    public static class HwElementRefs {
        
        protected ArrayList<HwElementRef> hwElementRef;
        

        
        @XmlElement(name="HW-ELEMENT-REF")
        public ArrayList<HwElementRef> getHwElementRef() {
            return this.hwElementRef;
        }

        public void setHwElementRef(ArrayList<HwElementRef> value) {
            this.hwElementRef = value;
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
    
    public static class HwPinGroupConnections {
        
        protected ArrayList<HwPinGroupConnector> hwPinGroupConnector;
        

        
        @XmlElement(name="HW-PIN-GROUP-CONNECTOR")
        public ArrayList<HwPinGroupConnector> getHwPinGroupConnector() {
            return this.hwPinGroupConnector;
        }

        public void setHwPinGroupConnector(ArrayList<HwPinGroupConnector> value) {
            this.hwPinGroupConnector = value;
        }
        

        
    }
    
    public static class HwPinConnections {
        
        protected ArrayList<HwPinConnector> hwPinConnector;
        

        
        @XmlElement(name="HW-PIN-CONNECTOR")
        public ArrayList<HwPinConnector> getHwPinConnector() {
            return this.hwPinConnector;
        }

        public void setHwPinConnector(ArrayList<HwPinConnector> value) {
            this.hwPinConnector = value;
        }
        

        
    }
    
}