package stdgui.data.model.orimodel;
@XmlRootElement(name = "FM-ATTRIBUTE-VALUE")
public class FmAttributeValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DefinitionRef_FmAttributeValue definitionRef;
    
    
    
    protected NumericalValue value;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEFINITION-REF")
    public DefinitionRef_FmAttributeValue getDefinitionRef() {
    return this.definitionRef;
}

    public void setDefinitionRef(DefinitionRef_FmAttributeValue value) {
        this.definitionRef = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public NumericalValue getValue() {
    return this.value;
}

    public void setValue(NumericalValue value) {
        this.value = value;
    }
    
    
}