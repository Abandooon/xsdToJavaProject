package stdgui.data.model.orimodel;
@XmlRootElement(name = "MULTILANGUAGE-LONG-NAME")
public class MultilanguageLongName {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<LLongName> l4;
    
    

    
    
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
    
    
    
    @XmlElement(name="L-4")
    public ArrayList<LLongName> getL4() {
    return this.l4;
}

    public void setL4(ArrayList<LLongName> value) {
        this.l4 = value;
    }
    
    
}