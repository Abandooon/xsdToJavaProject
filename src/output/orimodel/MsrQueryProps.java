package stdgui.data.model.orimodel;
@XmlRootElement(name = "MSR-QUERY-PROPS")
public class MsrQueryProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String msrQueryName;
    
    
    
    protected ArrayList<MsrQueryArg> msrQueryArg;
    
    
    
    protected String comment;
    
    

    
    
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
    
    
    
    @XmlElement(name="MSR-QUERY-NAME")
    public String getMsrQueryName() {
    return this.msrQueryName;
}

    public void setMsrQueryName(String value) {
        this.msrQueryName = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-ARG")
    public ArrayList<MsrQueryArg> getMsrQueryArg() {
    return this.msrQueryArg;
}

    public void setMsrQueryArg(ArrayList<MsrQueryArg> value) {
        this.msrQueryArg = value;
    }
    
    
    
    @XmlElement(name="COMMENT")
    public String getComment() {
    return this.comment;
}

    public void setComment(String value) {
        this.comment = value;
    }
    
    
}