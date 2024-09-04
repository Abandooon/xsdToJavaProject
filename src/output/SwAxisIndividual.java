package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwAxisIndividual {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected CompuMethodRef compuMethodRef;
    

    
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
    
    @XmlElement(name="COMPU-METHOD-REF")
    public CompuMethodRef getCompuMethodRef() {
        return this.compuMethodRef;
    }

    public void setCompuMethodRef(CompuMethodRef value) {
        this.compuMethodRef = value;
    }
    

    
    public static class CompuMethodRef extends Ref {
        
        protected CompuMethodSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public CompuMethodSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(CompuMethodSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}