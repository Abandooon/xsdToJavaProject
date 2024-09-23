package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwcToSwcOperationArguments {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwcToSwcOperationArgumentsDirectionEnum direction;
    
    
    
    protected OperationIrefs operationIrefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="DIRECTION")
    public SwcToSwcOperationArgumentsDirectionEnum getDirection() {
        return this.direction;
    }

    public void setDirection(SwcToSwcOperationArgumentsDirectionEnum value) {
        this.direction = value;
    }
    
    
    
    @XmlElement(name="OPERATION-IREFS")
    public OperationIrefs getOperationIrefs() {
        return this.operationIrefs;
    }

    public void setOperationIrefs(OperationIrefs value) {
        this.operationIrefs = value;
    }
    
    
}