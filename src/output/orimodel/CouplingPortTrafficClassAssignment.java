package stdgui.data.model.orimodel;
@XmlRootElement(name = "COUPLING-PORT-TRAFFIC-CLASS-ASSIGNMENT")
public class CouplingPortTrafficClassAssignment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected ArrayList<PositiveInteger> prioritys;
    
    
    
    protected PositiveInteger trafficClass;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElementWrapper(name="PRIORITYS")
@XmlElement(name="PRIORITY")
    public ArrayList<PositiveInteger> getPrioritys() {
    return this.prioritys;
}

    public void setPrioritys(ArrayList<PositiveInteger> value) {
        this.prioritys = value;
    }
    
    
    
    @XmlElement(name="TRAFFIC-CLASS")
    public PositiveInteger getTrafficClass() {
    return this.trafficClass;
}

    public void setTrafficClass(PositiveInteger value) {
        this.trafficClass = value;
    }
    
    
}