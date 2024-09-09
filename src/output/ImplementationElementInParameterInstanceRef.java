package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ImplementationElementInParameterInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRef contextRef;
    
    
    
    protected TargetRef targetRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-REF")
    public ContextRef getContextRef() {
        return this.contextRef;
    }

    public void setContextRef(ContextRef value) {
        this.contextRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-REF")
    public TargetRef getTargetRef() {
        return this.targetRef;
    }

    public void setTargetRef(TargetRef value) {
        this.targetRef = value;
    }
    
    


    
    public static class ContextRef extends Ref {
        
        protected ParameterDataPrototypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public ParameterDataPrototypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(ParameterDataPrototypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class TargetRef extends Ref {
        
        protected ImplementationDataTypeElementSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public ImplementationDataTypeElementSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(ImplementationDataTypeElementSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}