package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class AutosarVariableRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArVariableInImplementationDataInstanceRef autosarVariableInImplDatatype;
    
    
    
    protected VariableInAtomicSwcTypeInstanceRef autosarVariableIref;
    
    
    
    protected LocalVariableRef localVariableRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="AUTOSAR-VARIABLE-IN-IMPL-DATATYPE")
    public ArVariableInImplementationDataInstanceRef getAutosarVariableInImplDatatype() {
        return this.autosarVariableInImplDatatype;
    }

    public void setAutosarVariableInImplDatatype(ArVariableInImplementationDataInstanceRef value) {
        this.autosarVariableInImplDatatype = value;
    }
    
    
    
    @XmlElement(name="AUTOSAR-VARIABLE-IREF")
    public VariableInAtomicSwcTypeInstanceRef getAutosarVariableIref() {
        return this.autosarVariableIref;
    }

    public void setAutosarVariableIref(VariableInAtomicSwcTypeInstanceRef value) {
        this.autosarVariableIref = value;
    }
    
    
    
    @XmlElement(name="LOCAL-VARIABLE-REF")
    public LocalVariableRef getLocalVariableRef() {
        return this.localVariableRef;
    }

    public void setLocalVariableRef(LocalVariableRef value) {
        this.localVariableRef = value;
    }
    
    
}