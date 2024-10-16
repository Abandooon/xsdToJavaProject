package stdgui.data.model.orimodel;
@XmlRootElement(name = "RPT-HOOK")
public class RptHook {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CIdentifier codeLabel;
    
    
    
    protected NmtokenString mcdIdentifier;
    
    
    
    protected AnyInstanceRef rptArHookIref;
    
    
    
    protected ArrayList<Sdg> sdgs;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="CODE-LABEL")
    public CIdentifier getCodeLabel() {
    return this.codeLabel;
}

    public void setCodeLabel(CIdentifier value) {
        this.codeLabel = value;
    }
    
    
    
    @XmlElement(name="MCD-IDENTIFIER")
    public NmtokenString getMcdIdentifier() {
    return this.mcdIdentifier;
}

    public void setMcdIdentifier(NmtokenString value) {
        this.mcdIdentifier = value;
    }
    
    
    
    @XmlElement(name="RPT-AR-HOOK-IREF")
    public AnyInstanceRef getRptArHookIref() {
    return this.rptArHookIref;
}

    public void setRptArHookIref(AnyInstanceRef value) {
        this.rptArHookIref = value;
    }
    
    
    
    @XmlElementWrapper(name="SDGS")
@XmlElement(name="SDG")
    public ArrayList<Sdg> getSdgs() {
    return this.sdgs;
}

    public void setSdgs(ArrayList<Sdg> value) {
        this.sdgs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}