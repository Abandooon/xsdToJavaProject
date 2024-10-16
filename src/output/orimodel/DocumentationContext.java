package stdgui.data.model.orimodel;
@XmlRootElement(name = "DOCUMENTATION-CONTEXT")
public class DocumentationContext {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected AnyInstanceRef featureIref;
    
    
    
    protected IdentifiableRef identifiableRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
    return this.longName;
}

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
    }
    
    
    
    @XmlElement(name="FEATURE-IREF")
    public AnyInstanceRef getFeatureIref() {
    return this.featureIref;
}

    public void setFeatureIref(AnyInstanceRef value) {
        this.featureIref = value;
    }
    
    
    
    @XmlElement(name="IDENTIFIABLE-REF")
    public IdentifiableRef getIdentifiableRef() {
    return this.identifiableRef;
}

    public void setIdentifiableRef(IdentifiableRef value) {
        this.identifiableRef = value;
    }
    
    
}