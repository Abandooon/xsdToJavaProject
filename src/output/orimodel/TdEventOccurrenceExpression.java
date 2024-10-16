package stdgui.data.model.orimodel;
@XmlRootElement(name = "TD-EVENT-OCCURRENCE-EXPRESSION")
public class TdEventOccurrenceExpression {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<AutosarOperationArgumentInstance> arguments;
    
    
    
    protected TdEventOccurrenceExpressionFormula formula;
    
    
    
    protected ArrayList<AutosarVariableInstance> variables;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ARGUMENTS")
@XmlElement(name="AUTOSAR-OPERATION-ARGUMENT-INSTANCE")
    public ArrayList<AutosarOperationArgumentInstance> getArguments() {
    return this.arguments;
}

    public void setArguments(ArrayList<AutosarOperationArgumentInstance> value) {
        this.arguments = value;
    }
    
    
    
    @XmlElement(name="FORMULA")
    public TdEventOccurrenceExpressionFormula getFormula() {
    return this.formula;
}

    public void setFormula(TdEventOccurrenceExpressionFormula value) {
        this.formula = value;
    }
    
    
    
    @XmlElementWrapper(name="VARIABLES")
@XmlElement(name="AUTOSAR-VARIABLE-INSTANCE")
    public ArrayList<AutosarVariableInstance> getVariables() {
    return this.variables;
}

    public void setVariables(ArrayList<AutosarVariableInstance> value) {
        this.variables = value;
    }
    
    
}