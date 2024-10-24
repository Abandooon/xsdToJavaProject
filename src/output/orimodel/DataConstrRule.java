package stdgui.data.model.orimodel;
@XmlRootElement(name = "DATA-CONSTR-RULE")
public class DataConstrRule {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer constrLevel;
    
    
    
    protected PhysConstrs physConstrs;
    
    
    
    protected InternalConstrs internalConstrs;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONSTR-LEVEL")
    public Integer getConstrLevel() {
    return this.constrLevel;
}

    public void setConstrLevel(Integer value) {
        this.constrLevel = value;
    }
    
    
    
    @XmlElement(name="PHYS-CONSTRS")
    public PhysConstrs getPhysConstrs() {
    return this.physConstrs;
}

    public void setPhysConstrs(PhysConstrs value) {
        this.physConstrs = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-CONSTRS")
    public InternalConstrs getInternalConstrs() {
    return this.internalConstrs;
}

    public void setInternalConstrs(InternalConstrs value) {
        this.internalConstrs = value;
    }
    
    
}