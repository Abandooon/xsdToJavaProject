package stdgui.data.model.orimodel;
@XmlRootElement(name = "AUTOSAR-ENGINEERING-OBJECT")
public class AutosarEngineeringObject {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NmtokenString shortLabel;
    
    
    
    protected NmtokenString category;
    
    
    
    protected ArrayList<RevisionLabelString> revisionLabels;
    
    
    
    protected NmtokenString domain;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public NmtokenString getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(NmtokenString value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public NmtokenString getCategory() {
    return this.category;
}

    public void setCategory(NmtokenString value) {
        this.category = value;
    }
    
    
    
    @XmlElementWrapper(name="REVISION-LABELS")
@XmlElement(name="REVISION-LABEL")
    public ArrayList<RevisionLabelString> getRevisionLabels() {
    return this.revisionLabels;
}

    public void setRevisionLabels(ArrayList<RevisionLabelString> value) {
        this.revisionLabels = value;
    }
    
    
    
    @XmlElement(name="DOMAIN")
    public NmtokenString getDomain() {
    return this.domain;
}

    public void setDomain(NmtokenString value) {
        this.domain = value;
    }
    
    
}