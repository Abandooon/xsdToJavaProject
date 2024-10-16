package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-SERVER-OPERATION-MAPPING")
public class ClientServerOperationMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<DataPrototypeMapping> argumentMappings;
    
    
    
    protected FirstOperationRef firstOperationRef;
    
    
    
    protected SecondOperationRef secondOperationRef;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ARGUMENT-MAPPINGS")
@XmlElement(name="DATA-PROTOTYPE-MAPPING")
    public ArrayList<DataPrototypeMapping> getArgumentMappings() {
    return this.argumentMappings;
}

    public void setArgumentMappings(ArrayList<DataPrototypeMapping> value) {
        this.argumentMappings = value;
    }
    
    
    
    @XmlElement(name="FIRST-OPERATION-REF")
    public FirstOperationRef getFirstOperationRef() {
    return this.firstOperationRef;
}

    public void setFirstOperationRef(FirstOperationRef value) {
        this.firstOperationRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-OPERATION-REF")
    public SecondOperationRef getSecondOperationRef() {
    return this.secondOperationRef;
}

    public void setSecondOperationRef(SecondOperationRef value) {
        this.secondOperationRef = value;
    }
    
    
}