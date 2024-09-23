package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TextTableMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveIntegerValueVariationPoint bitfieldTextTableMaskFirst;
    
    
    
    protected PositiveIntegerValueVariationPoint bitfieldTextTableMaskSecond;
    
    
    
    protected Boolean identicalMapping;
    
    
    
    protected MappingDirectionEnum mappingDirection;
    
    
    
    protected ValuePairs valuePairs;
    
    

    
    
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
    
    
    
    @XmlElement(name="BITFIELD-TEXT-TABLE-MASK-FIRST")
    public PositiveIntegerValueVariationPoint getBitfieldTextTableMaskFirst() {
        return this.bitfieldTextTableMaskFirst;
    }

    public void setBitfieldTextTableMaskFirst(PositiveIntegerValueVariationPoint value) {
        this.bitfieldTextTableMaskFirst = value;
    }
    
    
    
    @XmlElement(name="BITFIELD-TEXT-TABLE-MASK-SECOND")
    public PositiveIntegerValueVariationPoint getBitfieldTextTableMaskSecond() {
        return this.bitfieldTextTableMaskSecond;
    }

    public void setBitfieldTextTableMaskSecond(PositiveIntegerValueVariationPoint value) {
        this.bitfieldTextTableMaskSecond = value;
    }
    
    
    
    @XmlElement(name="IDENTICAL-MAPPING")
    public Boolean getIdenticalMapping() {
        return this.identicalMapping;
    }

    public void setIdenticalMapping(Boolean value) {
        this.identicalMapping = value;
    }
    
    
    
    @XmlElement(name="MAPPING-DIRECTION")
    public MappingDirectionEnum getMappingDirection() {
        return this.mappingDirection;
    }

    public void setMappingDirection(MappingDirectionEnum value) {
        this.mappingDirection = value;
    }
    
    
    
    @XmlElement(name="VALUE-PAIRS")
    public ValuePairs getValuePairs() {
        return this.valuePairs;
    }

    public void setValuePairs(ValuePairs value) {
        this.valuePairs = value;
    }
    
    
}