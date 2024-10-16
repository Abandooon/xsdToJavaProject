package stdgui.data.model.orimodel;
@XmlRootElement(name = "CHAPTER-CONTENT")
public class ChapterContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Prms> prms;
    
    
    
    protected ArrayList<MsrQueryP1> msrQueryP1;
    
    

    
    
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
    
    
    
    @XmlElement(name="PRMS")
    public ArrayList<Prms> getPrms() {
    return this.prms;
}

    public void setPrms(ArrayList<Prms> value) {
        this.prms = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-P-1")
    public ArrayList<MsrQueryP1> getMsrQueryP1() {
    return this.msrQueryP1;
}

    public void setMsrQueryP1(ArrayList<MsrQueryP1> value) {
        this.msrQueryP1 = value;
    }
    
    
}