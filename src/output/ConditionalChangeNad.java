package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ConditionalChangeNad {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected TimeValue delay;
    
    
    
    protected Integer positionInTable;
    
    
    
    protected AssignedControllerRef assignedControllerRef;
    
    
    
    protected AssignedLinSlaveConfigRef assignedLinSlaveConfigRef;
    
    
    
    protected Integer byte;
    
    
    
    protected PositiveInteger id;
    
    
    
    protected Integer invert;
    
    
    
    protected Integer mask;
    
    
    
    protected Integer newNad;
    
    

    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="DELAY")
    public TimeValue getDelay() {
        return this.delay;
    }

    public void setDelay(TimeValue value) {
        this.delay = value;
    }
    
    
    
    @XmlElement(name="POSITION-IN-TABLE")
    public Integer getPositionInTable() {
        return this.positionInTable;
    }

    public void setPositionInTable(Integer value) {
        this.positionInTable = value;
    }
    
    
    
    @XmlElement(name="ASSIGNED-CONTROLLER-REF")
    public AssignedControllerRef getAssignedControllerRef() {
        return this.assignedControllerRef;
    }

    public void setAssignedControllerRef(AssignedControllerRef value) {
        this.assignedControllerRef = value;
    }
    
    
    
    @XmlElement(name="ASSIGNED-LIN-SLAVE-CONFIG-REF")
    public AssignedLinSlaveConfigRef getAssignedLinSlaveConfigRef() {
        return this.assignedLinSlaveConfigRef;
    }

    public void setAssignedLinSlaveConfigRef(AssignedLinSlaveConfigRef value) {
        this.assignedLinSlaveConfigRef = value;
    }
    
    
    
    @XmlElement(name="BYTE")
    public Integer getByte() {
        return this.byte;
    }

    public void setByte(Integer value) {
        this.byte = value;
    }
    
    
    
    @XmlElement(name="ID")
    public PositiveInteger getId() {
        return this.id;
    }

    public void setId(PositiveInteger value) {
        this.id = value;
    }
    
    
    
    @XmlElement(name="INVERT")
    public Integer getInvert() {
        return this.invert;
    }

    public void setInvert(Integer value) {
        this.invert = value;
    }
    
    
    
    @XmlElement(name="MASK")
    public Integer getMask() {
        return this.mask;
    }

    public void setMask(Integer value) {
        this.mask = value;
    }
    
    
    
    @XmlElement(name="NEW-NAD")
    public Integer getNewNad() {
        return this.newNad;
    }

    public void setNewNad(Integer value) {
        this.newNad = value;
    }
    
    
}