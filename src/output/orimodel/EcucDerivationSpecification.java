package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-DERIVATION-SPECIFICATION")
public class EcucDerivationSpecification {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EcucParameterDerivationFormula calculationFormula;
    
    
    
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
    
    
    
    @XmlElement(name="CALCULATION-FORMULA")
    public EcucParameterDerivationFormula getCalculationFormula() {
    return this.calculationFormula;
}

    public void setCalculationFormula(EcucParameterDerivationFormula value) {
        this.calculationFormula = value;
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