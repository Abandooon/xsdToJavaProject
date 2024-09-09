package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwTextProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArraySizeSemanticsEnum arraySizeSemantics;
    
    
    
    protected BaseTypeRef baseTypeRef;
    
    
    
    protected Integer swFillCharacter;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARRAY-SIZE-SEMANTICS")
    public ArraySizeSemanticsEnum getArraySizeSemantics() {
        return this.arraySizeSemantics;
    }

    public void setArraySizeSemantics(ArraySizeSemanticsEnum value) {
        this.arraySizeSemantics = value;
    }
    
    
    
    @XmlElement(name="BASE-TYPE-REF")
    public BaseTypeRef getBaseTypeRef() {
        return this.baseTypeRef;
    }

    public void setBaseTypeRef(BaseTypeRef value) {
        this.baseTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-FILL-CHARACTER")
    public Integer getSwFillCharacter() {
        return this.swFillCharacter;
    }

    public void setSwFillCharacter(Integer value) {
        this.swFillCharacter = value;
    }
    
    


    
    public static class BaseTypeRef extends Ref {
        
        protected SwBaseTypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwBaseTypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwBaseTypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}