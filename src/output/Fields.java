package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Fields {

    
    
    protected ArrayList<ApplicationRuleBasedValueSpecification> applicationRuleBasedValueSpecifications;
    
    
    
    protected ArrayList<ApplicationValueSpecification> applicationValueSpecifications;
    
    
    
    protected ArrayList<ArrayValueSpecification> arrayValueSpecifications;
    
    
    
    protected ArrayList<ConstantReference> constantReferences;
    
    
    
    protected ArrayList<NumericalRuleBasedValueSpecification> numericalRuleBasedValueSpecifications;
    
    
    
    protected ArrayList<NumericalValueSpecification> numericalValueSpecifications;
    
    
    
    protected ArrayList<RecordValueSpecification> recordValueSpecifications;
    
    
    
    protected ArrayList<ReferenceValueSpecification> referenceValueSpecifications;
    
    
    
    protected ArrayList<TextValueSpecification> textValueSpecifications;
    
    

    
    
    @XmlElement(name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION")
    public ArrayList<ApplicationRuleBasedValueSpecification> getApplicationRuleBasedValueSpecifications() {
        return this.applicationRuleBasedValueSpecifications;
    }

    public void setApplicationRuleBasedValueSpecifications(ArrayList<ApplicationRuleBasedValueSpecification> value) {
        this.applicationRuleBasedValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="APPLICATION-VALUE-SPECIFICATION")
    public ArrayList<ApplicationValueSpecification> getApplicationValueSpecifications() {
        return this.applicationValueSpecifications;
    }

    public void setApplicationValueSpecifications(ArrayList<ApplicationValueSpecification> value) {
        this.applicationValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="ARRAY-VALUE-SPECIFICATION")
    public ArrayList<ArrayValueSpecification> getArrayValueSpecifications() {
        return this.arrayValueSpecifications;
    }

    public void setArrayValueSpecifications(ArrayList<ArrayValueSpecification> value) {
        this.arrayValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-REFERENCE")
    public ArrayList<ConstantReference> getConstantReferences() {
        return this.constantReferences;
    }

    public void setConstantReferences(ArrayList<ConstantReference> value) {
        this.constantReferences = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION")
    public ArrayList<NumericalRuleBasedValueSpecification> getNumericalRuleBasedValueSpecifications() {
        return this.numericalRuleBasedValueSpecifications;
    }

    public void setNumericalRuleBasedValueSpecifications(ArrayList<NumericalRuleBasedValueSpecification> value) {
        this.numericalRuleBasedValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-VALUE-SPECIFICATION")
    public ArrayList<NumericalValueSpecification> getNumericalValueSpecifications() {
        return this.numericalValueSpecifications;
    }

    public void setNumericalValueSpecifications(ArrayList<NumericalValueSpecification> value) {
        this.numericalValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="RECORD-VALUE-SPECIFICATION")
    public ArrayList<RecordValueSpecification> getRecordValueSpecifications() {
        return this.recordValueSpecifications;
    }

    public void setRecordValueSpecifications(ArrayList<RecordValueSpecification> value) {
        this.recordValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="REFERENCE-VALUE-SPECIFICATION")
    public ArrayList<ReferenceValueSpecification> getReferenceValueSpecifications() {
        return this.referenceValueSpecifications;
    }

    public void setReferenceValueSpecifications(ArrayList<ReferenceValueSpecification> value) {
        this.referenceValueSpecifications = value;
    }
    
    
    
    @XmlElement(name="TEXT-VALUE-SPECIFICATION")
    public ArrayList<TextValueSpecification> getTextValueSpecifications() {
        return this.textValueSpecifications;
    }

    public void setTextValueSpecifications(ArrayList<TextValueSpecification> value) {
        this.textValueSpecifications = value;
    }
    
    
}