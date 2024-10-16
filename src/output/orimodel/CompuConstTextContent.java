package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-CONST-TEXT-CONTENT")
public class CompuConstTextContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VerbatimString vt;
    
    

    
    
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
    
    
    
    @XmlElement(name="VT")
    public VerbatimString getVt() {
    return this.vt;
}

    public void setVt(VerbatimString value) {
        this.vt = value;
    }
    
    
}