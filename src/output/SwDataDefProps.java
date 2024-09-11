package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwDataDefProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwDataDefPropsVariants swDataDefPropsVariants;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-DATA-DEF-PROPS-VARIANTS")
    public SwDataDefPropsVariants getSwDataDefPropsVariants() {
        return this.swDataDefPropsVariants;
    }

    public void setSwDataDefPropsVariants(SwDataDefPropsVariants value) {
        this.swDataDefPropsVariants = value;
    }
    
    


    
    public static class SwDataDefPropsVariants {
        

        

        
    }
    
}