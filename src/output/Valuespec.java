package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Valuespec {

    
    
    protected ApplicationRuleBasedValueSpecification applicationRuleBasedValueSpecification;
    
    
    
    protected ApplicationValueSpecification applicationValueSpecification;
    
    
    
    protected ArrayValueSpecification arrayValueSpecification;
    
    
    
    protected ConstantReference constantReference;
    
    
    
    protected NumericalRuleBasedValueSpecification numericalRuleBasedValueSpecification;
    
    
    
    protected NumericalValueSpecification numericalValueSpecification;
    
    
    
    protected RecordValueSpecification recordValueSpecification;
    
    
    
    protected ReferenceValueSpecification referenceValueSpecification;
    
    
    
    protected TextValueSpecification textValueSpecification;
    
    

    
    
    @XmlElement(name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION")
    public ApplicationRuleBasedValueSpecification getApplicationRuleBasedValueSpecification() {
        return this.applicationRuleBasedValueSpecification;
    }

    public void setApplicationRuleBasedValueSpecification(ApplicationRuleBasedValueSpecification value) {
        this.applicationRuleBasedValueSpecification = value;
    }
    
    
    
    @XmlElement(name="APPLICATION-VALUE-SPECIFICATION")
    public ApplicationValueSpecification getApplicationValueSpecification() {
        return this.applicationValueSpecification;
    }

    public void setApplicationValueSpecification(ApplicationValueSpecification value) {
        this.applicationValueSpecification = value;
    }
    
    
    
    @XmlElement(name="ARRAY-VALUE-SPECIFICATION")
    public ArrayValueSpecification getArrayValueSpecification() {
        return this.arrayValueSpecification;
    }

    public void setArrayValueSpecification(ArrayValueSpecification value) {
        this.arrayValueSpecification = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-REFERENCE")
    public ConstantReference getConstantReference() {
        return this.constantReference;
    }

    public void setConstantReference(ConstantReference value) {
        this.constantReference = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION")
    public NumericalRuleBasedValueSpecification getNumericalRuleBasedValueSpecification() {
        return this.numericalRuleBasedValueSpecification;
    }

    public void setNumericalRuleBasedValueSpecification(NumericalRuleBasedValueSpecification value) {
        this.numericalRuleBasedValueSpecification = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-VALUE-SPECIFICATION")
    public NumericalValueSpecification getNumericalValueSpecification() {
        return this.numericalValueSpecification;
    }

    public void setNumericalValueSpecification(NumericalValueSpecification value) {
        this.numericalValueSpecification = value;
    }
    
    
    
    @XmlElement(name="RECORD-VALUE-SPECIFICATION")
    public RecordValueSpecification getRecordValueSpecification() {
        return this.recordValueSpecification;
    }

    public void setRecordValueSpecification(RecordValueSpecification value) {
        this.recordValueSpecification = value;
    }
    
    
    
    @XmlElement(name="REFERENCE-VALUE-SPECIFICATION")
    public ReferenceValueSpecification getReferenceValueSpecification() {
        return this.referenceValueSpecification;
    }

    public void setReferenceValueSpecification(ReferenceValueSpecification value) {
        this.referenceValueSpecification = value;
    }
    
    
    
    @XmlElement(name="TEXT-VALUE-SPECIFICATION")
    public TextValueSpecification getTextValueSpecification() {
        return this.textValueSpecification;
    }

    public void setTextValueSpecification(TextValueSpecification value) {
        this.textValueSpecification = value;
    }
    
    
}