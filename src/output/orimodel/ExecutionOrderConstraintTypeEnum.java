package stdgui.data.model.orimodel;
@XmlRootElement(name = "EXECUTION-ORDER-CONSTRAINT-TYPE-ENUM")
public class ExecutionOrderConstraintTypeEnum {

    
    
    protected ExecutionOrderConstraintTypeEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public ExecutionOrderConstraintTypeEnumSimple getValue() {
    return this.value;
}

    public void setValue(ExecutionOrderConstraintTypeEnumSimple value) {
        this.value = value;
    }
    
    
    
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
    
    
}