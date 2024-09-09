package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class VariableAccessInEcuInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRootCompositionRef contextRootCompositionRef;
    
    
    
    protected ContextAtomicComponentRef contextAtomicComponentRef;
    
    
    
    protected TargetVariableAccessRef targetVariableAccessRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-ROOT-COMPOSITION-REF")
    public ContextRootCompositionRef getContextRootCompositionRef() {
        return this.contextRootCompositionRef;
    }

    public void setContextRootCompositionRef(ContextRootCompositionRef value) {
        this.contextRootCompositionRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-ATOMIC-COMPONENT-REF")
    public ContextAtomicComponentRef getContextAtomicComponentRef() {
        return this.contextAtomicComponentRef;
    }

    public void setContextAtomicComponentRef(ContextAtomicComponentRef value) {
        this.contextAtomicComponentRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-VARIABLE-ACCESS-REF")
    public TargetVariableAccessRef getTargetVariableAccessRef() {
        return this.targetVariableAccessRef;
    }

    public void setTargetVariableAccessRef(TargetVariableAccessRef value) {
        this.targetVariableAccessRef = value;
    }
    
    


    
    public static class ContextRootCompositionRef extends Ref {
        
        protected RootSwCompositionPrototypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public RootSwCompositionPrototypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(RootSwCompositionPrototypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class ContextAtomicComponentRef extends Ref {
        
        protected SwComponentPrototypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwComponentPrototypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwComponentPrototypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class TargetVariableAccessRef extends Ref {
        
        protected VariableAccessSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public VariableAccessSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(VariableAccessSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}