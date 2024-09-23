package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwAxisIndividual {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected InputVariableTypeRef inputVariableTypeRef;
    
    
    
    protected SwVariableRefs swVariableRefs;
    
    
    
    protected CompuMethodRef compuMethodRef;
    
    
    
    protected UnitRef unitRef;
    
    
    
    protected IntegerValueVariationPoint swMaxAxisPoints;
    
    
    
    protected IntegerValueVariationPoint swMinAxisPoints;
    
    
    
    protected DataConstrRef dataConstrRef;
    
    
    
    protected SwAxisGeneric swAxisGeneric;
    
    

    
    
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
    
    
    
    @XmlElement(name="INPUT-VARIABLE-TYPE-REF")
    public InputVariableTypeRef getInputVariableTypeRef() {
        return this.inputVariableTypeRef;
    }

    public void setInputVariableTypeRef(InputVariableTypeRef value) {
        this.inputVariableTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-VARIABLE-REFS")
    public SwVariableRefs getSwVariableRefs() {
        return this.swVariableRefs;
    }

    public void setSwVariableRefs(SwVariableRefs value) {
        this.swVariableRefs = value;
    }
    
    
    
    @XmlElement(name="COMPU-METHOD-REF")
    public CompuMethodRef getCompuMethodRef() {
        return this.compuMethodRef;
    }

    public void setCompuMethodRef(CompuMethodRef value) {
        this.compuMethodRef = value;
    }
    
    
    
    @XmlElement(name="UNIT-REF")
    public UnitRef getUnitRef() {
        return this.unitRef;
    }

    public void setUnitRef(UnitRef value) {
        this.unitRef = value;
    }
    
    
    
    @XmlElement(name="SW-MAX-AXIS-POINTS")
    public IntegerValueVariationPoint getSwMaxAxisPoints() {
        return this.swMaxAxisPoints;
    }

    public void setSwMaxAxisPoints(IntegerValueVariationPoint value) {
        this.swMaxAxisPoints = value;
    }
    
    
    
    @XmlElement(name="SW-MIN-AXIS-POINTS")
    public IntegerValueVariationPoint getSwMinAxisPoints() {
        return this.swMinAxisPoints;
    }

    public void setSwMinAxisPoints(IntegerValueVariationPoint value) {
        this.swMinAxisPoints = value;
    }
    
    
    
    @XmlElement(name="DATA-CONSTR-REF")
    public DataConstrRef getDataConstrRef() {
        return this.dataConstrRef;
    }

    public void setDataConstrRef(DataConstrRef value) {
        this.dataConstrRef = value;
    }
    
    
    
    @XmlElement(name="SW-AXIS-GENERIC")
    public SwAxisGeneric getSwAxisGeneric() {
        return this.swAxisGeneric;
    }

    public void setSwAxisGeneric(SwAxisGeneric value) {
        this.swAxisGeneric = value;
    }
    
    
}