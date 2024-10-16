package stdgui.data.model.orimodel;
@XmlRootElement(name = "ADMIN-DATA")
public class AdminData {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnum language;
    
    
    
    protected MultiLanguagePlainText usedLanguages;
    
    
    
    protected ArrayList<DocRevision> docRevisions;
    
    
    
    protected ArrayList<Sdg> sdgs;
    
    

    
    
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
    
    
    
    @XmlElement(name="LANGUAGE")
    public LEnum getLanguage() {
    return this.language;
}

    public void setLanguage(LEnum value) {
        this.language = value;
    }
    
    
    
    @XmlElement(name="USED-LANGUAGES")
    public MultiLanguagePlainText getUsedLanguages() {
    return this.usedLanguages;
}

    public void setUsedLanguages(MultiLanguagePlainText value) {
        this.usedLanguages = value;
    }
    
    
    
    @XmlElementWrapper(name="DOC-REVISIONS")
@XmlElement(name="DOC-REVISION")
    public ArrayList<DocRevision> getDocRevisions() {
    return this.docRevisions;
}

    public void setDocRevisions(ArrayList<DocRevision> value) {
        this.docRevisions = value;
    }
    
    
    
    @XmlElementWrapper(name="SDGS")
@XmlElement(name="SDG")
    public ArrayList<Sdg> getSdgs() {
    return this.sdgs;
}

    public void setSdgs(ArrayList<Sdg> value) {
        this.sdgs = value;
    }
    
    
}