package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Fields {

    
    
    protected ArrayList<ApplicationRuleBasedValueSpecification> applicationRuleBasedValueSpecification;
    
    
    
    protected ArrayList<ApplicationValueSpecification> applicationValueSpecification;
    
    
    
    protected ArrayList<ArrayValueSpecification> arrayValueSpecification;
    
    
    
    protected ArrayList<ConstantReference> constantReference;
    
    
    
    protected ArrayList<NumericalRuleBasedValueSpecification> numericalRuleBasedValueSpecification;
    
    
    
    protected ArrayList<NumericalValueSpecification> numericalValueSpecification;
    
    
    
    protected ArrayList<RecordValueSpecification> recordValueSpecification;
    
    
    
    protected ArrayList<ReferenceValueSpecification> referenceValueSpecification;
    
    
    
    protected ArrayList<TextValueSpecification> textValueSpecification;
    
    

    
    
    @XmlElement(name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION")
    public ArrayList<ApplicationRuleBasedValueSpecification> getApplicationRuleBasedValueSpecification() {
    return this.applicationRuleBasedValueSpecification;
}

    public void setApplicationRuleBasedValueSpecification(ArrayList<ApplicationRuleBasedValueSpecification> value) {
        this.applicationRuleBasedValueSpecification = value;
    }
    
    
    
    @XmlElement(name="APPLICATION-VALUE-SPECIFICATION")
    public ArrayList<ApplicationValueSpecification> getApplicationValueSpecification() {
    return this.applicationValueSpecification;
}

    public void setApplicationValueSpecification(ArrayList<ApplicationValueSpecification> value) {
        this.applicationValueSpecification = value;
    }
    
    
    
    @XmlElement(name="ARRAY-VALUE-SPECIFICATION")
    public ArrayList<ArrayValueSpecification> getArrayValueSpecification() {
    return this.arrayValueSpecification;
}

    public void setArrayValueSpecification(ArrayList<ArrayValueSpecification> value) {
        this.arrayValueSpecification = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-REFERENCE")
    public ArrayList<ConstantReference> getConstantReference() {
    return this.constantReference;
}

    public void setConstantReference(ArrayList<ConstantReference> value) {
        this.constantReference = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION")
    public ArrayList<NumericalRuleBasedValueSpecification> getNumericalRuleBasedValueSpecification() {
    return this.numericalRuleBasedValueSpecification;
}

    public void setNumericalRuleBasedValueSpecification(ArrayList<NumericalRuleBasedValueSpecification> value) {
        this.numericalRuleBasedValueSpecification = value;
    }
    
    
    
    @XmlElement(name="NUMERICAL-VALUE-SPECIFICATION")
    public ArrayList<NumericalValueSpecification> getNumericalValueSpecification() {
    return this.numericalValueSpecification;
}

    public void setNumericalValueSpecification(ArrayList<NumericalValueSpecification> value) {
        this.numericalValueSpecification = value;
    }
    
    
    
    @XmlElement(name="RECORD-VALUE-SPECIFICATION")
    public ArrayList<RecordValueSpecification> getRecordValueSpecification() {
    return this.recordValueSpecification;
}

    public void setRecordValueSpecification(ArrayList<RecordValueSpecification> value) {
        this.recordValueSpecification = value;
    }
    
    
    
    @XmlElement(name="REFERENCE-VALUE-SPECIFICATION")
    public ArrayList<ReferenceValueSpecification> getReferenceValueSpecification() {
    return this.referenceValueSpecification;
}

    public void setReferenceValueSpecification(ArrayList<ReferenceValueSpecification> value) {
        this.referenceValueSpecification = value;
    }
    
    
    
    @XmlElement(name="TEXT-VALUE-SPECIFICATION")
    public ArrayList<TextValueSpecification> getTextValueSpecification() {
    return this.textValueSpecification;
}

    public void setTextValueSpecification(ArrayList<TextValueSpecification> value) {
        this.textValueSpecification = value;
    }
    
    
}