package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS")
public class DiagnosticDebounceAlgorithmProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected DebounceAlgorithm debounceAlgorithm;
    
    
    
    protected DiagnosticDebounceBehaviorEnum debounceBehavior;
    
    
    
    protected Boolean debounceCounterStorage;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEBOUNCE-ALGORITHM")
    public DebounceAlgorithm getDebounceAlgorithm() {
    return this.debounceAlgorithm;
}

    public void setDebounceAlgorithm(DebounceAlgorithm value) {
        this.debounceAlgorithm = value;
    }
    
    
    
    @XmlElement(name="DEBOUNCE-BEHAVIOR")
    public DiagnosticDebounceBehaviorEnum getDebounceBehavior() {
    return this.debounceBehavior;
}

    public void setDebounceBehavior(DiagnosticDebounceBehaviorEnum value) {
        this.debounceBehavior = value;
    }
    
    
    
    @XmlElement(name="DEBOUNCE-COUNTER-STORAGE")
    public Boolean getDebounceCounterStorage() {
    return this.debounceCounterStorage;
}

    public void setDebounceCounterStorage(Boolean value) {
        this.debounceCounterStorage = value;
    }
    
    
}