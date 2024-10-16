package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-CONDITION-SPECIFICATION")
public class EcucConditionSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EcucConditionFormula conditionFormula;
    
    
    
    protected ArrayList<EcucQuery> ecucQuerys;
    
    
    
    protected MlFormula informalFormula;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONDITION-FORMULA")
    public EcucConditionFormula getConditionFormula() {
    return this.conditionFormula;
}

    public void setConditionFormula(EcucConditionFormula value) {
        this.conditionFormula = value;
    }
    
    
    
    @XmlElementWrapper(name="ECUC-QUERYS")
@XmlElement(name="ECUC-QUERY")
    public ArrayList<EcucQuery> getEcucQuerys() {
    return this.ecucQuerys;
}

    public void setEcucQuerys(ArrayList<EcucQuery> value) {
        this.ecucQuerys = value;
    }
    
    
    
    @XmlElement(name="INFORMAL-FORMULA")
    public MlFormula getInformalFormula() {
    return this.informalFormula;
}

    public void setInformalFormula(MlFormula value) {
        this.informalFormula = value;
    }
    
    
}