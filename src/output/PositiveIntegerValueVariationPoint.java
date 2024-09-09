package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PositiveIntegerValueVariationPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String blueprintValue;
    
    
    
    protected java.lang.String sd;
    
    
    
    protected ArrayList<Syscstringref> syscStringRef;
    
    
    
    protected ArrayList<Syscref> syscRef;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="BLUEPRINT-VALUE")
    public java.lang.String getBlueprintValue() {
        return this.blueprintValue;
    }

    public void setBlueprintValue(java.lang.String value) {
        this.blueprintValue = value;
    }
    
    
    
    @XmlAttribute(name="SD")
    public java.lang.String getSd() {
        return this.sd;
    }

    public void setSd(java.lang.String value) {
        this.sd = value;
    }
    
    
    
    @XmlElement(name="SYSC-STRING-REF")
    public ArrayList<Syscstringref> getSyscStringRef() {
        return this.syscStringRef;
    }

    public void setSyscStringRef(ArrayList<Syscstringref> value) {
        this.syscStringRef = value;
    }
    
    
    
    @XmlElement(name="SYSC-REF")
    public ArrayList<Syscref> getSyscRef() {
        return this.syscRef;
    }

    public void setSyscRef(ArrayList<Syscref> value) {
        this.syscRef = value;
    }
    
    


    
    public static class SyscStringRef extends Ref {
        
        protected SwSystemconstSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwSystemconstSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwSystemconstSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class SyscRef extends Ref {
        
        protected SwSystemconstSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwSystemconstSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwSystemconstSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}